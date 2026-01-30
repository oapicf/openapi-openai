namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeClientEventInputAudioBufferCommit =

  //#region RealtimeClientEventInputAudioBufferCommit

  //#region enums
  type TypeEnum = InputAudioBufferCommitEnum of string  
  //#endregion

  type RealtimeClientEventInputAudioBufferCommit = {
    EventId : string;
    Type : TypeEnum;
  }
  //#endregion
