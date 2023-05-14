package com.lucidpath.generator;

import com.lucidpath.model.Engineer;
import jakarta.inject.Singleton;
import net.datafaker.Faker;
import net.datafaker.providers.base.Name;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Singleton
public class EngineerGenerator {

    private final Faker faker = new Faker();

    private final Random random = new Random();

    public Engineer buildRandom() {
        final Name name = faker.name();

        return Engineer.builder()
                .firstName(name.firstName())
                .lastName(name.lastName())
                .age(randomAge())
                .primaryProgrammingLanguage(faker.programmingLanguage().name())
                .build();
    }

    public List<Engineer> buildRandom(int count) {
        return IntStream.range(0, count)
                .mapToObj(x -> buildRandom())
                .collect(Collectors.toList());
    }
    private Integer randomAge() {
        final int min = 14;
        final int max = 99;

        return random.nextInt(min, max);
    }

}
