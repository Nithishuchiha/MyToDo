package com.nithish.todolist.AddItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddItemRepo extends JpaRepository<AddItem, Integer> {

}
