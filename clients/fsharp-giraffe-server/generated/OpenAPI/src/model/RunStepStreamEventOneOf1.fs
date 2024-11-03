namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepObject

module RunStepStreamEventOneOf1 =

  //#region RunStepStreamEventOneOf1

  //#region enums
  type EventEnum = ThreadRunStepInProgressEnum of string  
  //#endregion

  type RunStepStreamEvent_oneOf_1 = {
    Event : EventEnum;
    Data : RunStepObject;
  }
  //#endregion
