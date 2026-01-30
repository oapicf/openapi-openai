namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeConversationItem

module RealtimeServerEventConversationItemCreated =

  //#region RealtimeServerEventConversationItemCreated

  //#region enums
  type TypeEnum = ConversationItemCreatedEnum of string  
  //#endregion

  type RealtimeServerEventConversationItemCreated = {
    EventId : string;
    Type : TypeEnum;
    PreviousItemId : string;
    Item : RealtimeConversationItem;
  }
  //#endregion
