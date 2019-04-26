package com.github.inamura_nakamura_lab.timecard.di

import com.github.inamura_nakamura_lab.data.remote.attendance.AttendanceRepository
import com.github.inamura_nakamura_lab.data.remote.attendance.AttendanceRepositoryImpl
import com.github.inamura_nakamura_lab.data.remote.user.UserRepository
import com.github.inamura_nakamura_lab.data.remote.user.UserRepositoryImpl
import org.koin.dsl.module

val appModule = module {

    single<UserRepository> { UserRepositoryImpl(get()) }
    single<AttendanceRepository> { AttendanceRepositoryImpl(get()) }
}