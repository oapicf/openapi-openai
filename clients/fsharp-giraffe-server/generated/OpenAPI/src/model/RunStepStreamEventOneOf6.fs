namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepObject

module RunStepStreamEventOneOf6 =

  //#region RunStepStreamEventOneOf6

  //#region enums
  type EventEnum = ThreadRunStepExpiredEnum of string  
  //#endregion

  type RunStepStreamEvent_oneOf_6 = {
    Event : EventEnum;
    Data : RunStepObject;
  }
  //#endregion
