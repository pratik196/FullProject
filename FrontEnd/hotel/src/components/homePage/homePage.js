import React, {Component} from 'react';
import './homePage.scss'
import {
  BrowserRouter,
  Link,
  Routes,
  Route,
  Outlet
}from "react-router-dom";
import { MDBFooter } from 'mdb-react-ui-kit';
import welcome from './welcome.gif'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as homePageActions from "../../store/homePage/actions";
export default class homePage extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {

    
      return <div className="component-home-page">
         <h1 id="header-new">Welcome To Hotel Hidden Leaf</h1>

        <h2 id="header-new">Login To Continue</h2>
        <br/>
        <div id="navbar-home">
        <Link to="/login" className='hometab' >User Login</Link></div><br/><br/>
        <div id="navbar-home">  
        <Link to="/vendorLogin" className='hometab' >Admin Login</Link><br/><br/></div>
        <br/>

        

       

        
      </div>;

      

      
      
    }
  }
// export default connect(
//     ({ homePage }) => ({ ...homePage }),
//     dispatch => bindActionCreators({ ...homePageActions }, dispatch)
//   )( homePage );