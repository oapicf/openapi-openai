namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RealtimeResponseStatusDetailsError

module RealtimeResponseStatusDetails =

  //#region RealtimeResponseStatusDetails

  [<CLIMutable>]
  type RealtimeResponseStatusDetails = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "reason")>]
    Reason : string;
    [<JsonProperty(PropertyName = "error")>]
    Error : RealtimeResponseStatusDetailsError;
  }

  //#endregion
