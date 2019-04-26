package com.github.inamura_nakamura_lab.data.remote.user

import com.github.inamura_nakamura_lab.data.ext.observeOnMainThread
import com.github.inamura_nakamura_lab.data.model.request.AddUserRequest
import com.github.inamura_nakamura_lab.data.model.response.GetUserResponse
import io.reactivex.Completable
import io.reactivex.Observable
import retrofit2.Retrofit

class UserRepositoryImpl(
    private val retrofit: Retrofit
) : UserRepository {

    private val client by lazy { retrofit.create(UserClient::class.java) }

    override fun getUser(id: Int): Observable<GetUserResponse> {
        return client.getUser(id)
            .observeOnMainThread()
    }

    override fun addUser(body: AddUserRequest): Completable {
        return client.addUser(body)
            .observeOnMainThread()

    }

    override fun deleteUser(id: Int): Completable {
        return client.deleteUser(id)
            .observeOnMainThread()
    }
}