import React from "react";
import {Link} from "react-router-dom";
import Button from "@mui/material/Button";

function Home(){

    const styles = {
        backgroundImage: `url("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.istockphoto.com%2Fillustrations%2Fdrawing-of-a-computer-repair&psig=AOvVaw3VMEFiAMy3mHJXIVVbwRfF&ust=1677960561296000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCNjU867IwP0CFQAAAAAdAAAAABAI")`,
        backgroundColor: '#17072b',
        height: '90vh',
        width: '100vw',
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
        justifyContent: 'center',
    };

    return (
        <div style={styles}>
            <h1 style={{ color: '#f6f6f6',    lineHeight: '2'}} > Welcome to Our Service</h1>
            <h2 style={{marginTop:5, color: '#7c5aa7'}} > Please Select Your Action</h2>
            <div style =  {{ display: 'flex', flexDirection: 'column', alignItems: 'center' }}>
                <Button component={Link} to="/booking" variant="contained" style={{ marginTop: 10, background: '#f9cf13', color: '#17072b',  }}>Booking</Button>
                <Button component={Link} to="/sale" variant="contained" style={{ marginTop: 15, background: '#fad013', color: '#17072b' }}>Technical Service</Button>
            </div>
        </div>

    )
}
export default Home;