namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeConversationItem

module RealtimeServerEventResponseOutputItemAdded =

  //#region RealtimeServerEventResponseOutputItemAdded

  //#region enums
  type TypeEnum = ResponseOutputItemAddedEnum of string  
  //#endregion

  type RealtimeServerEventResponseOutputItemAdded = {
    EventId : string;
    Type : TypeEnum;
    ResponseId : string;
    OutputIndex : int;
    Item : RealtimeConversationItem;
  }
  //#endregion
