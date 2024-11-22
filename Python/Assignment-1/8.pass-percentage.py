# Find out pass-percentage of a class.
# A teacher is entering the marks of students.
# A student passes a course if the marks are at
# least 40 (out of 100). The teacher wants to
# know the percentage of students passed.

marks = []
print("\n")
for mark in range(10):
    mark = int(input("Enter marks : "))
    marks.append(mark)

students = len(marks)

passed = sum(mark >= 40 for mark in marks)
failed = sum(mark < 40 for mark in marks)

pass_per = (passed / students) * 100
fail_per = (failed / students) * 100

print("\n")
print(f"Pass percentage:{pass_per:.2f}")
print(f"Fail percentage: {fail_per:.2f}")
print("\n")
print("The Out Of {0} Student's,{1} Student's is Passed,And {2} Student's is Failed".format(students,passed,failed))
print("\n")