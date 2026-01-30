namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeServerEventResponseContentPartDonePart

module RealtimeServerEventResponseContentPartDone =

  //#region RealtimeServerEventResponseContentPartDone

  //#region enums
  type TypeEnum = ResponseContentPartDoneEnum of string  
  //#endregion

  type RealtimeServerEventResponseContentPartDone = {
    EventId : string;
    Type : TypeEnum;
    ResponseId : string;
    ItemId : string;
    OutputIndex : int;
    ContentIndex : int;
    Part : RealtimeServerEventResponseContentPartDonePart;
  }
  //#endregion
