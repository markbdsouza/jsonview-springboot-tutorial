package com.markbdsouza.jsonviewtutorial.LevelTwo;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SubjectScore {

    @JsonView(LevelTwoViews.AllStudentDetails.class)
    private String subject;
    @JsonView(LevelTwoViews.AllStudentDetails.class)
    private int score;
    private String teacher;
}
