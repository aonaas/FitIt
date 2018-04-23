package ng.com.donsoft.fitit;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ng.com.donsoft.fitit.fragment.WaitFragment;

/**
 * Created by Donchi4all on 06/03/2018.
 */





public class SearchActivity extends AppCompatActivity {

    private Toolbar toolbar;
    TextView header;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise_scrollable_tabs);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        header = (TextView)toolbar. findViewById(R.id.exercise_head);
        String title = getIntent().getStringExtra("title");
        header.setText(title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new WaitFragment(), "FAVORITES");
        adapter.addFrag(new WaitFragment(), "RECENT");
        adapter.addFrag(new Search_Exercise(), " SEARCH EXERCISE");
        adapter.addFrag(new Search_Workout(), "WORKLOAD");
        adapter.addFrag( new WaitFragment(), "CUSTOM");

        viewPager.setAdapter(adapter);
        viewPager .setCurrentItem(2);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    public String GetMyData(){
        return getIntent().getStringExtra("title");

    }
}
