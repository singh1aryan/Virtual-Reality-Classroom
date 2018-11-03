//package com.example.org.gvrfapplication;
//
//import android.view.KeyEvent;
//
//import com.example.org.gvrfapplication.R;
//
//import org.gearvrf.GVRAndroidResource;
//import org.gearvrf.GVRContext;
//import org.gearvrf.GVRCursorController;
//import org.gearvrf.GVRMesh;
//import org.gearvrf.GVRPhongShader;
//import org.gearvrf.GVRPicker;
//import org.gearvrf.GVRSceneObject;
//import org.gearvrf.GVRTexture;
//import org.gearvrf.IEvents;
//import org.gearvrf.io.CursorControllerListener;
//import org.gearvrf.io.GVRControllerType;
//import org.gearvrf.io.GVRInputManager;
//import org.gearvrf.scene_objects.GVRCubeSceneObject;
//import org.gearvrf.scene_objects.GVRGearControllerSceneObject;
//import org.gearvrf.utility.Log;
//
//public class Gvr {
//    private static GVRContext s_Context = null;
//    private static String TAG = "GVR Helper";
//    private static GVRPicker s_Picker;
//
//    public static void init(GVRContext context){
//        s_Context = context;
//
//        initControllers();
//    }
//
//    /***************************************
//     * Scene Objects
//     ***************************************/
//
//    public static GVRCubeSceneObject createCube(){
//        if (s_Context == null) {
//            Log.e(TAG, "GVRContext is not initialized");
//            return null;
//        }
//
//        GVRCubeSceneObject cube = new GVRCubeSceneObject(s_Context);
//        cube.getRenderData().setShaderTemplate(GVRPhongShader.class);
//        return cube;
//    }
//
//    public static GVRSceneObject createMesh(int meshID, int textureID) {
//        if (s_Context == null) {
//            Log.e(TAG, "GVRContext is not initialized");
//            return null;
//        }
//
//        GVRMesh mesh = s_Context.getAssetLoader().loadMesh(new GVRAndroidResource(s_Context, meshID));
//        GVRTexture texture = s_Context.getAssetLoader().loadTexture(new GVRAndroidResource(s_Context, textureID));
//        GVRSceneObject sceneObject = new GVRSceneObject(s_Context, mesh, texture);
//
//        return sceneObject;
//    }
//
//    public static GVRSceneObject createQuad(float width, float height, int textureID){
//        GVRSceneObject quad = new GVRSceneObject(s_Context,
//                s_Context.createQuad(width, height),
//                s_Context.getAssetLoader().loadTexture(new GVRAndroidResource(s_Context, textureID)));
//
//        return quad;
//    }
//
//    /***************************************
//     * Controllers
//     ***************************************/
//    //Listener for controller event
//    private static GVRCursorController.ControllerEventListener controllerEventListener = new
//            GVRCursorController.ControllerEventListener() {
//                @Override
//                public void onEvent(GVRCursorController gvrCursorController) {
//                    KeyEvent keyEvent = gvrCursorController.getKeyEvent();
//                    if(keyEvent != null){
////                        mPickHandler.setClicked(keyEvent.getAction() == KeyEvent.ACTION_DOWN);
//                    }
//                }
//            };
//
//    //Listener for add/removal of a controller
//    private static CursorControllerListener listener = new CursorControllerListener() {
//
//        @Override
//        public void onCursorControllerAdded(GVRCursorController controller) {
//
//            //Setup GearVR Controller
//            if (controller.getControllerType() == GVRControllerType.CONTROLLER) {
//                //Create cursor
//                GVRSceneObject cursor = createQuad(1f, 1f, R.raw.cursor);
//                cursor.getRenderData().setDepthTest(false);
//                cursor.getRenderData().setRenderingOrder(100000);
//
//                //Create GearController
//                GVRGearControllerSceneObject ctrObj = new GVRGearControllerSceneObject(s_Context);
//                ctrObj.setCursorController(controller);
//                ctrObj.setCursor(cursor);
//
//                //Setup picking
//                //Set a pick ray position(vec3) + direction(vec3)
//                s_Picker.setPickRay(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f);
//                ctrObj.setRayDepth(8.0f);
//                ctrObj.attachComponent(s_Picker);
//
//                controller.addControllerEventListener(controllerEventListener);
//
//            }else{
//                controller.setEnable(false);
//            }
//        }
//
//        @Override
//        public void onCursorControllerRemoved(GVRCursorController controller) {
//            if (controller.getControllerType() == GVRControllerType.CONTROLLER) {
//                controller.removeControllerEventListener(controllerEventListener);
//                controller.resetSceneObject();
//            }
//        }
//    };
//
//    private static void initControllers() {
//        s_Picker = new GVRPicker(s_Context, s_Context.getMainScene());
//
//        GVRInputManager input = s_Context.getInputManager();
//        input.addCursorControllerListener(listener);
//
//        //Add controller if detected any
//        for (GVRCursorController cursor : input.getCursorControllers()) {
//            listener.onCursorControllerAdded(cursor);
//        }
//    }
//
//}