package com.service;

import java.io.IOException;
import java.util.List;


import com.model.FilmInfo;


public interface FilmInfoService {
		
	List<FilmInfo> findFilmInfoByChname(String chname);
	
	void downLoadPosterAndModify(String pName,String fName,String pUrl) throws IOException;
	
	void downLoadStillsAndModify(String pName,String fName,String sUrl1,String sUrl2,String sUrl3,String sUrl4) throws IOException;



	
	
}
