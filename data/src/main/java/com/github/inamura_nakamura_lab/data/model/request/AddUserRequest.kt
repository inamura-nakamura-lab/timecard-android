package com.github.inamura_nakamura_lab.data.model.request

import java.io.Serializable

data class AddUserRequest(
        val name: String,
        val student_number: String
) : Serializable