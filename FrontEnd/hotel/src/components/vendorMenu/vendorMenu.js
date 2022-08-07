import React, {Component} from 'react';
import './vendorMenu.scss'
import {
  BrowserRouter,
  Routes,
  Route,
  Link,
  Outlet
} from "react-router-dom";
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as vendorMenuActions from "../../store/vendorMenu/actions";
export default class vendorMenu extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      return <div className="component-vendor-menu" class="style-menu">
        <div id="navbar1">
      <Link to="/vendorDashboard" className='tabs1' >Vendor Dashboard</Link>
      
      <Link to="/vendorOrders" className='tabs1' >Orders</Link>

      <Link to="/vendorBooking" className='tabs1' >Booking</Link>
      
      <Link to="/vendorPendingOrders" className='tabs1' >Pending Orders</Link>
      
      <Link to="/vendorPendingBooking" className='tabs1' >Pending Booking</Link>

      <Link to="/acceptorReject" className='tabs1' >Accept or Reject Order</Link>

      <Link to="/acceptorRejectBooking" className='tabs1' >Accept or Reject Booking</Link>

      <Link to="/" className='tabs1' id="logouttab1">Logout</Link>
      </div>
      </div>;
    }
  }
// export default connect(
//     ({ vendorMenu }) => ({ ...vendorMenu }),
//     dispatch => bindActionCreators({ ...vendorMenuActions }, dispatch)
//   )( vendorMenu );