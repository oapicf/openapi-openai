namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeServerEventResponseFunctionCallArgumentsDone =

  //#region RealtimeServerEventResponseFunctionCallArgumentsDone

  //#region enums
  type TypeEnum = ResponseFunctionCallArgumentsDoneEnum of string  
  //#endregion

  type RealtimeServerEventResponseFunctionCallArgumentsDone = {
    EventId : string;
    Type : TypeEnum;
    ResponseId : string;
    ItemId : string;
    OutputIndex : int;
    CallId : string;
    Arguments : string;
  }
  //#endregion
