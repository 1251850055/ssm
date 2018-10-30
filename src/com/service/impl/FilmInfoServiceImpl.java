package com.service.impl;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import javax.annotation.Resource;
import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;
import com.mapper.FilmInfoMapper;
import com.model.FilmInfo;
import com.service.FilmInfoService;

/**
 * @author wangzehui
 */
@SuppressWarnings("ALL")
@Service
public class FilmInfoServiceImpl implements FilmInfoService {
    @Resource
    public FilmInfoMapper filmInfoMapper;

    /**
     * 查询影片信息
     */
    @Override
    public List<FilmInfo> findFilmInfoByChname(String chname) {
        List<FilmInfo> findFilmInfoByChname = filmInfoMapper.findFilmInfoByChname(chname);
        return findFilmInfoByChname;
    }


    /**
     * 下载海报然后修改
     */
    @Override
    public void downLoadPosterAndModify(String pName, String fName, String pUrl) throws IOException {
        //文件名字
        String hipiaoFileName = pName;
        String fileName = fName;

        char v = 'v';
        char w = 'W';
        String imageUrl = null;
        if (v == pUrl.charAt(1)) {
            //图片网络地址1
            imageUrl = "http://newimg.vcfilm.cn" + pUrl;
        } else if (w == pUrl.charAt(0)) {
            imageUrl = "http://img.vcfilm.cn/resource/" + pUrl;
        } else {

        }

        //加载地址
        URL url = new URL(imageUrl);
        //打开网络输入流
        DataInputStream dis = new DataInputStream(url.openStream());
        //图片存储本地地址
        String posterPicture = "E:\\我的图片\\" + hipiaoFileName + "\\" + fileName + "\\1.jpg";
        //建立一个新的文件
        FileOutputStream fos = new FileOutputStream(new File(posterPicture));
        byte[] buffer = new byte[1024];
        int length;
        //开始填充数据
        while ((length = dis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }
        dis.close();
        fos.close();


        File file = new File(posterPicture);
        Image src;
        src = javax.imageio.ImageIO.read(file);

        int wideth1 = 531;
        int height1 = 760;
        BufferedImage tag1 = new BufferedImage(wideth1, height1, BufferedImage.TYPE_INT_RGB);
        tag1.getGraphics().drawImage(src, 0, 0, wideth1, height1, null);

        int wideth2 = 171;
        int height2 = 245;
        BufferedImage tag2 = new BufferedImage(wideth2, height2, BufferedImage.TYPE_INT_RGB);
        tag2.getGraphics().drawImage(src, 0, 0, wideth2, height2, null);

        int wideth3 = 156;
        int height3 = 216;
        BufferedImage tag3 = new BufferedImage(wideth3, height3, BufferedImage.TYPE_INT_RGB);
        tag3.getGraphics().drawImage(src, 0, 0, wideth3, height3, null);


        //修改三种图片的本地地址
        String da = "E:\\我的图片\\" + hipiaoFileName + "\\" + fileName + "\\da.jpg";
        String zhong = "E:\\我的图片\\" + hipiaoFileName + "\\" + fileName + "\\zhong.jpg";
        String xiao = "E:\\我的图片\\" + hipiaoFileName + "\\" + fileName + "\\xiao.jpg";

        String formatName1 = da.substring(da.lastIndexOf(".") + 1);
        ImageIO.write(tag1, formatName1, new File(da));

        String formatName2 = zhong.substring(zhong.lastIndexOf(".") + 1);
        ImageIO.write(tag2, formatName2, new File(zhong));

        String formatName3 = xiao.substring(xiao.lastIndexOf(".") + 1);
        ImageIO.write(tag3, formatName3, new File(xiao));

    }

    /**
     * 下载剧照然后修改
     */
    @Override
    public void downLoadStillsAndModify(String pName, String fName, String sUrl1, String sUrl2, String sUrl3, String sUrl4) throws IOException {
        //文件名字
        String hipiaoFileName = pName;
        String fileName = fName;
        //判断图片网络地址
        char v = 'v';
        char w = 'W';
        if (v == sUrl1.charAt(1)) {
            String imageUrl1 = "http://newimg.vcfilm.cn" + sUrl1;
            String imageUrl2 = "http://newimg.vcfilm.cn" + sUrl2;
            String imageUrl3 = "http://newimg.vcfilm.cn" + sUrl3;
            String imageUrl4 = "http://newimg.vcfilm.cn" + sUrl4;
            modify(hipiaoFileName, fileName, imageUrl1, imageUrl2, imageUrl3, imageUrl4);
        } else if (w == sUrl1.charAt(0)) {
            String imageUrl1 = "http://img.vcfilm.cn/resource/" + sUrl1;
            String imageUrl2 = "http://img.vcfilm.cn/resource/" + sUrl2;
            String imageUrl3 = "http://img.vcfilm.cn/resource/" + sUrl3;
            String imageUrl4 = "http://img.vcfilm.cn/resource/" + sUrl4;
            modify(hipiaoFileName, fileName, imageUrl1, imageUrl2, imageUrl3, imageUrl4);
        } else {

        }

    }

    private void modify(String hipiaoFileName, String fileName, String imageUrl1, String imageUrl2, String imageUrl3, String imageUrl4) throws IOException {
        //加载地址
        URL url1 = new URL(imageUrl1);
        URL url2 = new URL(imageUrl2);
        URL url3 = new URL(imageUrl3);
        URL url4 = new URL(imageUrl4);

        //打开网络输入流
        DataInputStream dis1 = new DataInputStream(url1.openStream());
        DataInputStream dis2 = new DataInputStream(url2.openStream());
        DataInputStream dis3 = new DataInputStream(url3.openStream());
        DataInputStream dis4 = new DataInputStream(url4.openStream());

        //图片存储本地地址
        String posterPicture1 = "E:\\我的图片\\" + hipiaoFileName + "\\" + fileName + "\\2.jpg";
        String posterPicture2 = "E:\\我的图片\\" + hipiaoFileName + "\\" + fileName + "\\3.jpg";
        String posterPicture3 = "E:\\我的图片\\" + hipiaoFileName + "\\" + fileName + "\\4.jpg";
        String posterPicture4 = "E:\\我的图片\\" + hipiaoFileName + "\\" + fileName + "\\5.jpg";

        //建立一个新的文件
        FileOutputStream fos1 = new FileOutputStream(new File(posterPicture1));
        FileOutputStream fos2 = new FileOutputStream(new File(posterPicture2));
        FileOutputStream fos3 = new FileOutputStream(new File(posterPicture3));
        FileOutputStream fos4 = new FileOutputStream(new File(posterPicture4));

        byte[] buffer = new byte[1024];
        int length;

        //开始填充数据
        while ((length = dis1.read(buffer)) > 0) {
            fos1.write(buffer, 0, length);
        }
        dis1.close();
        fos1.close();

        while ((length = dis2.read(buffer)) > 0) {
            fos2.write(buffer, 0, length);
        }
        dis2.close();
        fos2.close();

        while ((length = dis3.read(buffer)) > 0) {
            fos3.write(buffer, 0, length);
        }
        dis3.close();
        fos3.close();

        while ((length = dis4.read(buffer)) > 0) {
            fos4.write(buffer, 0, length);
        }
        dis4.close();
        fos4.close();

        Image src1;
        Image src2;
        Image src3;
        Image src4;

        File file1 = new File(posterPicture1);
        File file2 = new File(posterPicture2);
        File file3 = new File(posterPicture3);
        File file4 = new File(posterPicture4);

        src1 = ImageIO.read(file1);
        src2 = ImageIO.read(file2);
        src3 = ImageIO.read(file3);
        src4 = ImageIO.read(file4);
        //定义图片宽和高 px
        int wideth = 600;
        int height = 400;

        BufferedImage tag1 = new BufferedImage(wideth, height, BufferedImage.TYPE_INT_RGB);
        tag1.getGraphics().drawImage(src1, 0, 0, wideth, height, null);

        BufferedImage tag2 = new BufferedImage(wideth, height, BufferedImage.TYPE_INT_RGB);
        tag2.getGraphics().drawImage(src2, 0, 0, wideth, height, null);

        BufferedImage tag3 = new BufferedImage(wideth, height, BufferedImage.TYPE_INT_RGB);
        tag3.getGraphics().drawImage(src3, 0, 0, wideth, height, null);

        BufferedImage tag4 = new BufferedImage(wideth, height, BufferedImage.TYPE_INT_RGB);
        tag4.getGraphics().drawImage(src4, 0, 0, wideth, height, null);


        String formatName1 = posterPicture1.substring(posterPicture1.lastIndexOf(".") + 1);
        ImageIO.write(tag1, formatName1, new File(posterPicture1));

        String formatName2 = posterPicture2.substring(posterPicture2.lastIndexOf(".") + 1);
        ImageIO.write(tag2, formatName2, new File(posterPicture2));

        String formatName3 = posterPicture1.substring(posterPicture3.lastIndexOf(".") + 1);
        ImageIO.write(tag3, formatName3, new File(posterPicture3));
        /*"GIF"*//* format desired *//* target */
        String formatName4 = posterPicture1.substring(posterPicture4.lastIndexOf(".") + 1);
        ImageIO.write(tag4, formatName4, new File(posterPicture4));

    }


}
