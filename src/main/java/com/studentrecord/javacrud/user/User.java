package com.studentrecord.javacrud.user;

import javax.persistence.*;

@Entity
@Table(name="users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 25, nullable = false, name="full_name")
    private String fullName;

    @Column(length =25, nullable = false, name="class")
    private String grade;

    @Column(length = 25, nullable = false, unique = true, name="roll_num")
    private String rollNo;

    @Column(length = 25, nullable = false, name="department")
    private String department;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", grade='" + grade + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
