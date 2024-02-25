<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <link rel="stylesheet" href="./styling.css">
</head>
<body>
  <div class="update">
    <div class="form5">
      <form action="updateStudent" method="post">
        <h2>Update Details</h2>
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
        <div>
          <button type="submit">Submit</button>
        </div>
      </form>
    </div>
  </div>

</body>
</html>