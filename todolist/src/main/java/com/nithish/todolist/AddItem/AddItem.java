package com.nithish.todolist.AddItem;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AddItem {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     int no;
     String task;

     public int getNo() {
          return no;
     }

     public String getTask() {
          return task;
     }

     public void setNo(int no) {
          this.no = no;
     }

     public void setTask(String task) {
          this.task = task;
     }

}
