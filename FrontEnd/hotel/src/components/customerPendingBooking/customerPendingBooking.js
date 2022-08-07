import React, {Component} from 'react';
import './customerPendingBooking.scss'
import axios from 'axios'
import Menu from '../menu/menu';
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as customerPendingBookingActions from "../../store/customerPendingBooking/actions";
export default class customerPendingBooking extends Component {
  constructor(props) {
      super(props);
      this.state = {
       booking : []
      };
  }

  componentDidMount(){
   let cid = localStorage.getItem("cid")
   axios.get("http://localhost:1111/customerPendingBooking/"+cid)
   .then(response => {
     this.setState({
       booking : response.data
     })
     console.log(response.data)
   })
  }

 render() {
   const {booking} = this.state
   return <div className="component-customer-pending-booking" >
     <Menu/>
     <table border="3" align="center" class="styled-table-p">
       <thead>
       <tr>
         <th>Booking Id</th>
         <th>Customer Id</th>
         <th>Room Id</th>
         <th>Admin Id</th>
         <th>Wallet Source</th>
         <th>Booking Quantity</th>
         <th>Bill Amount</th>
         <th>Booking Status</th>
         <th>Booking Comments</th>
       </tr></thead>
       
       {
         booking.map( book =>
           <thead>
           <tr>
             <td>{book.bookingId}</td>
             <td>{book.cusId}</td>
             <td>{book.roomId}</td>
             <td>{book.venId}</td>
             <td>{book.walSource}</td>
             <td>{book.bookingQuantity}</td>
             <td>{book.bookingBillamount}</td>
             <td style={{'color': book.bookingStatus === 'ACCEPTED' ? 'green' : book.bookingStatus === 'DENIED' ? 'red' : 'yellow'}}>{book.bookingStatus}</td>
             <td>{book.bookingComments}</td>
           </tr></thead>
           )
       }
     </table>
   </div>;
 }
}
// export default connect(
//     ({ customerPendingBooking }) => ({ ...customerPendingBooking }),
//     dispatch => bindActionCreators({ ...customerPendingBookingActions }, dispatch)
//   )( customerPendingBooking );