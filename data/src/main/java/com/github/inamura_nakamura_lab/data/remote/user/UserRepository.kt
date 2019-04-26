package com.github.inamura_nakamura_lab.data.remote.user

import com.github.inamura_nakamura_lab.data.model.request.AddUserRequest
import com.github.inamura_nakamura_lab.data.model.response.GetUserResponse
import io.reactivex.Completable
import io.reactivex.Observable

interface UserRepository {
    fun getUser(id: Int): Observable<GetUserResponse>
    fun addUser(body: AddUserRequest): Completable
    fun deleteUser(id: Int): Completable
}