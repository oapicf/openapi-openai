namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeServerEventConversationCreatedConversation =

  //#region RealtimeServerEventConversationCreatedConversation

  [<CLIMutable>]
  type RealtimeServerEventConversationCreatedConversation = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
  }

  //#endregion
