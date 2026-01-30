namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeResponseCreateParams

module RealtimeClientEventResponseCreate =

  //#region RealtimeClientEventResponseCreate

  //#region enums
  type TypeEnum = ResponseCreateEnum of string  
  //#endregion

  type RealtimeClientEventResponseCreate = {
    EventId : string;
    Type : TypeEnum;
    Response : RealtimeResponseCreateParams;
  }
  //#endregion
