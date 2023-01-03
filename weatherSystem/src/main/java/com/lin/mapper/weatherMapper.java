package com.lin.mapper;

import com.lin.pojo.weather;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface weatherMapper {

    void updateFZ(weather t);

    void updateBJ(weather t);

    void updateSH(weather t);

    void deleteFZ();

    void deleteBJ();

    void deleteSH();

    List<weather> queryFZ();

    List<weather> queryBJ();

    List<weather> querySH();

}
