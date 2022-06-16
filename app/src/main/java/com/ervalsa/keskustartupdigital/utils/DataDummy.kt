package com.ervalsa.keskustartupdigital.utils

import com.ervalsa.keskustartupdigital.R
import com.ervalsa.keskustartupdigital.data.ApotekEntity
import com.ervalsa.keskustartupdigital.data.HistoryEntity
import com.ervalsa.keskustartupdigital.data.ObatEntity

object DataDummy {

    fun generateDataHistoryDummy(): List<HistoryEntity> {
        val listHistory = ArrayList<HistoryEntity>()

        listHistory.add(
            HistoryEntity(
                "1",
                "Paramex Extra 6 Kaplek",
                "3 Items",
                "Rp15.000",
                R.drawable.paramex
            )
        )

        listHistory.add(
            HistoryEntity(
                "4",
                "Paramex Extra 6 Kaplek",
                "6 Items",
                "Rp30.000",
                R.drawable.paramex
            )
        )

        listHistory.add(
            HistoryEntity(
                "4",
                "Paramex Extra 6 Kaplek",
                "1 Items",
                "Rp5.000",
                R.drawable.paramex
            )
        )

        listHistory.add(
            HistoryEntity(
                "4",
                "Paramex Extra 6 Kaplek",
                "6 Items",
                "Rp30.000",
                R.drawable.paramex
            )
        )

        listHistory.add(
            HistoryEntity(
                "4",
                "Paramex Extra 6 Kaplek",
                "15 Items",
                "Rp15.000",
                R.drawable.paramex
            )
        )

        return listHistory
    }

    fun generateDataApotekDummy(): List<ApotekEntity> {
        val listApotek = ArrayList<ApotekEntity>()

        listApotek.add(
            ApotekEntity(
                "1",
                "Kimia Farma Prapatan",
                4,
                "Jl. Prapatan No.33, Prapatan, Kec. Balikpapan Kota, Kota Balikpapan, Kalimantan Timur 76111",
                R.drawable.kimia_farma_prapatan
            )
        )

        listApotek.add(
            ApotekEntity(
                "2",
                "Borneo Jaya",
                4,
                "Jl. Jenderal Sudirman No.71, Damai Bahagia, Kecamatan Balikpapan Selatan, Kota Balikpapan, Kalimantan Timur 76114",
                R.drawable.borneo_jaya
            )
        )

        listApotek.add(
            ApotekEntity(
                "3",
                "Kimia Farma Prapatan",
                4,
                "Jl. Prapatan No.33, Prapatan, Kec. Balikpapan Kota, Kota Balikpapan, Kalimantan Timur 76111",
                R.drawable.kimia_farma_prapatan
            )
        )

        listApotek.add(
            ApotekEntity(
                "4",
                "Kimia Farma Prapatan",
                4,
                "Jl. Prapatan No.33, Prapatan, Kec. Balikpapan Kota, Kota Balikpapan, Kalimantan Timur 76111",
                R.drawable.kimia_farma_prapatan
            )
        )

        listApotek.add(
            ApotekEntity(
                "5",
                "Kimia Farma Prapatan",
                4,
                "Jl. Prapatan No.33, Prapatan, Kec. Balikpapan Kota, Kota Balikpapan, Kalimantan Timur 76111",
                R.drawable.kimia_farma_prapatan
            )
        )

        return listApotek
    }

    fun generateDataObatDummy(): List<ObatEntity> {
        val listObat = ArrayList<ObatEntity>()

        listObat.add(
            ObatEntity(
                "1",
                "Bisolvon Extra Syrup 60ml",
                "BISOLVON EXTRA SIRUP merupakan obat batuk berdahak yang mengandung Bromhexine HCl danuaifenesin. Bromhexine bekerja mengencerkan dahak, sedangkan Guaiaphenesine bekerja meningkatkan aliran di sepanjang saluran pernapasan, sehingga efektif meredakan batuk berdahak dan mempermudah pengeluaran dahak pada saat batuk. n",
                "Rp42.000",
                R.drawable.bisolvon
            )
        )

        listObat.add(
            ObatEntity(
                "2",
                "Bodrex",
                "Obat sakit kepala yang dipercaya sejak 1970 sebagai Ahlinya Redakan Sakit Kepala. Dengan 5 OK-nya bodrex redakan sakit kepala, nyeri dan demam, formula yang dipercaya, dapat diminum sebelum makan, tanpa ngantuk, dipercaya sejak 1971.",
                "Rp9.000",
                R.drawable.bodrex
            )
        )

        listObat.add(
            ObatEntity(
                "3",
                "Comtusi Syrup 60ml",
                "Comtusi Sirup merupakan obat dengan kandungan Oxomemazine dan Guaiafenesin yang bermanfaat untuk membantu mengurangi batuk berdahak dengan reaksi alergi. Dalam penggunaan obat ini harus SESUAI DENGAN PETUNJUK DOKTER",
                "Rp67.000",
                R.drawable.comtusi
            )
        )

        listObat.add(
            ObatEntity(
                "4",
                "Paramex SK Extra 6 Kaplek",
                "Paramex SK kaplet adalah obat untuk meringankan rasa nyeri, seperti  sakit kepala, sakit kepala sebelah (migrain), sakit gigi, nyeri reumatik, dan nyeri menstruasi (dismenore)\nSelain itu, obat ini juga dapat digunakan untuk menurunkan demam dan meredakan gejala pilek, influenza, dan sakit tenggorokan. Paramex SK kaplet mengandung zat aktif paracetamol dan caffeine. Paracetamol dan caffeine adalah obat analgesik dan antipiretik ringan yang diformulasikan untuk meredakan nyeri. Obat ini merupakan obat bebas yang harus menggunakan resep dokter. ",
                "Rp5.000",
                R.drawable.paramex
            )
        )

        listObat.add(
            ObatEntity(
                "5",
                "Sanmol Paracetamol 60ml",
                "SANMOL merupakan obat dengan kandungan Paracetamol 500 mg. Obat ini digunakan untuk meringankan rasa sakit pada keadaan sakit kepala, sakit gigi dan menurunkan demam.",
                "Rp17.500",
                R.drawable.sanmol
            )
        )

        return listObat
    }
}