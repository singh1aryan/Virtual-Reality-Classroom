package com.example.org.gvrfapplication;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;

import org.gearvrf.GVRAndroidResource;
import org.gearvrf.GVRContext;
import org.gearvrf.GVRMesh;
import org.gearvrf.GVRSceneObject;
import org.gearvrf.scene_objects.GVRCubeSceneObject;
import org.gearvrf.scene_objects.GVRSphereSceneObject;
import org.gearvrf.scene_objects.GVRVideoSceneObject;
import org.gearvrf.scene_objects.GVRVideoSceneObjectPlayer;

import java.io.IOException;

public class GVRVideoPlayerObject4 extends GVRSceneObject{

    private final GVRVideoSceneObjectPlayer<?> mPlayer;
    private final MediaPlayer mMediaPlayer;

    public GVRVideoPlayerObject4(GVRContext gvrContext) throws IOException {
        super(gvrContext);

        GVRSphereSceneObject sphere = new GVRSphereSceneObject(gvrContext, 72, 144, false);
        //GVRMesh mesh = sphere.getRenderData().getMesh();

        GVRCubeSceneObject cubeSceneObject = new GVRCubeSceneObject(gvrContext,true);
        GVRMesh mesh = cubeSceneObject.getRenderData().getMesh();

        GVRCubeSceneObject cubeSceneObject1 = new GVRCubeSceneObject(gvrContext,true);
        GVRMesh mesh1 = cubeSceneObject1.getRenderData().getMesh();

//        GVRMesh board = gvrContext.getAssetLoader().loadMesh(
//                new GVRAndroidResource(gvrContext, "rec.fbx")
//        );
//        GVRSceneObject dinoObj = new GVRSceneObject(gvrContext, board);
//        dinoObj.getTransform().setPosition(0,0,-10);
//        dinoObj.getTransform().rotateByAxis(-90, 1f, 0f, 0f);
//        gvrContext.getMainScene().addSceneObject(dinoObj);

        mMediaPlayer = new MediaPlayer();
        mPlayer = GVRVideoSceneObject.makePlayerInstance(mMediaPlayer);

        GVRVideoSceneObject video = new GVRVideoSceneObject(gvrContext, mesh, mPlayer, GVRVideoSceneObject.GVRVideoType.MONO);
        video.setName("0");
        video.getTransform().setPosition(0,5,-15);
        video.getTransform().setScale(10f, 5f, 5f);

        addChildObject(video);
    }

    public void loadVideo(String fileName) {
        final AssetFileDescriptor afd;
        try {
            afd = this.getGVRContext().getContext().getAssets().openFd(fileName);
            mMediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            afd.close();
            mMediaPlayer.prepare();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void play() {
        if(mMediaPlayer != null) {
            mMediaPlayer.start();
        }
    }

    public void setLooping(boolean value) {
        mMediaPlayer.setLooping(value);
    }

    public void onPause() {
        mMediaPlayer.pause();
    }

    public void onResume() {
        mMediaPlayer.start();
    }
}