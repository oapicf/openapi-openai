namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeServerEventResponseContentPartAddedPart =

  //#region RealtimeServerEventResponseContentPartAddedPart

  //#region enums
  type TypeEnum = AudioEnum of string  |  TextEnum of string  
  //#endregion

  type RealtimeServerEventResponseContentPartAdded_part = {
    Type : TypeEnum;
    Text : string;
    Audio : string;
    Transcript : string;
  }
  //#endregion
