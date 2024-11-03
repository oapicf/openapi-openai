namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDetailsToolCallsCodeOutputImageObjectImage

module RunStepDetailsToolCallsCodeOutputImageObject =

  //#region RunStepDetailsToolCallsCodeOutputImageObject

  [<CLIMutable>]
  type RunStepDetailsToolCallsCodeOutputImageObject = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "image")>]
    Image : RunStepDetailsToolCallsCodeOutputImageObjectImage;
  }

  //#endregion
