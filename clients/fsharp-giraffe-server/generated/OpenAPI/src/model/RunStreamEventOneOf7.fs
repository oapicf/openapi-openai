namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunObject

module RunStreamEventOneOf7 =

  //#region RunStreamEventOneOf7

  //#region enums
  type EventEnum = ThreadRunCancelledEnum of string  
  //#endregion

  type RunStreamEvent_oneOf_7 = {
    Event : EventEnum;
    Data : RunObject;
  }
  //#endregion
