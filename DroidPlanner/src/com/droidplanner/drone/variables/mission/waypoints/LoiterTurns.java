package com.droidplanner.drone.variables.mission.waypoints;

import com.droidplanner.fragments.markers.MarkerManager.MarkerSource;
import com.droidplanner.fragments.mission.MissionFragment;
import com.droidplanner.fragments.mission.MissionLoiterTFragment;
import com.google.android.gms.maps.model.LatLng;

public class LoiterTurns extends Loiter implements MarkerSource {
	private int turns;
	
	public LoiterTurns(LatLng coord, double altitude) {
		super(coord, altitude);
	}

	public int getTurns() {
		return turns;
	}

	public void setTurns(int turns) {
		this.turns = turns;
	}
	
	@Override
	public MissionFragment getDialog() {
		return new MissionLoiterTFragment();
	}
}