package com.markbdsouza.jsonviewtutorial.LevelTwo;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    /**
     * GET without any json view
     *
     * @return created Student
     */
    @GetMapping("/levelTwo/default")
    public Student getLevelTwoDefault() {
        return createStudent();
    }

    /**
     * GET with lowest view Public
     *
     * @return created Student
     */
    @JsonView(LevelTwoViews.Public.class)
    @GetMapping("/levelTwo/public")
    public Student getLevelTwoPublic() {
        return createStudent();
    }

    /**
     * GET with BasicStudentDetails View which extends Public
     *
     * @return created Student
     */
    @JsonView(LevelTwoViews.BasicStudentDetails.class)
    @GetMapping("/levelTwo/basic")
    public Student getLevelTwoBasicDetails() {
        return createStudent();
    }

    /**
     * GET with AllStudentDetails View which extends BasicStudentDetails,Public
     *
     * @return created Student
     */
    @JsonView(LevelTwoViews.AllStudentDetails.class)
    @GetMapping("/levelTwo/all")
    public Student getLevelTwoAllDetails() {
        return createStudent();
    }

    /**
     * POST Mapping without any views
     *
     * @param student
     * @return same student
     */
    @PostMapping("/levelTwo/default")
    public Student postLevelTwoDefault(@RequestBody Student student) {
        System.out.println(student);
        return student;
    }

    /**
     * POST Mapping with Public View. Instance variables of Student without Public view will not be deserialized
     *
     * @param student
     * @return same student
     */
    @PostMapping("/levelTwo/public")
    public Student postLevelTwoBasic(@RequestBody @JsonView(LevelTwoViews.Public.class) Student student) {
        System.out.println(student);
        return student;
    }

    /**
     * create a Student for test purposes
     *
     * @return created Student
     */
    private static Student createStudent() {
        Student student = new Student();
        student.setAge(15);
        student.setFullName("Mark Dsouza");
        student.setWeight(49);
        student.setHeight(150);
        student.setClassName("VIII");
        student.setSchool(createSchool());
        student.setScores(createSubjectScoreList());
        return student;
    }

    /**
     * Create School object
     *
     * @return created school
     */
    private static School createSchool() {
        School school = new School();
        school.setSchoolName("Indian Public School");
        return school;
    }

    /**
     * create list of subject scores
     *
     * @return list of subject scores
     */
    private static List<SubjectScore> createSubjectScoreList() {
        List<SubjectScore> subjectScoreList = new ArrayList<>();
        SubjectScore mathScore = new SubjectScore();
        mathScore.setScore(80);
        mathScore.setSubject("Math");
        mathScore.setTeacher("Mr. John Watts");
        SubjectScore englishScore = new SubjectScore();
        englishScore.setScore(80);
        englishScore.setSubject("English");
        englishScore.setTeacher("Mrs. Mary Johnson");
        subjectScoreList.add(mathScore);
        subjectScoreList.add(englishScore);
        return subjectScoreList;
    }

}
