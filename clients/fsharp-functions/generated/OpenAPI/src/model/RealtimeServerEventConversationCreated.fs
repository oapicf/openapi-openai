namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RealtimeServerEventConversationCreatedConversation

module RealtimeServerEventConversationCreated =

  //#region RealtimeServerEventConversationCreated

  [<CLIMutable>]
  type RealtimeServerEventConversationCreated = {
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "conversation")>]
    Conversation : RealtimeServerEventConversationCreatedConversation;
  }

  //#endregion
