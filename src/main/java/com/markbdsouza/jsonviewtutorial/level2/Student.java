package com.markbdsouza.jsonviewtutorial.level2;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Student {
    @JsonView(LevelTwoViews.Public.class)
    private String fullName;
    @JsonView(LevelTwoViews.BasicStudentDetails.class)
    private float height;
    @JsonView(LevelTwoViews.BasicStudentDetails.class)
    private float weight;
    @JsonView(LevelTwoViews.Public.class)
    private int age;
    @JsonView(LevelTwoViews.BasicStudentDetails.class)
    private String className;
    // One to Many Relationship
    @JsonView(LevelTwoViews.AllStudentDetails.class)
    private List<SubjectScore> scores;
    // One to One Relationship
    @JsonView(LevelTwoViews.BasicStudentDetails.class)
    private School school;
}
