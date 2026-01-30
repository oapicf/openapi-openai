namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeConversationItem

module RealtimeServerEventResponseOutputItemDone =

  //#region RealtimeServerEventResponseOutputItemDone

  //#region enums
  type TypeEnum = ResponseOutputItemDoneEnum of string  
  //#endregion

  type RealtimeServerEventResponseOutputItemDone = {
    EventId : string;
    Type : TypeEnum;
    ResponseId : string;
    OutputIndex : int;
    Item : RealtimeConversationItem;
  }
  //#endregion
