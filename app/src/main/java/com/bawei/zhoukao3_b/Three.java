package com.bawei.zhoukao3_b;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/24/0024.
 */
public class Three extends FragmentActivity{


    private ViewPager three_viewPager;
    private RadioGroup three_radioGroup;
    private RadioButton three_liaoTian;
    private RadioButton three_lianXi;
    private List<Fragment> list;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three);


        three_viewPager = (ViewPager) findViewById(R.id.three_ViewPager);
        three_radioGroup = (RadioGroup) findViewById(R.id.three_RadioGroup);
        three_liaoTian = (RadioButton) findViewById(R.id.three_LiaoTian);
        three_lianXi = (RadioButton) findViewById(R.id.three_LianXi);


        list = new ArrayList<Fragment>();

        list.add(new Fragment1());
        list.add(new Fragment2());

        three_liaoTian.setBackgroundColor(Color.BLUE);
        three_lianXi.setBackgroundColor(Color.WHITE);


        three_viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });

        three_viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                switch (position){

                    case 0:

                        three_radioGroup.check(R.id.three_LiaoTian);

                        break;

                    case 1:

                        three_radioGroup.check(R.id.three_LianXi);

                        break;



                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        three_radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i){

                    case R.id.three_LiaoTian:

                        three_viewPager.setCurrentItem(0);
                        three_liaoTian.setBackgroundColor(Color.BLUE);
                        three_lianXi.setBackgroundColor(Color.WHITE);

                        break;

                    case R.id.three_LianXi:

                        three_viewPager.setCurrentItem(1);
                        three_liaoTian.setBackgroundColor(Color.WHITE);
                        three_lianXi.setBackgroundColor(Color.BLUE);

                        break;



                }

            }
        });


    }
}
