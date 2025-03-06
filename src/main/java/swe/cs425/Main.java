package swe.cs425;

import model.Publisher;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        var publisher = List.of(
                new Publisher(101,"Sahid","sales@sahid.com","123456898"),
                new Publisher(102,"hamid","sales@ham.com","453785498"),
                new Publisher(103,"labib","sales@lab.com",null)
        );
publisher.forEach(System.out::println);
    }
}
