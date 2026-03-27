import { useState } from "react";

function Promote() {
  let [employees, setEmployees] = useState([
    "Anu",
    "Mina",
    "Ravi",
    "Sita",
    "Mamatha",
  ]);
  const [staff, setstaff] = useState([
    {
      id: 1,
      name: "Kiran",
      qual: "Engineer",
      pic: "https://i.pinimg.com/736x/eb/96/d4/eb96d45d78ef77a5d1a18c88a3d71660.jpg",
      exp: "20 years exp in Java Enterprise programmingg and coding",
      desc: "Kiran is from Mangalore. He joined the company in the year 2022...",
    },
    {
      id: 2,
      name: "Priya",
      qual: "Designer",
      pic: "https://i.pinimg.com/webp/1200x/ed/6f/72/ed6f72c6de6ba4b1979e455c6014ffca.webp",
      exp: "10 years exp in XYZ Design and hosting",
      desc: "Priya is from Bangalore. She joined the company in the year 2021...",
    },
    {
      id: 3,
      name: "Sonam",
      qual: "HR",
      pic: "https://images.pexels.com/photos/36534339/pexels-photo-36534339.jpeg",
      exp: "5 years exp in HR",
      desc: "Sonam is from Pune. She joined the company in the year 2014...",
    },
  ]);
  const promoteEmp = (emp) => {
    employees = [emp, ...employees.filter((e) => e !== emp)];
    setEmployees(employees);
  };

  return (
    <>
      <h1>Employee Promotion Module!</h1>
      <table>
        <thead>
          <th>Emp.No</th>
          <th>Employee</th>
          <th>Promote</th>
        </thead>
        <tbody>
          {employees.map((emp, index) => (
            <tr>
              <td>{index + 1}</td>
              <td>
                Mr/Ms <strong>{emp}</strong>
              </td>
              <td>
                <button class="btn btn-success">Promote</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>

      {staff.map((item) => (
        <div class="card">
            <img src={item.pic} class="card-img-top" alt="..."></img>
                <div class="card-body">
                    <h5 class="card-title">{item.name}</h5>
                    <p>{item.qual}</p>
                    <p class="card-text">{item.desc}</p>
                    <a href="#" class="btn btn-primary">Read More..</a>
                </div>
        </div>
    ))}
    </>
    );
};
export default Promote;
