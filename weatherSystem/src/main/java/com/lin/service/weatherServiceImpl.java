package com.lin.service;

import com.lin.mapper.weatherMapper;
import com.lin.pojo.weather;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class weatherServiceImpl implements weatherService{

    static int FuzhouID = 101230101;
    static int BeijingID = 101010100;
    static int ShanghaiID = 101020100;

    @Autowired
    weatherMapper mapper;

    @Override
    public void updateFZ(){

        mapper.deleteFZ();
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String url = "https://devapi.qweather.com/v7/weather/3d?key=d7ed26a042e64cf0983011a17840be58&location=" + FuzhouID;
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            String info = EntityUtils.toString(response.getEntity());
            int a = info.indexOf("fxDate");
            int b = info.indexOf("tempMax");
            int c = info.indexOf("tempMin");
            int d = info.indexOf("textDay");
            String date = info.substring(a + 9, a + 19);
            int tempMax = Integer.parseInt(info.substring(b + 10, b + 12));
            int tempMin = Integer.parseInt(info.substring(c + 10, c + 12));
            String textDay = info.substring(d+ 10, d + 12);
            mapper.updateFZ(new weather(date,tempMax,tempMin,textDay));

            String info2 = info.replaceFirst("fxDate", "");
            info2 = info2.replaceFirst("tempMax","");
            info2 = info2.replaceFirst("tempMin","");
            info2 = info2.replaceFirst("textDay","");
            a = info2.indexOf("fxDate");
            b = info2.indexOf("tempMax");
            c = info2.indexOf("tempMin");
            d = info2.indexOf("textDay");
            date = info2.substring(a + 9, a + 19);
            tempMax = Integer.parseInt(info2.substring(b + 10, b + 12));
            tempMin = Integer.parseInt(info2.substring(c + 10, c + 12));
            textDay = info2.substring(d+ 10, d + 12);
            mapper.updateFZ(new weather(date,tempMax,tempMin,textDay));

            String info3 = info2.replaceFirst("fxDate", "");
            info3 = info3.replaceFirst("tempMax","");
            info3 = info3.replaceFirst("tempMin","");
            info3 = info3.replaceFirst("textDay","");
            a = info3.indexOf("fxDate");
            b = info3.indexOf("tempMax");
            c = info3.indexOf("tempMin");
            d = info3.indexOf("textDay");
            date = info3.substring(a + 9, a + 19);
            tempMax = Integer.parseInt(info3.substring(b + 10, b + 12));
            tempMin = Integer.parseInt(info3.substring(c + 10, c + 12));
            textDay = info3.substring(d+ 10, d + 12);
            mapper.updateFZ(new weather(date,tempMax,tempMin,textDay));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void updateBJ() {

        mapper.deleteBJ();
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String url = "https://devapi.qweather.com/v7/weather/3d?key=d7ed26a042e64cf0983011a17840be58&location=" + BeijingID;
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            String info = EntityUtils.toString(response.getEntity());
            int a = info.indexOf("fxDate");
            int b = info.indexOf("tempMax");
            int c = info.indexOf("tempMin");
            int d = info.indexOf("textDay");
            String date = info.substring(a + 9, a + 19);
            int tempMax = Integer.parseInt(info.substring(b + 10, b + 12));
            int tempMin = Integer.parseInt(info.substring(c + 10, c + 12));
            String textDay = info.substring(d+ 10, d + 12);
            mapper.updateBJ(new weather(date,tempMax,tempMin,textDay));

            String info2 = info.replaceFirst("fxDate", "");
            info2 = info2.replaceFirst("tempMax","");
            info2 = info2.replaceFirst("tempMin","");
            info2 = info2.replaceFirst("textDay","");
            a = info2.indexOf("fxDate");
            b = info2.indexOf("tempMax");
            c = info2.indexOf("tempMin");
            d = info2.indexOf("textDay");
            date = info2.substring(a + 9, a + 19);
            tempMax = Integer.parseInt(info2.substring(b + 10, b + 12));
            tempMin = Integer.parseInt(info2.substring(c + 10, c + 12));
            textDay = info2.substring(d+ 10, d + 12);
            mapper.updateBJ(new weather(date,tempMax,tempMin,textDay));

            String info3 = info2.replaceFirst("fxDate", "");
            info3 = info3.replaceFirst("tempMax","");
            info3 = info3.replaceFirst("tempMin","");
            info3 = info3.replaceFirst("textDay","");
            a = info3.indexOf("fxDate");
            b = info3.indexOf("tempMax");
            c = info3.indexOf("tempMin");
            d = info3.indexOf("textDay");
            date = info3.substring(a + 9, a + 19);
            tempMax = Integer.parseInt(info3.substring(b + 10, b + 12));
            tempMin = Integer.parseInt(info3.substring(c + 10, c + 12));
            textDay = info3.substring(d+ 10, d + 12);
            mapper.updateBJ(new weather(date,tempMax,tempMin,textDay));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void updateSH() {

        mapper.deleteSH();
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String url = "https://devapi.qweather.com/v7/weather/3d?key=d7ed26a042e64cf0983011a17840be58&location=" + ShanghaiID;
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            String info = EntityUtils.toString(response.getEntity());
            int a = info.indexOf("fxDate");
            int b = info.indexOf("tempMax");
            int c = info.indexOf("tempMin");
            int d = info.indexOf("textDay");
            String date = info.substring(a + 9, a + 19);
            int tempMax = Integer.parseInt(info.substring(b + 10, b + 12));
            int tempMin = Integer.parseInt(info.substring(c + 10, c + 12));
            String textDay = info.substring(d+ 10, d + 12);
            mapper.updateSH(new weather(date,tempMax,tempMin,textDay));

            String info2 = info.replaceFirst("fxDate", "");
            info2 = info2.replaceFirst("tempMax","");
            info2 = info2.replaceFirst("tempMin","");
            info2 = info2.replaceFirst("textDay","");
            a = info2.indexOf("fxDate");
            b = info2.indexOf("tempMax");
            c = info2.indexOf("tempMin");
            d = info2.indexOf("textDay");
            date = info2.substring(a + 9, a + 19);
            tempMax = Integer.parseInt(info2.substring(b + 10, b + 12));
            tempMin = Integer.parseInt(info2.substring(c + 10, c + 12));
            textDay = info2.substring(d+ 10, d + 12);
            mapper.updateSH(new weather(date,tempMax,tempMin,textDay));

            String info3 = info2.replaceFirst("fxDate", "");
            info3 = info3.replaceFirst("tempMax","");
            info3 = info3.replaceFirst("tempMin","");
            info3 = info3.replaceFirst("textDay","");
            a = info3.indexOf("fxDate");
            b = info3.indexOf("tempMax");
            c = info3.indexOf("tempMin");
            d = info3.indexOf("textDay");
            date = info3.substring(a + 9, a + 19);
            tempMax = Integer.parseInt(info3.substring(b + 10, b + 12));
            tempMin = Integer.parseInt(info3.substring(c + 10, c + 12));
            textDay = info3.substring(d+ 10, d + 12);
            mapper.updateSH(new weather(date,tempMax,tempMin,textDay));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<weather> queryFZ() {
        return mapper.queryFZ();
    }

    @Override
    public List<weather> queryBJ() {
        return mapper.queryBJ();
    }

    @Override
    public List<weather> querySH() {
        return mapper.querySH();
    }

}
