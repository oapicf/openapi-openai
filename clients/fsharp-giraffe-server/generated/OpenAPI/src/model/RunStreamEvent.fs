namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunObject
open OpenAPI.Model.RunStreamEventOneOf
open OpenAPI.Model.RunStreamEventOneOf1
open OpenAPI.Model.RunStreamEventOneOf2
open OpenAPI.Model.RunStreamEventOneOf3
open OpenAPI.Model.RunStreamEventOneOf4
open OpenAPI.Model.RunStreamEventOneOf5
open OpenAPI.Model.RunStreamEventOneOf6
open OpenAPI.Model.RunStreamEventOneOf7
open OpenAPI.Model.RunStreamEventOneOf8
open OpenAPI.Model.RunStreamEventOneOf9

module RunStreamEvent =

  //#region RunStreamEvent

  //#region enums
  type EventEnum = ThreadRunExpiredEnum of string  
  //#endregion

  type RunStreamEvent = {
    Event : EventEnum;
    Data : RunObject;
  }
  //#endregion
