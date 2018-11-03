package com.example.org.gvrfapplication;

import org.gearvrf.GVRAndroidResource;
import org.gearvrf.GVRContext;
import org.gearvrf.GVRMain;
import org.gearvrf.GVRMaterial;
import org.gearvrf.GVRMesh;
import org.gearvrf.GVRObjectPicker;
import org.gearvrf.GVRPointLight;
import org.gearvrf.GVRSceneObject;
import org.gearvrf.GVRTexture;
import org.gearvrf.scene_objects.GVRCubeSceneObject;
import org.gearvrf.scene_objects.GVRSphereSceneObject;

/**
 * The Main Scene of the App
 */
public class MainScene extends GVRMain {

    GVRSceneObject mCube;
    GVRSphereSceneObject mSphere;


    private GVRVideoPlayerObject mPlayerObj = null;
    // z axis goes up down
    // y goes sideways and x goes through us

    @Override
    public void onInit(GVRContext gvrContext) throws Throwable {

        //Create Sphere
//        mSphere = new GVRSphereSceneObject(gvrContext);
//        mSphere.getTransform().setPosition(1, 0, -3);
//        gvrContext.getMainScene().addSceneObject(mSphere);
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
//
//        GVRMesh board = gvrContext.getAssetLoader().loadMesh(
//                new GVRAndroidResource(gvrContext, "rec.fbx")
//        );
//
//
//
//
//        //Load Texture
//        GVRTexture dinoTexture = gvrContext.getAssetLoader().loadTexture(
//                new GVRAndroidResource(gvrContext, "trex_tex_diffuse.png")
//        );

        //Create SceneObject
//        GVRSceneObject dinoObj = new GVRSceneObject(gvrContext, dinoMesh, dinoTexture);
//        // z = =10 is closer than z = -20
//        dinoObj.getTransform().setPosition(0.0f, 0.0f, -20f);
//        dinoObj.getTransform().rotateByAxis(-90, 1f, 0f, 0f);
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
        mPlayerObj.loadVideo("One Minute Math Challenge_2dp.mp4");
        mPlayerObj.setLooping(true);
        mPlayerObj.play();

        gvrContext.getMainScene().addSceneObject(mPlayerObj);
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
            mPlayerObj.onPause();
    }
}