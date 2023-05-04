-- use ad-sba-sql;

-- Create a query that lists each department and the number of ocurses offered by that department. The output should be sorted first by the Number of Courses in ascending order, then by Department Name in ascending order.

-- select department.name, count(course.id) as num_courses
-- from department
-- join course on department.id = course.deptId
-- group by department.name
-- order by num_courses, department.name;


-- Create a query that lists the name of each course and the number of students in that course. The output should be sorted by the Number of Students in descending order, then by Course Name in ascending order.

-- select course.name, count(studentCourse.studentId) as num_students
-- from course
-- join studentCourse on course.id = studentCourse.courseId
-- group by course.name
-- order by num_students desc, course.name;

-- Create a query that lists the names of all Courses where the number of faculty assigned to those courses is zero. The output should be sorted by Course Name in ascending alphabetical order.

-- select course.name
-- from course
-- where course.id not in (select courseId from facultyCourse)
-- order by course.name;

-- Create a query that lists the Coruse Names and the Number of Students in those courses for all courses where there are no assigned faculty. The output should be sorted by the Number of Students in descending order, then by Course Name in ascending order.

-- select course.name, count(studentCourse.studentId) as num_students
-- from course
-- join studentCourse on course.id = studentCourse.courseId
-- where course.id not in (select courseId from facultyCourse)
-- group by course.name
-- order by num_students desc, course.name;

-- Create a query that lists the TotalNumber of Students that were enrolled in classes during each School Year. The first column should have the header "Students". Provide a second "Year" column showing the enrollment year.
-- The output should be sorted first by the School Year in ascending order, then by Total Number of Students in descending order.

select count(distinct studentId) as 'Students', year(startDate) as 'Year'
from studentCourse
group by year(startDate)
order by year(startDate) asc, count(distinct studentId) desc;

-- Create a query that lists the Start Date and Total Number of Students who enrolled in classes in August of each year. The output should be ordered by the Start Date in ascending order, then by Total Number of Students in ascending order.

-- select studentCourse.startDate, count(distinct studentCourse.studentId) as 'Students'
-- from studentCourse
-- where MONTH(studentCourse.startDate) = 8
-- group by studentCourse.startDate
-- order by studentCourse.startDate, count(*) desc;

-- Create a query that lists students firstname, lastname, and the number of courses they are taking in their major department. The output should be sorted by the number of courses in descending order, then by first name in ascending order, then by the last name in ascending order.

-- select student.firstName, student.lastName, count(studentCourse.studentId) as num_courses
-- from student
-- join studentCourse on student.id = studentCourse.studentId
-- join course on studentCourse.courseId = course.id
-- where course.deptId = student.majorId
-- group by student.firstName, student.lastName
-- order by num_courses desc, student.firstName, student.lastName;

-- Create a query that lists firstName, lastName and average progress of all students achieving average progress of less than 50%. The average progress displayed should be rounded to one decimal place. The output should be sorted by the average progress in descending order, then by first name in ascending order, then by last name in ascending order.

-- select student.firstName, student.lastName, round(avg(studentCourse.progress), 1) as avg_progress
-- from student
-- join studentCourse on student.id = studentCourse.studentId
-- group by student.firstName, student.lastName
-- having avg(studentCourse.progress) < 50
-- order by avg_progress desc, student.firstName, student.lastName;

-- Create a query that lists each course name and the average progress of students in that course. The average progress displayed should be rounded to one decimal place. The output should be sorted first by average progress in descending order, then by course name in ascending order.

-- select course.name, round(avg(studentCourse.progress), 1) as avg_progress
-- from course
-- join studentCourse on course.id = studentCourse.courseId
-- group by course.name
-- order by avg_progress desc, course.name;

-- Create a query that shows the course name and teh average student progress of the course with the highest average progress in the system. Teh average progress displayed should be rounded to one decimal place.

-- select course.name, round(avg(studentCourse.progress), 1) as 'average'
-- from course
-- join studentCourse on course.id = studentCourse.courseId
-- group by course.name
-- order by average desc, course.name
-- limit 1;

-- Create a query that outputs the faculty first name, last name and the average progress made over all of their courses. The average progress displayed should be rounded to one decimal place. The output should be sorted by the average progress in descending order, then by faculty first name in ascending order, then by faculty last name in ascending order.

-- select faculty.firstName, faculty.lastName, round(avg(studentCourse.progress), 1) as avg_progress
-- from faculty
-- join facultyCourse on faculty.id = facultyCourse.facultyId
-- join course on facultyCourse.courseId = course.id
-- join studentCourse on course.id = studentCourse.courseId
-- group by faculty.firstName, faculty.lastName
-- order by avg_progress desc, faculty.firstName, faculty.lastName;


-- progress < 40 = F
-- progress < 50 = D
-- progress < 60 = C
-- progress < 70 = B
-- progress >=70 = A

-- Create a query that displays each students firstname, lastname, miminum grade based on their minimum progress, and maximum grad based on their maximum progress. The output should be soreted by minimum grade in descending order, then by maximum grade in descending order, then by first name in ascending order, then by last name in ascending order.

-- select student.firstName, student.lastName,
-- case
-- when min(studentCourse.progress) < 40 then 'F'
-- when min(studentCourse.progress) < 50 then 'D'
-- when min(studentCourse.progress) < 60 then 'C'
-- when min(studentCourse.progress) < 70 then 'B'
-- else 'A'

-- end as min_grade,
-- case
-- when max(studentCourse.progress) < 40 then 'F'
-- when max(studentCourse.progress) < 50 then 'D'
-- when max(studentCourse.progress) < 60 then 'C'
-- when max(studentCourse.progress) < 70 then 'B'
-- else 'A'
-- end as max_grade
-- from student
-- join studentCourse on student.id = studentCourse.studentId
-- group by student.firstName, student.lastName
-- order by min_grade desc, max_grade desc, student.firstName asc, student.lastName asc;
