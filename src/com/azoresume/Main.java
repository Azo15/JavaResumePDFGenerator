package com.azoresume;

import com.azoresume.model.*;
import com.azoresume.service.PdfGenerator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(
                "Azo Ismail",
                "ismailazo260@gmail.com",
                "+90 538 878 70 00",
                "Kirklareli, Turkiye",
                "Kirklareli Universitesi Yazilim Muhendisligi 3. sinif ogrencisiyim. 2023 yilinda universiteye basladim. " +
                        "Ilk olarak C dili ile basladim, ardindan C Sharp, PHP, MySQL ve JavaScript ogrendim. " +
                        "PHP uzerinde Laravel framework kullanarak stajimi tamamladim. Su anda .NET ve Python uzerinde calismalar yapiyorum."
        );

        List<Experience> experiences = new ArrayList<>();
        experiences.add(new Experience(
                "Scramblebit Pazarlama Programlama Ltd. Sti.",
                "Backend Stajyeri (Laravel)",
                "2025",
                "Laravel framework uzerinde tam bir Kutuphane Yonetim Sistemi gelistirdim. " +
                        "Veritabani baglantilari, API entegrasyonlari, uye ve kitap islemleri, raporlama ve arayuz gelistirmeleri yaptim."
        ));
        experiences.add(new Experience(
                "Freelance Projeler",
                "Full Stack Gelistirici",
                "2023 - 2025",
                "Bootstrap, jQuery ve PHP kullanarak kucuk olcekli web uygulamalari gelistirdim. HTML, CSS ve JavaScript ile responsive tasarimlar uzerinde calistim."
        ));
        experiences.add(new Experience(
                "Akademik Calismalar",
                "Ogrenci Projeleri",
                "2023 - Devam Ediyor",
                "Universitede yapilan odev ve grup projelerinde Java, SQL ve Python kullanarak veri isleme ve otomasyon uygulamalari gelistirdim."
        ));

        String imagePath = "lib/profile.jpg"; // Fotograf dosyan buraya konacak
        PdfGenerator generator = new PdfGenerator();
        generator.generate(person, experiences, imagePath);
    }
}
