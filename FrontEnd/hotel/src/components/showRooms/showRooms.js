import React, {Component} from 'react';
import './showRooms.scss'
import Menu from '../menu/menu';
import  axios  from 'axios';

// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as showMenuActions from "../../store/showMenu/actions";
export default class showTooms extends Component {
     constructor(props) {
         super(props);
         this.state = {
          menu:[]
         };
     }

     componentDidMount() {
      axios.get("http://localhost:1111/showroom")
      .then(response => {
        this.setState({
          menu : response.data 
        })
        console.log(response.data)
      })
    
    }
    render() {
      const {menu} = this.state
      return <div className="component-show-rooms">
        <Menu/>
        <table border="3" align='center' class="styled-table-menu">
          <thead>
      <tr>
        <th>Room Id</th>
        <th>Room</th>
        <th>Price</th>
        <th>Number Of Beds</th>
        <th>Room Type</th>
      </tr></thead>
      
      {
        menu.map( customer => 
          <thead>
          <tr>
            <td>{customer.roomId}</td>
            <td>{customer.roomItem}</td>
            <td>{customer.roomPrice}</td>
            <td>{customer.roomBeds}</td>
            <td>{customer.roomSpeciality}</td>
          </tr></thead>
      )
      }
    </table>
    
      </div>;
    }
  }
// export default connect(
//     ({ showMenu }) => ({ ...showMenu }),
//     dispatch => bindActionCreators({ ...showMenuActions }, dispatch)
//   )( showMenu );