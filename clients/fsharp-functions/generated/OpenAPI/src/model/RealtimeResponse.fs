namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RealtimeConversationItem
open OpenAPI.Model.RealtimeResponseStatusDetails
open OpenAPI.Model.RealtimeResponseUsage

module RealtimeResponse =

  //#region RealtimeResponse

  [<CLIMutable>]
  type RealtimeResponse = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "status_details")>]
    StatusDetails : RealtimeResponseStatusDetails;
    [<JsonProperty(PropertyName = "output")>]
    Output : RealtimeConversationItem[];
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
    [<JsonProperty(PropertyName = "usage")>]
    Usage : RealtimeResponseUsage;
  }

  //#endregion
