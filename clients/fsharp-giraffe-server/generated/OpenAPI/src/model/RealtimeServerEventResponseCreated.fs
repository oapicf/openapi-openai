namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeResponse

module RealtimeServerEventResponseCreated =

  //#region RealtimeServerEventResponseCreated

  //#region enums
  type TypeEnum = ResponseCreatedEnum of string  
  //#endregion

  type RealtimeServerEventResponseCreated = {
    EventId : string;
    Type : TypeEnum;
    Response : RealtimeResponse;
  }
  //#endregion
