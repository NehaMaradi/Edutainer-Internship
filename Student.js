import React from "react";
import Exam from "./Exam";
import { useState } from "react";
import { useRef } from "react";
function Student() {
  const [name, setName] = useState("Enter Name");
  const refName= useRef("");
  console.log(refName);
  const cleartext= ()=>{
    setName("");
    refName.current.focus();
  }

  const [students, setStudents] = useState([
    { id: "1", name: "Kiran", subject: "Science", date: "Jan 10th" },
    { id: "2", name: "Simran", subject: "Maths", date: "Aug 15th" },
    { id: "3", name: "Arjun", subject: "History", date: "Nov 20th" },
  ]);
  return (
    <>
      <div className="container">
            <form>
            <label>Enter your name: </label>
            <input ref= {refName} type='text' value={name} onChange={(e)=> (setName(e.target.value))}></input>
            <br/>
            <br/>
            <label>Enter your phone number: </label>
            <input type='text'></input>
            <br/>
            <button className="btn btn-primary" style={{marginLeft: '250px', marginTop:'12px'}}
            onClick={cleartext}>clear</button>
            </form>

            <div>Student</div>
            {/* {students.map((stud, index) => {
            return (
                <Exam
                id={stud.id}
                subject={stud.subject}
                date={stud.date}
                name={stud.name}
                />
            );
            })} */}
      </div>
    </>
  );
}

export default Student;
