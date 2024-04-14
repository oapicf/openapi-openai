namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageObject

module MessageStreamEventOneOf3 =

  //#region MessageStreamEventOneOf3

  //#region enums
  type EventEnum = ThreadMessageCompletedEnum of string  
  //#endregion

  type MessageStreamEvent_oneOf_3 = {
    Event : EventEnum;
    Data : MessageObject;
  }
  //#endregion
