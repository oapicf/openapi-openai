namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeResponse

module RealtimeServerEventResponseDone =

  //#region RealtimeServerEventResponseDone

  //#region enums
  type TypeEnum = ResponseDoneEnum of string  
  //#endregion

  type RealtimeServerEventResponseDone = {
    EventId : string;
    Type : TypeEnum;
    Response : RealtimeResponse;
  }
  //#endregion
