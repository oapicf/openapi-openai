namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter

module RunStepDeltaStepDetailsToolCallsCodeObject =

  //#region RunStepDeltaStepDetailsToolCallsCodeObject

  [<CLIMutable>]
  type RunStepDeltaStepDetailsToolCallsCodeObject = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "code_interpreter")>]
    CodeInterpreter : RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter;
  }

  //#endregion
