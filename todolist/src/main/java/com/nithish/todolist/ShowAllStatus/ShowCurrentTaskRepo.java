package com.nithish.todolist.ShowAllStatus;

import com.nithish.todolist.AddItem.AddItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowCurrentTaskRepo extends JpaRepository<AddItem, Integer> {

}
