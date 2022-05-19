package com.t2010a.hellot2010aagain.entity;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    @Test
    public void countCakeByTeacher() throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream is = classLoader.getResourceAsStream("teacher.txt");
        InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);
        HashMap<String, Teacher> mapTeacher = new HashMap<>();
        for (String line; (line = reader.readLine()) != null;){
            String[] splitedLine = line.split(" ");
            if (splitedLine.length == 4){
                String teacherId = splitedLine[0];
                String name = splitedLine[1];
                int cakeCount = Integer.parseInt(splitedLine[3]);
                Teacher teacher = new Teacher(teacherId, name, cakeCount);
                if (mapTeacher.containsKey((teacher.getId()))) {
                    Teacher oldTeacher = mapTeacher.get(teacher.getId());

                    oldTeacher.setCakeCount(oldTeacher.getCakeCount() + teacher.getCakeCount());

                    mapTeacher.put(oldTeacher.getId(),oldTeacher);
                }else {
                    mapTeacher.put(teacher.getId(),teacher);
                }
                }

            }
        ArrayList<Teacher> listTeacher = new ArrayList<>(mapTeacher.values());
        for (Teacher teacher : listTeacher ){
            System.out.println(teacher.toString());
        }
        }
    }

