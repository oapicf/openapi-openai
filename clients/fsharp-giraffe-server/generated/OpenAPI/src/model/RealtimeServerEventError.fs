namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeServerEventErrorError

module RealtimeServerEventError =

  //#region RealtimeServerEventError

  //#region enums
  type TypeEnum = ErrorEnum of string  
  //#endregion

  type RealtimeServerEventError = {
    EventId : string;
    Type : TypeEnum;
    Error : RealtimeServerEventErrorError;
  }
  //#endregion
