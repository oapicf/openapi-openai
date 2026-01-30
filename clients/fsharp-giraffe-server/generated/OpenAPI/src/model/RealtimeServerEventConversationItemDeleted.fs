namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeServerEventConversationItemDeleted =

  //#region RealtimeServerEventConversationItemDeleted

  //#region enums
  type TypeEnum = ConversationItemDeletedEnum of string  
  //#endregion

  type RealtimeServerEventConversationItemDeleted = {
    EventId : string;
    Type : TypeEnum;
    ItemId : string;
  }
  //#endregion
