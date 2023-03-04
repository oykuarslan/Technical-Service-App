    import React from "react";
    import { Link } from 'react-router-dom';
    import { AppBar, IconButton, Toolbar, Typography } from '@mui/material';
    import MenuIcon from '@mui/icons-material/Menu';

    // Define your custom styles
    const customStyles = {
        color: 'white',
        textDecoration: 'none',
        size: 'large'
    };


    function Navbar() {
        const styles = {
            backgroundColor: '#17072b',
        }




        let userId = 2;
        return (
            <div >
                <AppBar position="static" style = {styles}>
                    <Toolbar>
                        <IconButton
                            size="large"
                            edge="start"
                            color="inherit"
                            aria-label="menu"
                            sx={{ mr: 2 }}
                        >
                            <MenuIcon />
                        </IconButton>
                        <Typography textAlign= "left" variant="h6" component="div" sx={{ flexGrow: 1 }}>
                            <Link underline = "none" to="" style={customStyles}>
                                Home
                            </Link>
                        </Typography>
                        <Link to={{ pathname: '/user/' + userId }} style={customStyles}>
                            User
                        </Link>
                    </Toolbar>
                </AppBar>
            </div>
        );
    }

    export default Navbar;