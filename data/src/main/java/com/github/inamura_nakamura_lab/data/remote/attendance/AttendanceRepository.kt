package com.github.inamura_nakamura_lab.data.remote.attendance

import com.github.inamura_nakamura_lab.data.model.request.RegisterAttendanceRequest
import com.github.inamura_nakamura_lab.data.model.response.GetAttendanceResponse
import io.reactivex.Completable
import io.reactivex.Observable

interface AttendanceRepository {
    fun getAttendance(id: Int, dateFrom: String?, dateTo: String?): Observable<GetAttendanceResponse>
    fun registerAttendance(body: RegisterAttendanceRequest): Completable
}