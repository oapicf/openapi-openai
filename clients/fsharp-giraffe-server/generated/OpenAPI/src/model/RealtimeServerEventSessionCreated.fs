namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeSession

module RealtimeServerEventSessionCreated =

  //#region RealtimeServerEventSessionCreated

  //#region enums
  type TypeEnum = SessionCreatedEnum of string  
  //#endregion

  type RealtimeServerEventSessionCreated = {
    EventId : string;
    Type : TypeEnum;
    Session : RealtimeSession;
  }
  //#endregion
