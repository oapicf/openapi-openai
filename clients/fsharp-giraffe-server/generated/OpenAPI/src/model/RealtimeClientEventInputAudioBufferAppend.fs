namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeClientEventInputAudioBufferAppend =

  //#region RealtimeClientEventInputAudioBufferAppend

  //#region enums
  type TypeEnum = InputAudioBufferAppendEnum of string  
  //#endregion

  type RealtimeClientEventInputAudioBufferAppend = {
    EventId : string;
    Type : TypeEnum;
    Audio : string;
  }
  //#endregion
