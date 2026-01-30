namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeConversationItem

module RealtimeClientEventConversationItemCreate =

  //#region RealtimeClientEventConversationItemCreate

  //#region enums
  type TypeEnum = ConversationItemCreateEnum of string  
  //#endregion

  type RealtimeClientEventConversationItemCreate = {
    EventId : string;
    Type : TypeEnum;
    PreviousItemId : string;
    Item : RealtimeConversationItem;
  }
  //#endregion
