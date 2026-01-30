namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RealtimeResponseCreateParams

module RealtimeClientEventResponseCreate =

  //#region RealtimeClientEventResponseCreate

  [<CLIMutable>]
  type RealtimeClientEventResponseCreate = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "response")>]
    Response : RealtimeResponseCreateParams;
  }

  //#endregion
