namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunObject

module RunStreamEventOneOf6 =

  //#region RunStreamEventOneOf6

  //#region enums
  type EventEnum = ThreadRunFailedEnum of string  
  //#endregion

  type RunStreamEvent_oneOf_6 = {
    Event : EventEnum;
    Data : RunObject;
  }
  //#endregion
