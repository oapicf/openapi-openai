namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsCodeObject
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsFileSearchObject
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsFunctionObject
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction

module RunStepDeltaStepDetailsToolCallsObjectToolCallsInner =

  //#region RunStepDeltaStepDetailsToolCallsObjectToolCallsInner

  [<CLIMutable>]
  type RunStepDeltaStepDetailsToolCallsObjectToolCallsInner = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "code_interpreter")>]
    CodeInterpreter : RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter;
    [<JsonProperty(PropertyName = "file_search")>]
    FileSearch : obj;
    [<JsonProperty(PropertyName = "function")>]
    Function : RunStepDeltaStepDetailsToolCallsFunctionObjectFunction;
  }

  //#endregion
