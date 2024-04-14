namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepObject

module RunStepStreamEventOneOf =

  //#region RunStepStreamEventOneOf

  //#region enums
  type EventEnum = ThreadRunStepCreatedEnum of string  
  //#endregion

  type RunStepStreamEvent_oneOf = {
    Event : EventEnum;
    Data : RunStepObject;
  }
  //#endregion
