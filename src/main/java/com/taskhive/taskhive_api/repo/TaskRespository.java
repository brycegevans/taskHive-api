package com.taskhive.taskhive_api.repo;

import com.taskhive.taskhive_api.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRespository extends JpaRepository<Task,Long> {
}
