package com.example.springdatajpaexample.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;

@Getter
@Entity
@Table(name = "member")
public class Member {

  @Id
  @Column(name = "id")
  private String id;

  @Column(name = "name")
  private String userName;

  @Column(name = "age")
  private Integer age;

  @Enumerated(EnumType.STRING)
  private RoleType roleType;

  @Temporal(TemporalType.TIMESTAMP)
  private Date createdAt;
}
