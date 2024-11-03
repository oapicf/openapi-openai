namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ThreadObject
open OpenAPI.Model.ThreadStreamEventOneOf

module ThreadStreamEvent =

  //#region ThreadStreamEvent

  //#region enums
  type EventEnum = ThreadCreatedEnum of string  
  //#endregion

  type ThreadStreamEvent = {
    Event : EventEnum;
    Data : ThreadObject;
  }
  //#endregion
