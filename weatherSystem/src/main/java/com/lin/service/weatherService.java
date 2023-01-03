package com.lin.service;

import com.lin.pojo.weather;

import java.util.List;

public interface weatherService {

    void updateFZ();

    void updateBJ();

    void updateSH();

    List<weather> queryFZ();

    List<weather> queryBJ();

    List<weather> querySH();

}
