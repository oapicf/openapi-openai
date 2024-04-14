namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepObject

module RunStepStreamEventOneOf3 =

  //#region RunStepStreamEventOneOf3

  //#region enums
  type EventEnum = ThreadRunStepCompletedEnum of string  
  //#endregion

  type RunStepStreamEvent_oneOf_3 = {
    Event : EventEnum;
    Data : RunStepObject;
  }
  //#endregion
