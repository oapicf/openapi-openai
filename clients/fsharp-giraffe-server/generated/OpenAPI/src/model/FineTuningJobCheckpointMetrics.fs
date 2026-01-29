namespace OpenAPI.Model

open System
open System.Collections.Generic

module FineTuningJobCheckpointMetrics =

  //#region FineTuningJobCheckpointMetrics


  type FineTuningJobCheckpoint_metrics = {
    Step : decimal;
    TrainLoss : decimal;
    TrainMeanTokenAccuracy : decimal;
    ValidLoss : decimal;
    ValidMeanTokenAccuracy : decimal;
    FullValidLoss : decimal;
    FullValidMeanTokenAccuracy : decimal;
  }
  //#endregion
