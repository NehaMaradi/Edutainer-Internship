import React from "react";
import Student from "./Student";

function Exam(props) {
  return (
    <>
      <div className="container" style={{backgroundColor:'lightblue', borderRadius:'12px', width:'550px', marginTop: '25px'}}>
        <div className="jumbotron">
          <h1 className="display-4">{props.name}</h1>
          <p className="lead">Exam details coming from the child component</p>
          <hr className="my-4" />
          <p>Subject: {props.subject}</p>
          <p>Date: {props.date}</p>
          <p className="lead">
            <button type="button" className="btn btn-primary btn-lg">Student ID: {props.id}</button>
          </p>
        </div>
      </div>
    </>
  );
}

export default Exam;
