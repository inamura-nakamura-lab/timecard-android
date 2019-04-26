package com.github.inamura_nakamura_lab.timecard.ui.main

import androidx.lifecycle.*
import com.github.inamura_nakamura_lab.data.model.response.GetCurrentStatusResponse
import com.github.inamura_nakamura_lab.data.remote.attendance.AttendanceRepository
import com.github.inamura_nakamura_lab.data.remote.status.StatusRepository
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import timber.log.Timber

class MainViewModel(
    private val attendanceRepository: AttendanceRepository,
    private val statusRepository: StatusRepository
) : ViewModel(), LifecycleObserver {

    private val disposable = CompositeDisposable()

    private val _status = MutableLiveData<GetCurrentStatusResponse>()
    val status: LiveData<GetCurrentStatusResponse> = _status

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        statusRepository.getCurrentStatus()
            .subscribe({
                _status.value = it
            }, {
                Timber.e(it)
            }).addTo(disposable)
    }

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }
}