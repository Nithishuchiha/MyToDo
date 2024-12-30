package com.nithish.todolist.AddItem;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AddItemController {

     public AddItemService addItemService;

     public AddItemRepo addItemRepo;

     AddItemController(AddItemService addItemService) {
          this.addItemService = addItemService;
     }

     @PostMapping("/addItem")
     public void addItem(@RequestBody AddItem item) {

          addItemService.addCurItem(item);
     }

}
