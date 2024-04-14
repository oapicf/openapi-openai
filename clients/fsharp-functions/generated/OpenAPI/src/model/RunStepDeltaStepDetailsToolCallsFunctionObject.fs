namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction

module RunStepDeltaStepDetailsToolCallsFunctionObject =

  //#region RunStepDeltaStepDetailsToolCallsFunctionObject

  [<CLIMutable>]
  type RunStepDeltaStepDetailsToolCallsFunctionObject = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "function")>]
    Function : RunStepDeltaStepDetailsToolCallsFunctionObjectFunction;
  }

  //#endregion
