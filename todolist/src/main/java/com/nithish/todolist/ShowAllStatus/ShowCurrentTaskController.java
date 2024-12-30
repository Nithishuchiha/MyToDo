package com.nithish.todolist.ShowAllStatus;

import org.springframework.web.bind.annotation.RestController;

import com.nithish.todolist.AddItem.AddItem;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ShowCurrentTaskController {

     public ShowCurrentTaskService showCurrentTaskService;

     ShowCurrentTaskController(ShowCurrentTaskService showCurrentTaskService) {
          this.showCurrentTaskService = showCurrentTaskService;
     }

     @GetMapping("/getAll")
     public List<AddItem> getCurrentTaskStatus() {
          return showCurrentTaskService.findAll();
     }
}
