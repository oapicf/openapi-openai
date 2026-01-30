namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeServerEventResponseTextDelta =

  //#region RealtimeServerEventResponseTextDelta

  //#region enums
  type TypeEnum = ResponseTextDeltaEnum of string  
  //#endregion

  type RealtimeServerEventResponseTextDelta = {
    EventId : string;
    Type : TypeEnum;
    ResponseId : string;
    ItemId : string;
    OutputIndex : int;
    ContentIndex : int;
    Delta : string;
  }
  //#endregion
