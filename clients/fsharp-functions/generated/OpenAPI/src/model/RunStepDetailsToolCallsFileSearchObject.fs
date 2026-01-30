namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDetailsToolCallsFileSearchObjectFileSearch

module RunStepDetailsToolCallsFileSearchObject =

  //#region RunStepDetailsToolCallsFileSearchObject

  [<CLIMutable>]
  type RunStepDetailsToolCallsFileSearchObject = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "file_search")>]
    FileSearch : RunStepDetailsToolCallsFileSearchObjectFileSearch;
  }

  //#endregion
