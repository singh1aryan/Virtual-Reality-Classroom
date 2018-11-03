package com.example.org.gvrfapplication;

import android.view.MotionEvent;

import org.gearvrf.GVRContext;
import org.gearvrf.GVRMain;
import org.gearvrf.GVRMaterial;
import org.gearvrf.GVRSceneObject;
import org.gearvrf.scene_objects.GVRSphereSceneObject;
import org.gearvrf.scene_objects.GVRTextViewSceneObject;

/**
 * The Main Scene of the App
 */
public class MainScene extends GVRMain {

    GVRSceneObject mCube;
    GVRSphereSceneObject mSphere,mSphere1,mSphere2,mSphere3,mSphere4,mSphere5,
            mSphere6,mSphere7,mSphere8,mSphere9
    ;

    PickHandler pickHandler;


    private GVRVideoPlayerObject mPlayerObj = null;
    private GVRVideoPlayerObject1 mPlayerObj1 = null;
    private GVRVideoPlayerObject2 mPlayerObj2 = null;
    private GVRVideoPlayerObject3 mPlayerObj3 = null;
    private GVRVideoPlayerObject4 mPlayerObj4 = null;
    private GVRVideoPlayerObject5 mPlayerObj5 = null;
    private GVRVideoPlayerObject6 mPlayerObj6 = null;
    private GVRVideoPlayerObject7 mPlayerObj7 = null;
    private GVRVideoPlayerObject8 mPlayerObj8 = null;
    private GVRVideoPlayerObject9 mPlayerObj9 = null;
    private GVRVideoPlayerObject10 mPlayerObj10 = null;
    private GVRVideoPlayerObject11 mPlayerObj11 = null;
    private GVRVideoPlayerObject12 mPlayerObj12 = null;
    private GVRVideoPlayerObject13 mPlayerObj13 = null;
    private GVRVideoPlayerObject14 mPlayerObj14 = null;
    private GVRVideoPlayerObject15 mPlayerObj15 = null;
    private GVRVideoPlayerObject16 mPlayerObj16 = null;
    private GVRVideoPlayerObject17 mPlayerObj17 = null;
    private GVRVideoPlayerObject18 mPlayerObj18 = null;
    // z axis goes up down
    // y goes sideways and x goes through us


    GVRTextViewSceneObject text;

    @Override
    public void onInit(GVRContext gvrContext) throws Throwable {


        pickHandler = new PickHandler();

        GVRMaterial flatMaterial;
        flatMaterial = new GVRMaterial(gvrContext);
        flatMaterial.setColor(1.0f, 0.0f, 0.0f);

        //Create Sphere
//        mSphere = new GVRSphereSceneObject(gvrContext);
//        mSphere.getTransform().setPosition(-4, -3, -10);
//        mSphere.getTransform().setScale(0.5f,0.5f,0.5f);
//        mSphere.setName("1");
////        mSphere.getRenderData().setMaterial(flatMaterial);
//        gvrContext.getMainScene().addSceneObject(mSphere);
//
//        mSphere1 = new GVRSphereSceneObject(gvrContext);
//        mSphere1.getTransform().setPosition(-2, -3, -10);
//        mSphere1.getTransform().setScale(0.5f,0.5f,0.5f);
//        mSphere1.setName("2");
//        gvrContext.getMainScene().addSceneObject(mSphere1);
//
//        mSphere2 = new GVRSphereSceneObject(gvrContext);
//        mSphere2.getTransform().setPosition(0, -3, -10);
//        mSphere2.getTransform().setScale(0.5f,0.5f,0.5f);
//        mSphere2.setName("3");
//        gvrContext.getMainScene().addSceneObject(mSphere2);
//
//        mSphere3 = new GVRSphereSceneObject(gvrContext);
//        mSphere3.getTransform().setPosition(2, -3, -10);
//        mSphere3.getTransform().setScale(0.5f,0.5f,0.5f);
//        mSphere3.setName("4");
//        gvrContext.getMainScene().addSceneObject(mSphere3);
//
//        mSphere4 = new GVRSphereSceneObject(gvrContext);
//        mSphere4.getTransform().setPosition(4, -3, -10);
//        mSphere4.getTransform().setScale(0.5f,0.5f,0.5f);
//        mSphere4.setName("5");
//        gvrContext.getMainScene().addSceneObject(mSphere4);

//        mSphere5 = new GVRSphereSceneObject(gvrContext);
//        mSphere5.getTransform().setPosition(-4, -5, -10);
//        mSphere5.getTransform().setScale(0.5f,0.5f,0.5f);
//        mSphere5.setName("6");
//        gvrContext.getMainScene().addSceneObject(mSphere5);
//
//        mSphere6 = new GVRSphereSceneObject(gvrContext);
//        mSphere6.getTransform().setPosition(-2, -5, -10);
//        mSphere6.getTransform().setScale(0.5f,0.5f,0.5f);
//        mSphere6.setName("7");
//        gvrContext.getMainScene().addSceneObject(mSphere6);
//
//        mSphere7 = new GVRSphereSceneObject(gvrContext);
//        mSphere7.getTransform().setPosition(0, -5, -10);
//        mSphere7.getTransform().setScale(0.5f,0.5f,0.5f);
//        mSphere7.setName("8");
//        gvrContext.getMainScene().addSceneObject(mSphere7);
//
//        mSphere8 = new GVRSphereSceneObject(gvrContext);
//        mSphere8.getTransform().setPosition(2, -5, -10);
//        mSphere8.getTransform().setScale(0.5f,0.5f,0.5f);
//        mSphere8.setName("8");
//        gvrContext.getMainScene().addSceneObject(mSphere8);
//
//        mSphere9 = new GVRSphereSceneObject(gvrContext);
//        mSphere9.getTransform().setPosition(4, -5, -10);
//        mSphere9.getTransform().setScale(0.5f,0.5f,0.5f);
//        mSphere9.setName("8");
//        gvrContext.getMainScene().addSceneObject(mSphere9);


//        text = new GVRTextViewSceneObject(gvrContext,20,20,"Choose your channel");
//        text.setBackgroundColor(Color.RED);
//        text.getTransform().setPosition(0,-4,-8);

//
//        //Create Cube
//        mCube = new GVRCubeSceneObject(gvrContext);
//        mCube.getTransform().setPosition(-1, 0, -3);
//        gvrContext.getMainScene().addSceneObject(mCube);
//
//        /*******************
//         * Assign solid color to Sphere
//         ********************/
//        GVRMaterial flatMaterial;
//        flatMaterial = new GVRMaterial(gvrContext);
//        flatMaterial.setColor(1.0f, 1.0f, 1.0f);
//        mSphere.getRenderData().setMaterial(flatMaterial);


        /********************
         * Assign textured material to Cube
         *********************/
        //Load texture
//        GVRTexture texture = gvrContext.getAssetLoader().loadTexture(new GVRAndroidResource(gvrContext, R.raw.crate_wood));
//
//        GVRMaterial textureMaterial;
//        textureMaterial = new GVRMaterial(gvrContext);
//        textureMaterial.setMainTexture(texture);
//        mCube.getRenderData().setMaterial(textureMaterial);


//        GVRMesh dinoMesh = gvrContext.getAssetLoader().loadMesh(
//                new GVRAndroidResource(gvrContext, "trex_mesh.fbx")
//        );
////
////        GVRMesh board = gvrContext.getAssetLoader().loadMesh(
////                new GVRAndroidResource(gvrContext, "rec.fbx")
////        );
////
////
////
////
////        //Load Texture
//        GVRTexture dinoTexture = gvrContext.getAssetLoader().loadTexture(
//                new GVRAndroidResource(gvrContext, "trex_tex_diffuse.png")
//        );
//
//        //Create SceneObject
//        GVRSceneObject dinoObj = new GVRSceneObject(gvrContext, dinoMesh, dinoTexture);
//        // z = =10 is closer than z = -20
//        dinoObj.getTransform().setPosition(-6, -3, -10);
//        dinoObj.getTransform().rotateByAxis(-80, 1f, 0f, 0f);
//        gvrContext.getMainScene().addSceneObject(dinoObj);

//
//        GVRSceneObject boardObj = new GVRSceneObject(gvrContext,board);
//        boardObj.getTransform().setPosition(0 ,0,-20);
//        boardObj.getTransform().rotateByAxis(90, 1f, 0f, 0f);
//        boardObj.getTransform().setScale(0.5f,0.5f,0.5f);
//        gvrContext.getMainScene().addSceneObject(boardObj);



        /**************************
         * Create Light
         **************************/
//        GVRPointLight pointLight;
//        pointLight = new GVRPointLight(gvrContext);
//        pointLight.setDiffuseIntensity(0.9f, 0.7f, 0.7f, 1.0f);
//
//        GVRSceneObject lightNode = new GVRSceneObject(gvrContext);
//        lightNode.getTransform().setPosition(0,0,0);
//        lightNode.attachLight(pointLight);
//
//        gvrContext.getMainScene().addSceneObject(lightNode);

        mPlayerObj = new GVRVideoPlayerObject(gvrContext);
        mPlayerObj.loadVideo("vid2.mp4");
        mPlayerObj.setLooping(true);
        mPlayerObj.play();

        mPlayerObj1 = new GVRVideoPlayerObject1(gvrContext);
        mPlayerObj1.loadVideo("vid1.mp4");
        mPlayerObj1.setLooping(true);
        mPlayerObj1.play();

        mPlayerObj2 = new GVRVideoPlayerObject2(gvrContext);
        mPlayerObj2.loadVideo("vid3.mp4");
        mPlayerObj2.setLooping(true);
        mPlayerObj2.play();

        mPlayerObj3 = new GVRVideoPlayerObject3(gvrContext);
        mPlayerObj3.loadVideo("vid4.mp4");
        mPlayerObj3.setLooping(true);
        mPlayerObj3.play();

        mPlayerObj4 = new GVRVideoPlayerObject4(gvrContext);
        mPlayerObj4.loadVideo("vid1.mp4");
        mPlayerObj4.setLooping(true);
        mPlayerObj4.play();

        mPlayerObj5 = new GVRVideoPlayerObject5(gvrContext);
        mPlayerObj5.loadVideo("vid2.mp4");
        mPlayerObj5.setLooping(true);
        mPlayerObj5.play();

        mPlayerObj6 = new GVRVideoPlayerObject6(gvrContext);
        mPlayerObj6.loadVideo("vid2.mp4");
        mPlayerObj6.setLooping(true);
        mPlayerObj6.play();

        mPlayerObj7 = new GVRVideoPlayerObject7(gvrContext);
        mPlayerObj7.loadVideo("vid5.mp4");
        mPlayerObj7.setLooping(true);
        mPlayerObj7.play();

        mPlayerObj8 = new GVRVideoPlayerObject8(gvrContext);
        mPlayerObj8.loadVideo("vid5.mp4");
        mPlayerObj8.setLooping(true);
        mPlayerObj8.play();

        mPlayerObj9 = new GVRVideoPlayerObject9(gvrContext);
        mPlayerObj9.loadVideo("vid1.mp4");
        mPlayerObj9.setLooping(true);
        mPlayerObj9.play();

        mPlayerObj10 = new GVRVideoPlayerObject10(gvrContext);
        mPlayerObj10.loadVideo("vid2.mp4");
        mPlayerObj10.setLooping(true);
        mPlayerObj10.play();

        mPlayerObj11 = new GVRVideoPlayerObject11(gvrContext);
        mPlayerObj11.loadVideo("vid5.mp4");
        mPlayerObj11.setLooping(true);
        mPlayerObj11.play();

        mPlayerObj12 = new GVRVideoPlayerObject12(gvrContext);
        mPlayerObj12.loadVideo("vid4.mp4");
        mPlayerObj12.setLooping(true);
        mPlayerObj12.play();

        mPlayerObj13 = new GVRVideoPlayerObject13(gvrContext);
        mPlayerObj13.loadVideo("vid5.mp4");
        mPlayerObj13.setLooping(true);
        mPlayerObj13.play();

        mPlayerObj14 = new GVRVideoPlayerObject14(gvrContext);
        mPlayerObj14.loadVideo("vid2.mp4");
        mPlayerObj14.setLooping(true);
        mPlayerObj14.play();

        mPlayerObj15 = new GVRVideoPlayerObject15(gvrContext);
        mPlayerObj15.loadVideo("vid5.mp4");
        mPlayerObj15.setLooping(true);
        mPlayerObj15.play();

        mPlayerObj16 = new GVRVideoPlayerObject16(gvrContext);
        mPlayerObj16.loadVideo("vid1.mp4");
        mPlayerObj16.setLooping(true);
        mPlayerObj16.play();

        mPlayerObj17 = new GVRVideoPlayerObject17(gvrContext);
        mPlayerObj17.loadVideo("vid5.mp4");
        mPlayerObj17.setLooping(true);
        mPlayerObj17.play();

        mPlayerObj18 = new GVRVideoPlayerObject18(gvrContext);
        mPlayerObj18.loadVideo("vid3.mp4");
        mPlayerObj18.setLooping(true);
        mPlayerObj18.play();


        gvrContext.getMainScene().addSceneObject(mPlayerObj);
        gvrContext.getMainScene().addSceneObject(mPlayerObj1);
        gvrContext.getMainScene().addSceneObject(mPlayerObj2);
        gvrContext.getMainScene().addSceneObject(mPlayerObj3);
        gvrContext.getMainScene().addSceneObject(mPlayerObj4);
        gvrContext.getMainScene().addSceneObject(mPlayerObj5);
        gvrContext.getMainScene().addSceneObject(mPlayerObj6);
        gvrContext.getMainScene().addSceneObject(mPlayerObj7);
        gvrContext.getMainScene().addSceneObject(mPlayerObj8);
        gvrContext.getMainScene().addSceneObject(mPlayerObj9);
        gvrContext.getMainScene().addSceneObject(mPlayerObj10);
        gvrContext.getMainScene().addSceneObject(mPlayerObj11);
        gvrContext.getMainScene().addSceneObject(mPlayerObj12);
        gvrContext.getMainScene().addSceneObject(mPlayerObj13);
        gvrContext.getMainScene().addSceneObject(mPlayerObj14);
        gvrContext.getMainScene().addSceneObject(mPlayerObj15);
        gvrContext.getMainScene().addSceneObject(mPlayerObj16);
        gvrContext.getMainScene().addSceneObject(mPlayerObj17);
        gvrContext.getMainScene().addSceneObject(mPlayerObj18);
    }

    @Override
    public SplashMode getSplashMode() {
        return SplashMode.NONE;
    }

    @Override
    public void onStep() {
        //Rotate the cube along the Y axis
    }

    public void onResume() {
        if (mPlayerObj != null)
            mPlayerObj.onResume();
    }

    public void onPause() {
        if (mPlayerObj != null)
            mPlayerObj.loadVideo("vid1.mp4");
            mPlayerObj.play();
    }

    public void onTouchEvent(MotionEvent event){
        switch (event.getAction() & MotionEvent.ACTION_MASK)
        {
            case MotionEvent.ACTION_BUTTON_PRESS:
            if(pickHandler.pickedObject != null){
                pickHandler.pickedObject.getRenderData().getMaterial().setDiffuseColor(0,0,1,1);
            }
            break;
            default:
                break;
        }
    }

    public void onDestroy(){
        mPlayerObj.loadVideo("vid2.mp4");
        mPlayerObj.play();
    }

}