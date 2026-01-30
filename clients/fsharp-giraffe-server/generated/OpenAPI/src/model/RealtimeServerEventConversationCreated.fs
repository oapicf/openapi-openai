namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeServerEventConversationCreatedConversation

module RealtimeServerEventConversationCreated =

  //#region RealtimeServerEventConversationCreated

  //#region enums
  type TypeEnum = ConversationCreatedEnum of string  
  //#endregion

  type RealtimeServerEventConversationCreated = {
    EventId : string;
    Type : TypeEnum;
    Conversation : RealtimeServerEventConversationCreatedConversation;
  }
  //#endregion
