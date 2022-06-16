package com.markbdsouza.jsonviewtutorial.level2;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class School {

    @JsonView(LevelTwoViews.BasicStudentDetails.class)
    private String schoolName;
}
