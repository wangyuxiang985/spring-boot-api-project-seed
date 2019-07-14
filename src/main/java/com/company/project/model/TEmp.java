package com.company.project.model;

import javax.persistence.*;

@Table(name = "t_emp")
public class TEmp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer age;

    @Column(name = "deptId")
    private Integer deptid;

    private Integer empno;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return deptId
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * @param deptid
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    /**
     * @return empno
     */
    public Integer getEmpno() {
        return empno;
    }

    /**
     * @param empno
     */
    public void setEmpno(Integer empno) {
        this.empno = empno;
    }
}