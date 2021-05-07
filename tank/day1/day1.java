package day1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class day1 extends IOException{
    public static<T> void show(String label,Stream<T> stream) {
        int a=0;
        List<T> elemens=stream.limit(10).collect(Collectors.toList());
        for(T t:elemens){
            System.out.println("label"+ ++a +": "+t);
        }
    }

    public static void main(String[] args) {
        Path path = Paths.get("C:/Users/EDZ/Desktop/stream.txt");
        try {
            String lines = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);

            Stream<String> words = Stream.of(lines.split("\\PL+"));
            show("words",words);

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
