package com.github.inamura_nakamura_lab.data.remote.attendance

import com.github.inamura_nakamura_lab.data.model.request.RegisterAttendanceRequest
import com.github.inamura_nakamura_lab.data.model.response.GetAttendanceResponse
import com.github.inamura_nakamura_lab.data.remote.ATTENDANCE
import io.reactivex.Completable
import io.reactivex.Observable
import retrofit2.http.*

interface AttendanceClient {
    @GET("$ATTENDANCE/{id}")
    fun getAttendance(
        @Path("id") id: Int,
        @Query("date_from") dateFrom: String?,
        @Query("date_to") dateTo: String?
    ): Observable<GetAttendanceResponse>

    @POST(ATTENDANCE)
    fun registerAttendance(@Body body: RegisterAttendanceRequest): Completable
}