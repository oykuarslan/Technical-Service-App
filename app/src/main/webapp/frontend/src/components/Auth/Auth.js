import { useState } from "react";
import React from "react";
import axios from "axios";
import Button from "@mui/material/Button";
import {FormHelperText, InputLabel, Input, FormControl} from "@mui/material";
import {useNavigate} from "react-router";


const Auth = () => {
    const [username, setUsername] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const navigate = useNavigate();
    const [error, setError] = useState("");

    const handleUsername = (value) => {
        setUsername(value);
    };

    const handleEmail = (value) => {
        setEmail(value);
    };

    const handlePassword = (value) => {
        setPassword(value);
    };

    const handleRegister = () => {
        axios
            .post("/api/auth/register", {
                username: username,
                email: email,
                password: password,
            })
            .then((response) => {
                console.log(response);
                localStorage.setItem("token", response.data.token);
                navigate("/");
            })
            .catch((error) => {
                console.log(error);
                setError(error);
            });
    };

    const handleLogin = () => {
        axios
            .post("/api/auth/login", {
                username: username,
                password: password,
            })
            .then((response) => {
                console.log(response);
                localStorage.setItem("token", response.data.token);
                navigate("/");
            })
            .catch((error) => {
                console.log("login error", error);
                setError(error);
            });
    };

    return(
        <FormControl>
            <InputLabel style = {{top:50}}>Username</InputLabel>
            <Input style={{top:40}}
                   onChange={i => handleUsername(i.target.value)} />
            <InputLabel style={{top:100}}>Email</InputLabel>
            <Input style={{top:40}}
                   onChange={i => handleEmail(i.target.value)}
            />
            <InputLabel style={{top:145}}>Password</InputLabel>
            <Input style={{top:40}}
                   onChange={i => handlePassword(i.target.value)}/>
            <Button variant = "contained" style={{marginTop:60, background: '#a2a6eb', color:'white'}} onClick = {handleRegister}>Register</Button>

            <FormHelperText style={{marginTop : 20}}>Are you already registered?</FormHelperText>
            <Button variant = "contained" style={{marginTop:10, background:'#b4e0dd',color:'white'}} onClick = {handleLogin}>Login</Button>

            <div className="error-message">{error && error.message}</div>
        </FormControl>
    )
};
export default Auth;
