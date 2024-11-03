namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ThreadObject

module ThreadStreamEventOneOf =

  //#region ThreadStreamEventOneOf

  //#region enums
  type EventEnum = ThreadCreatedEnum of string  
  //#endregion

  type ThreadStreamEvent_oneOf = {
    Event : EventEnum;
    Data : ThreadObject;
  }
  //#endregion
