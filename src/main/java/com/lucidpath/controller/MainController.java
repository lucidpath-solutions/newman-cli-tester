package com.lucidpath.controller;

import com.lucidpath.generator.EngineerGenerator;
import com.lucidpath.model.Engineer;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/main")
public class MainController {

    @Inject
    private EngineerGenerator engineerGenerator;

    @Get(produces = MediaType.APPLICATION_JSON)
    public HttpResponse<List<Engineer>> allEngineers() {
        return HttpResponse.ok(
                engineerGenerator.buildRandom(20)
        );
    }
}
