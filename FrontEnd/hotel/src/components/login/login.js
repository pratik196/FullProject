import React, {Component} from 'react';
import { withRouter } from '../../withRouter';
import './login.scss'
import  axios  from 'axios';
import {
  BrowserRouter,
  Routes,
  Route,
  Link,
  Outlet
} from "react-router-dom";



// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as loginActions from "../../store/login/actions";
export  class login extends Component {
   
  changeUserName(event) {  
    this.setState({  
        userName: event.target.value
    });  
  }
  changePassword(event) {  
    this.setState({  
        passWord: event.target.value
    });  
  }
  login = () => {
    let user = this.state.userName
    let pwd = this.state.passWord
    axios.get("http://localhost:1111/custAuthenticate/"+user+"/"+pwd)
    .then(response => {
      if (response.data=='1') {
        localStorage.setItem("cuser",user)
        this.props.navigate("/customerDashboard")
      }
     // alert(response.data)
     // result = response.data
      // this.setState({
      //   customers : response.data 
      // })
      console.log(response.data)
    })
    // if (this.state.userName=="Hexaware" && this.state.passWord=="Hexaware") {
    //   //alert("Correct Credentails...");
    //   this.props.navigate("/menu")
    // } else {
    //   alert("Invalid Credentials...")
    // }
  }
  constructor(props) {
        super(props);
        this.state = {
          userName:'',
          passWord:'',
          result : ''
        };
    }
    render() {
      return <div className="component-login">
        <div id="navbar-login"><Link to="/" className='tabs' id='logouttab-login'>&laquo; Back</Link></div>
         
        <form>  
        <div class="container">   
            <center><h1>Customer Login</h1></center>
        <center><p>Login To Continue</p></center>
    <hr/>

    <label><b>User Name</b></label>
    <input type="text" id="userName"
                 value={this.state.userName} 
                 onChange={this.changeUserName.bind(this)} />

    <label ><b>Password</b></label>
    <input type="password" id="passWord"
                   value={this.state.passWord}
                   onChange={this.changePassword.bind(this)} />

    
    <hr/>

    <p>By booking our services you agree to our <a href="#">Terms & Privacy</a>.</p>
    <input type="button"  className='registerbtn' value="LOGIN" onClick={this.login} /> 
               
        </div>   
    </form>

        </div>;
    }
  }
  export default withRouter(login);
// export default connect(
//     ({ login }) => ({ ...login }),
//     dispatch => bindActionCreators({ ...loginActions }, dispatch)
//   )( login );