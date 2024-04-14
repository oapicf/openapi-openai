namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepCompletionUsage
open OpenAPI.Model.RunStepObjectLastError
open OpenAPI.Model.RunStepObjectStepDetails
open OpenAPI.Model.int option

module RunStepObject =

  //#region RunStepObject

  [<CLIMutable>]
  type RunStepObject = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "assistant_id")>]
    AssistantId : string;
    [<JsonProperty(PropertyName = "thread_id")>]
    ThreadId : string;
    [<JsonProperty(PropertyName = "run_id")>]
    RunId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "step_details")>]
    StepDetails : RunStepObjectStepDetails;
    [<JsonProperty(PropertyName = "last_error")>]
    LastError : RunStepObjectLastError;
    [<JsonProperty(PropertyName = "expired_at")>]
    ExpiredAt : int option;
    [<JsonProperty(PropertyName = "cancelled_at")>]
    CancelledAt : int option;
    [<JsonProperty(PropertyName = "failed_at")>]
    FailedAt : int option;
    [<JsonProperty(PropertyName = "completed_at")>]
    CompletedAt : int option;
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
    [<JsonProperty(PropertyName = "usage")>]
    Usage : RunStepCompletionUsage;
  }

  //#endregion
