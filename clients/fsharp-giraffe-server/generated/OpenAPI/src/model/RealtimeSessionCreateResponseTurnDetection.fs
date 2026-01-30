namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeSessionCreateResponseTurnDetection =

  //#region RealtimeSessionCreateResponseTurnDetection


  type RealtimeSessionCreateResponse_turn_detection = {
    Type : string;
    Threshold : decimal;
    PrefixPaddingMs : int;
    SilenceDurationMs : int;
  }
  //#endregion
