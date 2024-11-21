package com.example.p8casestudy.ui.view.viewmodel

import com.example.p8casestudy.ui.model.RencanaStudi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RencanaStudyViewModel {
    private val _krsState = MutableStateFlow(RencanaStudi())
    val krsStateUi: StateFlow<RencanaStudi> = _krsState.asStateFlow()

    fun setMataKuliah(mkPilihan: String) {
        _krsState.update { stateMk -> stateMk.copy(namaMK = mkPilihan) }
    }
    fun setKelas(kelasPilihan: String) {
        _krsState.update { stateMk -> stateMk.copy(kelas = kelasPilihan) }
    }
    fun saveDataKRS(ls: MutableList<String>) {
        _krsState.update { stateMk ->
            stateMk.copy(
                namaMK = ls[0],
                kelas = ls[1]
            )
        }
    }
}