namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeSession

module RealtimeServerEventSessionUpdated =

  //#region RealtimeServerEventSessionUpdated

  //#region enums
  type TypeEnum = SessionUpdatedEnum of string  
  //#endregion

  type RealtimeServerEventSessionUpdated = {
    EventId : string;
    Type : TypeEnum;
    Session : RealtimeSession;
  }
  //#endregion
