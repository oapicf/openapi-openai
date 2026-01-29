namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDetailsToolCallsFunctionObjectFunction

module RunStepDetailsToolCallsFunctionObject =

  //#region RunStepDetailsToolCallsFunctionObject

  [<CLIMutable>]
  type RunStepDetailsToolCallsFunctionObject = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "function")>]
    Function : RunStepDetailsToolCallsFunctionObjectFunction;
  }

  //#endregion
