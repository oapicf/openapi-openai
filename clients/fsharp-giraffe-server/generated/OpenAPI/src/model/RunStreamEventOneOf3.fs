namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunObject

module RunStreamEventOneOf3 =

  //#region RunStreamEventOneOf3

  //#region enums
  type EventEnum = ThreadRunRequiresActionEnum of string  
  //#endregion

  type RunStreamEvent_oneOf_3 = {
    Event : EventEnum;
    Data : RunObject;
  }
  //#endregion
