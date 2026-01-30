namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDetailsToolCallsCodeObject
open OpenAPI.Model.RunStepDetailsToolCallsCodeObjectCodeInterpreter
open OpenAPI.Model.RunStepDetailsToolCallsFileSearchObject
open OpenAPI.Model.RunStepDetailsToolCallsFileSearchObjectFileSearch
open OpenAPI.Model.RunStepDetailsToolCallsFunctionObject
open OpenAPI.Model.RunStepDetailsToolCallsFunctionObjectFunction

module RunStepDetailsToolCallsObjectToolCallsInner =

  //#region RunStepDetailsToolCallsObjectToolCallsInner

  [<CLIMutable>]
  type RunStepDetailsToolCallsObjectToolCallsInner = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "code_interpreter")>]
    CodeInterpreter : RunStepDetailsToolCallsCodeObjectCodeInterpreter;
    [<JsonProperty(PropertyName = "file_search")>]
    FileSearch : RunStepDetailsToolCallsFileSearchObjectFileSearch;
    [<JsonProperty(PropertyName = "function")>]
    Function : RunStepDetailsToolCallsFunctionObjectFunction;
  }

  //#endregion
