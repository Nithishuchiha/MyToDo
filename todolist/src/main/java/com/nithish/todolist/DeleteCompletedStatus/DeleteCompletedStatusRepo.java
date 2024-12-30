package com.nithish.todolist.DeleteCompletedStatus;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nithish.todolist.AddItem.AddItem;

@Repository
public interface DeleteCompletedStatusRepo extends JpaRepository<AddItem, Integer> {

}