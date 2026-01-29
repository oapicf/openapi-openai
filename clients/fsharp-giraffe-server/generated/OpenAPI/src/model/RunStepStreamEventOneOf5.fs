namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepObject

module RunStepStreamEventOneOf5 =

  //#region RunStepStreamEventOneOf5

  //#region enums
  type EventEnum = ThreadRunStepCancelledEnum of string  
  //#endregion

  type RunStepStreamEvent_oneOf_5 = {
    Event : EventEnum;
    Data : RunStepObject;
  }
  //#endregion
