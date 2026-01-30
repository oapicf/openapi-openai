namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeServerEventResponseAudioTranscriptDone =

  //#region RealtimeServerEventResponseAudioTranscriptDone

  //#region enums
  type TypeEnum = ResponseAudioTranscriptDoneEnum of string  
  //#endregion

  type RealtimeServerEventResponseAudioTranscriptDone = {
    EventId : string;
    Type : TypeEnum;
    ResponseId : string;
    ItemId : string;
    OutputIndex : int;
    ContentIndex : int;
    Transcript : string;
  }
  //#endregion
