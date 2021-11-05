package com.mohamad_rizal.travellin.models

import com.mohamad_rizal.travellin.R

object CategoriesData {
    private val categoryName = arrayOf(
        "Jawa Tengah",
        "Jawa Barat",
        "Sumatera Selatan",
        "Kalimantan Timur",
        "Papua Barat",
        "Aceh"
    )

    private val categoryDesc = arrayOf(
        "Bahasa Daerah       : Bahasa Jawa\n" +
        "Rumah Adat             : Joglo\n" +
        "Pakaian Adat           : Jawi jangkep, kebaya\n" +
        "senjata tradisional : Keris, Pedang gada, Perisai, Tombak\n",
        "Bahasa Daerah       :Bahasa Sunda\n" +
        "Rumah Adat             : Jolopong\n" +
        "Pakaian Adat           : Kebaya Sunda, Pangsi\n" +
        "senjata tradisional : Kujang, Bedog\n",
        "Bahasa Daerah       : Bahasa Melayu\n" +
        "Rumah Adat             : Limas\n" +
        "Pakaian Adat           : Aesan Paksangko,Aesan Gede\n" +
        "senjata tradisional : Tombak Trisula, Khudok\n",
        "Bahasa Daerah       : Bahasa Paser\n" +
        "Rumah Adat             : Lamin\n" +
        "Pakaian Adat        : Takwo Biasa, Takwo Kustim, Takwo Sebelah\n" +
        "senjata tradisional : Sumpit\n",
        "Bahasa Daerah       : Biak\n" +
        "Rumah Adat             : Honai, Ebei\n" +
        "Pakaian Adat           : Koteka, Rok Rumbai\n" +
        "senjata tradisional : Pisau Belati, busur panah\n",
        "Bahasa Daerah       : Bahasa Gayo\n" +
        "Rumah Adat             : Aceh Krong Bade\n" +
        "Pakaian Adat           : Linto Biro, Daro Buro\n" +
        "senjata tradisional : Rencong meupucok, Siwah\n"

    )
    private val categoryImage = arrayOf(
        R.drawable.jawatengah,
        R.drawable.jawabarat,
        R.drawable.sumateraselatan,
        R.drawable.kalimantantimur,
        R.drawable.papuabarat,
        R.drawable.aceh
    )

    val listCategories : ArrayList<Categories>
        get() {
            val list = arrayListOf<Categories>()
            for (position in categoryName.indices){
                val categories = Categories()
                categories.categoriesName = categoryName[position]
                categories.categoriesDesc = categoryDesc[position]
                categories.categoriesImage = categoryImage[position]
                list.add(categories)
            }
            return list
        }

}