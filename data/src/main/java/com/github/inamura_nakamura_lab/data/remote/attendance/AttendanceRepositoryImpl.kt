package com.github.inamura_nakamura_lab.data.remote.attendance

import com.github.inamura_nakamura_lab.data.ext.observeOnMainThread
import com.github.inamura_nakamura_lab.data.model.request.RegisterAttendanceRequest
import com.github.inamura_nakamura_lab.data.model.response.GetAttendanceResponse
import io.reactivex.Completable
import io.reactivex.Observable
import retrofit2.Retrofit

class AttendanceRepositoryImpl(
    private val retrofit: Retrofit
) : AttendanceRepository {

    private val client by lazy { retrofit.create(AttendanceClient::class.java) }

    override fun getAttendance(id: Int, dateFrom: String?, dateTo: String?): Observable<GetAttendanceResponse> {
        return client.getAttendance(id, dateFrom, dateTo)
            .observeOnMainThread()
    }

    override fun registerAttendance(body: RegisterAttendanceRequest): Completable {
        return client.registerAttendance(body)
            .observeOnMainThread()
    }
}