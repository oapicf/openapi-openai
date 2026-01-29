namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Error

module ErrorEvent =

  //#region ErrorEvent

  //#region enums
  type EventEnum = ErrorEnum of string  
  //#endregion

  type ErrorEvent = {
    Event : EventEnum;
    Data : Error;
  }
  //#endregion
