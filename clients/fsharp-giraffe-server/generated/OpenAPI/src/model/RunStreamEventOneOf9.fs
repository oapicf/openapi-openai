namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunObject

module RunStreamEventOneOf9 =

  //#region RunStreamEventOneOf9

  //#region enums
  type EventEnum = ThreadRunExpiredEnum of string  
  //#endregion

  type RunStreamEvent_oneOf_9 = {
    Event : EventEnum;
    Data : RunObject;
  }
  //#endregion
