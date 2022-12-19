package com.example.eaproject1.domian;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public
class Faculty extends Person {
    private Long id;
    private String title;
//    @OneToMany(mappedBy = "faculty")
//    @JsonManagedReference
//    private List<CourseOffering> courseOfferings;
}
