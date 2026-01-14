package com.example.todo.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name="todo")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(length = 100, nullable = false, name = "do")
    private String work;

    @Column(nullable = false, name = "do_at")
    private LocalDateTime doAt;

    @Column(name = "importance")
    private String importance;
}