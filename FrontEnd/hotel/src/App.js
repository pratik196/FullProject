import logo from './logo.svg';
import './App.css';

import {
  BrowserRouter,
  Routes,
  Route,
  Link,
  Outlet
} from "react-router-dom";
import ShowMenu from './components/showMenu/showMenu'
import AcceptOrderReject from './components/acceptOrderReject/acceptOrderReject';
import PlaceOrder from './components/placeOrder/placeOrder';
import PlaceBooking from './components/placeBooking/placeBooking';
import VendorPendingOrders from './components/vendorPendingOrders/vendorPendingOrders';
import VendorOrders from './components/vendorOrders/vendorOrders';
import VendorShow from './components/vendorShow/vendorShow';
import VendorDashboard from './components/vendorDashboard/vendorDashboard';
import VendorMenu from './components/vendorMenu/vendorMenu';
import HomePage from './components/homePage/homePage';
import VendorLogin from './components/vendorLogin/vendorLogin';
import CustomerPendingOrders from './components/customerPendingOrders/customerPendingOrders';
import CustomerPendingBooking from './components/customerPendingBooking/customerPendingBooking';
import CustomerOrders from './components/customerOrders/customerOrders';
import CustomerWallet from './components/customerWallet/customerWallet'
import CustomerShow from './components/customerShow/customerShow';
import CustomerDashBoard from './components/customerDashBoard/customerDashBoard';
import Menu from './components/menu/menu';
import Login from './components/login/login';
import ShowRooms from './components/showRooms/showRooms';
import CustomerBooking from './components/customerBooking/customerBooking';
import VendorBooking from './components/vendorBooking/vendorBooking';
import VendorPendingBooking from './components/vendorPendingBooking/vendorPendingBooking';
import AcceptBookingReject from './components/acceptBookingReject/acceptBookingReject';

function App() {
  return (
    <div className="App">
            
      <BrowserRouter>
     
      <Routes>
        <Route path="/" element={<HomePage />} />
        <Route path="/login" element={<Login />} />
        <Route path="/vendorLogin" element={<VendorLogin />} />
        <Route path="/vendorMenu" element={<VendorMenu />} />
        <Route path="/vendorDashboard" element={<VendorDashboard />} />
        <Route path="/vendorShow" element={<VendorShow />} />
        <Route path="/vendorOrders" element={<VendorOrders />} />
        <Route path="/vendorPendingOrders" element={<VendorPendingOrders />} />
        <Route path="/acceptorReject" element={<AcceptOrderReject />} />
        <Route path="/customerDashboard" element={<CustomerDashBoard />} />
        <Route path="/customerShow" element={<CustomerShow />} />
        <Route path="/customerWallet" element={<CustomerWallet />} />
        <Route path="/customerOrders" element={<CustomerOrders/>} />
        <Route path="/customerPendingOrders" element={<CustomerPendingOrders/>} />
        <Route path="/placeOrders" element={<PlaceOrder/>} />
        <Route path="/placeBooking" element={<PlaceBooking/>} />
        <Route path="/menu" element={<Menu />} />
        <Route path="/showMenu" element={<ShowMenu />} />
        <Route path="/rooms" element={<ShowRooms />}/>
        <Route path="/customerPendingBooking" element={<CustomerPendingBooking/>}/>
        <Route path="/customerBooking" element={<CustomerBooking/>} />
        <Route path="/vendorBooking" element={<VendorBooking />} />
        <Route path="/vendorPendingBooking" element={<VendorPendingBooking/>} />
        <Route path="/acceptorRejectBooking" element={<AcceptBookingReject />} />
      </Routes>

      </BrowserRouter>
     
    </div>
  );
}

export default App;
