namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchErrors
open OpenAPI.Model.BatchRequestCounts

module Batch =

  //#region Batch

  [<CLIMutable>]
  type Batch = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "endpoint")>]
    Endpoint : string;
    [<JsonProperty(PropertyName = "errors")>]
    Errors : BatchErrors;
    [<JsonProperty(PropertyName = "input_file_id")>]
    InputFileId : string;
    [<JsonProperty(PropertyName = "completion_window")>]
    CompletionWindow : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "output_file_id")>]
    OutputFileId : string;
    [<JsonProperty(PropertyName = "error_file_id")>]
    ErrorFileId : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "in_progress_at")>]
    InProgressAt : int;
    [<JsonProperty(PropertyName = "expires_at")>]
    ExpiresAt : int;
    [<JsonProperty(PropertyName = "finalizing_at")>]
    FinalizingAt : int;
    [<JsonProperty(PropertyName = "completed_at")>]
    CompletedAt : int;
    [<JsonProperty(PropertyName = "failed_at")>]
    FailedAt : int;
    [<JsonProperty(PropertyName = "expired_at")>]
    ExpiredAt : int;
    [<JsonProperty(PropertyName = "cancelling_at")>]
    CancellingAt : int;
    [<JsonProperty(PropertyName = "cancelled_at")>]
    CancelledAt : int;
    [<JsonProperty(PropertyName = "request_counts")>]
    RequestCounts : BatchRequestCounts;
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
  }

  //#endregion
