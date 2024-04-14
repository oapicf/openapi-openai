namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RunStepDetailsToolCallsRetrievalObject =

  //#region RunStepDetailsToolCallsRetrievalObject

  [<CLIMutable>]
  type RunStepDetailsToolCallsRetrievalObject = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "retrieval")>]
    Retrieval : obj;
  }

  //#endregion
