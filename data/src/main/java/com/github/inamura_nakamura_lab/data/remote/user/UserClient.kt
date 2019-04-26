package com.github.inamura_nakamura_lab.data.remote.user

import com.github.inamura_nakamura_lab.data.model.request.AddUserRequest
import com.github.inamura_nakamura_lab.data.model.response.GetUserResponse
import com.github.inamura_nakamura_lab.data.remote.USER
import io.reactivex.Completable
import io.reactivex.Observable
import retrofit2.http.*

interface UserClient {
    @GET("$USER/{id}")
    fun getUser(@Path("id") id: Int): Observable<GetUserResponse>

    @POST(USER)
    fun addUser(@Body body: AddUserRequest): Completable

    @DELETE("$USER/{id}")
    fun deleteUser(@Path("id") id: Int): Completable
}