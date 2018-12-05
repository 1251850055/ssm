package com.mapper;

import java.util.List;

import com.model.FilmInfo;
import org.springframework.stereotype.Repository;


@Repository
public interface FilmInfoMapper {

    List<FilmInfo> findFilmInfoByChname(String chname);


}
