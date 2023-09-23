package org.example.com.company.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.NonNull;
import org.example.com.company.model.Taqvim;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class TaskService {
    public @NonNull String taskForToday() {
        try {
            URL url = new URL("https://islomapi.uz/api/present/day?region=Toshkent");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            Gson gson = new Gson();
            Taqvim taqvim = gson.fromJson(bufferedReader, Taqvim.class);
            String text = taqvim.toString();
            try (PrintWriter printWriter = new PrintWriter(
                    new FileWriter("C:\\Users\\ABDUMALIK\\OneDrive\\Desktop\\demoForUrlLearn\\ForToday.txt"))) {
                printWriter.println(taqvim);
                return text;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return " yoq ";
    }

    public String taskForWeek() {
        try {
            URL url = new URL("https://islomapi.uz/api/present/week?region=Toshkent");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            Gson gson = new Gson();
            List<Taqvim> times = gson.fromJson(bufferedReader, new TypeToken<List<Taqvim>>(){}.getType());
            String text = times.toString();
            try (PrintWriter printWriter = new PrintWriter(
                    new FileWriter("C:\\Users\\ABDUMALIK\\OneDrive\\Desktop\\demoForUrlLearn\\ForWeek.txt"))) {
                printWriter.println(times.toString());
//                return new InputFile("C:\\Users\\ABDUMALIK\\OneDrive\\Desktop\\demoForUrlLearn\\ForWeek.txt");
                return text;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return " null ";
    }
}
