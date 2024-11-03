namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FineTuningJobCheckpointMetrics

module FineTuningJobCheckpoint =

  //#region FineTuningJobCheckpoint

  [<CLIMutable>]
  type FineTuningJobCheckpoint = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "fine_tuned_model_checkpoint")>]
    FineTunedModelCheckpoint : string;
    [<JsonProperty(PropertyName = "step_number")>]
    StepNumber : int;
    [<JsonProperty(PropertyName = "metrics")>]
    Metrics : FineTuningJobCheckpointMetrics;
    [<JsonProperty(PropertyName = "fine_tuning_job_id")>]
    FineTuningJobId : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
  }

  //#endregion
