namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeServerEventInputAudioBufferSpeechStarted =

  //#region RealtimeServerEventInputAudioBufferSpeechStarted

  //#region enums
  type TypeEnum = InputAudioBufferSpeechStartedEnum of string  
  //#endregion

  type RealtimeServerEventInputAudioBufferSpeechStarted = {
    EventId : string;
    Type : TypeEnum;
    AudioStartMs : int;
    ItemId : string;
  }
  //#endregion
