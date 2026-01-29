namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepObject
open OpenAPI.Model.RunStepStreamEventOneOf
open OpenAPI.Model.RunStepStreamEventOneOf1
open OpenAPI.Model.RunStepStreamEventOneOf2
open OpenAPI.Model.RunStepStreamEventOneOf3
open OpenAPI.Model.RunStepStreamEventOneOf4
open OpenAPI.Model.RunStepStreamEventOneOf5
open OpenAPI.Model.RunStepStreamEventOneOf6

module RunStepStreamEvent =

  //#region RunStepStreamEvent

  //#region enums
  type EventEnum = ThreadRunStepExpiredEnum of string  
  //#endregion

  type RunStepStreamEvent = {
    Event : EventEnum;
    Data : RunStepObject;
  }
  //#endregion
