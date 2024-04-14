namespace OpenAPI.Model

open System
open System.Collections.Generic

module DoneEvent =

  //#region DoneEvent

  //#region enums
  type EventEnum = DoneEnum of string  
  //#endregion
  //#region enums
  type DataEnum = DONEEnum of string  
  //#endregion

  type DoneEvent = {
    Event : EventEnum;
    Data : DataEnum;
  }
  //#endregion
