namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepObject

module RunStepStreamEventOneOf4 =

  //#region RunStepStreamEventOneOf4

  //#region enums
  type EventEnum = ThreadRunStepFailedEnum of string  
  //#endregion

  type RunStepStreamEvent_oneOf_4 = {
    Event : EventEnum;
    Data : RunStepObject;
  }
  //#endregion
