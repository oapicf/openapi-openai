namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RunStepDeltaStepDetailsToolCallsFileSearchObject =

  //#region RunStepDeltaStepDetailsToolCallsFileSearchObject

  [<CLIMutable>]
  type RunStepDeltaStepDetailsToolCallsFileSearchObject = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "file_search")>]
    FileSearch : obj;
  }

  //#endregion
