package com.AshuBoi.SpringBootRestCrud;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {
    private long id;
    private String courseName;
    private String author;
}
