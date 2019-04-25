package com.github.inamura_nakamura_lab.data.model.response

data class GetAttendanceResponse(
        val attendance: List<Attendance>,
        val date_from: String,
        val date_to: String,
        val id: Int,
        val name: String,
        val student_number: String
) {
    data class Attendance(
            val date: String,
            val enter_at: String,
            val exit_at: String
    )
}
