namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ThreadObject

module ThreadStreamEvent =

  //#region ThreadStreamEvent

  //#region enums
  type EventEnum = ThreadCreatedEnum of string  
  //#endregion

  type ThreadStreamEvent = {
    Enabled : bool;
    Event : EventEnum;
    Data : ThreadObject;
  }
  //#endregion
