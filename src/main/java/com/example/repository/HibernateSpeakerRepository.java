package com.example.repository;

import com.example.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepository implements SpeakerRepository {
    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers=new ArrayList<Speaker>();
        Speaker speaker=new Speaker();
        speaker.setFirstName("Ask");
        speaker.setLastName("Adam");
        speakers.add(speaker);
        return speakers;

    }
}
