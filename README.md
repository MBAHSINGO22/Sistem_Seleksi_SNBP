# 📝 Sistem Seleksi SNBP Konsol

## Sistem Pengelolaan Peserta Seleksi SNBP dengan Java 

Proyek Java yang membaca data peserta dari file TXT, menampilkan daftar, mencari dengan sequential/binary search, dan menentukan kelulusan berdasarkan nilai atau sertifikat.

---

## 📖 Deskripsi Proyek

**Sistem_Seleksi_SNBP_Konsol** adalah proyek pembelajaran Java yang mengimplementasikan aplikasi konsol untuk pengelolaan data peserta SNBP. Proyek ini berfokus pada:

- 📊 **Pembacaan Data**: Mengimpor data peserta akademik dan non-akademik dari file TXT menggunakan kelas `ReadData`.
- 🔍 **Pencarian**: Sequential search dan binary search untuk mencari peserta berdasarkan nomor pendaftaran.
- 🧮 **Perhitungan Kelulusan**: Rata-rata nilai untuk peserta akademik dan bobot sertifikat untuk non-akademik, dengan standar lulus 85.
- 🛠️ **Menu Interaktif**: Kelas `Menu` untuk navigasi, tampilan tabel, dan pengecekan jalur peserta.

Proyek ini terdiri dari kelas-kelas dalam package `Projek_SDL_UTS`, dengan entry point `ProjekMain.java`. 🟢

---

## 🧠 Teknologi
- Java

---

## 📂 Struktur File

```
Sistem_Seleksi_SNBP_Konsol/
├── src/Projek_SDL_UTS/
│   ├── ReadData.java             # 📊 Kelas untuk membaca data dari file TXT
│   ├── Sertifikat.java           # 📋 Kelas sertifikat prestasi
│   ├── Peserta.java              # 📝 Kelas dasar peserta dengan nilai dan sertifikat
│   ├── ProjekMain.java           # 🚀 Entry point aplikasi dengan menu utama
│   ├── Menu.java                 # 🔍 Kelas untuk menu, tabel, search, dan perhitungan
├── DataPrestasiAkademik.txt      # 📈 File data peserta akademik
├── DataPrestasiNonAkademik.txt   # 📈 File data peserta non-akademik
├── README.md                     # 📖 Dokumentasi proyek
```
---

## 🟢 Catatan
- Pastikan Anda memiliki Java Development Kit (JDK) yang terinstal.
- Data dibaca dari file TXT dengan format spesifik (Nama, No Pendaftaran, Jalur, Nilai/Sertifikat).
- Binary search memerlukan data yang terurut berdasarkan nomor pendaftaran.
- Standar kelulusan: **85** untuk rata-rata nilai (akademik) atau bobot sertifikat (non-akademik).

---

## 📈 Contoh Output

**ProjekMain.java**

```
     === Cek Peserta SNBP ===
1. Tampilkan Daftar Peserta SNBP
2. Cari Peserta SNBP (Sequential)
3. Cari Peserta SNBP (Binary)
4. Exit Program

Pilihan = 1

Daftar Peserta SNBP 
No. Peserta         Nama
----------------------------------------
2024001             Anies Baswedan
2024002             Prabowo Subianto
2024003             Ganjar Pranowo
...

Cari No. Peserta = 2024001
Nama: Anies Baswedan
No Pendaftaran: 2024001
Jalur: Akademik
Rata-rata nilai: 83.25
Tidak Lolos

Cari No. Peserta = 2024051
Nama: Ahmad Rifqi
No Pendaftaran: 2024051
Jalur: Non Akademik
Sertifikat:
- Juara Lomba Renang (Kota, 1)
- Juara Lomba Bulu Tangkis (Provinsi, 1)
- Peringkat 3 Lomba Catur (Nasional, 3)
Bobot Sertifikat: 80.0
Tidak Lolos
```

---

## 👨‍💻 Pengembang
- **MBAHSINGO22**
- 🔗 GitHub

- **Naranss**
- 🔗 [GitHub](https://github.com/Naranss)

- **Khrisnayana**
- 🔗 [GitHub](https://github.com/Khrisnayana)

- **Firjatullah-bf**
- 🔗 [GitHub](https://github.com/Firjatullah-bf)
