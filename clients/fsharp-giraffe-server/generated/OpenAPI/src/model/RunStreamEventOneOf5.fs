namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunObject

module RunStreamEventOneOf5 =

  //#region RunStreamEventOneOf5

  //#region enums
  type EventEnum = ThreadRunFailedEnum of string  
  //#endregion

  type RunStreamEvent_oneOf_5 = {
    Event : EventEnum;
    Data : RunObject;
  }
  //#endregion
