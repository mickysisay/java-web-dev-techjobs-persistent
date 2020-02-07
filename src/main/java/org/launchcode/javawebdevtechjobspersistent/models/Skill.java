package org.launchcode.javawebdevtechjobspersistent.models;

import org.apache.catalina.User;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs= new ArrayList<>();
    @Size(min = 3, max = 100, message = "skill description must be between 3 and 100 characters")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Skill(){

    }

}