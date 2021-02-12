package com.springdemo.service;

import com.springdemo.model.Speaker;
import com.springdemo.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

//    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
    }

    public SpeakerServiceImpl(SpeakerRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
