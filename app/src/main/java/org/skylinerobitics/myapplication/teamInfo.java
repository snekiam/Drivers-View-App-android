package org.skylinerobitics.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Miles on 11/1/2014.
 */
public class teamInfo extends Fragment {
    public String teamnumber;
    public String failures;
    public String techFouls;
    public String fouls;
    public String winPerc;
    public String teamRole;
    public String driveTrain;
    public teamInfo(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container
            ,Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.teaminfo, container, false);
        TextView teamInfo = (TextView) rootView.findViewById(R.id.teamNumberInfo);
        TextView winPercent = (TextView) rootView.findViewById(R.id.winPercData);
        TextView techFoul = (TextView) rootView.findViewById(R.id.techFoulData);
        TextView foul = (TextView) rootView.findViewById(R.id.foulData);
        TextView fails = (TextView) rootView.findViewById(R.id.failData);
        TextView role = (TextView) rootView.findViewById(R.id.teamRole);
        TextView drive = (TextView) rootView.findViewById(R.id.driveType);
        teamInfo.setText(teamnumber);
        winPercent.setText(winPerc);
        techFoul.setText(techFouls);
        foul.setText(fouls);
        fails.setText(failures);
        role.setText(teamRole);
        drive.setText(driveTrain);
        return rootView;
    }
}