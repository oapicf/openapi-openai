namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeServerEventResponseTextDone =

  //#region RealtimeServerEventResponseTextDone

  [<CLIMutable>]
  type RealtimeServerEventResponseTextDone = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "response_id")>]
    ResponseId : string;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "output_index")>]
    OutputIndex : int;
    [<JsonProperty(PropertyName = "content_index")>]
    ContentIndex : int;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
  }

  //#endregion
