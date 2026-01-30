namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeSessionTurnDetection =

  //#region RealtimeSessionTurnDetection

  //#region enums
  type TypeEnum = ServerVadEnum of string  
  //#endregion

  type RealtimeSession_turn_detection = {
    Type : TypeEnum;
    Threshold : decimal;
    PrefixPaddingMs : int;
    SilenceDurationMs : int;
  }
  //#endregion
