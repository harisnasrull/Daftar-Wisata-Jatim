package com.example.submissionwisatajatim;

import java.util.ArrayList;

class DataKabupaten {
    private static String[] namaKab = {
            "Kabupaten Bangkalan",
            "Kabupaten Banyuwangi",
            "Kabupaten Blitar",
            "Kabupaten Bojonegoro",
            "Kabupaten Bondowoso",
            "Kabupaten Gresik",
            "Kabupaten Jember",
            "Kabupaten Jombang",
            "Kabupaten Kediri",
            "Kabupaten Lamongan",
            "Kabupaten Lumajang",
            "Kabupaten Madiun",
            "Kabupaten Magetan",
            "Kabupaten Malang",
            "Kabupaten Mojokerto",
            "Kabupaten Nganjuk",
            "Kabupaten Ngawi",
            "Kabupaten Pacitan",
            "Kabupaten Pamekasan",
            "Kabupaten Pasuruan",
            "Kabupaten Ponorogo",
            "Kabupaten Probolinggo",
            "Kabupaten Sampang",
            "Kabupaten Sidoarjo",
            "Kabupaten Situbondo",
            "Kabupaten Sumenep",
            "Kabupaten Trenggalek",
            "Kabupaten Tuban",
            "Kabupaten Tulungagung",
            "Kota Batu",
            "Kota Blitar",
            "Kota Kediri",
            "Kota Madiun",
            "Kota Malang",
            "Kota Mojokerto",
            "Kota Pasuruan",
            "Kota Probolinggo",
            "Kota Surabaya"
    };
    private static int[] logoKab = {
            R.drawable.lambang_bangkalan,
            R.drawable.lambang_kab_banyuwangi,
            R.drawable.lambang_kab_blitar,
            R.drawable.lambang_kabupaten_bojonegoro,
            R.drawable.lambang_bondowoso,
            R.drawable.lambang_kabupaten_gresik,
            R.drawable.lambang_kabupaten_jember,
            R.drawable.lambang_kabupaten_jombang,
            R.drawable.lambang_kabupaten_kediri,
            R.drawable.lambang_kabupaten_lamongan,
            R.drawable.lambang_kabupaten_lumajang,
            R.drawable.lambang_kabupaten_madiun,
            R.drawable.lambang_kabupaten_magetan,
            R.drawable.lambang_kabupaten_malang,
            R.drawable.lambang_kabupaten_mojokerto,
            R.drawable.lambang_kabupaten_nganjuk,
            R.drawable.lambang_kabupaten_ngawi,
            R.drawable.lambang_pacitan,
            R.drawable.lambang_kab_pamekasan,
            R.drawable.lambang_kabupaten_pasuruan,
            R.drawable.lambang_kabupaten_ponorogo,
            R.drawable.lambang_kabupaten_probolinggo,
            R.drawable.lambang_sampang,
            R.drawable.lambang_kabupaten_sidoarjo,
            R.drawable.lambang_kabupaten_situbondo,
            R.drawable.lambang_kabupaten_sumenep,
            R.drawable.lambang_kabupaten_trenggalek,
            R.drawable.lambang_kabupaten_tuban,
            R.drawable.lambang_tulungagung,
            R.drawable.lambang_kota_batu,
            R.drawable.lambang_kota_blitar,
            R.drawable.lambang_kota_kediri,
            R.drawable.lambang_kota_madiun,
            R.drawable.lambang_kota_malang,
            R.drawable.lambang_kota_mojokerto,
            R.drawable.lambang_kota_pasuruan,
            R.drawable.lambang_kota_probolinggo,
            R.drawable.lambang_kota_surabaya
    };
    private static int[] lokasiKab ={
            R.drawable.kabupaten_bangkalan,
            R.drawable.kabupaten_banyuwangi,
            R.drawable.kabupaten_blitar,
            R.drawable.kabupaten_bojonegoro,
            R.drawable.kabupaten_bondowoso,
            R.drawable.kabupaten_gresik,
            R.drawable.kabupaten_jember,
            R.drawable.kabupaten_jombang,
            R.drawable.kabupaten_kediri,
            R.drawable.kabupaten_lamongan,
            R.drawable.kabupaten_lumajang,
            R.drawable.kabupaten_madiun,
            R.drawable.kabupaten_magetan,
            R.drawable.kabupaten_malang,
            R.drawable.kabupaten_mojokerto,
            R.drawable.kabupaten_nganjuk,
            R.drawable.kabupaten_ngawi,
            R.drawable.kabupaten_pacitan,
            R.drawable.kabupaten_pamekasan,
            R.drawable.kabupaten_pasuruan,
            R.drawable.kabupaten_ponorogo,
            R.drawable.kabupaten_probolinggo,
            R.drawable.kabupaten_sampang,
            R.drawable.kabupaten_sidoarjo,
            R.drawable.kabupaten_situbondo,
            R.drawable.kabupaten_sumenep,
            R.drawable.kabupaten_trenggalek,
            R.drawable.kabupaten_tuban,
            R.drawable.kabupaten_tulungagung,
            R.drawable.kota_batu,
            R.drawable.kota_blitar,
            R.drawable.kota_kediri,
            R.drawable.kota_madiun,
            R.drawable.kota_malang,
            R.drawable.kota_mojokerto,
            R.drawable.kota_pasuruan,
            R.drawable.kota_probolinggo,
            R.drawable.kota_surabaya
    };
    private static String[] detail = {
            "Wisata Religi\n\n" +
                    "Makam Syaikhona Muhammad Kholil di Martajasah Bangkalan\n" +
                    "Makam Bujuk Cendana di Kwanyar Bangkalan\n" +
                    "Sunan Bangkalan/Raden Jakandar\n" +
                    "Perahu Sarimuna Peninggalan Syaichona Muhammad Cholil\n" +
                    "Pesarean Makam Zimat Sayyid Husein bin Assegaf\n\n" +
                    "Wisata Sejarah\n\n" +
                    "Makam raja-raja Bangkalan di Aermata Arosbaya\n" +
                    "Benteng ERFPRINS\n" +
                    "Mercusuar Sembilangan\n" +
                    "Benteng Tjakraningrat IV Tanjoeng Piring\n" +
                    "Patirtan Tjakraningrat IV Tanjoeng Piring\n" +
                    "Museum Cakraningrat\n\n" +
                    "Wisata Alam\n\n" +
                    "Sumber Mata Air / Pemandian Kec.Modung ( sumber bening - Langkap )\n" +
                    "Bukit Geger\n" +
                    "Pantai Siring Kemuning di desa Macajah, Tanjungbumi\n" +
                    "Pantai Rongkang\n" +
                    "Pantai Basmalah\n" +
                    "Pantai Maneron\n\n" +
                    "Wisata Kuliner\n\n" +
                    "Taman Rekreasi Kota (TRK) Bangkalan\n" +
                    "Taman Paseban Bangkalan\n" +
                    "Bebek Sinjay\n" +
                    "Cetar Membahana\n" +
                    "Ole-Olang Resto",
            "Kabupaten Banyuwangi memiliki banyak objek wisata seperti :\n\n" +
                    "Kawah Ijen\n" +
                    "Pantai Boom\n" +
                    "Pantai Plengkung\n" +
                    "Pantai Rajegwesi\n" +
                    "Pulau Merah\n" +
                    "Watu Dodol\n" +
                    "Teluk Hijau\n" +
                    "Teluk Biru\n" +
                    "Pantai Lampon\n" +
                    "Pantai Blimbingsari\n" +
                    "Pantai Wedi Ireng\n" +
                    "Pantai Sukomade\n" +
                    "Pantai bangsring\n" +
                    "Pantai cemara\n" +
                    "Rawa Bayu\n" +
                    "Rawa bulan\n" +
                    "Rumah Pohon\n" +
                    "Rumah Apung\n" +
                    "Waduk Sidodadi\n" +
                    "Waduk Bajulmati\n" +
                    "Pulau Tabuhan\n" +
                    "Air Terjun Lider\n" +
                    "Air Terjun Wonorejo (Tirto Kemanten)\n" +
                    "Air Terjun Jagir\n" +
                    "Air Terjun Antogan\n" +
                    "Air Terjun Selendangarum\n" +
                    "Wisata Osing\n" +
                    "Wisata Arung Jeram Kali Badeng\n" +
                    "Taman Blambangan\n" +
                    "Taman Sritanjung\n" +
                    "Taman Tirtawangi\n" +
                    "Alam Indah Lestari\n" +
                    "Mira Fantasy\n" +
                    "Taman Suruh\n" +
                    "Taman Nasional Alas Purwo\n" +
                    "Taman Nasional Meru Betiri\n" +
                    "Taman Nasional baluran\n" +
                    "Savanna Sadengan\n" +
                    "Taman Jawatan\n" +
                    "Wisata Sejarah Asrama Inggrisan\n\n" +
                    "Cagar budaya\n\n" +
                    "Situs Umpak Songo\n" +
                    "Situs Siti Inggil\n" +
                    "Kelenteng Ho Tong Bio",
            "Berikut ini adalah beberapa tempat wisata menarik di Kabupaten Blitar.\n\n" +
                    "Pantai Peh Pulo\n" +
                    "Soko Adventure\n" +
                    "Candi Penataran\n" +
                    "Serah Kencong\n" +
                    "Candi Sawentar\n" +
                    "Pantai Serang\n" +
                    "Rambut Monte\n" +
                    "Candi Plumbangan\n" +
                    "Gua Embultuk\n" +
                    "Pantai Jolosutro\n" +
                    "Pantai Pangi\n" +
                    "Pantai Tambakrejo\n" +
                    "Gong Kyai Pradah\n" +
                    "Candi Simping\n" +
                    "Monumen Trisula\n" +
                    "Kampung Coklat\n" +
                    "Bukit Bunda\n" +
                    "Kebun kopi Karanganyar\n" +
                    "Pantai Gondo Mayit\n" +
                    "Pantai Pangi\n" +
                    "Hutan Wisata Kaloka",
            "Wisata alam\n\n" +
                    "Kayangan Api, di Sendangharjo\n" +
                    "Waduk Pacal, di Kedungsumber\n" +
                    "Wana Wisata Dander, di Dander\n" +
                    "Bendungan Gerak Bojonegoro, di Ngringinrejo\n" +
                    "Air Terjun Kedungmaor, di Temayang\n" +
                    "Air Terjun Krondonan, di Gondang\n" +
                    "Wisata Alam Negeri Atas Angin, di Sekar\n" +
                    "Little Teksas Wonocolo, di Kedewan\n" +
                    "Water Fun, di Ngunut Dander\n" +
                    "Air Terjun Sujonopuro, di Sekar\n" +
                    "Air Terjun Pucang, di Bubulan\n" +
                    "Air Terjun Kedung Gupit, di Sekar\n\n" +
                    "Wisata keluarga\n\n" +
                    "Dander Waterpark, di Dander\n" +
                    "Go Fun Theme Park, di Jalan Veteran\n\n" +
                    "Wisata sejarah\n\n" +
                    "Masjid Al Birru Pertiwi, di Dander\n" +
                    "Masjid Agung Bojonegoro, di Kauman\n" +
                    "Museum Rajekwesi, di Jawik\n" +
                    "Klenteng Hok Swie Bio, di Sekaran\n" +
                    "Sumurboto, di Dadapan, Sumberagung, Ngraho\n\n" +
                    "Wisata religi\n\n" +
                    "Makam Wali Kidangan, di Sukorejo\n" +
                    "Makam Buyut Dalem, di Karang Pacar\n" +
                    "Makam Mbah Malang Negoro, di Ngasinan\n\n" +
                    "Wisata belanja\n\n" +
                    "Swalayan Sultan Ratu Keraton, di Gajah\n" +
                    "KDS Store Bojonegoro, di Sukorejo\n" +
                    "Bravo Bojonegoro di Bojonegoro\n" +
                    "Giant Supermarket Bojonegoro di Bojonegoro\n\n" +
                    "Wisata taman kota\n\n" +
                    "Taman Alun-alun Bojonegoro, di Kota Bojonegoro\n" +
                    "Taman Rajekwesi, di Kota Bojonegoro\n" +
                    "Taman Bengawan Solo, di Kota Bojonegoro\n" +
                    "Taman Mlaten, di Kota Bojonegoro\n" +
                    "Taman Kawasan Stadion H Soedirman, di Kota Bojonegoro\n" +
                    "Taman Talun, di Sumberrejo",
            "Pariwisata, seni dan budaya merupakan salah satu kegiatan yang diharapkan dapat menunjang pertumbuhan ekonomi masyarakat, yang berdampak pada meningkatnya pendapatan daerah. Kunjungan wisatawan baik nusantara maupun mancanegara diharapkan dapat menggerakkan perekonomian masyarakat. Berdasarkan Peraturan Daerah Nomor 8 Tahun 2007 tentang RTRW Kabupaten Bondowoso, ditetapkan kawasan wisata Kabupaten Bondowoso yaitu:\n\n 1.Kawasan Wisata Terpadu Kawah Ijen di Kecamatan Sempol dan Sumberwringin, dengan objek wisata: a.Wisata Kawah Ijen, Kawah Telaga Weru dan Kawah Wurung b.Wisata Air Terjun Blawan dan Gua Stalagtit c.Wisata Pemandian Air Panas Blawan dan Pemandian Damarwulan d.Wisata Agro Kopi Kalisat e.Wisata Air Terjun Puloagung - Sukorejo\n" +
                    "\n\n" +
                    "2.Kawasan Wisata Terpadu Lereng Argopuro di Kecamatan Pakem, dengan objek wisata: a.Wisata Agro Pusat Penelitian Kopi dan Kakao b.Wisata Air Terjun Tancak Kembar c.Wisata Pendakian Pegunungan Hyang (Gunung Argopuro)\n" +
                    "\n\n" +
                    "3.Kawasan Wisata Pemandangan Arak-arak di Kecamatan Wringin\n" +
                    "4.Kawasan Wisata Pendakian Gunung Raung di Kecamatan Sumberwringin\n" +
                    "5.Kawasan Wisata Panjat Tebing Alam Patirana di Kecamatan Grujugan\n" +
                    "6.Kawasan Wisata Pemandian Tasnan di Kecamatan Grujugan\n" +
                    "7.Kawasan Wisata Sejarah Sarkopage di Kecamatan Grujugan, Maesan, Wringin, Tegalampel, Bondowoso, Wonosari, Tamanan, Jambesari Darussholah, Prajekan, Tlogosari dan Sempol\n" +
                    "8.Kawasan Wisata Rekreasi Alun-alun Bondowoso\n" +
                    "9.Kawasan Wisata Ziarah Makam Ki Ronggo di Kecamatan Tegalampel\n" +
                    "10.Kawasan Wisata Budaya Pedepokan Gema Buana di Kecamatan Prajekan\n" +
                    "11.Kawasan Wisata Kerajinan Kuningan Cindogo di Kecamatan Tapen\n" +
                    "12.Kawasan Wisata Bendung Sampean Baru di Kecamatan Tapen\n" +
                    "13.Kawasan Wisata Budaya Upacara Adat Desa Blimbing di Kecamatan Klabang\n" +
                    "14.Kawasan Wisata Arung Jeram Bosamba di Kecamatan Taman Krocok dan Tapen.\n" +
                    "15.kawasan wisata aduan sapi yang ada di kecamatan tapen Dalam mendukung pariwisata, di Kabupaten Bondowoso juga disediakan sarana akomodasi penginapan yang memadai bagi wisatawan. Pada tahun 2008 ini jumlah hotel di Kabupaten Bondowoso terdiri dari 11 hotel. Satu hotel bintang 3 yaitu Hotel Ijen View di Jalan KIS Mangunsarkoro. Sedangkan lainnya yaitu hotel melati. Enam hotel di Kota Bondowoso yaitu Palm, Anugerah, Baru, Slamet, Kinanti dan Grand serta 4 hotel di luar Kota Bondowoso yaitu Arabica, Catimore, Jampit, dan Wisata Asri.",
            "Objek wisata\n\n" +
                    "Pulau Bawean, merupakan tujuan wisata bahari, yang terdapat suaka alam dan suaka margasatwa. Di antara tujuan wisata Bawean adalah: Noko Gili, Pantai Bayangkara, Pantai Tanjunggaang, Pulau China, Pantai Selayar, Danau Kastoba, dll.\n\n" +
                    "Pantai Delegan, Pantai ini terletak di Desa Delegan Kecamatan Panceng dari Gresik kota berjarak sekitar 40 km, setelah dari Sidayu dan melewati hutan jati Panceng ada papan penunjuk arah menunjukkan wisata Pantai Delegan, dari jalan arteri masuk ke utara sekitar 1 km sudah sampai di lokasi. Pantai Delegan sangat cocok untuk wisata pantai, lomba perahu atau memancing. Pantai berpasir putih ini setiap bulan Agustus diadakan atraksi wisata berupa perlombaan yang terkait dengan wisata bahari. Pantai Delegan dibuka untuk umum sejak tahun 2003.\n\n" +
                    "Muara Bengawan Solo, Bengawan Solo adalah sungai terpanjang di Pulau Jawa, Muara Bengawan Solo merupakan kawasan yang tidak kalah menariknya untuk dikunjungi. Untuk mencapai ke lokasi tersebut dari kota gresik melewati jalur pantura, setelah jembatan sungai bengawan solo sembayat tepatnya di pertigaan Bungah belok kiri mengikuti petunjuk ke Dukun, sekitar satu kiloan di sisi kanan jalan ada gang masuk ke area pertambangan bukit kapur dan proyek pembangunan perumahan Pondok Bunga Indah. Setelah masuk gang lurus sampai pertigaan kemudian kearah kiri sampai terlihat Bukit Jamur ini.\n\n" +
                    "Banyu Biru Lowayu Dukun Gresik, Banyu Biru Lowayu terletak di kecamatan Dukun desa Lowayu. Danau ini cukup menarik banyak minat para pengunjung, meski jauh dari pengunungan tetapi kandungan belerang di banyu biru cukup lumayan, kondisi airnya yang hangat ketika pagi dipercaya masyarakat sekitar untuk menyembuhkan berbagai penyakit kulit. Proses Erupsi pada batu batu sisa galian menyebabkan adanya perubahan yang mirip dengan jamur, karena pada bagian bawah lebih rapuh dibandingkan posisi sebelah atas\n\n" +
                    "Dynasty Water World, merupakan tempat wisata terbaru di Kabupaten Gresik yang terletak di Jalan Rantau No. 27-29, Gresik Kota Baru, Kabupaten Gresik yang menyediakan berbagai kolam renang lengkap dengan wahana airnya yang fantastik. Dynasty Water World ini dihubungkan Jalan Tol Surabaya - Manyar dan merupakan kolam renang terbesar di Kabupaten Gresik, Dynasty Water World diresmikan oleh Wali kota Gresik Sambari Halim Radianto pada tanggal 22 Maret 2016 yang bertepatan dengan Hari Air Sedunia, dengan harga tiket yaitu Selasa–Jumat Rp50.000,00 dan Sabtu–Minggu Rp75.000,00 dan pada hari Senin tutup.\n\n"
                    +"Wisata Ziarah\n\n" +
                    "Makam Maulana Malik Ibrahim (Sunan Gresik), di desa Gapuro\n" +
                    "Makam Sunan Giri, di desa Giri\n" +
                    "Makam Sunan Prapen (Cucu Sunan Giri), di desa Klangonan\n" +
                    "Makam Fatimah binti Maimun, di desa Klangonan\n" +
                    "Makam Kanjeng Sepuh, di desa Kauman\n" +
                    "Petilasan Sunan Kalijaga, di Kawasan Gunung Surowiti kecamatan Panceng di Kabupaten Gresik\n\n" +
                    "Wisata Tradisi\n\n" +
                    "Selain itu ada tradisi yang telah cukup lama hingga sekarang masih terus berlangsung yakni tradisi rebo wekasan, Haul Bungah, Nyadran di desa Abar-abir, malem selawe, dan pasar bandeng.[5]\n" +
                    "\n" +
                    "Kabupaten Gresik memiliki banyak peninggalan sejarah yang berpotensi sebagai pusaka (heritage), komunitas Mataseger telah mempelopori kegiatan pelestarian pusaka ini dengan ikut membidani lahirnya Perda Cagar Budaya Nomor 27/2011, tinggal peran serta Pemerintah dan masyarakat untuk ikut memelihara dan memanfaatkan potensi ini.\n" +
                    "\n" +
                    "Gresik Kota Lama (ratusan bangunan kuno yang menyebar di kota lama)\n" +
                    "Benteng Lodewijk Mengare\n" +
                    "Situs Gosari\n" +
                    "Situs Kanjeng Sepuh Sedayu\n" +
                    "Dan lain-lain\n\n" +
                    "Wisata Seni Budaya\n\n" +
                    "Tari Pencak Macan Gresik, yang tersebar di seluruh pesisir Kabupaten Gresik\n" +
                    "Tari Bantengan, Yang tersebar di Balongpanggang, Benjeng dan Wringinanom\n" +
                    "Tari Zavin Mandilingan dari pulau Bawean, yang juga dilestarikan juga putera Bawean di pulau Jawa. Selalu menjadi tamu Kehormatan untuk menyajikan tarian zavin Mandiling di berbagai acara besar.\n" +
                    "Tari Kencrengan, Merupakan tarian yang menceritakan pergerakan saat sholat yang diringi musik rebana dan pujian islami. Tari Kencrengan pernah menjadi tamu kehormatan berskala nasional pada penutupan Festival Reyog Nasional di Ponorogo tahun 2011.\n" +
                    "Reog Ponorogo, Di lestarikan oleh Pt Pupuk Indonesia Petro Kimia (Barong Samudro) dan PT Semen Gresik Indonesia (Pudak Arum) yang pernah menjadi Juara nasional FRN. Reog di Gresik juga dilestarikan oleh Sman 1 Manyar, SMAN 1 Kebomas, SMP 3 Gresik, Sdn Pongangan Manyar, Desa Sidomoro, dan Pura hindu Penataran Luhur Kamulan Menganti. Reog Selalu mengiringi pengarakan piala adipura Gresik, gulat Okol Menganti dan bersih desa setempat di Gresik.\n" +
                    "Wayang Kulit, Di Lestarikan oleh pt Semen Gresik dan pt Petro kima Gresik yang setiap tahunnya selalu menampilkan semalam suntuk pertunjukan wayang. di Kabupaten Gresik terdapat puluhan kelompok wayang kulit yang tersebar tiap kecamatan di Kabupaten Gresik.\n" +
                    "Orkes Melayu Dangdut, dengan ratusan group di antaranya yang terkenal adalah Rockdut Sera dari Balongpanggang.",
            "Tempat Wisata\n\n" +
                    "Pantai Payangan\n" +
                    "Pantai ini terletak di Kecamatan Ambulu. pesona pantai ini akan sangat indah jika dilihat dari atas bukit yang terletak di sekitar pantai . Selain dihiasi beberapa bukit pantai ini juga dihiasi oleh bebatuan yang berbaris rapi di tepi pantai. banyak wisatawan dari dalam maupun luar kota yang datang untuk berwisata. sebagian besar dari mereka menginap atau datang pada tengah malam untuk dapat melihat sunrise dari atas bukit.\n" +
                    "\n" +
                    "Pantai Watu Ulo\n" +
                    "Pantai yang terletak sekitar 25 Km dari Kecamatan Ambulu dan pada saat hari-hari libur biasanya banyak anak-anak muda dan rombongan keluarga yang pergi kesana untuk berlibur, apalagi saat hari-hari besar dan hari raya. Mereka biasanya pergi ke sana bersama-sama dengan keluarga mereka masing-masing menggunakan angkutan umum atau kendaraan pribadi. Pantai Watu Ulo memiliki panorama yang mempesona menghadap lautan Indonesia dengan deretan batu karang menyerupai ular.[4]\n" +
                    "\n" +
                    "Pantai Tanjung Papuma\n" +
                    "Pantai dengan pesona pasir putihnya dan Wisata Sejarah berupa peninggalan Gua Jepang. Pantai ini dikenal juga dengan nama Pantai Pasir Putih Malikan. Dinamakan Papuma karena pantai ini berpasir putih dengan hamparan batu-batu yang bila diterjang ombak lalu saling terberai membalik.[4] Pantai Papuma adalah pantai yang sangat eksotik bila dibandingkan dengan pantai pantai yang ada di Jawa Timur, karena memiliki keindahan pantai dan laut yang menawan dengan pantai yang hijau kebiruan menjadikan tempat wisata ini banyak dikunjungi baik dari warga Jember sendiri juga dari kabupaten lain.\n" +
                    "\n" +
                    "Pantai Puger\n" +
                    "Pantai yang terletak 15 Km dari Kecamatan Ambulu. Tempat wisata ini juga banyak dikunjungi oleh banyak orang dan paling banyak adalah anak-anak muda untuh menghibur diri. Pantai Puger juga menjadi surga bagi orang yang suka memancing. Di pantai ini juga terdapat TPI (Tempat Pelelangan Ikan) yang menjual ikan hasil tangkapan nelayan. Di sekitar Pantai Puger juga terdapat Cagar Alam Puger Watangan dengan pesona sumber air Kucur. Pantai Puger juga merupakan gerbang keluar menuju Cagar Alam Pulau Nusa Barong.\n" +
                    "\n" +
                    "Pantai Paseban\n" +
                    "Pantai di daerah Kencong. Di pantai ini wisatawan dapat menikmati mandi laut mengingat ombaknya yang tenang dan landai nan teratur sehingga tidak membahayakan.\n" +
                    "\n" +
                    "Pantai Bandealit\n" +
                    "Pantai di wilayah Taman Nasional Meru Betiri yang secara administratif masuk kedalam wilayah Kecamatan Tempurejo. Pantai ini berdekatan dengai Pantai Sukamade yang merupakan tempat penetasan telur penyu.\n" +
                    "\n" +
                    "Pemandian Patemon\n" +
                    "Pemandian yang berada di wilayah Kecamatan Tanggul. Di pemandian Patemon udaranya sangat sejuk karena terletak di daerah pegunungan dan air yang mengalir di pemandian tersebut adalah air yang berasal dari sumber mata air pegunungan, jadi airnya sangat dingin. Pada hari-hari libur khususnya hari Minggu dan hari libur nasional banyak orang berkunjung, mulai dari anak-anak, anak muda, sampai pada orang tua. Pemandian ini menjadi semakin menarik dengan ditambahnya satu kolam renang baru dan wahana waterboom. Selain itu tempat-tempat yang ada di sekitar kolam renang telah diperbaiki sehingga semakin menarik untuk dikunjungi.\n" +
                    "\n" +
                    "Pemandian Rembangan\n" +
                    "Pemandian yang terletak di salah satu puncak gunung, memiliki daya tarik pemandangan, pemandian, hotel, dan wisata agro berupa perkebunan kopi milik PTP Nusantara XII dan peternakan sapi perah, di mana Anda bisa melihat proses pemerahan susu sapi dan membeli susu sapi segar literan. Di Rembangan, Anda bisa melihat kota Jember & sekitarnya dari atas. Dan, pada waktu malam, pemandangan lampu kota sangat mengesankan. Di sini suhunya sangat sejuk & udaranya sangat bersih & segar; sangat baik untuk tubuh Anda.\n" +
                    "\n" +
                    "Air Terjun Tancak\n" +
                    "Air terjun yang terletak di Perkebunan Gunung Pasang - Kecamatan Panti.\n" +
                    "\n" +
                    "Air Terjun Antrokan\n" +
                    "Air terjun terletak di wilayah Kecamatan Tanggul.\n" +
                    "\n" +
                    "Air Terjun Sumberjambe\n" +
                    "Air terjun terletak di Rowosari.\n" +
                    "\n" +
                    "Air Terjun Gn. Rayap\n" +
                    "Air Terjun yang berada dikawasan wisata puncak Rembangan\n" +
                    "\n" +
                    "Wisata Loko\n" +
                    "Wisata di lahan PG Semboro yang menawarkan keindahan pemandangan alam perkebunan tebu, jeruk, rambutan dan salak yang berada di sepanjang perjalanan selama 3 jam dengan menggunakan lokomotif uap.\n" +
                    "\n" +
                    "Wisata Lori\n" +
                    "Wisata di daerah Garahan yang menyajikan dua buah terowongan Kereta Api (90 m dan 970 m) yang merupakan terowongan Kereta Api terpanjang di Indonesia. Selain itu wisatawan juga dapat menikmati wisata agro Gunung Gumitir.\n" +
                    "\n" +
                    "Taman Botani\n" +
                    "Taman edukatif dan pemandian di wilayah Kecamatan Sukorambi yang mulai dibuka tahun 2007.\n" +
                    "\n" +
                    "Alun-Alun (Central Park)\n" +
                    "Alun-alun Jember selalu dipadati masyarakat Jember untuk menghabiskan waktu menikmati jantung kota Jember, disini ada bisa menemukan banyak pusat perbelanjaan dan warung lesehan. Di setiap hari minggu selalu diadakan Car Free Day. Dalam setiap cara Car Free Day, Jl. PB. Sudirman yang berada di dekat Alun-Alun akan berubah menjadi tempat berjualan para pedagan makanan, dan harga yang ditawarkan pun sangat terjangkau.\n" +
                    "\n" +
                    "Wisata Agro Glantangan (WAG)\n" +
                    "Pemandian Oleng Si Butong di Arjasa\n" +
                    "Pemandian Kebon Agung di Gebang\n" +
                    "Pemandian Kimo\n" +
                    "Pontang Jaya Waterpark\n" +
                    "Mumbul Garden Waterpark\n" +
                    "Cafe & Rest Area Gumitir\n" +
                    "Tiara Jember Park (Water Boom) di Jl. Kaliurang\n" +
                    "Niagara Water park di Ambulu\n" +
                    "Dira I Swalayan, Fashion, Swiming Pool & Waterboom di Ambulu\n" +
                    "Happy Fun Swimming Pool & Waterboom di Kesilir, Wuluhan\n" +
                    "Surya Tirta, Fitnes Centre and Swimming Pool di Ambulu\n" +
                    "Jubung Rest Area/Jatian (Taman, Rumah Makan, Souvenir/Oleh-oleh, Pemandian, Paint Ball Arena)\n" +
                    "Wisata Edukatif puslit kopi dan kakao\n" +
                    "Wisata Edukatif Tanoker\n" +
                    "Agrowisata cigarete cerutu di Arjasa\n" +
                    "Wisata Religi Masjid Agung Jember (Jam'i Al-Baitul Amien)\n" +
                    "Wisata Religi K.H Muh Shidiq\n" +
                    "Wisata Religi Vihara Dewi Sri di Pantai Papuma",
            "Wisata buatan\n\n" +
                    "Tirta Wisata\n" +
                    "Tempat wisata lokal yang terdapat balekambang, kolam pancing, kolam renang dan lapangan tenis. Tempat ini sering diselenggarakan berbagai konser, baik artis regional hingga artis ibu kota. Terletak di tepi jalan raya Jombang-Surabaya, Desa Keplaksari, Kecamatan Peterongan.\n\n" +
                    "Taman Keplaksari\n" +
                    "Taman wisata yang terdapat monumen pesawat tempur di sebelah tenggara taman ini dan patung hewan di Indonesia dari barang bekas. Terletak di sebelah utara Tirta Wisata.\n\n" +
                    "Wisata alam\n\n" +
                    "Sungai Kedung Cinet di Ploso, Jombang (1927)\n" +
                    "Wanawisata Sumberboto\n" +
                    "Merupakan wahana wisata binaan dari Perhutani yang banyak dikunjungi wisatawan lokal. Suasana dingin dan asri penuh dengan pepohonan, terdapat pula kolam renang air hangat. Terletak di Desa Grobogan, Kecamatan Mojowarno. Biasanya ditempat ini dijadikan sebagai tempat perkemahan.\n" +
                    "Wisata Agro Perkebunan Panglungan\n" +
                    "Kawasan perkebunan dengan topografi pegunungan yang berada di Desa Sambirejo, Kecamatan Wonosalam ini berfungsi sebagai daerah resapan air dan kawasan konservasi lahan. Saat ini Panglungan tengah dikembangkan sebagai agrowisata dengan tanaman utama kakao, cengkeh, melinjo, dan kopi.\n" +
                    "Air Terjun Tretes\n" +
                    "Merupakan air terjun dengan ketinggian 158 meter, dan terletak di ketinggian 1250 meter di atas permukaan air laut. Terletak di Dusun Tretes, Desa Galengdowo, Kecamatan Wonosalam.\n" +
                    "Goa Sigolo-golo\n" +
                    "Terletak di Dusun Kranten, Desa Panglungan, Kecamatan Wonosalam. Merupakan Goa di wilayah Jombang yang menyuguhkan pemandangan alam yang indah.\n" +
                    "Kedung Cinet\n" +
                    "Merupakan wisata alami pegunungan yang sangat mempesona. Aliran sungai yang jernih dan menawan dilintasi oleh \"jembatan goyang\". Terdapat di Desa Klitih, Kecamatan Plandaan.\n" +
                    "Sendang Made\n" +
                    "Terletak di Desa Made, Kecamatan Kudu. Di kawasan ini terdapat peninggalan sejarah petilasan Raja Airlangga. Selain Sendang Made di sekitarnya terdapat sendang-sendang lain yang lebih kecil, Diantaranya Sendang Payung, Sendang Padusan, Sendang Drajat, Sendang Sinden dan Sendang Omben.\n\n" +
                    "Wisata minat khusus\n\n" +
                    "Candi Ngrimbi\n" +
                    "Candi ini dulunya merupakan pintu gerbang sebelah selatan Kerajaan Majapahit. Terletak di Desa Ngrimbi, Kecamatan Bareng. Letaknya sangat strategis karena berada di tepi jalan utama Mojoagung-Wonosalam.\n" +
                    "Makam K.H. Hasyim Asy'ari dan K.H. Wachid Hasyim\n" +
                    "K.H. Hasyim Asy'ari merupakan pendiri Ponpes Tebuireng (Jombang), salah satu pendiri organisasi Nahdlatul Ulama. Puteranya, K.H. Wahid Hasyim adalah Menteri Agama RI pertama. Dua makam pahlawan nasional ini terletak di kompleks Ponpes Tebuireng, Desa Cukir, Kecamatan Diwek.\n" +
                    "Makam Sayid Sulaiman\n" +
                    "Sayid Sulaiman merupakan salah satu penyebar Islam di kawasan Jombang pada era pasca runtuhnya Majapahit. Pada malam Jumat Legi, makam ini banyak dikunjungi peziarah. Terletak di Desa Mancilan, Kecamatan Mojoagung.\n" +
                    "Makam Gunung Kuncung\n" +
                    "Terletak di lereng gunung, di Desa Wonorejo, Kecamatan Wonosalam; yakni di perbatasan dengan Kabupaten Kediri.\n" +
                    "Makam Pangeran Benowo\n" +
                    "Makam ini terletak di Desa Wonomerto, Kecamatan Wonosalam.\n" +
                    "Makam Gus Dur\n" +
                    "Merupakan makam mantan dari presiden Indonesia yang keempat, KH. Abdurrahman Wahid, di kompleks Ponpes Tebuireng, Desa Cukir, Kecamatan Diwek. Tempat ini dijadikan tempat ziarah yang selalu ramai dikunjungi.\n\n" +
                    "Wisata religius\n\n" +
                    "Pondok Pesantren\n" +
                    "Jombang telah lama terkenal dengan julukan kota santri. Lima ponpes terbesar di Kabupaten Jombang adalah Ponpes Tebuireng di Cukir (Kecamatan Diwek), Ponpes Darul Ulum di Rejoso (Kecamatan Peterongan), Ponpes Bahrul Ulum di Tambakberas (Kecamatan Jombang), Ponpes Mambaul Maarif di Denanyar (Kecamatan Jombang) dan Ponpes Luhur Nurhasan di Gadingmangu (Kecamatan Perak).\n" +
                    "Pengajian Padang Mbulan\n" +
                    "Merupakan pengajian rutin yang digelar pada setiap malam bulan purnama. Pengajian ini dirintis oleh budayawan Emha Ainun Nadjib (Cak Nun). Diadakan di halaman depan asal rumah Cak Nun di Desa Menturo, Kecamatan Sumobito.\n" +
                    "Kelenteng Hong San Kiong\n" +
                    "Terletak di desa Gudo, Jombang. Selain dikenal sebagai tempat ibadah Tridarma (Agama Taoisme, Budha, dan Konghucu) juga sebagai tempat berobat. Menariknya yang datang untuk berobat juga banyak yang dari kalangan pribumi. Setiap menjelang Tahun Baru Imlek, kelenteng ini mengadakan acara hajatan yang cukup meriah, seperti Wayang Potehi maupun Pagelaran Barongsai.\n" +
                    "Gereja Mojowarno\n" +
                    "Gereja Mojowarno merupakan gereja tertua di kawasan, serta dulunya pernah menjadi pusat salah satu aliran Kristen Protestan pada zaman Belanda. Setiap setahun sekali, gereja ini mengadakan upacara kebetan dan unduh-unduh, yang sarat akan kultur lokal.",
            "Wisata Alam\n\n" +
                    "Wisata Sumber Air Ubalan di Dusun Kalasan, Desa Jarak, Plosoklaten\n" +
                    "Air Terjun Besuki, di Desa Jugo\n" +
                    "Gunung Kelud di Desa Sugihwaras\n" +
                    "Gua Surowono, di Desa Canggu\n" +
                    "Gua Maria Lourdes Pohsarang, di Desa Semen\n" +
                    "Arung Jeram Sungai Konto, di Desa Siman\n" +
                    "Gunung Ongakan, Ds. Besowo\n" +
                    "Pemandian Alam Corah\n" +
                    "Alas Simpenan\n\n" +
                    "Wisata Sejarah\n\n" +
                    "Petilasan Sri Aji Joyoboyo, di Desa Menang\n" +
                    "Candi Tegowangi, di Desa Tegowangi\n" +
                    "Candi Surowono, di Desa Canggu\n" +
                    "Situs Tondowongso, di Desa Gayam\n" +
                    "Makam Tan Malaka di Desa Selopanggung\n\n" +
                    "Wisata Pendidikan\n\n" +
                    "Kampung Inggris, di Desa Pelem & Desa Tulungrejo\n\n" +
                    "Wisata Keluarga\n\n" +
                    "Simpang Lima Gumul (SLG), di Desa Tugu Rejo\n" +
                    "Argo Wisata Sepawon, di Desa Sepawon\n" +
                    "Pagora di Kediri\n" +
                    "Kampung Anggrek di Ngancar\n" +
                    "Kampung Tebu di Djengkol\n" +
                    "Taman Hijau SLG\n" +
                    "Taman Kilisuci di Barat Masjid Agung Pare\n" +
                    "Alun Alun Taman Ringin Mbah Budho Pare\n" +
                    "Taman Hutan Kota Pelem-Pare\n\n" +
                    "Wisata Religi\n\n" +
                    "Masjid An-Nur Pare, di Desa Tulungrejo\n" +
                    "Gereja Pohsarang, di Desa Semen\n" +
                    "Makam Gus Miek (KH Hamim Tohari Djazuli) di Desa Ploso, Kecamatan Mojo",
            "Wisata Alam\n\n" +
                    "Tempat wisata alam di Kabupaten Lamongan, yaitu:\n" +
                    "\n" +
                    "Waduk Gondang\n" +
                    "Akar Langit Trinil Brondong\n" +
                    "Wego\n" +
                    "Istana Gunung Mas\n" +
                    "Waduk Prijetan\n" +
                    "Wisata Bahari Lamongan\n" +
                    "Gua Maharani Zoo (Mazoola)\n" +
                    "Pantai Kutang Brondong\n" +
                    "Gunung Suru Lembor\n\n" +
                    "Wisata Sejarah\n\n" +
                    "Tempat wisata sejarah di Kabupaten Lamongan, yaitu:\n" +
                    "\n" +
                    "Museum Sunan Drajat\n" +
                    "Monumen Van der Wijck\n" +
                    "Situs Sendang Gede Ngimbang\n" +
                    "Candi Slumpang Laren\n\n" +
                    "Wisata Religi\n\n" +
                    "Tempat wisata religi di Kabupaten Lamongan, yaitu:\n" +
                    "\n" +
                    "Makam Sunan Drajat\n" +
                    "Makam Sunan Sendang Duwur\n" +
                    "Makam Syekh Maulana Ishaq (Ayah Sunan Giri)\n" +
                    "Makam Sunan Lamongan/Syekh Hisyamudin (Putra Sunan Ampel)\n" +
                    "Makam Dewi Sekardadu (Ibu Sunan Giri)\n" +
                    "Makam Dewi Andongsaroli (Ibu Patih Gajah Mada)",
            "Lumajang memiliki cukup banyak lokasi wisata pantai di Laut Selatan (Samudera Hindia) seperti Pantai Bambang, Pantai Dampar, Watu Pecak, Watu Godeg dan Watu Gedeg. Di samping itu, di lereng-lereng timur Semeru terdapat beberapa lokasi wisata lokal seperti Piket Nol, yang menjadi puncak tertinggi di lintas perbukitan selatan, Goa Tetes, dan Gladak Perak di lintas selatan Lumajang-Malang. Di daerah Sumber Mujur juga terdapat kawasan hutan bambu di sekitar mata air Sumber Deling yang merupakan tempat pelestarian aneka jenis tanaman bambu, yang sekaligus menjadi habitat bagi kawanan kera dan ribuan kelelawar (kalong). Di Pasrujambe terdapat sebuah tempat wisata mata air suci dan Pura Watu Klosot yang menjadi tujuan wisata bagi peziarah Hindu dari Bali.Lumajang juga memiliki air terjun yang sangat menarik, diantaranya Air Terjun Tumpak Sewu, Air Terjun Kapas Biru, Air Terjun Kabut Pelangi. Dan Lumajang memiliki Wisata \"Negeri Diatas Awan\" Puncak B-29",
            "Wisata Alam\n\n" +
                    "Waduk Bening Widas\n" +
                    "Waduk Notopuro\n" +
                    "Waduk Kedungbrubus\n" +
                    "Waduk Dawuhan\n" +
                    "Wisata Alam Pesanggrahan\n" +
                    "Wana Wisata Grape\n" +
                    "Dungus Forest Park\n" +
                    "Gligi Forest Park\n" +
                    "Hutan Pinus Nongko Ijo\n" +
                    "Desa Wisata Brumbun\n" +
                    "Watu Rumpuk\n" +
                    "Gunung Wilis\n" +
                    "Gunung Kendil\n" +
                    "Air Terjun Banyulawe\n" +
                    "Air Terjun Seweru\n" +
                    "Air Terjun Krecekan Denu\n" +
                    "Air Terjun Kucur\n" +
                    "Bumi Perkemahan Kandangan\n" +
                    "Selo Gedong\n" +
                    "Kali Krangkeng\n" +
                    "Wahana Bermain Sekar Arum\n" +
                    "Wisata Religi\n" +
                    "Makam Kuncen Caruban\n" +
                    "Masjid Kuno Sewulan\n" +
                    "Masjid Jami' Al Muttaqien Banjarsari\n" +
                    "Masjid Jami' Al Arifiyah Caruban\n" +
                    "Masjid Agung Kabupaten Madiun (Masjid Quba)\n\n" +
                    "Wisata Sejarah\n\n" +
                    "Monumen Kresek\n" +
                    "Monumen Lubang Yudho\n" +
                    "Peninggalan Situs Nglambangan\n" +
                    "Candi Wonorejo\n" +
                    "Situs Ngurawan Dolopo\n" +
                    "Palang Mejayan\n" +
                    "Wisata Keluarga\n" +
                    "Madiun Umbul Square\n" +
                    "Alun - Alun Caruban\n" +
                    "Piranha Swimming Club\n" +
                    "Kolam Renang Sendang Biru\n" +
                    "Taman Kota Caruban Asti\n" +
                    "Taman Lalu Lintas Caruban\n\n" +
                    "Wisata Budaya\n\n" +
                    "Kesenian Dongkrek\n" +
                    "Desa Wisata Gunungsari\n\n" +
                    "Wisata Agro\n\n" +
                    "Wahana Wisata dan Pasar Papringan Kalikerto\n\n" +
                    "Wisata Belanja/Pasar\n\n" +
                    "Pasar Baru Caruban\n" +
                    "Pasar Burung Caruban\n" +
                    "Pasar Sayur Caruban\n" +
                    "Pasar Dolopo Baru\n" +
                    "Pasar Slering Baru\n" +
                    "Pasar Nglames\n" +
                    "Pasar Balerejo\n" +
                    "Pasar Muneng\n" +
                    "Pasar Kajang\n" +
                    "Pasar Pagotan\n" +
                    "Pasar Karangmalang\n" +
                    "Pasar Dungus\n" +
                    "Pasar Sambirejo\n" +
                    "Pasar Gondosuli\n" +
                    "Pasar Sukolilo\n" +
                    "Pasar Babadan\n" +
                    "Pasar Gosong\n" +
                    "Pasar Pundensari\n" +
                    "Pasar Sugihwaras\n" +
                    "Pasar Cobaan\n" +
                    "Pasar Cermo\n" +
                    "Pasar Mlilir",
            "Tempat Wisata\n" +
                    "\n" +
                    "Beberapa objek wisata terkenal di Kabupaten Magetan yang sedang dikembangkan adalah:\n" +
                    "\n" +
                    "Gunung Lawu\n" +
                    "Telaga Sarangan\n" +
                    "Kerajinan Gamelan Patihan Karangrejo\n" +
                    "Telaga Wahyu\n" +
                    "Candi Sadon\n" +
                    "Candi Simbatan (Beji)\n" +
                    "Puncak Lawu\n" +
                    "Air Terjun Pundak Kiwo\n" +
                    "Air Terjun Tirtasari\n" +
                    "Argo Dumilah\n" +
                    "Taman Ria Dirgantara Kosala Tirta Maospati\n" +
                    "Manunggal\n" +
                    "Pemandian Dewi Sri\n" +
                    "Gerbang Kadipaten Purwodadi\n" +
                    "Cemorosewu\n" +
                    "Mojosemi Camping Ground\n" +
                    "Sumber Clelek Driyorejo\n" +
                    "Bendungan Gonggang Poncol\n" +
                    "Monumen Soco",
            "Wisata gunung\n" +
                    "Gunung Kawi, terletak di wilayah Kecamatan Wonosari. Terkenal sebagai tempat wisata spiritual.\n" +
                    "Gunung Arjuno-Welirang, sering dipakai untuk pendakian dengan rute Junggo, Cangar, Singosari, Lawang, Purwosari, atau Pandaan.\n" +
                    "Bromo lewat Desa Tumpang (Kecamatan Tumpang), Desa Gubuk Klakah - Kecamatan Poncokusumo.\n" +
                    "Gunung Semeru lewat desa Ngadas kecamatan Poncokusumo\n" +
                    "Gunung Anjasmoro lewat Kecamatan Pujon\n" +
                    "Wisata Payung Batu, kota Batu\n" +
                    "Bukit Buduk Asu, Lewat Desa Ketindan, Lawang\n\n" +
                    "Wisata air\n\n" +
                    "Waduk Selorejo, terletak di Kecamatan Ngantang (di tepi jalan raya Malang-Kediri)\n" +
                    "Kasembon Rafting, merupakan objek wisata bagi pencinta olahraga arung jeram, terletak di Kasembon (70 km barat kota Malang).\n" +
                    "Bendungan Sutami, terletak di Kecamatan Sumberpucung.\n" +
                    "Bendungan Lahor,terletak di sebelah barat Bendungan Ir.Sutami (Sumberpucung,kab.Malang)\n" +
                    "Taman Ria Sengkaling, terletak di tepi jalan raya Malang-Batu, terdapat kolam renang dan taman bermain.\n" +
                    "Wendit Water Park, terletak di jalan raya Mangliawan Pakis. Sebuah tempat wisata yang baru saja di renovasi. Objek wisata ini terkenal dengan sumber airnya dan kera-nya.\n" +
                    "Pemandian Umbulan,merupakan pemandian bernuansa pegunungan terletak di Kecamatan Dampit tepatnya di Desa Ubalan 2 Km dari pusat kota.\n" +
                    "Pemandian Dewi Sri, terletak di Kecamatan Pujon, menyajikan wisata pemandian air pegunungan. Wisata ini berada di dekat Pasar Pujon sebagai sentra pemasaran buah dan sayur mayur (Terminal Agribisnis Mantung).\n" +
                    "Pemandian Ken Dedes, terletak di Kecamatan Singosari\n" +
                    "Wisata Air Krabyakan, terletak di Desa Sumberngepoh, Kecamatan Lawang\n" +
                    "Sumber Nyolo, Terletak Di Desa lang lang,singosari\n\n" +
                    "Wisata air terjun\n\n" +
                    "Air terjun Coban Rondo, terletak di Kecamatan Pujon.\n" +
                    "Air terjun Parang Teja di Desa Gading Kulon kecamatan Dau\n" +
                    "Air terjun Coban Pelangi, terletak di Kecamatan Poncokusumo.\n" +
                    "Air terjun Coban Glothak, terletak di Kecamatan Wagir.\n" +
                    "Air terjun Bayu Anjlok, terletak di Pantai Lenggoksono.[9]\n" +
                    "Air terjun Coban Sewu, terletak di kecamatan Ampelgading.\n" +
                    "Air terjun Coban supit urang Di Lawang\n\n" +
                    "Wisata sejarah\n\n" +
                    "Candi Singosari dan arca Dwarapala, terletak di Kecamatan Singosari,\n" +
                    "Candi Jago (Jayaghu) di Kecamatan Tumpang, merupakan makam Ranggawuni\n" +
                    "Candi Kidal di kecamatan Tumpang, merupakan makam Anusapati, perlu diketahui di mana semua candi di kabupaten Malang sebagian besar adalah peninggalan sejarah kerajaan Singhasari, kecuali beberapa situs purbakala di sekitar wilayah Dau, Wagir dan Turen merupakan peninggalan kerajaan Kanjuruhan.\n\n" +
                    "Wisata pantai\n\n" +
                    "\n" +
                    "Donomulyo: Modangan (70 km dari pusat kota Malang), Ngliyep (62 km), Jonggring Saloko (69 km), Kondang Bandung, Kondang Iwak, Bantol, Nglurung, Ngebros\n" +
                    "Gedangan: Bajul Mati (58 km), Wonogoro (55 km), Nganteb, Goa Cina\n" +
                    "Bantur: Balekambang (57 km), Kondang Merak (59 km), Kipas\n" +
                    "Sumbermanjing Wetan: Tamban (68 km), Rawa Indah, Tambak Asri (60 km), Sendangbiru (Segoro Anakan) (69 km),\n" +
                    "Tirtoyudo: Sipelot, Lenggoksono, Tanger (70 km)\n" +
                    "Ampelgading: Licin (64 km)\n\n" +
                    "Wisata agro\n\n" +
                    "Kebun Teh PTPN Wonosari di Desa Ketindan kecamatan Lawang, terdapat agrowisata serta cottage,kolam pemandian dan transportasi wisata yang dapat disewa jika ingin berlibur.\n" +
                    "Wisata petik jeruk, di desa Selorejo kecamatan Dau\n" +
                    "PWEC (Petungsewu Wildlife Ecosystem Conservation) di desa Petungsewu Dau\n" +
                    "Wisata durian, disepanjang jalan raya Ngantang - Kasembon tepatnya di desa Pait.\n\n" +
                    "Wisata religi\n\n" +
                    "Masjid Tiban, di Sananrejo, Turen, Kabupaten Malang.[10]\n" +
                    "Feng Shui Asri Abadi di desa sidodadi kecamatan Lawang\n" +
                    "GKJW Peniwen, di Desa Peniwen. Desa Peniwen termasuk 41 Desa Kristen yang ada di Jawa Timur, Kampung Kristen di Jawa Timur inilah yang dikenal dengan sentra Gereja Kristen Jawi Wetan (GKJW), yaitu gereja beraliran Kristen Protestan yang sudah ada sejak masa penjajahan Belanda.\n" +
                    "GKJW Sitiarjo, di Desa Sitiarjo.\n" +
                    "Pesarehan Gunung Kawi, di Gunung Kawi.",
            "Kabupaten Mojokerto memiliki sejumlah objek wisata menarik.\n" +
                    "\n" +
                    "Mulai dari Kabupaten Mojokerto bagian Utara, ada Kecamatan Kemlagi terdapat wisata yang cukup banyak dikunjungi yaitu Waduk Tanjungan yang terdapat di desa Tanjungan, Kemlagi. Kemudian di Kecamatan Jetis ada Watu Blorok yang konon dulu saat pembangunan jalan, ada sebuah batu yang cukup besar yang akan dipindahkan karena berada pada tengah pembangunan jalan, tetapi esok harinya batu tersebut kembali ke posisi semula saat sebelum dipindahkan, tetapi wisata ini sekarang sepi pengunjungnya karena perawatan yang kurang. Ada pula wisata di bantaran sungai Brantas yang biasanya digunakan untuk event-event besar seperti Lomba Dayung, Lomba Layang-layang, dll.\n" +
                    "\n" +
                    "Di kecamatan trowulan, yang pernah menjadi pusat Kerajaan Majapahit. Ini terlihat dari banyaknya sisa peninggalan sejarah kerajaan tersebut yang dijumpai di sana. Trowulan adalah daya tarik utama wisata sejarah di kabupaten ini, karena terdapat puluhan candi peninggalan Kerajaan Majapahit, makam raja-raja Majapahit, serta Pendopo Agung yang diperkirakan berada tepat di pusat istana Majapahit, candi yang terdapat di kecamatan ini antara lain Candi Tikus, Candi Bajang Ratu, Candi Brahu, Candi Gentong, Candi Wringin Lawang, dan masih banyak Candi lain yang ditemukan.\n" +
                    "\n" +
                    "Kawasan pegunungan di kecamatan Pacet dan Kecamatan Trawas di selatan juga merupakan kawasan wisata andalan Kabupaten Mojokerto karena pemandangan yang sangat bagus dan hawa sejuk pegunungan yang dirasa sangat nyaman, di antaranya ada Wisata Arung Jeram dan Lokasi Outbound Training OBECH Wilderness Experience, Pemandian Air Panas di Padusan, Air terjun yang banyak antaranya Air terjun Coban Canggu, Air terjun Grenjengan, Air terjun Watu Ulo, dll, juga vila-vila peristirahatan di Pacet dan Trawas.",
            "Pariwisata\n" +
                    "\n" +
                    "Air terjun Sedudo\n" +
                    "Air terjun Singokromo\n" +
                    "Air Merambat Roro kuning\n" +
                    "Goa Margo Tresno\n" +
                    "Candi Ngetos\n" +
                    "Candi Lor\n" +
                    "Taman Wisata Anjuk Ladang\n" +
                    "Air Terjun Gedangan\n" +
                    "Air Terjun Sumber Manik\n" +
                    "Air Terjun Pring Jowo\n" +
                    "Air Terjun Tirto Panji\n" +
                    "Sendang Putri Wilis\n" +
                    "Air Terjun Selo Leter dan Air Terjun Watulumbung\n" +
                    "The Legend Waterpark Kertosono",
            "Tempat wisata\n\n" +
                    "Sedangkan tempat rekreasi yang ada saat ini adalah Wisata Air Terjun Pengantin yang terletak di dusun Besek Desa Hargomulyo Kec. Ngrambe, pemandianTawun, Waduk Pondok, Air terjun Srambang, serta kebun Teh Jamus yang berhawa sejuk dan terdapat Kolam Pemandian di sekitar Perkebunan Teh tersebut. Perkebunan Teh ini terletak di Kecamatan Sine, Selain Kebun Teh Jamus di Kec. Sine, selain teh di kecamatan sine ada pula perkebunan karet yang dikelola oleh PTP XXIII Tretes Juga ada Bendungan Ndorjo yang lokasinya di Desa hargosari Dsn. Gondorejo. Selain itu terdapat juga situs purbakala Trinil yang menyimpan fosil Pithecanthropus erectus (Manusia kera berjalan tegak) pertama kali ditemukan oleh arkeolog Belanda bernama Eugene Dubois.\n" +
                    "\n" +
                    "Gunung Liliran merupakan objek wisata ziarah yang terkenal bagi masyarakat Jawa. Pada bulan Muharam (Syura) para peziarah berdatangan ke puncak bukit pada siang dan malam hari. Sebagian dari mereka bersemadi di beberapa gua atau berziarah ke Makam Joko Buduk. Pemandangan dari puncak bukit memang sangat indah berupa pesawahan dan sungai yang meliuk ke arah utara menuju Bengawan Solo. Sayang hutan di Gunung Liliran tidak indah lagi karena tanaman pinus yang dikelola Perhutani kini banyak ditebangi.\n" +
                    "\n" +
                    "Di daerah ini terdapat Benteng van Den Bosch yang digunakan oleh Belanda sebagai strategi Benteng Steelsel dalam upaya mempersempit ruang gerak Pangeran Diponegoro dalam perang gerilya. Benteng ini sekarang terbuka untuk umum. ada pula Situs Arca Banteng tepatnya di Dusun Reco Banteng, Desa Wonorejo, Kecamatan Kedunggalar, Ngawi terdapat pula Taman Bermain Anak yang berlokasi di pusat pemerintahan Kabupaten Ngawi\n" +
                    "\n" +
                    "Air Terjun Watu Jonggol Obyek Wisata Anyar Di Kabupaten Ngawi, Untuk perjalanan menuju Wisata Sumber Air Kamulyan Watu Jonggol dilalui dengan melewati jalan pedesaan di mana kanan dan kirinya sebagian besar adalah sawah dan kebun pertanian. Kemudian dilanjutkan dengan berjalan menyusuri lereng kaki gunung Lawu dengan kondisi jalan yang terkadang meanjak curam dan terjal. Sebelum menuju ke Sumber Air Kamulyan Watu Jonggol, pengunjung dapat menikmati indahnya pemandangan hutan yang berada di sisi jalan. Setelah melakukan perjalanan dengan pemandangan hutan yang eksotik dan melewati sederetan batu yang tertata alami maka akan terlihat tumpukan batuan alam yang tersusun secara artistik seperti keluar dari permukaan tebing dengan air terjun yang mengalir deras kebawah secara begitu indah.\n" +
                    "\n" +
                    "Selondo, salah satu tempat wisata yang masuk Desa Ngrayudan, Kecamatan Jogorogo. Selondo Village yang menempati areal seluas 3 hektar ini dilengkapi berbagai fasilitas seperti kolam renang, tempat pertemuan, restoran dan beberapa kios yang menjajakan hasil khas masyarakat sekitar termasuk hasil agrobisnis berupa sayur mayur.\n" +
                    "\n" +
                    "Hot springs in ngawi: Sumber air panas diyakini bisa sembuhkan penyakit, terletak di Tempuran, Paron ini juga patut didatangi.\n" +
                    "\n" +
                    "Monumen Soerjo (Suryo) yang dibangun pada tahun 1975 lalu dan diresmikan oleh May-Jen TNI-AD Witarmin, terletak di jalan raya Ngawi-Solo Km 19, tepatnya masuk wilayah desa Pelanglor Kec. Kedunggalar Kab. Ngawi. Disamping guna mengenang gugurnya Gubernur pertama Jawa timur oleh keganasan PKI,banyak pula yang berdatangan untuk berziarah\n" +
                    "\n" +
                    "Hargo DumilahSuasana yang asri itulah terlihat dari kolam pemandian Hargo Dumilah yang berada di lereng utara Gunung Lawu tepatnya di Desa Setono, Kecamatan Ngrambe, Atau berada di sebelah selatan Kota Ngawi yang berjarak 30 Kilometer. Kerindangan pohon jati yang berjajar ditepi kolam menambah anggunnya suasana kolam pemandian Hargo Dumilah. Apalagi berlatar belakang Gunung Lawu dan areal persawahan, cukup sudah alam yang natural melengkapi keindahan sekaligus memberikan nuansa tersendiri bagi para pengunjungnya untuk berelaksasi bersama keluarga.",
            "Pariwisata\n\n" +
                    "Pacitan dikenal dengan nama Kota Pariwisata atau Kota Seribu Gua. Hal ini dikarenakan kekayaan alam dan ekstika Pacitan yang sungguh luar biasa dan sangat memikat para pengunjung. Pariwisata di Pacitan terdiri dari Wisata Gua, Wisata Pantai, Wisata Pegunungan (Hikking), Wisata Sejarah, Wisata Pemandian Alam dan Saat ini sedang dalam tahap penyelesaian kawasan Olahraga yang nantinya bisa menjadi salah satu alternatif tempat yang bisa dikunjungi di Pacitan.\n" +
                    "\n" +
                    "Wisata Goa yang terkenal di Pacitan diantaranya Goa Gong Yang ternama sebagai Gua Terindah se-Asia Tenggara, Goa Kalak Konon Mantan Presiden Soeharto pernah melakukan semadi di Goa ini, Goa Tabuhan di mana Alibasyha Sentot Prawirodirjo pernah melakukan semadi di dalam Goa ini dan Batu di dalam goa ini jika dipukul akan membunyikan suara seperti alat musik gamelan Jawa, Goa Luweng Jaran.\n" +
                    "\n" +
                    "Wisata Pantai terhampar luas di Pacitan, sehingga anda harus menentukan terlebih dahulu pantai mana yang akan anda kunjungi. Jika anda menginginkan pantai dengan pasir putih dan pemandangan batu karang yang indah Pantai Watu Karung, Srau, Pantai Klayar dan Pantai kasap bisa menjadi pilihannya. Namun jika anda menginginkan pantai yang penuh dengan sarana wisata dan mudah diakses Pantai Teleng Ria bisa menjadi pilihannya karena hanya berjarak sekitar 3 Km dari pusat Kota. Pantai lain yang bisa dikunjungi seperti Pantai Soge yang terkenal dengan jembatan indahnya, Pantai Taman di mana disana terdapat penangkaran penyu, pantai Sidomulyo dengan Flyingfox terpanjang se-Indonesia, Pantai Banyutibo dengan pemandangan air terjun yang langsung menuju ke pantai, dan masih banyak pilihan pantai lainnya.\n" +
                    "\n" +
                    "Pemandian Air Hangat Tirtohusodo berada di Kecamatan Arjosari, sekitar 15 Km dari pusat kota ke arah Utara, disini menyuguhkan pesona mandi dibawa kaki gunung kelir dengan air Panas Alami, fasilitas di Pemandian ini pun cukup lengkap seperti Villa, Toko Cenderamata, Kantin atau Rumah Makan, Parkir luas\n" +
                    "\n" +
                    "Monumen Jenederal Sudirman berada di Kecamatan Nawangan, 30 Km dari pusat kota Pacitan. Monumen ini berdiri megah di atas gunung dan telah diresmikan oleh Presiden Susilo Bambang Yudhoyono, disini masih dapat kita lihat Rumah yang digunakan Jenderal Sudirman ketika melakukan Gerilya.\n" +
                    "\n" +
                    "Rumah Presiden Susilo Bambang Yudhoyono, terletak di Lingkungan Blumbang, Kelurahan Ploso berjarak 200 meter dari Terminal Kelas A Kota Pacitan atau sekitar 1 Km dari pusat kota Pacitan.",
            "Tempat Wisata\n\n" +
                    "Pantai Talang Siring, Kecamatan Montok\n" +
                    "Pantai Jumiang, Kecamatan Pademawu\n" +
                    "Pantai Batu Kerbuy\n" +
                    "Api tak kunjung padam / Jhengkah\n" +
                    "Makam Batuampar\n" +
                    "Makam Kyai Ratoh Sumber Anyar\n" +
                    "Vihara Avalokitesara\n" +
                    "Situs Pangeran Rangga Sukawati\n" +
                    "Candi Burung, Kecamatan Proppo\n" +
                    "Museum Daerah\n" +
                    "Pasar Batik Joko Tole\n" +
                    "Pasar 17 Agustus\n" +
                    "Campor Lorjuk Jumiang\n\n" +
                    "Monumen\n\n" +
                    "Monumen Arek Lancor, Pamekasan\n" +
                    "Monumen Proklamasi, Pamekasan\n\n" +
                    "Perayaan\n\n" +
                    "Pekan Budaya Madura\n\n" +
                    "Akomodasi\n\n" +
                    "Hotel di Pamekasan:\n" +
                    "\n" +
                    "Madinah\n" +
                    "Garuda\n" +
                    "Ramayana\n" +
                    "Pkpri\n" +
                    "Trunojoyo\n" +
                    "New Ramayana\n" +
                    "Putri\n" +
                    "Purnama\n" +
                    "Edo Hotel\n" +
                    "Malindo\n" +
                    "Madura Indah\n" +
                    "Home Stay Asri\n" +
                    "Losmen Varia\n" +
                    "Odaita\n" +
                    "Front One",
            "Pariwisata\n" +
                    "\n" +
                    "Bagian barat wilayah kabupaten ini (perbatasan dengan wilayah Kabupaten Mojokerto dan Malang) adalah dataran tinggi yang cukup sejuk, dan merupakan salah satu daerah tujuan wisata utama Jawa Timur. Kawasan tersebut terdapat villa-villa peristirahatan, dan sejumlah perumahan elit. Kawasan pegunungan ini juga sering digunakan sebagai tempat berkemah. Di antara objek wisata andalan Pasuruan adalah Taman Safari Indonesia di Prigen dan Kebun Raya Purwodadi. Sebelah selatan Kota Pasuruan terdapat Gunung Bromo, salah satu tujuan wisata utama Jawa Timur.\n" +
                    "\n" +
                    "Perayaan/Acara\n" +
                    "Kabupaten Pasuruan memiliki beberapa acara kegiatan, yaitu:\n" +
                    "\n" +
                    "HUT Pasuruan\n" +
                    "Pasuruan Expo\n" +
                    "Pasuruan Fashion Carnival (PFC)\n" +
                    "Pasuruan Fashion on the Street",
            "Objek wisata budaya\n" +
                    "\n" +
                    "Setiap tanggal 1 Muharram (1 Suro), pemerintah Kabupaten Ponorogo menyelenggarakan Grebeg Suro. Dalam rangkaian perayaan Grebeg Suro ini diadakan Kirab Pusaka yang biasa diselenggarakan sehari sebelum tanggal 1 Muharram. Pusaka peninggalan pemimpin Ponorogo zaman dahulu, saat masih dalam masa Kerajaan Wengker, diarak bersama pawai pelajar dan pejabat pemerintahan di Kabupaten Ponorogo, dari makam Bathara Katong (pendiri Ponorogo) di daerah Pasar Pon sebagai Kota Lama, ke Pendapa Kabupaten. Pada malam harinya, di alun-alun kota, Festival Reog Nasional memasuki babak final. Esok paginya ada acara Larung Risalah Doa di Telaga Ngebel, di mana nasi tumpeng dan kepala kerbau dilarung bersama doa ke tengah-tengah telaga.[25] Perayaan Grebeg Suro ini menjadi salah satu jadwal kalender wisata Jawa Timur. Objek wisata budaya lainnya, yaitu Taman Rekreasi Singo Pitu, Pentas Wayang Kulit, dan Reog Bulan Purnama.\n" +
                    "\n\n" +
                    "Objek wisata industri\n\n" +
                    "Di Kabupaten Ponorogo terdapat beberapa sentra industri, di antaranya sentra industri seng di Desa Paju, Kecamatan Ponorogo, sentra industri jenang di Desa Josari, Kecamatan Jetis, dan sentra industri kulit di Desa Nambangrejo, Kecamatan Sukorejo.\n\n"+
                    "Objek wisata alam\n" +
                    "Beberapa objek wisata alam yang terdapat di Kabupaten Ponorogo yaitu:\n" +
                    "\n" +
                    "Telaga Ngebel\n" +
                    "Telaga Ngebel adalah sebuah danau alami yang terletak di Kecamatan Ngebel, Kabupaten Ponorogo. Kecamatan Ngebel terletak di lereng gunung Wilis. Telaga Ngebel terletak sekitar 30 km dari pusat kota Ponorogo dengan ketinggian 734 meter di atas permukaan laut. Keliling dari Telaga Ngebel sekitar 5 km dan suhu di telaga ini berkisar antara 20–26 ℃.\n" +
                    "Taman Wisata Ngembag\n" +
                    "Taman Wisata Ngembag adalah taman wisata yang terletak di Kelurahan Ronowijayan Kecamatan Siman sekitar 3 km di sebelah timur dari pusat kota Ponorogo. Taman ini terdiri dari sumber air yang dilengkapi dengan taman bermain dan kolam renang anak. Sebelumnya Ngembag dikenal sebagai mata air yang tak terawat. Kemudian oleh Pemkab Ponorogo diubah sebagai taman kota yang dilengkapi dengan kolam renang anak dan juga beberapa permainan anak-anak.\n" +
                    "Air Terjun Pletuk\n" +
                    "Air Terjun Pletuk atau juga dikenal dengan nama Coban Temu adalah air terjun yang terletak di Dusun Kranggan, Desa Jurug, Kecamatan Sooko, sebelah tenggara dari pusat kota Ponorogo atau lebih tepatnya sebelah selatan dari Kecamatan Pulung. Air terjun ini memiliki ketinggian sekitar 30 meter dan berada di atas ketinggian 450 meter di atas laut. Kawasan ini dikelilingi oleh perbukitan yang menjulang tinggi dan ditumbuhi sejumlah tanaman.\n" +
                    "Gunung Bayangkaki\n" +
                    "Gunung Bayangkaki adalah gunung yang tak aktif yang terletak di Ponorogo, Jawa Timur, tepatnya di Desa Temon, Kecamatan Sawoo. Gunung Bayangkaki memiliki empat puncak, yakni Puncak Ijo (Gunung Ijo), Puncak Tuo (Gunung Tuo), Puncak Tumpak (Puncak Bayangkaki), dan Puncak Gentong (Gunung Gentong). Di balik indahnya alam dan kukuhnya batu-batu besar yang menjulang, Bayangkaki memiliki berbagai keunikan dan masih diselimuti dengan mitos yang terus berkembang dalam masyarakat sampai sekarang. Salah satu mitos yang berkembang dalam masyarakat adalah ketika Puncak Gentong sudah terbakar tanpa sebab berarti musim hujan akan segera tiba.\n" +
                    "Air Terjun Juruk Klenteng\n" +
                    "Air terjun Juruk Klenteng atau air terjun Tumpuk adalah air terjun yang terletak di Desa Tumpuk, Kecamatan Sawoo, Kabupaten Ponorogo. Air terjun ini berlokasi di perbatasan Ponorogo dan Trenggalek. Dinamakan air terjun Juruk Klenteng karena tempatnya yang menjuruk ke dalam dan diimpit dua tebing gunung bebatuan. Air terjun ini memiliki ketinggian sekitar 45 meter ini. Pada ujung bawah air terjun terdapat kolam yang airnya terlihat hijau yang disebut kedung. Menurut mitos, kedung atau lubuk tersebut adalah tembusan ke laut selatan.\n" +
                    "Gua Lowo\n" +
                    "\n" +
                    "Gua Lowo terletak di Kecamatan Sampung, sekitar 20 km dari pusat kota Ponorogo. Air terjun ini dinamakan Gua Lowo karena dihuni oleh banyak kelelawar. Kelelawar yang hidup di dalam gua ini bebas dan tidak mengganggu masyarakat setempat. Dalam gua ini juga ditemukan situs arkeologi yang memiliki nilai arkeologis tinggi. Lingkungan sekitar gua ini sangat alami dan dikelilingi oleh pepohonan dan batu-batuan.\n" +
                    "Hutan Wisata Kucur\n" +
                    "Hutan wisata Kucur atau taman wisata Kucur adalah hutan wisata yang terletak di Kecamatan Badegan, sekitar 20 km ke barat. Ada sumber air (kucur) di tengah hutan jati yang juga berfungsi sebagai taman nasional dan tempat perkemahan. Selain itu, karena lokasinya yang strategis, yang terletak di antara jalan Jawa Timur dan Jawa Tengah, taman wisata Kucur sering menjadi tempat beristirahat oleh siapa saja yang melakukan perjalanan.\n" +
                    "Air Terjun Toyomerto\n" +
                    "Air terjun Toyomerto atau dikenal juga dengan sebutan air terjun Selorejo terletak di Dusun Toyomerto, Desa Pupus, Kecamatan Ngebel, sekitar 35 km dari pusat kota. Akses ke air terjun ini medannya cukup sulit, menanjak penuh kelok dengan kanan kiri tebing curam dan membutuhkan kerja eksta untuk menuju ke sana. Namun hal itu dapat membawa pengalaman yang berbeda bagi para petualang. Air terjun ini terdiri dari 2 tingkat air dalam satu aliran yang jatuh dari tebing batu. Masing-masing tingkatan memiliki ketinggian 25 hingga 30 meter. Untuk tingkat pertama dikenal dengan nama Air Terjun Selorejo Atas dengan ukuran yang lebih besar dibandingkan dengan tingkat kedua. Untuk tingkat kedua dikenal dengan nama Air Terjun Selorejo Bawah. Pada Selorejo Atas dindingnya dapat dipanjat.\n" +
                    "Air Terjun Setapak\n" +
                    "Air terjun Setapak berada di Desa Banaran, Kecamatan Pulung. Akses ke air terjun Setapak ini cukup sulit karena melewati hutan hujan tropis yang sangat lebat. Air terjun ini berada di sekitar pegunungan Wilis selatan, tepatnya di utara Bukit Wolan. Air terjun ini memiliki ketinggian 13 meter dengan debit air yang cukup banyak dan dingin.\n\n" +
                    "Objek wisata religius\n\n" +
                    "\n" +
                    "Di Kabupaten Ponorogo terdapat dua jenis objek wisata religius, yaitu objek wisata ziarah dan objek wisata agama. Objek wisata ziarah di antaranya adalah Makam Bathara Katong di Desa Setono, Kecamatan Jenangan dan Makam Gondoloyo di Desa Tanjungsari, Kecamatan Jenangan. Dan objek wisata agama di antaranya adalah Mata Air Sendang Waluyo Jati yang merupakan tempat ibadah penganut Katolik, dengan sebuah Patung Maria di Desa Klepu, Kecamatan Sooko dan Masjid Tegalsari yang dibangun sekitar abad ke-18 oleh Kiai Ageng Hasan Besari, berarsitektur Jawa dengan 36 tiang, serta kitab berusia 400 tahun yang ditulis Ronggo Warsito di Desa Tegalsari, Kecamatan Jetis.[26]",
            "Pariwisata\n" +
                    "\n" +
                    "Kabupaten Probolinggo juga memiliki tempat wisata yang banyak diminati Wisatawan baik dari Dalam negeri maupun luar negeri. Berikut adalah nama-nama tempat wisata yang ada di Kabupaten Probolinggo:\n" +
                    "\n" +
                    "Gunung Bromo\n" +
                    "Banyak yang beranggapan bahwa kawasan wisata Gunung Bromo sepenuhnya termasuk dalam wilayah administrasi kabupaten Malang. Padahal Gunung Bromo notabanenya masuk dalam wilayah administrasi kabupaten Probolinggo dan sebelah Barat Daya termasuk dalam wilayah kabupaten Pasuruan.\n" +
                    "\n" +
                    "Dalam mitologi suku Tengger yang mendiami wilayah Bromo, tepatnya di Desa Ngadisari, Dsn. Cemorolawang, kecamatan Sukapura, kabupaten Probolinggo, terdapat sebuah upacara adat bernama upacara kasada (Yadnya Kasada). Upacara diadakan pada tengah malam hingga dini hari setiap bulan purnama sekitar tanggal 14 atau 15 di bulan Kasodo (kesepuluh) menurut penanggalan Jawa.\n" +
                    "\n" +
                    "Gunung Argopuro\n" +
                    "Gunung Argopuro memiliki beberapa puncak, salah satunya adalah puncak Rengganis. Selain memiliki daya tarik khas puncak gunung, di Rengganis juga terdapat situs peninggalan jaman purbakala berupa teras berundak yang terdiri dari 3 komplek area dengan 5 bekas bangunan di dalamanya. Reruntuhan bersejarah itu dipercaya sebagai bekas reruntuhan kerajaan Dewi Rengganis.\n" +
                    "\n" +
                    "Pulau Gili Ketapang\n" +
                    "Pulau Gili Ketapang adalah pulau di Selat Madura, jaraknya delapan kilometer dari bibir pantai Probolinggo, dan dihuni oleh mayoritas Suku Madura. Pulau Gili Ketapang mempunyai luas 68 hektar, dan bisa diakses melalui Pelabuhan Tanjung Tembaga. Konon dulu Pulau Gili Ketapang menyatu dengan Pulau Jawa, dan baru memisah setelah terjadi letusan Gunung Semeru yang dahsyat. Gili artinya mengalir, Ketapang adalah nama tempat tersebut.Di Gili Ketapang kita bisa snorkeling,melihat terumbu karang yang masih jernih dan pemandangan alam laut lainnya yang masih perawan.\n" +
                    "\n" +
                    "Ranu Segaran\n" +
                    "Ranu Segaran atau Danau Segaran terletak di Desa Segaran, Kecamatan Tiris. Ranu Segaran dapat ditemput dari pusat Probolinggo selama tiga puluh menit perjalanan. Jangan cemas, sepanjang perjalanan anda disuguhi pemandangan berupa pepohonan dan rangkaian pegunungan. Anda bisa sejenak singgah di Air Panas dalam perjalanan ke Danau Segaran.Ranu Segaran muncul akibat aktivitas vulkanik alias gunung berapi. Airnya masih bening, alam sekitaranya masih perawan. Pemandangannya syahdu melenakan hati. Perlu hati-hati biar anda tidak tertidur sampai malam di tempat asri ini.\n" +
                    "\n" +
                    "Candi Jabung\n" +
                    "Candi Jabung adalah Candi Hindu peninggalan kerajaan Majapahit. Meski hanya dari bata merah, candi Jabung terbukti mampu bertahan selama ratusan tahun. Menurut keagamaan, Agama Budha dalam kitab Nagarakertagama Candi Jabung di sebutkan dengan nama Bajrajinaparamitapura. Dalam kitab Nagarakertagama candi Jabung dikunjungi oleh Raja Hayam Wuruk pada lawatannya keliling Jawa Timur pada tahun 1359 Masehi. Pada kitab Pararaton disebut Sajabung yaitu tempat pemakaman Bhre Gundal salah seorang keluarga raja.\n" +
                    "\n" +
                    "Air Panas Desa Tiris\n" +
                    "Air Panas Desa Tiris masih termasuk kompleks Ranu Segaran, tinggal melangkah 200 meter. Wisata Air Panas Desa Tiris masih alami, hanya ada tembok pemisah yang sangat sederhana. Belum ada sentuhan manusia yang lebih heboh.\n" +
                    "\n" +
                    "Air Panas Desa Tiris bisa kita nikmati dari dekat, dan kita bisa merasakan kehangatannya. Ada air sungai yang jernih di sampingnya, dangkal sekali, cuma selutut, hingga tapak kaki kita kelihatan. Sekitar sungai adalah pepohonan yang rimbun. Dan di seberangnya adalah pemandangan alam yang asri dan bagus.\n" +
                    "\n" +
                    "Air terjun Madakaripura\n" +
                    "Air terjun Madakaripura terletak di Desa Negororejo, Kecamatan Lumbang. Air terjun Madakaripura masih termasuk kawasan Taman Nasional Bromo Tengger Semeru. Air terjun Madakaripura berbentuk ceruk yang dikelilingi perbukitan yang meneteskan air pada seluruh bidang tebingnya, tiga di antaranya mengucur deras dan membentuk air terjun lagi.Madakaripura bisa dicapai dari Probolinggo, bisa dari Malang. Kalau dari Probolinggo kita bisa ikut bus ke arah Tongas. Bilang saja mau ke air terju Madakaripura pada pak kondektur atau sopir. Anda akan berhenti di pertigaan Tongas. Lalu naik angkot. Jangan lupa nawar biar murah.\n" +
                    "\n" +
                    "Arung Jeram Sungai Pekalen\n" +
                    "Sungai Pekalen hanya sejauh 25 kilometer dari Probolinggo. Sungai Pekalen punya pemandangan yang asoy geboy, meski ya namanya juga lokasi arung jeram, agak menantang dengan belokannya yang bertebing dan juram, batu-batu lumayan besar. Sungai Pekalen ini mengalir di tiga kecamatan, yaitu Maron, Tiris dan kecamatan Gading.",
            "Tempat Wisata\n\n" +
                    "Pulau Mandangin\n" +
                    "Pantai Camplong\n" +
                    "Kuburan Madegan\n" +
                    "Waduk Klampis Desa Kramat kecamatan Kedungdung\n" +
                    "Air terjun Toroan\n" +
                    "Rimba monyet - Nepa Raden segoro\n" +
                    "Reruntuhan Pababaran\n" +
                    "Pemandian Sumber Otok\n" +
                    "Wisata Alam Goa Lebar\n" +
                    "Monumen Sampang\n" +
                    "Situs Pababaran Trunojoyo\n" +
                    "Situs Ratoh Ebuh\n" +
                    "Sumur Daksan\n" +
                    "Situs Makam Pangeran Santo Merto\n" +
                    "Situs Makam Bangsacara dan Ragapatmi\n" +
                    "Situs Makam Sayyid Ustman Bin Ali Bin Abdillah Al-Habsyi",
            "Tempat Wisata\n\n" +
                    "Monumen Jayandaru\n" +
                    "Wisata Lumpur Lapindo, Porong\n" +
                    "Gelanggang Olahraga Sidoarjo\n" +
                    "Delta Fishing\n" +
                    "Wisata Sungai Karanggayam\n" +
                    "Wisata Bahari Tlocor\n" +
                    "Pulau Sarinah\n" +
                    "Makam KH. Ali Mas Ud, Pagerwojo\n" +
                    "Makam Dewi Sekardadu, Buduran\n" +
                    "Masjid Agung Sidoarjo\n" +
                    "Masjid Jami' Al Abror Sidoarjo\n" +
                    "Pura Jala Siddhi Amertha\n" +
                    "Tempat Ibadat Tri Dharma Tjong Hok Kiong\n" +
                    "Gereja Pantekosta Elohim\n" +
                    "Kampung Batik Jetis\n" +
                    "Museum Mpu Tantular.\n" +
                    "Candi Dermo.\n" +
                    "Candi Mendalem.\n" +
                    "Candi Pari.\n" +
                    "Candi Sumur.\n" +
                    "Candi Tawangalun.\n" +
                    "Kawasan Pemancingan Kalanganyar, Cemandi.\n" +
                    "Kampung Krupuk Desa Kedungrejo, Jabon\n" +
                    "Sentra tas dan koper Tanggulangin.\n" +
                    "Taman Dwarakerta, Porong\n" +
                    "Taman Apkasi, Porong\n" +
                    "Taman Abhirama, Pagerwojo\n" +
                    "Taman Tanjung Puri, Sidoarjo",
            "Wisata Alam Taman Nasional Baluran\n" +
                    "Gunung Baluran\n" +
                    "Savana Bekol\n" +
                    "Pantai Bama\n" +
                    "Pantai Bilik\n" +
                    "Forever Green Forest\n" +
                    "Goa Jepang\n" +
                    "Curah Tangis\n\n" +
                    "Wisata Alam Bahari\n\n" +
                    "Pantai Pasir Putih\n" +
                    "Pantai Berigheen\n" +
                    "Pantai Pathek\n" +
                    "Pantai Banongan\n" +
                    "Pantai Bama\n" +
                    "Pantai Lempuyang\n" +
                    "Pantai Tangsi\n" +
                    "Pantai Tampora\n" +
                    "Pantai Keperan\n" +
                    "Pantai Bilik\n" +
                    "Pantai Pasir Putih\n" +
                    "Kampung Kerapu Klatakan\n" +
                    "Bendungan Curah Cottok\n" +
                    "Pemandian Taman\n" +
                    "Air Terjun Telempong\n" +
                    "Arung Jeram Samir Indah\n" +
                    "Cikasur Savana Sumbermalang\n" +
                    "Plaza Rengganis Sumbermalang\n" +
                    "Pelabuhan Panarukan\n" +
                    "Pelabuhan Kalbut\n" +
                    "Pelabuhan Jangkar\n" +
                    "Pelabuhan Besuki\n\n" +
                    "Wisata Alam Pegunungan\n\n" +
                    "Puncak Rengganis\n" +
                    "Desa Baderan\n" +
                    "Gunung Pattok\n" +
                    "Padang Savana Sekasor (merujuk pada penamaan daerah ini oleh penduduk Sumbermalang), Lereng Argopuro.\n\n" +
                    "Wisata Sejarah\n\n" +
                    "PG Demaas ( Besuki )\n" +
                    "PG Wringin Anom ( Panarukan )\n" +
                    "PG Olean ( Situbondo )\n" +
                    "PG Pandjie ( Panji )\n" +
                    "PG Asembagoes ( Asembagus )\n" +
                    "Goa Jepang\n" +
                    "DAM Sluice\n" +
                    "Stasiun Kereta Api\n" +
                    "Rumah Resident Besuki\n" +
                    "Rumah Dalem Tengah\n" +
                    "Rumah Bupati Besuki\n" +
                    "Situs Selobanteng\n" +
                    "Situs Batu Lantai\n" +
                    "situs prasejarah Sumbermalang\n\n" +
                    "Wisata Religi\n\n" +
                    "Pondok Pesantren Besar\n\n" +
                    "PP Salafiyah Syafi'iyah (KHR. Azaim Ibrahimy, S.Sy)\n" +
                    "PP Walisongo (KHR. Muhammad Kholil As'ad)\n" +
                    "PP Sumber Bunga (KH. Syainuri Sufyan)\n" +
                    "PP Ad Dhiyaul Musthafawiy, Olean (Habib Haidarah Al Hinduan)\n" +
                    "PP Nurul Huda, Peleyan (Habib Musthofa Al Djufri)\n" +
                    "PP Nurul Huda, Paowan (KH. Mursyid Romli)\n" +
                    "PP Nurul Iman (Seletreng Kapongan) (KH. Faruq Amir)\n" +
                    "PP Nurul Islam (Seletreng Kapongan) (KH. Ubbad Yamin)\n" +
                    "PP Syech Maulana Ishaq (Pecaron) Pengasuh Kyai Ainur Rofiq\n" +
                    "PP Darul Mubtadi'in (Bletok) Kyai Mas Basid\n" +
                    "PP Sabilal Muhtadin (Bungatan) (KH. Mas Faqih Aly)\n" +
                    "PP Nurul Wafa (Demung)\n\n" +
                    "Makam dan Petilasan\n\n" +
                    "Pasarean Syech Maulana Ishaq (Pecaron)\n" +
                    "Pasarean Agung Saifudin\n" +
                    "Makam Raden Tjondrokusumo\n" +
                    "Petilasan Syekh Maulana Ishaq\n" +
                    "Makam Ke Pate Alos (Besuki)\n" +
                    "Situs Makam Tegal Mas\n\n" +
                    "Wisata Religi\n\n" +
                    "Klenteng Poo Tong Biaw Besuki\n" +
                    "Gereja\n\n" +
                    "Wisata Seni dan Budaya\n\n" +
                    "Kesenian Ojhung\n" +
                    "Pojhien",
            "Wisata Sejarah, Budaya dan Arsitektur\n" +
                    "\n" +
                    "Museum Keraton Sumenep merupakan museum yang dikelola oleh pemerintah daerah Sumenep yang di dalamnya menyimpan berbagai koleksi benda-benda cagar budaya peninggalan keluarga Karaton Sumenep dan beberapa peninggalan masa kerajaan hindu budha seperti arca Wisnu dan Lingga yang ditemukan di Kecamatan Dungkek. Di dalam museum terdapat juga beberapa koleksi pusaka peninggalan Bangsawan Sumenep seperti guci keramik dari Cina dan Kareta My Lord pemberian Kerajaan Inggris kepada Sri Sultan Abdurrahman Pakunataningrat I atas jasanya yang telah banyak membantu Thomas Stamford Raffles salah seorang Gubenur Inggris dalam penelitian yang dilakukannya di Indonesia.\n" +
                    "Keraton Sumenep merupakan peninggalan pusaka Sumenep yang dibangun oleh Raja/Adipati Sumenep XXXI, Panembahan Sumolo Asirudin Pakunataningrat dan diperluas oleh keturunannya yaitu Sri Sultan Abdurrahman Pakunataningrat I. Karaton Sumenep sendiri letaknya tepat berada di depan Museum Karaton Sumenep,\n" +
                    "Masjid Jamik Sumenep merupakan bangunan yang mempunyai arsitektur yang khas, memadukan berbagai kebudayaan menjadi bentuk yang unik dan megah, dibangun oleh Panembahan Somala Asirudin Pakunataningrat yang memerintah pada tahun 1762-1811 M dengan arsitek berkebangsaan tionghoa \"law pia ngho\"\n" +
                    "Kota Tua Kalianget letaknya di sebelah timur kota Sumenep, disini para pengunjung bisa melihat peninggalan-peninggalan Pabrik garam, Arsitektur Kolonial dan beberapa daerah pertahanan yang dibangun Oleh Pemerintahan Kolonial saat menjajah wilayah Sumenep,\n" +
                    "Rumah Adat Tradisional Madura Tanean Lanjhang, bisa ditemui di beberapa daerah menuju pantai lombang maupun menuju pantai slopeng,\n" +
                    "Benteng VOC Kalimo'ok di Kalianget.\n\n" +
                    "Wisata Religi/Ziarah\n\n" +
                    "Asta Karang Sabu merupakan kompleks pemakaman keluarga Raja / Adipati Sumenep yang memerintah pada abad 15 yaitu Pangeran Ario kanduruan, Pangeran Lor dan Pangeran Wetan. di daerah karang sabu inilah dia memimpin pemerintah Sumenep pada saat itu.\n" +
                    "Kompleks pemakaman Asta Tinggi Sumenep merupakan kompleks pemakaman Raja-Raja Sumenep yang dibangun pada tahun 1644 M. terletak di daerah dataran Tinggi Kebon Agung Sumenep.\n" +
                    "Asta Yusuf merupakan salah satu makam penyebar agama Islam di Pulau Talango, makam tersebut ditemukan oleh Sri Sultan Abdurrahman Pakunataningrat ketika betolak menuju Bali pada tahun 1212 hijriah (1791),\n" +
                    "Asta Katandur merupakan salah satu makam penyebar agama Islam di Sumenep, Pangeran Katandur yang juga salah satu tokoh yang ahli dalam bidang pertanian dan menurut berbagai sumber, Pangeran Katandur juga merupakan pencipta tradisi kerapan sapi,\n" +
                    "Makam Pangeran Panembahan Joharsari yang merupakan salah satu Adipati Sumenep V yang pertama kali memeluk Agama Ifslam di Bluto,\n\n" +
                    "Wisata Alam\n" +
                    "\n" +
                    "Pantai Lombang adalah pantai dengan hamparan pasir putih dan gugusan tanaman cemara udang yang tumbuh di areal tepi dan sekitar pantai. Suasananya sangat teduh dan indah sekali. Pantai Lombang adalah satu-satunya pantai di Indonesia yang ditumbuhi pohon cemara udang,\n" +
                    "Pantai Slopeng adalah pantai dengan hamparan gunung pasir putih yang mengelilingi sisi pantai sepanjang hampir 6 km. Kawasan pantai ini sangat cocok untuk mancing ria karena areal lautnya kaya akan beragam jenis ikan, termasuk jenis ikan tongkol,\n" +
                    "Pantai Ponjug di Pulau Talango,\n" +
                    "Pantai Badur di Kecamatan Batu Putih,\n" +
                    "Taman Air Kiermata di Kecamatan Saronggi,\n" +
                    "Goa Jeruk Asta Tinggi Sumenep,\n" +
                    "Goa Kuning di Kecamatan Kangean,\n" +
                    "Goa Payudan di Kecamatan Guluk-Guluk,\n\n" +
                    "Wisata Bahari/Laut\n\n" +
                    "Kepulauan Kangean dan sekitarnya merupakan gugusan kepulauan Kabupaten Sumenep yang letaknya berada di wilayah ujung timur Pulau Madura. Mempunyai banyak pantai yang eksotik,\n" +
                    "Wisata Taman Laut Mamburit Pulau Arjasa\n" +
                    "Wisata Taman Laut Gililabak Pulau Talango\n" +
                    "Pantai Pasir Putih dan Terumbu Karang Pulau Saor (Kecamatan Sapeken)\n" +
                    "Pantai pasir putih, taman mangrove/ bakau dan wisata taman laut takat Pulau Pajangan (kecamatan nonggunong)\n\n" +
                    "Wisata Konservasi\n\n" +
                    "Ayam bekisar, ayam bekisar adalah ayam khas Sumenep yang banyak dibudidayakan untuk peliharaan di Pulau Kangean.\n" +
                    "Kijang, merupakan hewan penghuni hutan di daerah Arjasa. Jenis hewan ini termasuk hewan yang dilindungi.\n" +
                    "Cemara Udang, merupakan satu jenis spesies cemara yang hanya ada di Kabupaten Sumenep dan di Pesisir Pantai Negeri China. Pohon cemara ini banyak dibudidayakan oleh masyarakat di wilayah Kecamatan Batang-Batang dan Kecamatan Dungkek, tak jauh dari lokai wisata Pantai Lombang.\n" +
                    "Taman laut takat pajangan\n" +
                    "merupakan taman bawah laut pulau pajangan yang terletak di sebelah utara pantai pulau pajangan. terumbu karangnya yang luas dan jenis terumbu karangnya yang sangat banyak hampir menyerupai taman nasional bunaken di manado\n" +
                    "\n" +
                    "Wisata Minat Khusus\n" +
                    "Tirta Sumekar Indah merupakan salah satu kompleks pemandian kolam renang yang ada di Sumenep, letaknya berada di kecamatan Batuan, sebelah barat kota Sumenep. Letaknya yang strategis, dikelilingi Perkebunan Pohon Jati dan Jambu Mente serta tak jauh dari wisata kompleks pemakaman Asta Tinggi membuat pemandian ini banyak di kunjungi warga saat akhir pekan dan liburan sekolah,\n" +
                    "Water Park Sumekar, merupakan wisata air yang terletak tak jauh di belakang lokasi Wisata kompleks Asta Tinggi, kondisi bangunannya yang terletak dilerang bukit Kasengan sangat menambah suasana alami di kawasan ini,\n\n" +
                    "Wisata:Sumenep\n\n" +
                    "Alun-Alun Sumenep sekarang menjadi taman Adipura, setiap harinya khususnya pada malam hari dibangian utara Alun-Alun Sumenep ini terdapat pasar malam dengan menyajikan berbagai macam kuliner dan accesories yang bisa dinikmati dengan harga yang murah.\n" +
                    "Wisata kesehatan di Pulau Giliyang Kecamatan Dungkek merupakan daerah di kabupaten Sumenep yang mempunyai kandungan O2/oksigen sebesar 21,5% atau 215.000 ppm.[13]\n" +
                    "Kota tua Kalianget merupakan wisata kota tua bekas peninggalan masa kolonial Belanda, hingga saat ini masih bisa dinikmati berupa bekas pabrik, bekas bioskop, bekas kolam renang dan bekas gereja tua.\n" +
                    "Nambakor merupakan salah satu desa yang terletak di Kecamatan Saronggi, desa ini merupakan penghasil garam dan penghasil ikan budidaya tambak.",
            "Trenggalek mempunyai banyak tempat peristirahatan dan tempat wisata yang mempunyai keindahan yang masih asli belum terubah oleh keadaan zaman, misalnya goa, pantai, dan pegunungan yang asri.\n" +
                    "\n" +
                    "Gua Lowo. Merupakan salah satu gua yang terletak di Desa Watuagung, Kecamatan Watulimo, sekitar 30 km Tenggara kota Trenggalek. Berdasarkan ahli gua, Mr Gilbert Manthovani dan Dr Robert K Kho tahun 1984, Gua Lowo adalah gua alam yang besar di Asia Tenggara dengan panjang 800 meter, sembilan ruang utama dan beberapa ruang kecil.\n" +
                    "Pantai Prigi. Pusat pariwisata dan perekonomian warga Kecamatan Watulimo. Terdapat tempat pelelangan ikan dan merupakan Pelabuhan Nusantara.\n" +
                    "Pantai Pasir Putih. Kurang lebih 2 km dari Pantai Prigi. Terkenal karena pasirnya yang putih bersih.\n" +
                    "Pantai Pelang. Pantai yang terletak di Kecamatan Panggul ini mempunyai keindahan yang luar biasa. Memiliki air terjun dan pulau kecil-kecil yang indah.\n" +
                    "Larung Sembonyo. Upacara adat pesisir yang selalu menarik perhatian wisatawan asing maupun domestik. Diadakan setahun sekali di Pantai Prigi.\n" +
                    "Pantai Blado. Terletak di Kecamatan Munjungan, merupakan tempat wisata alami yang berada di arah Selatan dari Kota Trenggalek, Yang terkenal dengan pusatnya tanaman Cengkih dan Durian.\n" +
                    "Pantai Ngampiran. Lokasi berada di Munjungan dan terkenal dengan air jernih dan pasirnya yang putih bersih.\n" +
                    "Upacara Dam Bagong. Diadakan setiap tahun sekali dengan mempersembahkan kepala kerbau untuk di larung di Kali Bagong.\n" +
                    "Candi Brongkah. Merupakan candi yang berisi sejarah asal usul Trenggalek.\n" +
                    "Alun-alun Kota. Sarana rekreasi keluarga yang selalu ramai dikunjungi warga Trenggalek, terutama pada malam minggu, serta pada hari hari menjelang proklamasi kemerdekaan RI dimana di alun alun kota trenggalek diadakan bazaar dan taman hiburan rakyat yang dapat menghibur anak anak maupun orang dewasa\n" +
                    "Tari Turangga Yaksa. Merupakan tarian khas Kabupaten Trenggalek.\n" +
                    "Hutan Kota. Tempat wisata alternatif di Gunung Jaas, Kelurahan Ngantru, Kecamatan Trenggalek.\n" +
                    "Trenggalek Green Park. Taman bermain dan wisata keluarga di Jalan Brigjend Soetran.",
            "Wisata alam\n\n" +
                    "Goa Akbar, di Gedongombo (Semanding)\n" +
                    "Goa Putri Asih, di Nguluhan (Montong)\n" +
                    "Goa Suci, di Leran (Palang)\n" +
                    "Air Panas Prataan, di Wukiharjo (Parengan)\n" +
                    "Air Terjun Nglirip, di Mulyoagung, Singgahan\n" +
                    "Air Terjun Bongok, di Montong\n" +
                    "Ngerong Rengel, di Rengel\n" +
                    "Pantai Boom, di Kota Tuban\n" +
                    "Pemandian Kolam Renang Bektiharjo, di Bektiharjo (Semanding)\n" +
                    "Sendang Kalangan, Montongsekar Kecamatan Montong\n" +
                    "Pantai Mangrove, di Jenu\n" +
                    "Pantai Kelapa, di Panyuran (Palang)\n" +
                    "Pantai Sowan, di Bancar\n" +
                    "Pantai Pasir Putih Remen, di Remen (Jenu)\n" +
                    "Sendang Asmoro, di Ngino (Semanding)\n" +
                    "Tebing Pelangi, di Mahbeser (Merakurak)\n" +
                    "Wana Wisata Prataan, di Desa Prataan, Kec. Parengan\n" +
                    "Pemandian Air Hangat Nganget, di Dusun Mojo, Desa Sidorejo, Kecamatan Kenduruan, Tuban\n" +
                    "Wisata Pelang, Desa Pelang, Kecamatan Merakurak, TUBAN\n\n" +
                    "Wisata sejarah\n\n" +
                    "Masjid Agung Tuban, Kelurahan Kutorejo, Kecamatan Tuban\n" +
                    "Museum Kambang Putih, di Kecamatan Tuban\n\n" +
                    "Wisata religi\n\n" +
                    "Makam Sunan Bonang\n" +
                    "Makam Syeh Maulana Ibrahim Asmaraqandi\n" +
                    "Makam Sunan Bejagung Lor (Makam Sunan Bejagung Utara)\n" +
                    "Makam Sunan Bejagung Kidul (Makam Sunan Bejagung Selatan)\n" +
                    "Makam Syekh Achmad Cholil, Desa Rawasan, Kecamatan Jenu\n" +
                    "Makam Sunan Gesing, Desa Gesing, Kecamatan Semanding\n" +
                    "Makam Syekh Subakir, Desa Tasikharjo, Kecamatan Jenu\n" +
                    "Pondok Pesantren Al-Maghribi (Ponpes Perut Bumi), Desa Gedongombo, Kecamatan Semanding\n\n" +
                    "Tempat bersejarah Tuban\n" +
                    "\n" +
                    "Terdapat banyak tempat bersejarah di Tuban, seperti Masjid Agung Tuban yang terletak di Kelurahan Kutorejo, Kecamatan Tuban. Dahulu Masjid Agung Tuban digunakan Walisongo untuk menyiarkan agama Islam, Masjid Agung Tuban sudah dilakukan beberapa kali renovasi untuk menambah daya tampung jamaah yang akan melaksanakan ibadah sholat di Masjid ini. Beberapa tempat bersejarah di Kabupaten Tuban seperti:\n" +
                    "\n" +
                    "Monumen Kuda Ronggolawe, Alun-alun Kota Tuban\n" +
                    "Masjid Agung Tuban, Kelurahan Kutorejo, Tuban\n" +
                    "Monumen Adpada Pancasila, Desa Sugihwaras, Kecamatan Jenu\n" +
                    "Patung Letda Sucipto (Bunderan Patung), Kota Tuban\n" +
                    "Klenteng Kwan Sing Bio, Kelurahan Karangsari, Kota Tuban\n" +
                    "Tugu Peringatan Kembalinya Kota Tuban dari penjajah (Tugu Caluk Watulumur), Kota Tuban",
            "Wisata Alam\n\n" +
                    "Industri pariwisata di Tulungagung cukup berkembang dengan objek wisata andalan Pantai Popoh yang terletak di Kecamatan Besuki.\n" +
                    "\n" +
                    "Di kecamatan Bandung, tepatnnya di desa Sukoharjo terdapat beberapa wisata alam yang menawan, di antaranya \"Sumber Ece\", yang terletak di dusun Nglempung, desa Sukoharjo, kecamatan Bandung, kabupaten Tulungagung.[butuh rujukan]\n" +
                    "\n" +
                    "Ada lagi di dusun Nguri, yaitu wisata alam \"Goa Sepeda\" dan \"Banyu Ilang\".[butuh rujukan]\n" +
                    "\n" +
                    "Wisata pantai\n\n" +
                    "Tulungagung diuntungkan dengan letak geografis yang berada di tepi Samudera Hindia, sehingga memiliki banyak pantai yang menarik untuk dikunjungi selain Pantai Popoh, di antaranya Pantai Sidem, Pantai Brumbun, Pantai Sine, Pantai Molang, Pantai Klatak, Pantai Gerangan, Pantai Sanggar, Pantai Gemah, Pantai Ngalur, Pantai Coro, Pantai Lumbung dan Pantai Dlodo, Pantai Pathok Gebang, Pantai Kedung Tumpang.\n" +
                    "\n" +
                    "Wisata Air Terjun\n\n" +
                    "Selain objek wisata pantai, Tulungagung juga memiliki objek wisata alam lain, di antaranya Air Terjun Lawean di Kecamatan Sendang, Coban Alam di Kecamatan Campurdarat, Gua Selomangleng di Kecamatan Boyolangu, serta Gua Pasir di Kecamatan Sumbergempol. Disisi timur, yakni Kecamatan Rejotangan juga terdapat Wana Wisata Alam Kandung yang terkenal dengan Grojogan Sewu dan bangunan cerobong peninggalan zaman Belanda di Bukit Cemenung. Di utara Tulungagung, objek wisata alam yang terkenal adalah Pesanggarahan Argo Wilis, Perkebunan Teh Penampean, serta Bendungan Wonorejo.\n" +
                    "\n" +
                    "Wisata Candi\n\n" +
                    "Selain itu Tulungagung juga mempunyai Beberapa Bangunan Candi yang tersebar di beberapa tempat, yaitu Candi Dadi yang terletak di Puncak bukit di Desa Sanggrahan kecamatan Boyolangu, Candi Cungkup (Candi Sanggrahan) yang terletak di Desa Sanggrahan Kecamatan Boyolangu, Candi Gayatri (Boyolangu) yang terletak di kecamatan Boyolangu, candi Mirigambar terletak di Kecamatan sumbergempol, Candi Bodho terletak di Kecamatan Kalidawir, Candi Penampihan berada di Lereng Gunung wilis kecamatan Sendang. Di selatan Tulungagung tepatnya di Kecamatan Campurdarat sebuah Telaga yang bernama Telaga Buret, telaga ini tak pernah kering walaupun letaknya di Perbukitan kapur selatan yang terkenal kering dan panas saat musim kemarau datang. Arca Joko Budhek, adalah sebentuk batu yang ukurannya besar yang bentuknya seperti seorang pria yang bertapa,arca ini berada di puncakbukit, dan bisa dilihat dari jalan raya karena ukurannya yang besar.\n" +
                    "\n" +
                    "Wisata Budaya\n\n" +
                    "Tulungagung memiliki beberapa kesenian khas yang bisa dijadikan magnet untuk mengangkat pariwisata Tulungagung, di antaranya:\n" +
                    "\n" +
                    "Wayang Kulit Purwo/Ringgit Purwo\n" +
                    "Jaranan sentherewe\n" +
                    "Reog Kendang\n" +
                    "Tiban\n" +
                    "Jedor\n" +
                    "Kentrung\n" +
                    "Manten kucing\n" +
                    "Langen Beksan\n" +
                    "Tayub Tulungagung\n" +
                    "Sendra Tari Setyo Budaya\n" +
                    "Reog Ponorogo Cahaya Budaya\n" +
                    "Kesenian jaranan dan reog kendang serta wayang kulit bahkan mendapat dukungan yang luas dari mayoritas masyarakat Tulungagung untuk maju dan berkembang.dan disukai masyarakat sekitar bahkan sering ditanggap\n" +
                    "\n" +
                    "Wisata Kuliner\n" +
                    "Tulungagung memiliki jajanan khas, yaitu:\n" +
                    "\n" +
                    "Sate dan Gule Kambing, Sate Tulungagung mirip dengan sate lainnya dan tampak sederhana, terdiri dari daging kambing yang ditusuk dalam sujen (tusuk sate) bambu, disajikan dengan bumbu kecap yang diberi merica dan petis, serta ditaburi dengan irisan bawang merah, di beberapa warung ditambah irisan daun jeruk, berbeda dengan tampilan Sate di kabupaten Trenggalek (Sate Bendo) yang dalam penyajiannya ditaburi kecambah sama seperti daerah Nganjuk, tidak seperti sate Madura dan sate Ponorogo dan Kediri, yang bumbu-nya mengandung kacang, Sehingga rasanya memang khas Tulungagung-an, pada dasarnya perbedaan rasa ini dikarenakan proses bakarnya dicelupkan dalam kuah gule dan pemakaian kecap manis tradisional merk kuda khas tulungagung-an.\n" +
                    "Nasi Lodho Tulungagung, sebenarnya kuliner ini mirip dengan kare ayam, hanya saja ayamnya dipanggang/diasap terlebih dulu dan disajikan bersama nasi/tiwul (tiwul adalah nasi yang terbuat dari gaplek/singkong) dengan pelengkap gudhangan (kudapan) sayur-sayuran, namun dalam perkembangannya lebih banyak yang disajikan (warung kaki lima) serupa dengan kare ayam. Lodho Tulungagung dibedakan dalam 2 genre,yaitu Lodho kuah kental dan encer, kekentalannya berasal dari konsentrasi santan, biasanya rasanya pedas,ayamnya ayam kampung.\n" +
                    "Sredek, Makanan yang terbuat dari gethuk singkong, kemudian digoreng. Biasa dimakan dengan tempe goreng dan cabe mentah (sebagai lalap), adalah makanan khas Tulungagung selatan.\n" +
                    "Kemplang, makanan yang terbuat dari ketela yang diparut dikasih bumbu-bumbu dibentuk pipih diatasnya dikasih kacang lotho lalu di goreng itu juga makanan khas tulungagung\n" +
                    "Emping Melinjo, makanan ini terbuat dari biji belinjo yang dipipihkan dan kemudian dijemur seperti kerupuk.\n" +
                    "Kerupuk Gadung, kuliner yang untuk saat ini pembuatannya hanya dikuasai oleh sedikit orang (umumnya orang tua) karena pengolahannya harus diperam dulu menggunakan abu untuk menghilangkan kandungan getah gadung agar tidak menyebabkan efek mabuk/pusing ketika dimakan.\n" +
                    "Soto Ayam Kampung Tulungagung warung soto dengan aroma rempah yang kuat dan kemiri sebagai penguat rasa banyak ditemui disekitaran Kecamatan Kauman dan Kecamatan Gondang\n" +
                    "Nasi pecel Tulungagung, nasi pecel dengan karakter sambal pecel seperti di daerah Kabupaten Blitar, yang membedakan dengan pecel dari daerah lain seperti Madiun/Ponorogo adalah karakter sambal kacang yang pedas manis (karena penambahan gula jawa/gula aren) serta aroma daun jeruk yang kuat.\n" +
                    "Sompil, Lontong diiris kemudian disiram dengan sayur lodeh (umumnya lodeh kacang) dan diatasnya ditambahi dengan bubuk kedelai yang gurih-manis.\n" +
                    "Lopis, makanan seperti lontong biasanya dicampur cenil, kicak atau gethuk dikasih larutan gula merah\n" +
                    "Cenil Yang dibuat dari singkong yang diolah melalui proses ditumbuk/digiling yang biasanya juga dibuat bersama Kicak, disajikan dengan parutan kelapa muda dan disiram dengan gula jawa/gula aren cair.\n" +
                    "Kerupuk Rambak Tulungagung, kerupuk yang terbuat dari kulit sapi/kerbau serupa kerupuk jangek di Padang-Sumatra Barat namun dengan karakter yang lebih renyah, sentra industri kerupuk ini ada di seputaran Botoran Panggungrejo kota, Sembung.\n" +
                    "Gethuk, singkong rebus yang dihaluskan dengan cara ditumbuk bersama gula jawa/ gula aren dan disajikan dengan taburan parutan kelapa diatasnya.\n" +
                    "Srondeng, parutan kelapa yang digoreng dengan dibumbui sedemikian rupa sampai berwarna merah kecoklatan, kadang-kadang buat campuran dendeng sapi\n" +
                    "Jenang Syabun, jenang yang diolah dari beras ketan menjadi serupa dodol dengan penggabungan karakter rasa manis dari dua macam gula, gula jawa dan gula pasir,jenang ini mempunyai tektur lembut namun kenyal dan tidak lengket,originalnya jenang initidakmenggunakan pengawet,sehingga jarang dipajang ditoko,jika berminat disarankan datang ke pabriknya di desa Botoran.\n" +
                    "Jenang Grendol, makanan terbuat dari tepung kanji, biasanya disajikan bersama dengan Jenang Baning yang terbuat dari tepung beras serta Jenang Ketan dari bubur ketan hitam. Secara terpisah Jenang Grendol disajikan dengan kuah santan karena karakter jenang itu sendiri yang sudah manis namun apabila dicampur akan diberikan kuah gula jawa/gula aren yang umum disebut Juruh.\n" +
                    "Geti, adalah nuget terbuat dari wijen kadang-kadang dicampur kacang yang dimasak dengan gula sehingga memunculkan sensasi rasa yang manis-gurih.\n" +
                    "Kopi Cethe, ampas kopi yang dijadikan bahan pengoles rokok agar memiliki aroma yang lebih sedap.\n" +
                    "Punten Pecel, Punten serupa dengan Jadah cuma bedanya kalau Jadah terbuat dari bahan ketan sementara Punten dari bahan beras yang ditanak dengan santan gurih dan kemudian dijelu atau ditumbuk pelan dan umumnya ditambah parutan kelapa muda sehingga tercipta adonan kenyal dan gurih yang biasanya disajikan dengan pecel.\n" +
                    "Brondong Ketan, di Tulungagung umumnya disebut Bipang, dengan mengolah berondong dari beras ketan yang diolah dengan gula.\n" +
                    "Capar Tape, atau disebut tape pecel yang terbuat dari tape singkong (umumnya putih) dan disiram sayur pecel bahkan biasanya juga ditambahkan mentimun rebus.\n" +
                    "Glondhong Juruh,asli Sambitan, terbuat dari kukusan ketela pohon disiram juruh kental atau dibuat dengan memasukkan singkong kedalam ke jadi/wajan besar tempat orang memasak gula jawa/gula tebu sehingga menjadi manis, kadang-kadang disebut juga Cimplung yang mungkin karena dibuat dengan nyemplung/memasukan singkong ke wadah pengolahan gula.\n" +
                    "Sego Bantingan, nasi bungkus yang dijual secara murah meriah, pelengkapnya sederhana (lauk standar dan sambal/keringan) dan apabila ingin menambahkan sayur atau lauk ada disiapkan secara terpisah.\n" +
                    "Gembrot, kuliner khas yang terbuat dari beberapa jenis dedaunan yang dicampur dengan parutan kelapa yang telah dibumbui sedemikian rupa kemudian dibungkus dengan daun kelapa dan dikukus, kadang-kadang didalamnya juga ditambahkan sejenis ikan sungai atau udang.\n" +
                    "Gathot, makanan yang terbuat dari singkong yang direndam air garam kemudian dijemur hingga kering menjadi Gaplek, gaplek yang dicacah/diiris tipis apabila ditanak menjadi Gathot dan disajikan dengan parutan kelapa muda, sementara itu Gaplek yang ditumbuk menjadi Tiwul dan ditanak sebagai pengganti nasi\n" +
                    "Klethek, klethek merupakan makanan yang terbuat dari singkong yang dalam pengolahannya dicampur dengan bumbu-bumbu lainnya, seperti terasi dan kedelai. Klethek mirip dengan keripik singkong hanya saja dalam pemasakannya klethek digoreng sedikit lebih lama.",
            "Pariwisata kota Batu merupakan salah satu yang terbesar di Indonesia. Jumlah kunjungan wisatawan ke kota ini merupakan salah satu yang terbesar bersama dengan Bali dan Yogyakarta. Objek wisata kota Batu sangat beragam, dari sejarah, retail, pendidikan, hingga kawasan alam. Di objek wisata Songgoriti terdapat Candi Songgoriti peninggalan Kerajaan Medang dan arca Ganesha peninggalan Kerajaan Singhasari serta tempat peristirahatan yang dibangun sejak zaman Belanda.\n" +
                    "\n" +
                    "Wisata Alam\n\n" +
                    "Wisata gua terdapat di Cangar dan Tlekung\n" +
                    "Air terjun Coban Rais\n" +
                    "Air terjun Coban Talun\n" +
                    "Air terjun Coban Putri\n" +
                    "Pemandian Songgoriti (pemandian air panas)\n" +
                    "Pemandian Selecta (pemandian air)\n" +
                    "Pemandian Cangar (pemandian air panas mengandung belerang)\n\n" +
                    "Agrowisata\n\n" +
                    "Arboretum Sumber Brantas (mata air Sungai Brantas)\n" +
                    "Kusuma Agrowisata (perkebunan apel, stroberi, jambu, dan jeruk, serta tempat outbound)\n\n" +
                    "Wisata Perkemahan\n\n" +
                    "Taman Hutan Raya Raden Soerjo\n" +
                    "Gunung Panderman\n\n" +
                    "Wisata Keluarga\n\n" +
                    "Batu Secret Zoo (Jawa Timur Park 2)\n" +
                    "Jawa Timur Park 1\n" +
                    "Batu Night Spectacular\n" +
                    "Batu Wonderland\n" +
                    "Eco Green Park\n" +
                    "Kusuma Waterpark\n" +
                    "Predator Fun Park\n" +
                    "Jatim Park 3\n\n" +
                    "Wisata Edukasi Susu Batu\n" +
                    "Kampoeng Kidz\n\n" +
                    "Wisata Pendidikan\n\n" +
                    "Balai Besar Pelatihan Peternakan (BBPP) Batu\n" +
                    "Museum Angkut+\n" +
                    "Museum Satwa (Jawa Timur Park 2)\n" +
                    "The Bagong Adventure Museum Tubuh\n" +
                    "Omah Munir (Museum)\n" +
                    "Kampoeng Kidz",
            "Tempat Wisata\n" +
                    "Tempat tujuan wisata di Kota Blitar antara lain:\n" +
                    "\n" +
                    "Taman Pecut Kota Blitar pada saat malam hari\n\n" +
                    "Makam Bung Karno, tempat dimakamkannya presidan pertama sekaligus proklamator kemerdekaan Republik Indonesia, Soekarno. Makam ini terletak di Kelurahan Bendogerit, Kecamatan Sananwetan, sekitar 2 kilometer sebelah utara pusat kota.\n\n" +
                    "Perpustakaan dan Museum Bung Karno merupakan perpustakaan yang selain berisi segala bentuk memorabilia Bung Karno, juga dikembangkan sebagai pusat studi terpadu. Beberapa koleksi yang ada saat ini adalah lukisan hidup Bung Karno yang dapat berdetak tepat pada bagian jantungnya, uang bergambar Bung Karno yang dapat menggulung sendiri, dan koleksi sumbangan dari Yayasan Idayu.\n\n" +
                    "Istana Gebang atau lebih dikenal dengan sebutan Ndalem Gebang, merupakan rumah tempat tinggal orang tua Bung Karno. Istana ini bertempat di Jalan Sultan Agung 69. Di rumah ini pada setiap bulan Juni ramai didatangi pengunjung, baik dalam rangka peringatan hari ulang tahun Bung Karno maupun karena adanya kegiatan tahunan yang diselenggarakan oleh Pemkot Blitar, seperti Grebeg Pancasila.\n\n" +
                    "Petilasan Arya Blitar merupakan sebuah makam dari Adipati Arya Blitar yang terletak di Kelurahan Blitar, Kecamatan Sukorejo. Makam ini ramai dikunjungi pada bulan Sura dan juga setiap malam Jumat legi.\n\n" +
                    "Monumen Supriyadi merupakan sebuah monumen untuk mengenang jasa Soeprijadi. Pada tahun 1945, Kota Blitar menjadi pusat pemberontakan tentara Peta yang dipimpin oleh Shodancho Soeprijadi melawan tentara Jepang. Monumen ini terletak di depan bekas Markas Peta dan Taman Makam Pahlawan Raden Wijaya. Selain itu, juga dibangun sebuah patung setengah dada Soeprijadi yang terletak di depan Pendapa Rangga Hadinegara.\n\n" +
                    "Kebon Rojo, yaitu taman hiburan dan rekreasi keluarga yang berada di belakang kompleks rumah dinas Wali Kota Blitar yang disediakan untuk masyarakat umum maupun wisatawan secara cuma-cuma. Di taman tersebut, terdapat beberapa jenis hewan peliharaan, fasilitas bermain anak-anak, tempat bersantai, panggung apresiasi seniman, air mancur, dan juga berbagai jenis tanaman langka yang berfungsi sebagai paru-paru kota.\n\n" +
                    "Taman Air Sumberudel merupakan taman air yang terletak di Jalan Kali Brantas. Taman air ini diresmikan kembali oleh Wali Kota Blitar pada tanggal 10 Oktober 2007 setelah direnovasi selama kurang lebih satu setengah tahun. Fasilitas yang dimilikinya cukup lengkap bila dibandingkan dengan taman-taman air lain di Jawa Timur.\n\n" +
                    "Green Park merupakan taman hijau terbuka yang terletak di Kelurahan Bandogerit, Sananwetan. Fasilitas yang ada di taman ini berupa gazebo, tempat duduk, jungkat-jungkit, dan beberapa permainan lain untuk anak-anak.\n\n" +
                    "Taman Pecut merupakan ruang terbuka hijau yang terletak di sebelah selatan Alun-Alun Kota Blitar.Taman ini diresmikan hari Kamis, 22 Juni 2017 oleh Wali kota Blitar. Di taman ini, pengunjung bisa menyaksikan atraksi air mancur dengan sinar lampu berwarna-warni yang bisa menari dengan iringan suara musik setiap malam Minggu. Taman Pecut juga menyediakan fasilitas seperti gazebo, kamar mandi, dan beberapa titik swafoto.",
            "Wisata Alam\n\n" +
                    "Wisata Sejarah\n\n" +
                    "Candi Setono Gedong, Satu-satunya candi di Indonesia yang ada tepat di tengah kota. Candi ini merupakan peninggalan Kerajaan Hindu dan terletak di Jalan Dhoho\n" +
                    "Museum Airlangga, di Kelurahan Pojok\n" +
                    "Museum Fotografi Kediri\n" +
                    "Klenteng Tjio Hwie Kiong\n" +
                    "Gereja Merah GPIB Kediri, bangunan khas era kolonial\n" +
                    "Dermaga Joyoboyo\n" +
                    "Monumen Kediri Syu\n\n" +
                    "Wisata Keluarga\n\n" +
                    "Waterpark Selomangleng, di Kelurahan Pojok\n" +
                    "Kolam Renang Pagora\n" +
                    "Kolam Renang Tirtoyoso\n" +
                    "Alun-Alun Kota Kediri\n" +
                    "Taman Sekartaji\n" +
                    "Taman Brantas\n" +
                    "Taman Ngronggo\n" +
                    "Hutan Joyoboyo\n\n" +
                    "Wisata Religi\n\n" +
                    "Masjid Banjar Mlati, Masjid Tertua di Kota Kediri\n" +
                    "Masjid Auliyya Setono Gedong\n" +
                    "Masjid Agung Kota Kediri\n" +
                    "Makam Kuno Mbah Wassil\n\n" +
                    "Wisata Kuliner\n\n" +
                    "Wisata Kuliner Soto Kediri Bok Ijo di Terminal Tamanan\n" +
                    "Pusat Tahu Takwa dan Gethuk Gedang di Jalan Pattimura dan Jalan Yos Sudarso\n" +
                    "Kuliner Pecel di Jalan Dhoho\n" +
                    "Kuliner Jagung Bakar di Bundaran Sekartaji",
            "Pariwisata\n\n" +
                    "Makam & Masjid Kuno Taman\n" +
                    "Makam & Masjid Kuno Kuncen\n" +
                    "Suncity Water & Theme Park\n" +
                    "Dumilah Waterpark\n" +
                    "Masjid Agung Baitul Hakim\n" +
                    "Alun - Alun Kota Madiun\n" +
                    "Gereja Santo Cornelius\n" +
                    "Gereja Pantekosta Immanuel\n" +
                    "Gereja Mater Dei\n" +
                    "Taman Lalu Lintas Bantaran Kali Madiun\n" +
                    "Taman Monumen Lokomotif C2606\n" +
                    "Taman Hijau Demangan\n" +
                    "Taman Manisrejo\n" +
                    "Taman Olahraga Gulun\n" +
                    "Taman Bantaran Kali Madiun\n" +
                    "Taman Trembesi Madiun\n" +
                    "Taman Tawangrejo\n" +
                    "Taman Kelun\n" +
                    "Taman Mojorejo\n" +
                    "Taman Obor\n" +
                    "Taman Hero\n" +
                    "Ruang Terbuka Hijau (RTH) Kartini\n" +
                    "Taman Hutan Kota Madiun\n" +
                    "Ruang Terbuka Publik (RTP) Taman Hutan Kota Ngegong\n" +
                    "Klenteng Tri Dharma \"Hwie Ing Kiong\" Kota Madiun\n" +
                    "Monumen Patung Moeljadi (Mastrip)\n" +
                    "Monumen Patung Kolonel Marhadi\n" +
                    "Monumen Kolonel Marhadi\n" +
                    "Monumen TGP (Tentara Genie Pelajar)\n" +
                    "Monumen Perjuangan PETA Madiun\n" +
                    "Monumen Gembok Kejujuran\n" +
                    "Patung Gajah Demangan\n" +
                    "Monumen Keris\n" +
                    "Kompleks Bosbow Madiun\n" +
                    "Rumah Kapitan Cina\n" +
                    "Tugu Pendekar Proliman\n" +
                    "Kolam Renang Indoor Pasar Besar Madiun\n" +
                    "PeceLand",
            "Pariwisata di Kota Malang cukup besar. Pada tahun 2016, tercatat jumlah wisatawan domestik di Kota Malang berjumlah 3.987.074 orang, sedangkan wisatawan mancanegara sejumlah 9.535 orang. Jumlah wisatawan tahun 2016 merupakan suatu lonjakan yang signifikan dari tahun sebelumnya. Dengan melihat bukti tersebut, pemerintah optimis jumlah kunjungan wisatawan, terutama mancanegara akan terus meningkat.\n" +
                    "\n" +
                    "Kampung Wisata\n" +
                    "Kampung Wisata Jodipan adalah kampung tematik pertama di Jodipan, Blimbing\n" +
                    "Malang dikenal memiliki banyak sekali kampung tematik yang bernuansa pedesaan dan khas. Di antaranya, yang paling terkenal adalah Kampung Wisata Jodipan (Kampung Warna-Warni), kampung warna-warni pertama di Indonesia yang menjadi salah satu destinasi favorit di Kota Malang. Selain itu, ada juga Kampung Tridi yang terletak di seberang Kampung Warna-Warni yang terkenal akan karya seni mural di dinding-dinding perumahannya, seperti Haji Lane di Singapura. Kedua kampung tersebut dihubungkan oleh sebuah jembatan kaca. Keduanya merupakan tempat selfie favorit para wisatawan.\n" +
                    "\n" +
                    "Selain itu, ada juga kampung wisata di Kota Malang yang terkenal akan keramahan lingkungannya dan kehijauannya. Di antaranya adalah Kampung Glintung Go Green (3G) yang terletak di Purwantoro dan Kampung Bamboo Mewek di Tunjungsekar. Keramahan lingkungan di Kampung 3G dapat dilihat dari penuhnya kampung oleh tanaman. Kampung 3G pun merupakan kampung konservasi air pertama di Indonesia. Sedangkan, Kampung Bamboo Mewek dianggap ramah lingkungan karena penuh dengan pohon dan bambu serta merupakan kampung konservasi.\n" +
                    "\n" +
                    "Sebagai kota berbudaya, Malang pun memiliki kampung-kampung budaya. Kampung Budaya Polowijen adalah salah satunya. Kampung ini dianggap sebagai kampung budaya karena menyimpan dan menampilkan berbagai situs warisan budaya: topeng malangan, makam Mbah Reni, pembuat topeng malangan pertama, dan Sumur Windu, tempat pemandian Ken Dedes di zaman dahulu. Kampung ini pun memiliki perpustakaan unik yang terletak di gazebo. Selain kampung tersebut, ada juga Kampung Topeng Malangan. Sesuai namanya, mulai dari gerbang menuju kawasan tersebut, pengunjung akan disambut ratusan topeng dengan aneka warna dan berbagai karakter seperti dalam kisah-kisah panji.\n" +
                    "\n" +
                    "Sarana dan prasarana penunjang\n" +
                    "\n" +
                    "Macito, bus wisata bertingkat\n" +
                    "Pada Februari 2015, Pemerintah Kota Malang meluncurkan sistem angkutan bus tingkat wisata bewarna hijau yang dinamai Bus Macito, singkatan dari Malang City Tour yang disediakan secara gratis dan khusus untuk para wisatawan. Bus ini beroperasi di Kota Malang dari depan gedung DPRD Kota Malang dan rutenya melewati beberapa titik-titik penting di tiap sudut kota, di antaranya beberapa museum-museum penting, kawasan Jalan Ijen, wisata kuliner, dan sebagainya. Bus ini berkapasitas 40 penumpang dengan jatah keliling sebanyak tiga kali.\n" +
                    "\n" +
                    "Sarana penginapan untuk pariwisata di Kota Malang beragam, mulai dari hotel, apartemen, losmen, hingga rumah singgah yang tersebar di seluruh penjuru kota. Keberagaman ini didukung oleh kenyataan bahwa Malang merupakan tujuan wisata paling populer di Indonesia setelah Bali, Bandung, dan Yogyakarta. Hotel yang paling terkenal di kota adalah Hotel Tugu. Hal ini dikarenakan hotel sudah dikenal baik di kalangan wisatawan asing dan hotel ini sering memeanjakan pengunjungnya dengan berbagai acara. Hotel terkenal lainnya adalah Hotel Pelangi karena hotel tersebut memiliki koleksi lukisan-lukisan Belanda.",
            "Pariwisata\n\n" +
                    "Alun-alun Kota Mojokerto terletak di pusat kota. Bagi warga Kota Mojokerto dan sekitarnya dulu merupakan tempat rekreasi sekaligus sebagai sarana bersantai bagi keluarga di akhir pekan.\n" +
                    "\n" +
                    "Namun Sekarang Alun - Alun dikosongkan dan Pedagangnya dipindahkan ke Jl.Benteng Pancasila yang tidak jauh dari Kediaman mantan Wali kota Mojokerto yaitu Bpk. Abdul Gani.\n" +
                    "\n" +
                    "Gereja Protestan Indonesia Bagian Barat merupakan salah satu gereja tertua di Kota Mojokerto dan merupakan peninggalan zaman Belanda. Masjid Agung Al-Fattah didirikan pada zaman Belanda tepatnya pada tanggal 7 Mei 1878 berada di pusat kota sebelah Barat Aloon-aloon.\n" +
                    "\n" +
                    "Klenteng Hok Siang Kiong didirikan pada tahun 1895. Ciri khas kedua bangunan itu adalah bentuk arsitekturnya yang khas Cina. Bagi mereka yang senang berolahraga dapat menempuh perjalanan 1 km di arena jogging track di Dermaga sungai Brantas Indah. Di lokasi ini juga terdapat warung lesehan yang menyediakan beberapa macam makanan. Rekreasi keluarga lainnya dapat dikunjungi Pemandian Sekar Sari terletak di tengah kota. Tempat rekreasi ini dilengkapi kolam renang dengan fasilitas bermain untuk anak-anak, wartel, toko alat-alat olahraga dan rumah makan yang menjual beraneka ragam makanan (bakso, kikil, soto ayam, dan lain-lain).[6]\n" +
                    "\n" +
                    "Jalan Benteng Pancasila, Kecamatan Magersari merupakan pusat keramaian terbaru di kota Mojokerto. Di Jalan Ini terdapat Pusat Jualan PKL yang menjual beragam produk dari produk garmen sampai sepatu dan tas. Selain itu juga, Jalan Benteng Pancasila atau biasa disebut Benpas merupakan tempat berkumpul kawula muda Mojokerto dan wilayah sekitarnya seperti Sidoarjo, Jombang, Lamongan, Nganjuk, Kediri, Surabaya hingga Pasuruan di malam minggu dan pada hari libur nasional.\n" +
                    "\n" +
                    "Kini, di Jl. Benteng Pancasila terdapat sebuah mall di Mojokerto yaitu Sunrise Mall yang dibuka pada Juni 2016. Mall ini biasanya ramai pada saat weekend. Terdapat beberapa brand makanan dan Fashion terkenal di mall ini, seperti J.co, Bread Talk, Sport Stations, Matahari, D'cost, Optik Melawai, Game Fantasia, Amazone, dan juga CGV Blitz (Bioskop). Mall ini sekaligus menjadi mall pertama dan terbesar di kota Mojokerto saat ini. Selain mall, akan dibuat Ayola Hotel yang nantinya langsung terkoneksi dengan Sunrise Mall, dan sekarang masih dalam tahap pembangunan.",
            "Tempat Wisata\n" +
                    "\n" +
                    "Kota Pasuruan memiliki beberapa tempat wisata, yaitu:\n" +
                    "\n" +
                    "Pelabuhan , Pusat aktivitas nelayan, juga menjadi lokasi perdagangan hasil laut. Nelayan yang beraktivitas di sini berasal dari sekitar Pasuruan hingga nelayan pulau lain.\n" +
                    "Taman Kota, Terletak dekat Stadion Untung Suropati, dengan fasilitas utama tempat bermain anak-anak. Seiring dengan pemenuhan kebutuhan teknologi, tambahan fasilitas wifi di Taman Kota menjadi daya tarik untuk tempat ini. Dan di samping tempat ini terdapat perpustakaan kota.\n" +
                    "Astoria, Waterpark yang ada di kawasan CBD di samping carrefour pasuruan.\n" +
                    "Bioskop Star Cineplex, Bioskop yang terletak di kompleks pertokoan BCA lama, terdapat dua studio yang selalu memutar film-film Indonesia maupun luar negeri.\n" +
                    "Kolam Renang\n" +
                    "Kolam Renang Pondok Surya Kencana (Perumahan Pondok Surya Kencana)\n" +
                    "Kolam Renang Inna Joyo Tirto (Jl. Patiunus, BugulKidul )\n" +
                    "Kolam Renang Milenium ( Perumahan Millenium, Wironini )\n" +
                    "Taman\n" +
                    "Taman Lansia (Jl. Ki Hajar Dewantoro)\n" +
                    "Taman Pekuncen (Jl. Dr Wahidin Sudirohusodo)\n" +
                    "Taman Sekargadung / Hutan Kota (Jl. Sekarsono)\n" +
                    "Taman Hayati (Petahunan)\n" +
                    "Taman Hijau Karang ketug\n" +
                    "Taman Kota Pasuruan\n" +
                    "Alun-Alun Pasuruan" ,
            "Tempat Wisata\n\n" +
                    "Probolinggo dikenal sebagai kota singgah dalam perjalanan pariwisata menuju Gunung Bromo. Secara umum Probolinggo dijangkau oleh para wisatawan lokal maupun mancanegara melalui Surabaya dengan menggunakan kendaraan umum seperti bus maupun kereta api. Adapun objek wisata dalam kota sebagai berikut:\n" +
                    "\n" +
                    "Taman Wisata Studi Lingkungan (TWSL).\n" +
                    "Berupa kebun binatang mini yang berada di daerah Mangunharjo. Satwa yang ada dalam kebun binatang ini cukup beragam. Kini, TWSL terus dikembangkan. Biaya masuk hanya Rp 3000/orang untuk dewasa dan Rp 2000 untuk anak-anak.\n" +
                    "\n" +
                    "Pelabuhan Tanjung Tembaga dan Perikanan Pantai\n" +
                    "Masyarakat kota Probolinggo sering berwisata ke Pelabuhan Tanjung Tembaga dan Perikanan Pantai. Walaupun sebenarnya bukan sebuah objek wisata, tetapi pemandangan dan suasana yang disajikan cukup bagus. Tarif masuk hanya dikenakan terhadap kendaraan bermotor. Untuk Sepeda Motor sebesar Rp 1000 dan Mobil Rp 2000.\n" +
                    "\n" +
                    "Alun-Alun.\n" +
                    "Alun-Alun merupakan pusat kota Probolinggo. Terdapat beberapa bangunan penting mengelilingi alun-alun tersebut, seperti, Perpustakaanl, Penjara, Masjid, Kantor DPRD, dan Stasiun. Di sekitar alun-alun juga terdapat banyak penjual makanan dan minuman (semacam pusat jajanan). Terutama setiap minggu, diadakan pasar di alun-alun kota ini, menjual makanan dan berbagai tumbuh-tumbuhan. Tidak dikenakan biaya untuk masuk alun-alun.\n" +
                    "\n" +
                    "Taman Manula\n" +
                    "adalah taman rekreasi terletak di jalan Soekarno Hatta yang menyediakan fasilitas HotSPot gratis dan juga fasilitas Massage relaksasi.\n" +
                    "\n" +
                    "Museum Probolinggo\n" +
                    "yaitu museum yang dirintis sejak tahun 2009 dengan mengumpulkan sejumlah bukti-bukti. Misalnya bangunan, pusaka dan foto-foto kuno. Setelah tim museum terbentuk, akhirnya memburu dan mengumpulkan sejumlah bukti sejarah Probolinggo.Sebanyak 140 koleksi Museum Probolinggo terdiri dari temuan Arkeologi, Etnografi, Nomismatik (Uang), Filologi, Keramik Arkelogi, Pusaka, Alat Transportasi dan foto-foto masa lalu.\n" +
                    "\n" +
                    "BeeJay Bakau Resort (BJBR)\n" +
                    "Adalah ekowisata bakau di atas pantai pasang surut di Kota Probolinggo dengan fasilitas lengkap antara lain: Pantai pasir putih dengan Permainan Air, Water Boom, FlyingFox, Cafe, Restoran Sari Laut dan Bungalow.\n" +
                    "\n" +
                    "Mahagoni Park\n" +
                    "Adalah wisata yg terletak di kecamatan Sumber... Mahagoni Park adalah Wisata Hutan Pinus yg menyajikan pemandangan yg Sangat Indah... Biaya Masuk hanya Rp. 5.000 Rupiah...",
            "Surabaya memiliki beragam destinasi wisata yang menarik. Kebanyakan destinasi wisata di kota ini erat kaitannya dengan sejarah penyebaran agama Islam di tanah Jawa, serta perjuangan nasional Indonesia. Selain itu, Surabaya juga memiliki wisata alam yang menarik, di antaranya adalah Ekowisata Mangrove Wonorejo dan Pantai Kenjeran. Surabaya juga dikenal sebagai kota tempat singgahnya wisatawan mancanegara yang akan berwisata di wilayah Malang Raya, Gunung Bromo, maupun Gunung Ijen.\n" +
                    "\n" +
                    "Alam\n\n" +
                    "Ekowisata Mangrove Wonorejo\n" +
                    "Pantai Kenjeran\n\n" +
                    "Sejarah\n\n" +
                    "Gedung Balai Kota Surabaya\n" +
                    "Gedung Internatio\n" +
                    "Gedung De Javasche Bank\n" +
                    "Pabrik Sirup Telasih\n" +
                    "Jembatan Merah\n" +
                    "Kawasan Kota Tua Surabaya\n" +
                    "Monumen Bambu Runcing\n" +
                    "Monumen Jalesveva Jayamahe\n" +
                    "Monumen Jenderal Soedirman\n" +
                    "Monumen Kapal Selam\n" +
                    "Monumen Mayangkara\n" +
                    "Museum Kedokteran\n" +
                    "Museum Loka Jala Crana\n" +
                    "Museum Nahdlatul 'Ulama\n" +
                    "Museum Negeri Mpu Tantular\n" +
                    "Museum W. R. Soepratman\n" +
                    "Tugu Pahlawan\n\n" +
                    "Religi\n\n" +
                    "Gereja Perawan Maria Tak Berdosa Surabaya\n" +
                    "Gereja Katolik Kelahiran Santa Perawan Maria\n" +
                    "Gereja Katolik Santo Yakobus Surabaya\n" +
                    "Kelenteng Hong Tiek Hian\n" +
                    "Kelenteng Boen Bio\n" +
                    "Kelenteng Sanggar Agung\n" +
                    "Makam Sunan Ampel\n" +
                    "Masjid Cheng Ho Surabaya\n" +
                    "Masjid Nasional Al Akbar\n" +
                    "Pura Jagad Karana\n\n" +
                    "Wisata keluarga\n\n" +
                    "Ciputra Waterpark\n" +
                    "Jalan Tunjungan\n" +
                    "Kebun Bibit Surabaya\n" +
                    "Kebun Binatang Surabaya\n" +
                    "Pasar Buah Peneleh\n" +
                    "Pasar Bunga Bratang\n" +
                    "Pasar Bunga Kayoon\n" +
                    "Patung Buddha Empat Wajah, di Sukolilo\n" +
                    "Patung Joko Dolog\n" +
                    "Rumah Batik\n" +
                    "Taman Bungkul\n" +
                    "Taman Harmoni\n" +
                    "Taman Remaja Surabaya"
    };
    private static String[] jenis ={
            "Wisata Religi, Alam, Sejarah, Kuliner",
            "Pantai, Air Terjun, Taman Nasional, Cagar Budaya",
            "Pantai, Candi, Kampung Coklat, Hutan Wisata",
            "Kayangan Api, Air Terjun, Sejarah, Religi, Taman Kota",
            "Wisata Alam, Sejarah, Rekreasi, Budaya, Ziarah",
            "Wisata Alam, Ziarah, Tradisi, Sejarah, Seni Budaya",
            "Pantai, Air Terjun, Agrowisata, Religi, Edukatif",
            "Wisata Alam, Taman, Candi, Ziarah, Religi",
            "Wisata Alam, Sejarah, Pendidikan, Keluarga, Religi",
            "Wisata Alam, Sejarah, Ziarah, Religi",
            "Pantai, Air Terjun, Ziarah, Goa",
            "Wisata Alam, Sejarah, Budaya, Agrowisata, Belanja",
            "Telaga Sarangan, Gunung, Candi, Air Terjun",
            "Gunung, Air Terjun, Sejarah, Pantai, Agrowisata, Religi",
            "Air Terjun, Air Panas, Candi, Waduk",
            "Wisata Air, Air Terjun, Candi, Goa",
            "Air Terjun, Perkebunan Teh, Trinil, Gunung, Sejarah",
            "Goa, Pantai, Pegunungan, Sejarah, Pemandian Air Panas",
            "Pantai, Monumen, Perayaan, Candi, Ziarah",
            "Taman Safari, Gunung, Perayaan, Pasuruan Expo",
            "Grebeg Suro, Wisata Industri, Alam, Goa, Religi",
            "Gunung, Danau, Candi, Air Terjun, Arung Jeram",
            "Ziarah, Air Terjun, Goa, Pemandian, Sejarah",
            "Wisata Air, Ziarah, Candi, Religi, Taman",
            "Taman Nasional, Pantai, Gunung, Sejarah, Religi, Ziarah, Budaya",
            "Sejarah, Religi, Ziarah, Wisata Alam, Bahari, Konservasi",
            "Goa, Pantai, Candi, Hutan Kota, Seni dan Budaya",
            "Goa, Air Terjun, Pantai, Sejarah, Religi",
            "Pantai, Air Terjun, Candi, Budaya, Kuliner",
            "Sejarah, Pendidikan, Wisata Alam, Agrowisata, Wisata Keluarga",
            "Makam Soekarno, Taman, Sejarah, Ziarah",
            "Sejarah, Keluarga, Religi, Kuliner",
            "Religi, Ziarah, Taman, Sejarah, Monumen",
            "Kampung Wisata, Kampung Budaya",
            "Alun - Alun, Religi, Sejarah, Belanja",
            "Pelabuhan, Taman, Kolam Renang, WIsata Air",
            "Taman, Pelabuhan, Alun-ALun, Sejarah, Ekowisata",
            "Ekowisata, Sejarah, Religi, Taman, Pasar",
    };

    static ArrayList<Kabupaten> getlistdata(){
        ArrayList<Kabupaten> list = new ArrayList<>();
        for (int position=0; position<namaKab.length;position++){
            Kabupaten kabupaten = new Kabupaten();
            kabupaten.setNama(namaKab[position]);
            kabupaten.setLogo(logoKab[position]);
            kabupaten.setLocator(lokasiKab[position]);
            kabupaten.setDetail(detail[position]);
            kabupaten.setJenis(jenis[position]);
            list.add(kabupaten);
        }
        return list;
    }
}