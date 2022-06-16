package com.markbdsouza.jsonviewtutorial.level1;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    @JsonView({LevelOneViews.Public.class})
    private int userId;
    @JsonView(LevelOneViews.UserNameDetails.class)
    private String firstName;
    @JsonView(LevelOneViews.UserNameDetails.class)
    private String lastName;
    @JsonView({LevelOneViews.UserDetails.class, LevelOneViews.OtherDetails.class})
    private String email;
    @JsonView({LevelOneViews.UserDetails.class, LevelOneViews.OtherDetails.class})
    private String organization;
    private Boolean isActive;
}
