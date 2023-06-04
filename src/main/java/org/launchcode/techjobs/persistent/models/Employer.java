package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Employer extends AbstractEntity {
    @NotBlank(message = "Location is required")
    @Size(min = 3, max = 100, message = "Location must be between 3 and 100 characters")
    private String location;


//    Within Employer, add a private property jobs of type List<Job> and initialize it to an empty ArrayList.
//    After we set up the Job class to work with Employer objects, this list will represent the list of all items in a given job.
//    We’ll do this in a bit.
//
//    Use the @OneToMany and @JoinColumn annotations on the jobs list in Employer to declare the relationship between data tables.
//    Recall that this annotation needs a name parameter. What should its value be?

    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

//    public Employer(String location) {
//        this.location = location;
//    }

    public Employer(){}

    public Employer(String local){
        this.location = local;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
