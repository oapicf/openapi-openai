namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeSessionCreateRequest

module RealtimeClientEventSessionUpdate =

  //#region RealtimeClientEventSessionUpdate

  //#region enums
  type TypeEnum = SessionUpdateEnum of string  
  //#endregion

  type RealtimeClientEventSessionUpdate = {
    EventId : string;
    Type : TypeEnum;
    Session : RealtimeSessionCreateRequest;
  }
  //#endregion
