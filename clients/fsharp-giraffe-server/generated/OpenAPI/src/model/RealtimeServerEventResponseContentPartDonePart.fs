namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeServerEventResponseContentPartDonePart =

  //#region RealtimeServerEventResponseContentPartDonePart

  //#region enums
  type TypeEnum = AudioEnum of string  |  TextEnum of string  
  //#endregion

  type RealtimeServerEventResponseContentPartDone_part = {
    Type : TypeEnum;
    Text : string;
    Audio : string;
    Transcript : string;
  }
  //#endregion
