package com.mohamad_rizal.travellin.models

import com.mohamad_rizal.travellin.R

object NearestData {

    private val tourName = arrayOf(
        "Tari Saman",
        "Reog Ponorogo",
        "Tari Zapin",
        "Tombak",
        "Mandau",
        "Badik",
        "Batabue",
        "Payes Agung",
        "Surjan",
        "Rumah Adat Baloy",
        "Rumah Adat Bale Lumbung",
        "Tongkongan"

    )

    private val tourContent = arrayOf(
        "Tari Saman adalah sebuah tarian suku Gayo yang biasa ditampilkan untuk merayakan peristiwa-peristiwa penting dalam adat. Syair dalam tarian saman mempergunakan bahasa Gayo. Selain itu biasanya tarian ini juga ditampilkan untuk merayakan kelahiran Nabi Muhammad SAW. Dalam beberapa literatur menyebutkan tari Saman di Aceh didirikan dan dikembangkan oleh Syekh Saman, seorang ulama yang berasal dari Gayo di Aceh Tenggara. Tari Saman ditetapkan UNESCO sebagai Daftar Representatif Budaya Takbenda Warisan Manusia dalam Sidang ke-6 Komite Antar-Pemerintah untuk Pelindungan Warisan Budaya Tak benda UNESCO di Bali, 24 November 2011.",
        "Reog Ponorogo merupakan salah satu dari sekian banyaknya kesenian yang ada di Indonesia. Kesenian rakyat yang berasal dari Kabupaten Ponorogo, Jawa Timur ini merupakan sebuah pertunjukan tari tradisional yang biasanya dilakukan di arena terbuka sambil diiringi alat musik tradisional seperti kendang dan juga gong. Hingga saat ini, pertunjukan Reog Ponorogo masih identik dengan hal-hal yang berbau mistik. Dulunya pertunjukan Reog Ponorogo dipentaskan dalam bentuk iring-iringan atau yang disebut kirab dalam bahasa Jawa.",
        "Tari Zapin adalah tarian adat yang terus dilestarikan oleh masyarakat Riau. Tarian ini terus diwariskan secara turun temurun dan tidak tergeser oleh perkembangan zaman. Berdasarkan sejarahnya, Tarian Zapin merupakan hasil dari gabungan dua kebudayaan, yaitu budaya Melayu dan budaya Arab pada masa lalu. Akulturasi ini terjadi karena kedatangan orang-orang Arab ke wilayah Riau dan tinggal disini.",
        "Senjata Tombak merupakan salah satu jenis senjata tradisional Papua yang biasa digunakan untuk menyerang musuh dengan jarak jauh. Jenis senjata ini memang banyak digunakan oleh banyak daerah termasuk Papua. Tombak ini juga dapat dipakai untuk perang & berburu. Tombak sendiri memiliki bentuk yang panjang karena gagangnya terbuat dari kayu. Selain itu di ujungnya terdapat tulang ataupun batu tajam dan berfungsi sebagai mata. Namun, seiring waktu ujungnya tersebut diganti dengan logam.",
        "Mandau adalah senjata tradisional nomer wahid dan juga mematikan di Kalimantan Selatan (Kalsel). Menurut sejarah yang dikutip dari laman wikipedia.com, kata mandau memiliki arti tersendiri. Mandau ternyata berasal dari kosakata Kalimantan Tengah yang terdiri dari 2 suku kata, yaitu Man dan Do. Man adalah singkatan dari kata “Kuman” yang berarti “Makan”. Dan Do adalah singkatan dari kata “Dohong”, pisau belati khas Kalimantan Tengah sebelum mandau populer. Jadi, mandau adalah singkatan dari Makan Dohong.",
        "Senjata adat Sulawesi Barat Badik adalah senjata sejenis pisau dengan bentuk khas yang dikembangkan oleh masyarakat Bugis dan Makassar. Badik tersebut bersisi tajam tunggal atau ganda. Panjang Badik mencapai sekitar setengah meter. Layaknya keris, Badik berbentuk tidak simetris dan bilahnya sering kali dihiasi pamor. Badik tidak pernah mempunyai ganja (penyangga bilah), berbeda dari keris, . Senjata Tradisonal tersebut adalah senjata identitas provinsi Sulawesi Barat. Menurut kepercayaan orang Bugis Makassar, setiap jenis Badik mempunyai kekuatan gaib.Kekuatan tersebut diyakini bisa memberikan pengaruh pada kondisi, keadaan, dan proses kehidupan pemiliknya. Selain itu, ada kepercayaan bahwa Badik juga bisa menimbulkan ketenangan, kedamaian, kesejahteraan dan kemakmuran ataupun kemelaratan, kemiskinan dan penderitaan bagi pemiliknya.",
        "Baju batabue atau baju bertabur adalah baju adat Minangkabau baju kurung (naju) yang dihiasi dengan taburan pernik benang emas. Pernik-pernik sulaman benang emas tersebut melambangkan tentang kekayaan alam daerah Sumatera Barat yang begitu berlimpah. Corak dan motif dari sulaman ini pun sangat beragam.Baju batabue dapat kita jumpai dalam 4 varian warna, yaitu warna merah, hitam, biru, dan lembayung. Pada bagian tepi lengan dan leher terdapat hiasan yang biasa disebut minsie. Minsie adalah sulaman yang menyimbolkan bahwa seorang wanita Minang harus taat pada batas-batas hukum adat yang berlaku.",
        "Payas Agung adalah pakaian adat Bali yang hanya digunakan oleh dalam berbagai acara adat seperti pernikahan, munggah deha (upacara kedewasaan), pitra yadnya (ngaben), mesagih (upacara potong gigi), dan upacara adat lainnya.Payas Agung dominan dengan warna emas dan mahkota tinggi yang menjulang. Untuk wanita, mengenakan pakaian ini terlihat anggun, cantik dan elegan. Untuk pria, Payas Agung mengkombinasikan lilitan kain songket mewah dengan jas beludru bermotif prada Bali.",
        "Surjan merupakan pakaian adat Yogyakarta yang biasanya dikenakan kaum pria. Esensinya surjan adalah lurik atau model kemeja berlengan panjang.Kainnya memiliki tekstur tebal dengan motif vertikal, berwana gelap dan dilengkapi dengan kancing. Namun, dalam perkembanganya motif lurik ternyata tidak hanya garis-garis membujur saja, tetapi terdapat motif kotak-kotak sebagai hasil kombinasi antara garis vertikal dengan garis horisontal.Selanjutnya muncul surjan ontrokusuma yang bermotif bunga.",
        "Rumah adat terkenal dari masyarakat Kalimantan Utara disebut Rumah Baloy. Rumah adat ini merupakan hasil kebudayaan seni arsitektur dari masyarakat suku Tidung, Kalimantan Utara. Seperti suku lainnya, suku Tidung ini mempunyai kebudayaan dan model rumah adat sendiri. Walaupun rumah adat ini masih menggunakan sejumlah tiang tinggi pada bagian bawahnya, bentuk bangunan rumah adat ini terlihat lebih modern dan modis. Diduga rumah adat ini adalah hasil pengembangan arsitektur Dayak dari Rumah Panjang (Rumah Lamin) seperti yang dihuni oleh suku Dayak Kenyah di Kalimantan Timur.",
        "Bale Lumbung adalah rumah adat dari suku Sasak yang berada di dusun Sade di desa Rembitan, Pujut, Lombok Tengah. Keunikan dari dusun Sade adalah keteguhannya dalam melestarikan rumah adat ini. Suku sasak memiliki aturan-aturan untuk membangun rumah, yaitu memilih waktu membangun dan juga lokasi pembangunan karena mereka mempercayai jika tidak mengikuti aturan akan mendapat nasib buruk saat menempati rumah.",
        "Tongkonan adalah rumah adat orang Toraja, yang merupakan tempat tinggal, kekuasaan adat, dan perkembangan kehidupan sosial budaya orang Toraja.  Arsitektur tongkonan dikenal dengan bentuknya yang khas melalui struktur bawah, tengah dan atas yang memiliki keindahan estetika struktur dan konstruksinya. Mekanika sistem struktur membentuk suatu sistem estetika arsitektural. Tongkonan tidak lagi dijadikan rumah tempat tinggal tetapi sudah tidak dihuni lagi oleh karena setiap keluarga yang mendiami Tongkonan pada umumnya telah membangun rumah tinggal sendiri. Rumah adat Tongkonan yang sarat dengan ukiran mengandung makna yaitu melambangkan status sosial pemilik Tongkonan menempati lapisan atas."
    )
    private val tourImage = arrayOf(
        R.drawable.tarisaman,
        R.drawable.reog,
        R.drawable.zapin,
        R.drawable.tombak,
        R.drawable.mandau,
        R.drawable.badik,
        R.drawable.batabue,
        R.drawable.payesagung,
        R.drawable.surjan,
        R.drawable.baloy,
        R.drawable.balelumbung,
        R.drawable.tongkongan



    )

    val listTour : ArrayList<Nearest>
        get() {
            val list = arrayListOf<Nearest>()
            for (position in tourName.indices){
                val nearestTour = Nearest()
                nearestTour.tourImage = tourImage[position]
                nearestTour.tourName = tourName[position]
                nearestTour.tourContent = tourContent[position]
                list.add(nearestTour)
            }
            return list
        }

}