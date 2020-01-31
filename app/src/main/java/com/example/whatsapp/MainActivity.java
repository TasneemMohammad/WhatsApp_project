package com.example.whatsapp;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
public class MainActivity extends AppCompatActivity {
   TabLayout tabLayout ;
   ViewPager viewPager ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.main_tabLayout);
        viewPager = (ViewPager) findViewById(R.id.main_viewPager);
        ArrayList<String> array_name = new ArrayList<>();
        array_name.add("Salma");
        array_name.add("Mama");
        array_name.add("Teta");
        array_name.add("Khalto Sahar");
        array_name.add("Hafsa");
        array_name.add("Amira");
        array_name.add("Rahma");
        array_name.add("Nouran");
        array_name.add("Mariem");
        array_name.add("Khadega");
        ArrayList<Integer> array_Image = new ArrayList<>();
        array_Image.add(R.drawable.ic_face_black_24dp);
        array_Image.add(R.drawable.ic_face_black_24dp);
        array_Image.add(R.drawable.ic_face_black_24dp);
        array_Image.add(R.drawable.ic_face_black_24dp);
        array_Image.add(R.drawable.ic_face_black_24dp);
        array_Image.add(R.drawable.ic_face_black_24dp);
        array_Image.add(R.drawable.ic_face_black_24dp);
        array_Image.add(R.drawable.ic_face_black_24dp);
        array_Image.add(R.drawable.ic_face_black_24dp);
        array_Image.add(R.drawable.ic_face_black_24dp);
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        adapter.addTap(new MyTab("Chat",FragmentChat.newInstance(array_name,array_Image)));
        adapter.addTap(new MyTab("Calls",Fragment_Calls.newInstance(array_name,array_Image)));
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
    public boolean onCreateOptionsMenu(Menu menu) { // menu = menu
        MenuInflater menuInflater =  getMenuInflater();
        menuInflater.inflate(R.menu.menu_whatsapp,menu); // menu dh elle hrkeb 3leh el menu bta3e menu_test
        return  true ;
    }

}
