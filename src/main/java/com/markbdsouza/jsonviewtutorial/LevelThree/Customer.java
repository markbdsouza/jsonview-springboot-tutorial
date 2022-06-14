package com.markbdsouza.jsonviewtutorial.LevelThree;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "CUSTOMER_ID", nullable = false)
    @JsonView(LevelThreeViews.Public.class)
    private String customerId;
    @Column(name = "FIRST_NAME", nullable = false, length = 50)
    @JsonView(LevelThreeViews.CustomerDetails.class)
    private String firstName;
    @Column(name = "LAST_NAME", nullable = false, length = 50)
    @JsonView(LevelThreeViews.CustomerDetails.class)
    private String lastName;
}
