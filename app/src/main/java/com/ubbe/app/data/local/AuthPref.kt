package com.ubbe.app.data.local

import android.content.Context
import android.content.SharedPreferences
import android.provider.ContactsContract
import com.ubbe.app.data.model.ActionState
import com.ubbe.app.data.model.AuthUser
import com.ubbe.app.util.getObject
import com.ubbe.app.util.putObject

class AuthPref(val context: Context) {
    private val sp: SharedPreferences by lazy {
        context.getSharedPreferences((AuthPref::class.java.name, Context.MODE_PRIVATE))
    }

    private  companion object {
        const val AUTH_USER = "auth_user"
        const val IS_LOGIN = "is_login"
    }

    private var authUser: AuthUser?
    get() = sp.getObject(AUTH_USER)
    set(value) = sp.edit().putObject(AUTH_USER, value).apply()

    private var authLogin: Boolean
        get() = sp.getObject(IS_LOGIN, false)
        set(value) = sp.edit().putBoolean(IS_LOGIN, value).apply()

    suspend fun  login(email: String, password: String): ActionState<AuthUser> {
        val user = authUser
        if (user == null) {
            return ActionState(message = "Anda belum terdaftar", isSuccess = false)
        }
    }
}