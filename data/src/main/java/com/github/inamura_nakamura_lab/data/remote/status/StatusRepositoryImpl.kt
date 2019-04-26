package com.github.inamura_nakamura_lab.data.remote.status

import com.github.inamura_nakamura_lab.data.ext.observeOnMainThread
import com.github.inamura_nakamura_lab.data.model.response.GetCurrentStatusResponse
import io.reactivex.Observable
import retrofit2.Retrofit

class StatusRepositoryImpl(
    private val retrofit: Retrofit
) : StatusRepository {

    private val client by lazy { retrofit.create(StatusClient::class.java) }

    override fun getCurrentStatus(): Observable<GetCurrentStatusResponse> {
        return client.getCurrentStatus()
            .observeOnMainThread()
    }
}