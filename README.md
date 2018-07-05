
# react-native-rear-camera-characteristics-display-metrics

## Getting started

`$ npm install react-native-rear-camera-characteristics-display-metrics --save`

### Mostly automatic installation

`$ react-native link react-native-rear-camera-characteristics-display-metrics`

### Manual installation

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNRearCameraCharacteristicsDisplayMetricsPackage;` to the imports at the top of the file
  - Add `new RNRearCameraCharacteristicsDisplayMetricsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-rear-camera-characteristics-display-metrics'
  	project(':react-native-rear-camera-characteristics-display-metrics').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-rear-camera-characteristics-display-metrics/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-rear-camera-characteristics-display-metrics')
  	```

## Available Constants
```
FOCAL_LENGTH
SENSOR_HEIGHT
SENSOR_WIDTH
DISPLAY_METRICS_Density
DISPLAY_METRICS_DensityDPI
DISPLAY_METRICS_HeightPixels
DISPLAY_METRICS_WidthPixels
DISPLAY_METRICS_ScaledDensity
DISPLAY_METRICS_Xdpi
DISPLAY_METRICS_Ydpi
```

## Usage
```javascript
import RNRearCameraCharacteristicsDisplayMetrics from 'react-native-rear-camera-characteristics-display-metrics';

// TODO: What to do with the module?
<Text>
  ....
  {RNRearCameraCharacteristicsDisplayMetrics.FOCAL_LENGTH}
  {RNRearCameraCharacteristicsDisplayMetrics.DISPLAY_METRICS_Density}
  .....
<Text>
```
  
