package org.skylinerobitics.myapplication;

import android.app.Activity;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.*;
import org.w3c.dom.Text;


public class MyActivity extends Activity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        getActionBar().setDisplayShowHomeEnabled(false);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));

    }
    public void blueIB1(View v){
        FragmentManager fragmentManager = getFragmentManager();
        teamInfo teamInfoInit = new teamInfo();
        teamInfoInit.teamnumber = "3322";
        teamInfoInit.failures = "0";
        teamInfoInit.fouls = "0";
        teamInfoInit.techFouls = "0";
        teamInfoInit.winPerc = "87";
        teamInfoInit.teamRole = "Shooter";
        teamInfoInit.driveTrain = "Mechanum";
        fragmentManager.beginTransaction()
                .replace(R.id.container, teamInfoInit).addToBackStack("tag").commit();

    }
    public void blueIB2(View v){
        FragmentManager fragmentManager = getFragmentManager();
        teamInfo teamInfoInit = new teamInfo();
        teamInfoInit.teamnumber = "830";
        teamInfoInit.failures = "1";
        teamInfoInit.fouls = "0";
        teamInfoInit.techFouls = "0";
        teamInfoInit.winPerc = "76";
        teamInfoInit.teamRole = "Shooter";
        teamInfoInit.driveTrain = "Mechanum";
        fragmentManager.beginTransaction()
                .replace(R.id.container, teamInfoInit).addToBackStack("tag").commit();
    }
    public void blueIB3(View v){
        FragmentManager fragmentManager = getFragmentManager();
        teamInfo teamInfoInit = new teamInfo();
        teamInfoInit.teamnumber = "67";
        teamInfoInit.failures = "0";
        teamInfoInit.fouls = "0";
        teamInfoInit.techFouls = "0";
        teamInfoInit.winPerc = "92";
        teamInfoInit.teamRole = "Shooter";
        teamInfoInit.driveTrain = "Mechanum";
        fragmentManager.beginTransaction()
                .replace(R.id.container, teamInfoInit).addToBackStack("tag").commit();
    }
    public void redIB1(View v){
        FragmentManager fragmentManager = getFragmentManager();
        teamInfo teamInfoInit = new teamInfo();
        teamInfoInit.teamnumber = "27";
        teamInfoInit.failures = "2";
        teamInfoInit.fouls = "1";
        teamInfoInit.techFouls = "0";
        teamInfoInit.winPerc = "64";
        teamInfoInit.teamRole = "Shooter";
        teamInfoInit.driveTrain = "Mechanum";
        fragmentManager.beginTransaction()
                .replace(R.id.container, teamInfoInit).addToBackStack("tag").commit();
    }
    public void redIB2(View v){
        FragmentManager fragmentManager = getFragmentManager();
        teamInfo teamInfoInit = new teamInfo();
        teamInfoInit.teamnumber = "33";
        teamInfoInit.failures = "2";
        teamInfoInit.fouls = "0";
        teamInfoInit.techFouls = "1";
        teamInfoInit.winPerc = "53";
        teamInfoInit.teamRole = "Shooter";
        teamInfoInit.driveTrain = "Mechanum";
        fragmentManager.beginTransaction()
                .replace(R.id.container, teamInfoInit).addToBackStack("tag").commit();
    }
    public void redIB3(View v){
        FragmentManager fragmentManager = getFragmentManager();
        teamInfo teamInfoInit = new teamInfo();
        teamInfoInit.teamnumber = "503";
        teamInfoInit.failures = "0";
        teamInfoInit.fouls = "0";
        teamInfoInit.techFouls = "0";
        teamInfoInit.winPerc = "47";
        teamInfoInit.teamRole = "Shooter";
        teamInfoInit.driveTrain = "Mechanum";
        fragmentManager.beginTransaction()
                .replace(R.id.container, teamInfoInit).addToBackStack("tag").commit();
    }
    public void onSectionAttached(int number) {
        switch (number) {
            case 0:
                mTitle = "Blue Teams";
                break;
            case 1:
                mTitle = "Red Teams";
                break;
        }
    }
    FragmentManager fragmentManager = getFragmentManager();

    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        fragmentManager = getFragmentManager();
        switch(position){
        case 0:
            bluFrag view1 = new bluFrag();
               fragmentManager.beginTransaction()
                    .replace(R.id.container, view1)
                    .commit();
            break;
        case 1:
            redFrag view2 = new redFrag();
            fragmentManager.beginTransaction()
                    .replace(R.id.container, view2)
                    .commit();
            break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.my, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_my, container, false);
            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((MyActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

}
