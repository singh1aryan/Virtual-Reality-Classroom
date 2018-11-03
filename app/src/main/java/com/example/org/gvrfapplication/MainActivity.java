package com.example.org.gvrfapplication;

import android.os.Bundle;
import android.view.MotionEvent;

import org.gearvrf.GVRActivity;
import org.gearvrf.GVRAndroidResource;
import org.gearvrf.GVRBillboard;
import org.gearvrf.GVRContext;
import org.gearvrf.GVRMain;
import org.gearvrf.GVRSceneObject;
import org.gearvrf.GVRTexture;
import org.joml.Vector3f;


public class MainActivity extends GVRActivity {


    MainScene main;
    private GVRSceneObject mNode;
    private GVRSceneObject mTrexObj;
    private float mDir = 0.1f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * Set Main Scene
         * It will be displayed when app starts
         */
        main = new MainScene();
        setMain(new MainScene());
    }

    private final class Main extends GVRMain {

        @Override
        public void onInit(GVRContext gvrContext) throws Throwable {

            //Load texture
//            GVRTexture texture = gvrContext.getAssetLoader().loadTexture(new GVRAndroidResource(gvrContext, R.drawable.__default_splash_screen__));
//
//            //Create a rectangle with the texture we just loaded
//            GVRSceneObject quad = new GVRSceneObject(gvrContext, 4, 2, texture);
//            quad.getTransform().setPosition(0, 0, -3);
//
//            //Add rectangle to the scene
//            gvrContext.getMainScene().addSceneObject(quad);
            //Load texture
//            GVRTexture texture = gvrContext.getAssetLoader().loadTexture(new GVRAndroidResource(gvrContext, R.drawable.__default_splash_screen__));
//
//            //Create a rectangle with the texture we just loaded
//            GVRSceneObject quad = new GVRSceneObject(gvrContext, 4, 2, texture);
//            quad.getTransform().setPosition(0, 0, -3);
//
//            //Add rectangle to the scene
//            gvrContext.getMainScene().addSceneObject(quad);
//
//            mNode = new GVRSceneObject(gvrContext);
//            gvrContext.getMainScene().addSceneObject(mNode);

        }

        @Override
        public SplashMode getSplashMode() {
            return SplashMode.NONE;
        }

        @Override
        public void onStep() {
            //Add update logic here
//
//            float oldPosX = mTrexObj.getTransform().getPositionX();
//            if (Math.abs(oldPosX) > 10){
//                mDir = -mDir;
//            }
//
//            mTrexObj.getTransform().setPositionX(oldPosX + mDir);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        main.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        main.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        main.onDestroy();
    }

    //
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        main.onTouchEvent(event);
//        return super.onTouchEvent(event);
//    }
}
