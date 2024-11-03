namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.FineTuningJobCheckpointMetrics

module FineTuningJobCheckpoint =

  //#region FineTuningJobCheckpoint

  //#region enums
  type ObjectEnum = FineTuningJobCheckpointEnum of string  
  //#endregion

  type FineTuningJobCheckpoint = {
    Id : string;
    CreatedAt : int;
    FineTunedModelCheckpoint : string;
    StepNumber : int;
    Metrics : FineTuningJobCheckpointMetrics;
    FineTuningJobId : string;
    Object : ObjectEnum;
  }
  //#endregion
