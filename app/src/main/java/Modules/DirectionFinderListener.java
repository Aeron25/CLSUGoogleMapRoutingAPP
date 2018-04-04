package Modules;
/**
 * Created by Aeron on 27/03/2018.
 */

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

import Modules.Route;

public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}