namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeServerEventResponseAudioTranscriptDelta =

  //#region RealtimeServerEventResponseAudioTranscriptDelta

  //#region enums
  type TypeEnum = ResponseAudioTranscriptDeltaEnum of string  
  //#endregion

  type RealtimeServerEventResponseAudioTranscriptDelta = {
    EventId : string;
    Type : TypeEnum;
    ResponseId : string;
    ItemId : string;
    OutputIndex : int;
    ContentIndex : int;
    Delta : string;
  }
  //#endregion
