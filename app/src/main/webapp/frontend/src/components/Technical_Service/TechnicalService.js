import React from 'react';
import Button from "@mui/material/Button";
import {Link} from "react-router-dom";

function TechnicalService(){
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
            <h1 style={{ color: '#f6f6f6',    lineHeight: '2'}} > I would like to ... </h1>
            <div style =  {{ display: 'flex', flexDirection: 'column', alignItems: 'center' }}>
                <Button component={Link} to="/booking/add" variant="contained" style={{ marginTop: 10, background: '#f9cf13', color: '#17072b',  }}>get a proposal</Button>
                <Button component={Link} to="/sale" variant="contained" style={{ marginTop: 15, background: '#fad013', color: '#17072b' }}>i want to buy products</Button>
            </div>
        </div>
    );
}
export default TechnicalService;