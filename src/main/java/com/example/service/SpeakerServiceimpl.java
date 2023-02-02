package com.example.service;

import com.example.model.Speaker;
import com.example.repository.HibernateSpeakerRepository;
import com.example.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceimpl implements SpeakerService {

    private SpeakerRepository repository=new HibernateSpeakerRepository();
    public List<Speaker> findAll(){
        return  repository.findAll();
    }
}
