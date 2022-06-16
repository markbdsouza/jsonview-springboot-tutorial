package com.markbdsouza.jsonviewtutorial.level3;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    /**
     * GET Mapping without JsonView
     * @return List of Customer inserted in the DB
     */
    @GetMapping("/levelThree/default")
    public List<Customer> getLevelThree() {
        return customerRepository.findAll();
    }

    /**
     * GET Mapping with Public JsonView
     * @return List of Customer inserted in the DB
     */
    @JsonView(LevelThreeViews.Public.class)
    @GetMapping("/levelThree/public")
    public List<Customer> getLevelThreePublic() {
        return customerRepository.findAll();
    }

    /**
     * GET Mapping with CustomerDetails JsonView which extends Public as well
     * @return List of Customer inserted in the DB
     */
    @JsonView(LevelThreeViews.CustomerDetails.class)
    @GetMapping("/levelThree/details")
    public List<Customer> getLevelThreeDetails() {
        return customerRepository.findAll();
    }

}
