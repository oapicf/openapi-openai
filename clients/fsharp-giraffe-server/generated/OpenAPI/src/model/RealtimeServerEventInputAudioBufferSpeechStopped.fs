namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeServerEventInputAudioBufferSpeechStopped =

  //#region RealtimeServerEventInputAudioBufferSpeechStopped

  //#region enums
  type TypeEnum = InputAudioBufferSpeechStoppedEnum of string  
  //#endregion

  type RealtimeServerEventInputAudioBufferSpeechStopped = {
    EventId : string;
    Type : TypeEnum;
    AudioEndMs : int;
    ItemId : string;
  }
  //#endregion
