import React from "react";
import { useState } from "react";
import { TextField } from "@mui/material";
import Button from "@mui/material/Button";
import axios from "axios";
import { useNavigate } from "react-router";

function BookingAdd() {
    const [fields, setFields] = useState({});
    const [note, setNote] = useState("");
    const [email, setEmail] = useState("");
    const navigate = useNavigate();
    const [service,setService] = useState("");

    const handleNote = (event) => {
        setNote(event.target.value);
    };
    const handleService = (event) => {
        setService(event);
    }
    const handleEmail = (event) => {
        setEmail(event.target.value);
    };

    const handleInputChange = (event) => {
        const { name, value } = event.target;
        setFields((prevState) => ({ ...prevState, [name]: value }));
    };

    const handleSubmit = (event) => {
        event.preventDefault(); // prevent the form from submitting normally

        // retrieve user object from database or authentication system
        axios
            .get(`/system_user?email=${email}`)
            .then((response) => {
                const user = response.data;
                const userId = user.id;

                axios
                    .post("/booking/add", {
                        note: note,
                        userId: userId,
                    })
                    .then((response) => {
                        console.log(response);
                        localStorage.setItem("token", response.data.token);
                        navigate("/");
                    })
                    .catch((error) => {
                        console.log(error);
                    });
            })
            .catch((error) => {
                console.log(error);
            });
    };

    return (
        <form onSubmit={handleSubmit}>
            <div
                style={{
                    display: "flex",
                    justifyContent: "center",
                    alignItems: "center",
                    flexDirection: "column",
                }}
            >
                <TextField
                    size="small"
                    label="Please Enter Your Note Here"
                    variant="outlined"
                    name="note"
                    value={note}
                    onChange={handleNote}
                    style={{ width: "50%", marginBottom: 10, marginTop: 80 }}
                />
                <TextField
                    size="small"
                    label="Email"
                    variant="outlined"
                    name="email"
                    value={email}
                    onChange={handleEmail}
                    style={{ width: "50%", marginBottom: 10 }}
                />
                <TextField
                    size="small"
                    label="Please select the service that you need"
                    variant="outlined"
                    name="field3"
                    value={fields.field3 || ""}
                    onChange={handleInputChange}
                    style={{ width: "50%", marginBottom: 10 }}
                />
                <Button
                    type="submit"
                    variant="contained"
                    color="primary"
                    style={{ width: "50%" }}
                >
                    Submit
                </Button>
            </div>
        </form>
    );
}

export default BookingAdd;
