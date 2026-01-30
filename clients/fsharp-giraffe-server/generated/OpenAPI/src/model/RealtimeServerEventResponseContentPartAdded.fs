namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeServerEventResponseContentPartAddedPart

module RealtimeServerEventResponseContentPartAdded =

  //#region RealtimeServerEventResponseContentPartAdded

  //#region enums
  type TypeEnum = ResponseContentPartAddedEnum of string  
  //#endregion

  type RealtimeServerEventResponseContentPartAdded = {
    EventId : string;
    Type : TypeEnum;
    ResponseId : string;
    ItemId : string;
    OutputIndex : int;
    ContentIndex : int;
    Part : RealtimeServerEventResponseContentPartAddedPart;
  }
  //#endregion
