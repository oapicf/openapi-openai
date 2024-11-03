namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RunStepDeltaStepDetailsToolCallsRetrievalObject =

  //#region RunStepDeltaStepDetailsToolCallsRetrievalObject

  [<CLIMutable>]
  type RunStepDeltaStepDetailsToolCallsRetrievalObject = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "retrieval")>]
    Retrieval : obj;
  }

  //#endregion
