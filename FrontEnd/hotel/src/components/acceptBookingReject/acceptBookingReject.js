import React, { Component } from 'react';
import './acceptBookingReject.scss'
import VendorMenu from '../vendorMenu/vendorMenu';
import axios from 'axios';
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as acceptBookingRejectActions from "../../store/acceptBookingReject/actions";
export default class acceptBookingReject extends Component {
  constructor(props) {
    super(props);
    this.state = {
      bid: 0,
      vid: localStorage.getItem("vid"),
      status: 'YES'
    };
  }

  changeBookingId(event) {
    this.setState({
      bid: event.target.value
    });
  }

  changeStatus(event) {
    this.setState({
      status: event.target.value
    });
  }

  acceptBookingReject = () => {
    axios.post('http://localhost:1111/acceptOrRejectBooking/' + this.state.bid + '/' + this.state.vid + '/' + this.state.status, null)
      .then(res => {
        console.log(res);
        console.log(res.data);
        this.state.result = res.data
        alert(res.data)
      })
  }

  render() {
    return <div className="component-accept-booking-reject">
      <VendorMenu /><br />
      <form>
          <div class="container">
            <center><h1>Accept or reject Booking</h1></center>
            <hr />
            <label><b>Booking Id</b></label>
            <input type="text" id="bid" value={this.state.bid} onChange={this.changeBookingId.bind(this)} />
            <label ><b>Vendor Id</b></label>
            <input type="text" id="vid" value={this.state.vid} />

            <label ><b>Status</b></label>
            <select id="status" value={this.state.status} onChange={this.changeStatus.bind(this)}>
              <option value="YES" >ACCEPT</option>
              <option value="NO" >REJECT</option>
            </select>
            <hr />
            <input type="button" value="Confirm" onClick={this.acceptBookingReject} id="btn-ar" />
          </div>
        </form>
    </div>;
  }
}
// export default connect(
//     ({ acceptBookingReject }) => ({ ...acceptBookingReject }),
//     dispatch => bindActionCreators({ ...acceptBookingRejectActions }, dispatch)
//   )( acceptBookingReject );