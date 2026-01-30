namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeServerEventResponseTextDone =

  //#region RealtimeServerEventResponseTextDone

  //#region enums
  type TypeEnum = ResponseTextDoneEnum of string  
  //#endregion

  type RealtimeServerEventResponseTextDone = {
    EventId : string;
    Type : TypeEnum;
    ResponseId : string;
    ItemId : string;
    OutputIndex : int;
    ContentIndex : int;
    Text : string;
  }
  //#endregion
