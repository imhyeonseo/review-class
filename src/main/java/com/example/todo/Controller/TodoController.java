package com.example.todo.Controller;

import com.example.todo.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/todo/index")
    public String index(Model model) {
        model.addAttribute("Todo", todoService.index());
        return "Todo/index";
    }
}
