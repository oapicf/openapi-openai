namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunObject

module RunStreamEventOneOf =

  //#region RunStreamEventOneOf

  //#region enums
  type EventEnum = ThreadRunCreatedEnum of string  
  //#endregion

  type RunStreamEvent_oneOf = {
    Event : EventEnum;
    Data : RunObject;
  }
  //#endregion
