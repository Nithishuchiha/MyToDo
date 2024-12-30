package com.nithish.todolist.ShowAllStatus;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nithish.todolist.AddItem.AddItem;

@Service
public class ShowCurrentTaskService {

     public ShowCurrentTaskRepo showCurrentTaskRepo;

     // Constructor Injection - Better than Field injection(AutoWired)
     ShowCurrentTaskService(ShowCurrentTaskRepo showCurrentTaskRepo) {
          this.showCurrentTaskRepo = showCurrentTaskRepo;
     }

     public List<AddItem> findAll() {
          return showCurrentTaskRepo.findAll();
     }
}
