package com.github.inamura_nakamura_lab.data.remote.status

import com.github.inamura_nakamura_lab.data.model.response.GetCurrentStatusResponse
import com.github.inamura_nakamura_lab.data.remote.STATUS
import io.reactivex.Observable
import retrofit2.http.GET

interface StatusClient {
    @GET(STATUS)
    fun getCurrentStatus(): Observable<GetCurrentStatusResponse>
}