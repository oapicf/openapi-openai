namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeClientEventConversationItemDelete =

  //#region RealtimeClientEventConversationItemDelete

  //#region enums
  type TypeEnum = ConversationItemDeleteEnum of string  
  //#endregion

  type RealtimeClientEventConversationItemDelete = {
    EventId : string;
    Type : TypeEnum;
    ItemId : string;
  }
  //#endregion
