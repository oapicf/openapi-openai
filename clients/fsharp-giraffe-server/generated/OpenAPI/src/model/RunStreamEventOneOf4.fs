namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunObject

module RunStreamEventOneOf4 =

  //#region RunStreamEventOneOf4

  //#region enums
  type EventEnum = ThreadRunCompletedEnum of string  
  //#endregion

  type RunStreamEvent_oneOf_4 = {
    Event : EventEnum;
    Data : RunObject;
  }
  //#endregion
