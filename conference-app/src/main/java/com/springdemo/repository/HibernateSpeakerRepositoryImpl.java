package com.springdemo.repository;

import com.springdemo.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Rob");
        speaker.setLastName("White");
        speakers.add(speaker);

        return speakers;
    }
}
