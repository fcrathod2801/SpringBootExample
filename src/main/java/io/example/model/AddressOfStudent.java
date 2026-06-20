package io.example.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="address")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddressOfStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String street;
    private String city;
    private String state;
    private String zipCode;

    @ManyToOne
    @JoinColumn(name = "stud_id")
            @JsonBackReference
    Stud stud;

}
