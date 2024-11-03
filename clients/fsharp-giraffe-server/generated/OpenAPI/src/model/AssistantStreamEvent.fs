namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.DoneEvent
open OpenAPI.Model.ErrorEvent
open OpenAPI.Model.MessageStreamEvent
open OpenAPI.Model.RunStepStreamEvent
open OpenAPI.Model.RunStreamEvent
open OpenAPI.Model.ThreadStreamEvent

module AssistantStreamEvent =

  //#region AssistantStreamEvent

  //#region enums
  type EventEnum = DoneEnum of string  
  //#endregion
  //#region enums
  type DataEnum = DONEEnum of string  
  //#endregion

  type AssistantStreamEvent = {
    Event : EventEnum;
    Data : DataEnum;
  }
  //#endregion
