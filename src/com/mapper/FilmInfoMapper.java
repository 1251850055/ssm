package com.mapper;

import java.util.List;

import com.model.FilmInfo;

public interface FilmInfoMapper {

    List<FilmInfo> findFilmInfoByChname(String chname);


}
