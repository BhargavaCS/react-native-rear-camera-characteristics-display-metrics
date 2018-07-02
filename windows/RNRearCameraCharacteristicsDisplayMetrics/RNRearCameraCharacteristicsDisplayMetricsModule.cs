using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Rear.Camera.Characteristics.Display.Metrics.RNRearCameraCharacteristicsDisplayMetrics
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNRearCameraCharacteristicsDisplayMetricsModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNRearCameraCharacteristicsDisplayMetricsModule"/>.
        /// </summary>
        internal RNRearCameraCharacteristicsDisplayMetricsModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNRearCameraCharacteristicsDisplayMetrics";
            }
        }
    }
}
