package miu.edu.lab1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/books")
    public String bookList(String title, String isbn){
        return "Computer Science, " +   "B001" ;
    }

}
