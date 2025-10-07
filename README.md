# Java Resume PDF Generator

## Açıklama
Bu proje, **Java kullanarak PDF formatında özgeçmiş oluşturma** uygulamasıdır.  
- Arayüz içermez, tüm bilgiler kod içinde tanımlıdır.  
- Çıktı olarak fotoğraflı bir PDF oluşturur.  
- Üç iş deneyimi ve eğitim bilgilerini içerir.  

## Proje Yapısı
- **src/com/azoresume/model/**  
  - `Person.java` → Kişisel bilgileri tutar  
  - `Experience.java` → İş deneyimlerini tutar  

- **src/com/azoresume/service/**  
  - `PdfGenerator.java` → PDF oluşturma işlemlerini gerçekleştirir  

- **src/com/azoresume/Main.java**  
  - Tüm verileri tanımlar ve PDF oluşturmayı başlatır  

- **lib/**  
  - `itextpdf-5.5.13.3.jar` → PDF kütüphanesi  
  - `profile.jpg` → Özgeçmiş fotoğrafı  

## Kullanılan Araçlar ve Teknolojiler
- Java 23  
- iTextPDF 5.5.13.3  
- IntelliJ IDEA  
- Git / GitHub  
- Kod desteği: **GitHub Copilot** ve **Chat GPT**  

## Kullanım
1. Projeyi klonla veya ZIP ile indir  
2. `lib/profile.jpg` dosyasını hazırla  
3. IntelliJ IDEA veya terminalden `Main.java` çalıştır  
4. Proje çalışınca proje klasöründe **Resume.pdf** oluşur  

## PDF İçeriği
- Profil fotoğrafı  
- Kişisel bilgiler: Ad, e-posta, telefon, adres  
- Özet (summary)  
- Üç iş deneyimi:  
  1. Laravel ile stajda kütüphane yönetim sistemi  
  2. Freelance projeler (Bootstrap, jQuery, PHP)  
  3. Akademik projeler (Java, SQL, Python)  

## Not
- Proje public bir GitHub reposunda paylaşılmıştır  
- Arayüz gerektirmez, tamamen teknik ve kod tabanlıdır
