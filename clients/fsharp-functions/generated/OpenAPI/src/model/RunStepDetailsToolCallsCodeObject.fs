namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDetailsToolCallsCodeObjectCodeInterpreter

module RunStepDetailsToolCallsCodeObject =

  //#region RunStepDetailsToolCallsCodeObject

  [<CLIMutable>]
  type RunStepDetailsToolCallsCodeObject = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "code_interpreter")>]
    CodeInterpreter : RunStepDetailsToolCallsCodeObjectCodeInterpreter;
  }

  //#endregion
