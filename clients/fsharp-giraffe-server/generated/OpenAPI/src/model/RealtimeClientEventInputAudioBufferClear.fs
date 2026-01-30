namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeClientEventInputAudioBufferClear =

  //#region RealtimeClientEventInputAudioBufferClear

  //#region enums
  type TypeEnum = InputAudioBufferClearEnum of string  
  //#endregion

  type RealtimeClientEventInputAudioBufferClear = {
    EventId : string;
    Type : TypeEnum;
  }
  //#endregion
