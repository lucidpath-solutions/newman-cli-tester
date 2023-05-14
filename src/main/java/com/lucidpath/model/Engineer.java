package com.lucidpath.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Engineer {
    private String firstName;
    private String lastName;
    private Integer age;
    private String primaryProgrammingLanguage;
}
