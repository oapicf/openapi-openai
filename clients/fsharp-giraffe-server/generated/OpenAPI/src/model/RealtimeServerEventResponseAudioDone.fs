namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeServerEventResponseAudioDone =

  //#region RealtimeServerEventResponseAudioDone

  //#region enums
  type TypeEnum = ResponseAudioDoneEnum of string  
  //#endregion

  type RealtimeServerEventResponseAudioDone = {
    EventId : string;
    Type : TypeEnum;
    ResponseId : string;
    ItemId : string;
    OutputIndex : int;
    ContentIndex : int;
  }
  //#endregion
