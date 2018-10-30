package com.controller;

import java.io.IOException;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.model.FilmInfo;
import com.service.FilmInfoService;

/**
 * @author wangzehui
 */

@Controller
@RequestMapping("/filmInfo")
public class FilmInfoController {
    @Resource
    private FilmInfoService filmInfoService;

//	@RequestMapping("findFilmInfo")
//	 public String findFilmInfo(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
//        List<FilmInfo> listFilmInfo = filmInfoService.findFilmInfo();
//        request.setAttribute("listFilmInfo",listFilmInfo);
////        request.getRequestDispatcher("/jsp/filmFilmByChname.jsp").forward(request, response);
//        return "/filmInfo";
//    }


    /**
     * 控制视图跳转
     */
    @RequestMapping("findFilmInfoByChname")
    public ModelAndView findFilmInfoByChname(String chname) {
        List<FilmInfo> listFilmInfoByChname = filmInfoService.findFilmInfoByChname(chname);
        ModelAndView mav = new ModelAndView("/filmInfoByChname");
        mav.addObject("listFilmInfoByChname", listFilmInfoByChname);
        return mav;

    }

    /**
     * 修改海报
     */
    @RequestMapping("downLoadPosterAndModify")
    public Object downLoadPosterAndModify(String pName, String fName, String pUrl) throws IOException {
        filmInfoService.downLoadPosterAndModify(pName, fName, pUrl);
        return "/filmInfoByChname";

    }


    /**
     * 修改剧照
     */
    @RequestMapping("downLoadStillsAndModify")
    public Object downLoadStillsAndModify(String pName, String fName, String sUrl1, String sUrl2, String sUrl3, String sUrl4) throws IOException {
        filmInfoService.downLoadStillsAndModify(pName, fName, sUrl1, sUrl2, sUrl3, sUrl4);
        return "/filmInfoByChname";

    }


}
