package org.home.GetPersonServiceDBPost;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class PersonRequest {
    @JsonProperty("lastName")
    @NotNull
    String lastName;
    @JsonProperty("lastName")
    @NotNull
    String firstName;
    @JsonProperty("lastName")
    @NotNull
    @Min(1)
    Integer age;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getAge() {
        return age;
    }
}
