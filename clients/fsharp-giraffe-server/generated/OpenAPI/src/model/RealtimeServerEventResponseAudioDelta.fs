namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeServerEventResponseAudioDelta =

  //#region RealtimeServerEventResponseAudioDelta

  //#region enums
  type TypeEnum = ResponseAudioDeltaEnum of string  
  //#endregion

  type RealtimeServerEventResponseAudioDelta = {
    EventId : string;
    Type : TypeEnum;
    ResponseId : string;
    ItemId : string;
    OutputIndex : int;
    ContentIndex : int;
    Delta : string;
  }
  //#endregion
