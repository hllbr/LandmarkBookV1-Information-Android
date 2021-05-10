package com.hllbr.landmarkv1_information;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        //DATA
        ArrayList<String> meeting = new ArrayList<>();
        meeting.add("Selenium");
        meeting.add("Java");
        meeting.add("Rest assured");
        meeting.add("Web Service");
        meeting.add("web Service Soap");
        meeting.add("Rest");
        meeting.add("selenium grid");
        meeting.add("Container");
        meeting.add("sdlc");
        meeting.add("Jenkins");
        meeting.add("Continuos integration");

        ArrayList<String> detailsarray = new ArrayList<>();
        detailsarray.add("twitter,instagram,eksisözlük veri çekme-test yapılabiliyor ben tesy için kullanmadım.");
        detailsarray.add("uzay oyunu-rest api ile döviz çevirici yaptım-çekiliş uygulaması-notepad++ vb uygulamalar gerçekleştirdim.");
        detailsarray.add("Ruby-Groovy gibi dinamik dillerdeki kolaylıkları javaya sunana bir yapı");
        detailsarray.add("uzak service ve farklı platformlar arasında ortak bir biçim kullaranarak veri alışverişi sağlar");
        detailsarray.add("HTTP üzerinden web hizmetlerine erişim için xml tabanlı bir protokoldür.Basit nesne erişim protokolü olarak bilinir.Basit ifadeyle web servicelerinin birbirleriyle nasıl konuştuğunun ve onları çağıran islemci uygulamalarıyla nasıl konuştuğunun bir tanımıdır.");
        detailsarray.add("birden fazla web hizmeti kullanan etkileşimli uygulamalara yönelik bir Yyazılım standartı-Fixerıo ile döviz çevirici programı yazdım javada bunun dışında pythonda nickname göre kişinin repositieslerini getiren bir local sistem kurdum.");
        detailsarray.add("testleri paralel olarak çalıştırmak için kullanılan bir yöntem Hub-node yapısı temel alınarak tasarlanmıştır.");
        detailsarray.add("Docker bulut bilişim içinde hypervisior içerisinde cihazın izin verdği oranda uygulamaların çalıştılması olarak ifade edebilirim.tek bir sanal makinada birden fazla sanal makina oluşturabiliyoruz.Benim android kodlarımı sanal cihazlar üzerinde yada pcmdeki emülatörlerimde test etmem gibi ");
        detailsarray.add("ihtiyaçların belirlenmesi-analizler-tasarım-kodlama-test-onay(kabul)-waterfall model");
        detailsarray.add("yazılım geliştirme-test ve işleme alınması işlemlerini otomatikleştirmeye yarayan sürekli otomasyon .sunucu tabanlı çaşılıyor");
        detailsarray.add("tüm geliştiricilerin çalışma kopyalarını gün içinde birkaç kez paylaşan ve bir hatta birleştiren uygulama");

        //ListView
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,meeting);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              //  System.out.println(meeting.get(position));
              //  System.out.println(detailsarray.get(position));

                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("name",meeting.get(position));
                intent.putExtra("detail",detailsarray.get(position));
                startActivity(intent);
            }
        });
    }
}