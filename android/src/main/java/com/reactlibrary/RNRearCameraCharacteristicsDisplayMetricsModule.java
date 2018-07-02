
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import java.util.Map;
import java.util.HashMap;

import android.util.DisplayMetrics;
import android.widget.Toast;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;


public class RNRearCameraCharacteristicsDisplayMetricsModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNRearCameraCharacteristicsDisplayMetricsModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNRearCameraCharacteristicsDisplayMetrics";
  }

  @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();
    double focalLength = 4.12F, sensorHeight = 3.14, sensorWidth = 4.9, xdpi = 295, ydpi = 295;
    DisplayMetrics displayMetrics=null;
    try{
      displayMetrics = getReactApplicationContext().getResources().getDisplayMetrics();
      CameraManager mCameraManager = (CameraManager) getReactApplicationContext().getSystemService(Context.CAMERA_SERVICE);
      CameraCharacteristics cameraCharacteristics = mCameraManager.getCameraCharacteristics("0");
      focalLength = cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS)[0];
      sensorHeight = cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE).getHeight();
      sensorWidth = cameraCharacteristics.get(cameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE).getWidth();
    }
    catch(Exception e){
        Toast.makeText(getReactApplicationContext(),"Exception "+e,Toast.LENGTH_SHORT).show();
    }
    finally{
      constants.put("FOCAL_LENGTH",focalLength);
      constants.put("SENSOR_HEIGHT",sensorHeight);
      constants.put("SENSOR_WIDTH",sensorWidth);
      constants.put("DISPLAY_METRICS_Density",displayMetrics.density);
      constants.put("DISPLAY_METRICS_DensityDPI",displayMetrics.densityDpi);
      constants.put("DISPLAY_METRICS_HeightPixels",displayMetrics.heightPixels);
      constants.put("DISPLAY_METRICS_WidthPixels",displayMetrics.widthPixels);
      constants.put("DISPLAY_METRICS_ScaledDensity",displayMetrics.scaledDensity);
      constants.put("DISPLAY_METRICS_Xdpi",displayMetrics.xdpi);
      constants.put("DISPLAY_METRICS_Ydpi",displayMetrics.ydpi);
    }
    return constants;
  }
}