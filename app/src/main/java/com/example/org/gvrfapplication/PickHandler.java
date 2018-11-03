package com.example.org.gvrfapplication;

import org.gearvrf.GVRPicker;
import org.gearvrf.GVRSceneObject;
import org.gearvrf.IPickEvents;

/**
 * Created by Aryan Singh on 11/3/2018.
 */

public class PickHandler implements IPickEvents {

    GVRSceneObject pickedObject = null;
    @Override
    public void onPick(GVRPicker picker) {
        GVRPicker.GVRPickedObject picked = picker.getPicked()[0];
        pickedObject = picked.hitObject;
        pickedObject.getRenderData().getMaterial().setDiffuseColor(1,0,1,0.5f);
    }

    @Override
    public void onNoPick(GVRPicker picker) {

        if(pickedObject != null){
            pickedObject.getRenderData().getMaterial().setDiffuseColor(1,0,1,0.5f);
        }
        pickedObject = null;
    }

    @Override
    public void onEnter(GVRSceneObject sceneObj, GVRPicker.GVRPickedObject collision) {

    }

    @Override
    public void onExit(GVRSceneObject sceneObj) {

    }

    @Override
    public void onInside(GVRSceneObject sceneObj, GVRPicker.GVRPickedObject collision) {

    }
}
