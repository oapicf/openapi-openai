namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeServerEventInputAudioBufferCleared =

  //#region RealtimeServerEventInputAudioBufferCleared

  //#region enums
  type TypeEnum = InputAudioBufferClearedEnum of string  
  //#endregion

  type RealtimeServerEventInputAudioBufferCleared = {
    EventId : string;
    Type : TypeEnum;
  }
  //#endregion
