package com.elasticsearch.practice.respository;

import com.elasticsearch.practice.entity.Club;

import java.util.List;

public interface CustomClubSearchRepository {
    List<Club> searchByTitle(String title);
}
