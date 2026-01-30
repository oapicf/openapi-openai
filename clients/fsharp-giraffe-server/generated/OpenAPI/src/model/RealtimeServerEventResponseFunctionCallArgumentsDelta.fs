namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeServerEventResponseFunctionCallArgumentsDelta =

  //#region RealtimeServerEventResponseFunctionCallArgumentsDelta

  //#region enums
  type TypeEnum = ResponseFunctionCallArgumentsDeltaEnum of string  
  //#endregion

  type RealtimeServerEventResponseFunctionCallArgumentsDelta = {
    EventId : string;
    Type : TypeEnum;
    ResponseId : string;
    ItemId : string;
    OutputIndex : int;
    CallId : string;
    Delta : string;
  }
  //#endregion
