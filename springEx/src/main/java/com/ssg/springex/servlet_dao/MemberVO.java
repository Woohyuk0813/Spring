package com.ssg.springex.servlet_dao;
import lombok.Data;

import java.sql.Date;

@Data


public class MemberVO {
    private String id;
    private String password;
    private String name;
    private String email;
    private Date joinDate;

}