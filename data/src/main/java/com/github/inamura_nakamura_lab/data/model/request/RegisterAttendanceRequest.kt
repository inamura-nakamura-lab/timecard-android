package com.github.inamura_nakamura_lab.data.model.request

import java.io.Serializable

data class RegisterAttendanceRequest(
        val id: Int,
        val status: Int
) : Serializable