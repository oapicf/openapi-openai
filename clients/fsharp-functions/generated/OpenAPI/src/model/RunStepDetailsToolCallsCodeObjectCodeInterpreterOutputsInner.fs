namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDetailsToolCallsCodeOutputImageObject
open OpenAPI.Model.RunStepDetailsToolCallsCodeOutputImageObjectImage
open OpenAPI.Model.RunStepDetailsToolCallsCodeOutputLogsObject

module RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner =

  //#region RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner

  [<CLIMutable>]
  type RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "logs")>]
    Logs : string;
    [<JsonProperty(PropertyName = "image")>]
    Image : RunStepDetailsToolCallsCodeOutputImageObjectImage;
  }

  //#endregion
