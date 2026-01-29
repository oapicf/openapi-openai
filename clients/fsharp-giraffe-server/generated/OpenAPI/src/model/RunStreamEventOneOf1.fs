namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunObject

module RunStreamEventOneOf1 =

  //#region RunStreamEventOneOf1

  //#region enums
  type EventEnum = ThreadRunQueuedEnum of string  
  //#endregion

  type RunStreamEvent_oneOf_1 = {
    Event : EventEnum;
    Data : RunObject;
  }
  //#endregion
