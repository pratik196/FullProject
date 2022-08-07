import React, {Component} from 'react';
import './abcd.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as abcdActions from "../../store/abcd/actions";
export default class abcd extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      return <div className="component-abcd">Hello! component abcd</div>;
    }
  }
// export default connect(
//     ({ abcd }) => ({ ...abcd }),
//     dispatch => bindActionCreators({ ...abcdActions }, dispatch)
//   )( abcd );