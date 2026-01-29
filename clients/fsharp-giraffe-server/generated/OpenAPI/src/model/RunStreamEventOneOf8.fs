namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunObject

module RunStreamEventOneOf8 =

  //#region RunStreamEventOneOf8

  //#region enums
  type EventEnum = ThreadRunExpiredEnum of string  
  //#endregion

  type RunStreamEvent_oneOf_8 = {
    Event : EventEnum;
    Data : RunObject;
  }
  //#endregion
