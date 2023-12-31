package com.example.todolist.data

import kotlinx.coroutines.flow.Flow

class TodoRepositoryImpl(private val dao: Dao ): TodoRepository {

    override suspend fun insertTodo(todo: Todo) {
        dao.insertTodo(todo)
    }

    override suspend fun deleteTodo(todo: Todo) {
        dao.deleteTodo(todo)
    }

    override suspend fun getTodoById(id: Int): Todo? {
        return dao.getTodoById(id)
    }

    override fun getTodo(): Flow<List<Todo>> {
        return dao.getTodo()
    }

}