namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDeltaObject

module RunStepStreamEventOneOf2 =

  //#region RunStepStreamEventOneOf2

  //#region enums
  type EventEnum = ThreadRunStepDeltaEnum of string  
  //#endregion

  type RunStepStreamEvent_oneOf_2 = {
    Event : EventEnum;
    Data : RunStepDeltaObject;
  }
  //#endregion
