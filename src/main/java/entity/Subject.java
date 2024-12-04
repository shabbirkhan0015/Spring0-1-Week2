package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;


    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;


    @ManyToMany(mappedBy = "subjects")
    private List<Student> students;
}