package com.springdemo.service;

import com.springdemo.model.Speaker;
import com.springdemo.repository.HibernateSpeakerRepositoryImpl;
import com.springdemo.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
