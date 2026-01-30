namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeClientEventConversationItemTruncate =

  //#region RealtimeClientEventConversationItemTruncate

  //#region enums
  type TypeEnum = ConversationItemTruncateEnum of string  
  //#endregion

  type RealtimeClientEventConversationItemTruncate = {
    EventId : string;
    Type : TypeEnum;
    ItemId : string;
    ContentIndex : int;
    AudioEndMs : int;
  }
  //#endregion
