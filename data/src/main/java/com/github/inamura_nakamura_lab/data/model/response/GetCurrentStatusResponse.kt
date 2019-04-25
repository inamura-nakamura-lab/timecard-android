package com.github.inamura_nakamura_lab.data.model.response

data class GetCurrentStatusResponse(
        val attendance: List<Attendance>,
        val date: String
) {
    data class Attendance(
            val id: Int,
            val name: String,
            val status: Int,
            val student_number: String
    )
}
