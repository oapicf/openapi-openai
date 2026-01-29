namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage

module RunStepDeltaStepDetailsToolCallsCodeOutputImageObject =

  //#region RunStepDeltaStepDetailsToolCallsCodeOutputImageObject

  [<CLIMutable>]
  type RunStepDeltaStepDetailsToolCallsCodeOutputImageObject = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "image")>]
    Image : RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;
  }

  //#endregion
