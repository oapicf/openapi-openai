namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeSessionCreateRequestTurnDetection =

  //#region RealtimeSessionCreateRequestTurnDetection


  type RealtimeSessionCreateRequest_turn_detection = {
    Type : string;
    Threshold : decimal;
    PrefixPaddingMs : int;
    SilenceDurationMs : int;
    CreateResponse : bool;
  }
  //#endregion
