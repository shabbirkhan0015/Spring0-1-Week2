package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    // One professor teaches many subjects
    @OneToMany(mappedBy = "professor")
    private List<Subject> subjects;

    // Many professors can have many students
    @ManyToMany(mappedBy = "professors")
    private List<Student> students;
}