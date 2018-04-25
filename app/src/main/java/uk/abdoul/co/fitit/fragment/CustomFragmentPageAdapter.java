package uk.abdoul.co.fitit.fragment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import uk.abdoul.co.fitit.Grid.Exercise_Main;


public class CustomFragmentPageAdapter extends FragmentPagerAdapter {

    private static final String TAG = CustomFragmentPageAdapter.class.getSimpleName();

  //  private static final int FRAGMENT_COUNT = 4;
    private static final int FRAGMENT_COUNT = 2;

    public CustomFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Workout_fragment();
             //   return new home();
            case 1:
               // return new Workout_fragment();
                return new Exercise_Main();
            //case 2:
              //  return new Exercise_Main();
           // case 3:
            //    return new Logs();
            //    return new SongFragment();
            /*case 1:
                return new PlaylistFragment();
            case 2:
                return new AlbumFragment();
            case 3:
                return new ArtistFragment();*/
        }
        return null;
    }

    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "WORKOUT";
             //   return "HOME";
            case 1:
               // return "WORKOUT";
                return "EXERCISES";
           // case 2:
            //    return "EXERCISES";
            //case 3:
             //   return "LOGS";
        }
        return null;
    }
}
