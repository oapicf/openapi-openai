namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeServerEventInputAudioBufferCommitted =

  //#region RealtimeServerEventInputAudioBufferCommitted

  //#region enums
  type TypeEnum = InputAudioBufferCommittedEnum of string  
  //#endregion

  type RealtimeServerEventInputAudioBufferCommitted = {
    EventId : string;
    Type : TypeEnum;
    PreviousItemId : string;
    ItemId : string;
  }
  //#endregion
