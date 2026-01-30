namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module RealtimeServerEventErrorError =

  //#region RealtimeServerEventErrorError


  type RealtimeServerEventError_error = {
    Type : string;
    Code : string option;
    Message : string;
    Param : string option;
    EventId : string option;
  }
  //#endregion
