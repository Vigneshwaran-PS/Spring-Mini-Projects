<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Student Management</title>
  <link rel="stylesheet" href="./styling.css">
</head>
<body>
  <div id="main">
    <div class="form1">
      <form action="addStudent" method="post">
        <div>
          <h2>Student Enroll</h2>
          <label for="rollno">Roll No</label>
          <input type="text" name="rollno" id="rollno">
        </div>
        <div>
          <label for="name">Name</label>
          <input type="text" name="name" id="name">
        </div>
        <div>
          <label for="department">Department</label>
          <input type="text" name="department" id="department">
        </div>
        <div>
          <label for="cgpa">CGPA</label>
          <input type="text" name="cgpa" id="cgpa">
        </div>
        <div class="bt">
          <button type="submit">Submit</button>
        </div>
      </form>
    </div>

    <div class="form2">
      <form action="getStudent" method="get">
        <h2>Enter Roll No to Get Details</h2>
        <div>
          <label for="rollno">Roll No</label>
          <input type="text" name="rollno" id="rollno">
        </div>
        <div>
          <button type="submit">Submit</button>
        </div>
      </form>
    </div>

    <div class="form3">
      <form action="deleteStudent" method="post">
        <h2>Enter Roll No to Delete Details</h2>
        <div>
          <label for="rollno">Roll No</label>
          <input type="text" name="rollno" id="rollno">
        </div>
        <div>
          <button type="submit">Delete</button>
        </div>
      </form>
    </div>

    <div class="form4">
      <form action="updateStudent" method="get">
        <h2>Enter Roll No to Update Details</h2>
        <div>
          <label for="rollno1">Roll No</label>
          <input type="text" name="rollno" id="rollno1">
        </div>
        <div>
          <button type="submit">Update</button>
        </div>
      </form>
    </div>

  </div>


</body>
</html>