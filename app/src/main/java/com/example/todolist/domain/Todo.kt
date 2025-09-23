package com.example.todolist.domain

data class Todo(
    var id: Long,
    var title: String,
    var description: String?,
    var isCompleted: Boolean,
)

//Fake objects
val todo1: Todo = Todo(
    id = 1,
    title = "Todo 1",
    description = "Description for Todo 1",
    isCompleted = false,
)

val todo2 = Todo(
    id = 2,
    title = "Todo 2",
    description = "Description for Todo 2",
    isCompleted = true,
)

val todo3 = Todo(
    id = 3,
    title = "Todo 3",
    description = "Description for Todo 3",
    isCompleted = false,
)