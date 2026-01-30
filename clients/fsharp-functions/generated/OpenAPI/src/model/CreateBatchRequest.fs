namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open System.Collections.Generic

module CreateBatchRequest =

  //#region CreateBatchRequest

  [<CLIMutable>]
  type CreateBatchRequest = {
    [<JsonProperty(PropertyName = "input_file_id")>]
    InputFileId : string;
    [<JsonProperty(PropertyName = "endpoint")>]
    Endpoint : string;
    [<JsonProperty(PropertyName = "completion_window")>]
    CompletionWindow : string;
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : IDictionary<string, string>;
  }

  //#endregion
