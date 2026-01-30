namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeServerEventConversationItemTruncated =

  //#region RealtimeServerEventConversationItemTruncated

  //#region enums
  type TypeEnum = ConversationItemTruncatedEnum of string  
  //#endregion

  type RealtimeServerEventConversationItemTruncated = {
    EventId : string;
    Type : TypeEnum;
    ItemId : string;
    ContentIndex : int;
    AudioEndMs : int;
  }
  //#endregion
