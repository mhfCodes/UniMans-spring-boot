<h1>UniManS</h1>
<p>UniManS Is A University Management System Made With <strong>Spring Boot</strong>, <strong>Spring Security</strong>,<br/>
<strong>Spring Data JPA</strong>, <strong>MapStruct</strong> And <strong>Postgresql</strong>.</p>
<p>The Main Lesson That I Learned From Doing This Project Is How To Use MapStruct Which Is<br/>
A Mapping Framework (Actually A Code Generator), Much Much Easier (And Of Course Faster) To Use Than ModelMapper.</p>

<h4>Requests:</h4>

<p><strong>/UniManS</strong> ====> By Sending A Request To This Endpoint Users Will See A Welcome Page</p>
<p><strong>/UniManS/login</strong> ====> By Sending A Request To This Endpoint Uses Can Login</p>
<p><strong>/UniManS/admin/students</strong> ====> Only Admins Can Send Requests To This Endpoint.<br/>
By Sending A Request To This Endpoint, Admin Will Get A List Of All Students</p>
<p><strong>/UniManS/admin/teachers</strong> ====> Only Admins Can Send Requests To This Endpoint.<br/>
By Sending A Request To This Endpoint, Admin Will Get A List Of All Teachers</p>
<p><strong>/UniManS/courses</strong> ====> By Sending A GET Request To This Endpoint, Users Will Get A List Of All Courses</p>
<p><strong>/UniManS/courses</strong> ====> Only Admins Can Send Requests To This Endpoint.<br/>
By Sending A POST Request To This Endpoint, Admins Can Add New Courses And Assign Teachers To Them</p>
<p><strong>/UniManS/student/courses</strong> ====> By Sending A GET Request To This Endpoint, Student Will Get A List Of All Their Chosen Courses</p>
<p><strong>/UniManS/student/courses</strong> ====> By Sending A POST Request To This Endpoint,<br/>
Students Can Add A New Course To Their List Of Chosen Courses</p>
<p><strong>/UniManS/student/courses/{stcId}</strong> ====> By Sending A DELETE Request To This Endpoint,<br/>
Students Can Remove A Course From Their List Of Chosen Courses</p>
<p><strong>/UniManS/teacher/courses</strong> ====> By Sending A GET Request To This Endpoint,<br/>
Teachers Will Get A List Of Their Courses</p>
<p><strong>/UniManS/teacher/courses/{stcId}</strong> ====> By Sending A DELETE Request To This Endpoint,<br/>
Teachers Can Remove A Student From A Course</p>










