namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunObject

module RunStreamEventOneOf2 =

  //#region RunStreamEventOneOf2

  //#region enums
  type EventEnum = ThreadRunInProgressEnum of string  
  //#endregion

  type RunStreamEvent_oneOf_2 = {
    Event : EventEnum;
    Data : RunObject;
  }
  //#endregion
