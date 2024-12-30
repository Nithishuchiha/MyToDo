package com.nithish.todolist.AddItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddItemService {

     @Autowired
     private AddItemRepo addItemRepo;

     AddItemService(AddItemRepo addItemRepo) {
          this.addItemRepo = addItemRepo;
     }

     public void addCurItem(AddItem item) {
          addItemRepo.save(item);
     }

}
