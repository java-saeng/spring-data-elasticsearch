package com.elasticsearch.practice.entity;

import com.elasticsearch.practice.respository.ClubRepository;
import com.elasticsearch.practice.respository.ClubSearchRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClubServiceTest {

    @Autowired
    ClubRepository clubRepository;

    @Autowired
    ClubSearchRepository clubSearchRepository;

    @BeforeEach
    public void init() {
        for (int i = 0; i < 10000; i++) {
            Club club = new Club("hyeonwoo " + i, "description" + i);
            Club savedClub = clubRepository.save(club);
            clubSearchRepository.save(savedClub);
        }
    }
}