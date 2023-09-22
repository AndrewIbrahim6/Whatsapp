package com.example.whatsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.example.whatsapp.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {



    ActivityMainBinding binding;
    ArrayList<ModelFragment> list = new ArrayList<>();
    ChatFragment chatFragment;
    StatusFragment statusFragment;
    FragmentPagerAdapter fragmentPagerAdapter;

    FirebaseAuth auth = FirebaseAuth.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        statusFragment = new StatusFragment();
        chatFragment = new ChatFragment();
        list.add(new ModelFragment(chatFragment,"chats"));
        list.add(new ModelFragment(statusFragment,"Status"));
        fragmentPagerAdapter = new FragmentPagerAdapter(this,list);

        binding.veiwpagercontainer.setAdapter(fragmentPagerAdapter);

        new TabLayoutMediator(binding.Tabs, binding.veiwpagercontainer, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(list.get(position).getTitle());
            }
        }).attach();


    }
}