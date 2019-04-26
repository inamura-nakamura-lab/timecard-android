package com.github.inamura_nakamura_lab.data.remote.status

import com.github.inamura_nakamura_lab.data.model.response.GetCurrentStatusResponse
import io.reactivex.Observable

interface StatusRepository {
    fun getCurrentStatus(): Observable<GetCurrentStatusResponse>
}