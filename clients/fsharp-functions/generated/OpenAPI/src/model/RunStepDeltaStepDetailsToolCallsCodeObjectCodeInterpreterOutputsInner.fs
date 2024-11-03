namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject

module RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner =

  //#region RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner

  [<CLIMutable>]
  type RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "logs")>]
    Logs : string;
    [<JsonProperty(PropertyName = "image")>]
    Image : RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;
  }

  //#endregion
