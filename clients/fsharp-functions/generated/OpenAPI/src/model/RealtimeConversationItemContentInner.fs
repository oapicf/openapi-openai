namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeConversationItemContentInner =

  //#region RealtimeConversationItemContentInner

  [<CLIMutable>]
  type RealtimeConversationItemContentInner = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "audio")>]
    Audio : string;
    [<JsonProperty(PropertyName = "transcript")>]
    Transcript : string;
  }

  //#endregion
