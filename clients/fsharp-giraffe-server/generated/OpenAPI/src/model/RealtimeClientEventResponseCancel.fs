namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeClientEventResponseCancel =

  //#region RealtimeClientEventResponseCancel

  //#region enums
  type TypeEnum = ResponseCancelEnum of string  
  //#endregion

  type RealtimeClientEventResponseCancel = {
    EventId : string;
    Type : TypeEnum;
    ResponseId : string;
  }
  //#endregion
