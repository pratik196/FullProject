import React, {Component} from 'react';
import {
  BrowserRouter,
  Routes,
  Route,
  Link,
  Outlet
} from "react-router-dom";

import './menu.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as menuActions from "../../store/menu/actions";
export default class menu extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      return <div className="component-menu">
              {/* <Link to="/">First</Link>{' '}
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; */}
      {/* <Link to="/first">First</Link>

      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; */}
      

      <div id="navbar">
      <Link to="/customerDashboard" style={{ textDecoration: 'none' }}  className="tabs">My Profile</Link>
      
      <Link to="/showMenu" style={{ textDecoration: 'none' }} className="tabs">Show Menu</Link>

      <Link to="/rooms" style={{ textDecoration: 'none' }} className="tabs">Rooms</Link>
      
      <Link to="/customerWallet" style={{ textDecoration: 'none' }} className="tabs">Wallet</Link>
      
      <Link to="/customerOrders" style={{ textDecoration: 'none' }} className="tabs">Orders</Link>

      <Link to="/customerBooking" style={{ textDecoration: 'none' }} className="tabs">Booking</Link>
      
      <Link to="/customerPendingOrders" style={{ textDecoration: 'none' }} className="tabs">Pending Orders</Link>
      
      <Link to="/customerPendingBooking" style={{ textDecoration: 'none' }} className="tabs">Pending Booking</Link>
      
      <Link to="/placeOrders" style={{ textDecoration: 'none' }} className="tabs">Place Order</Link>
     
      <Link to="/placeBooking" style={{ textDecoration: 'none' }} className="tabs">Book Room</Link>

      <Link to="/" className='tabs' id='logouttab'>Logout</Link>

      
      </div>


        </div>;
    }
  }
// export default connect(
//     ({ menu }) => ({ ...menu }),
//     dispatch => bindActionCreators({ ...menuActions }, dispatch)
//   )( menu );