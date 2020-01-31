package com.example.whatsapp;
import androidx.fragment.app.Fragment;
public class MyTab {
    private String name;

    private Fragment fragment ;
    public MyTab(String name, Fragment fragment) {
        this.name = name;
        this.fragment = fragment;
    }

    public String getTabName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fragment getFragment() {
        return  fragment;
    }

    public void setFragment(FragmentChat fragment) {
        this.fragment = fragment;
    }
    }
