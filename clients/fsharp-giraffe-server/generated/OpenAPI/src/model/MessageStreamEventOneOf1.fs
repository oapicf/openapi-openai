namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageObject

module MessageStreamEventOneOf1 =

  //#region MessageStreamEventOneOf1

  //#region enums
  type EventEnum = ThreadMessageInProgressEnum of string  
  //#endregion

  type MessageStreamEvent_oneOf_1 = {
    Event : EventEnum;
    Data : MessageObject;
  }
  //#endregion
