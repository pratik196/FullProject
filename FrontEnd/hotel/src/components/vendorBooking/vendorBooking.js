import React, {Component} from 'react';
import './vendorBooking.scss'
import axios from 'axios';
import VendorMenu from '../vendorMenu/vendorMenu';
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as vendorBookingActions from "../../store/vendorBooking/actions";
export default class vendorBooking extends Component {
  constructor(props) {
    super(props);
    this.state = {
     booking: []
    };
}

componentDidMount(){
 let vid = localStorage.getItem("vid")
 axios.get("http://localhost:1111/vendorBooking/"+vid)
 .then(response => {
   this.setState({
     booking : response.data
   })
   console.log(response.data)
 })
}

render() {
 const {booking} = this.state
 return <div className="component-vendor-booking">
   <VendorMenu/>
   <table border="3" align="center" class="styled-table-venord">
     <thead>
     <tr>
       <th>Booking Id</th>
       <th>Customer Id</th>
       <th>Room Id</th>
       <th>Vendor Id</th>
       <th>Wallet Source</th>
       <th>Booking Quantity</th>
       <th>Bill Amount</th>
       <th>Booking Status</th>
       <th>Booking Comments</th>
     </tr></thead>
     
     {
       booking.map(book =>
        <thead>
         <tr>
           <td>{book.bookingId}</td>
           <td>{book.cusId}</td>
           <td>{book.roomId}</td>
           <td>{book.venId}</td>
           <td>{book.walSource}</td>
           <td>{book.bookingQuantity}</td>
           <td>{book.bookingBillamount}</td>
           <td style={{'color': book.bookingStatus === 'ACCEPTED' ? 'green' : book.bookingStatus === 'DENIED' ? 'red' : 'violet'}}>{book.bookingStatus}</td>
           <td>{book.bookingComments}</td>
         </tr>
         </thead>
         )
     }
   </table>
   
 </div>;
}
  }
// export default connect(
//     ({ vendorBooking }) => ({ ...vendorBooking }),
//     dispatch => bindActionCreators({ ...vendorBookingActions }, dispatch)
//   )( vendorBooking );