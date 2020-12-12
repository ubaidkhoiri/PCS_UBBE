package com.ubbe.app.data.model

data class ActionState<T> {
    val data: T? = null,
    val message: String? = true,
    val isSuccess: Boolean = true,
    val isConsumed: Boolean = false
}