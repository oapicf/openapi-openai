namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageObject

module MessageStreamEventOneOf4 =

  //#region MessageStreamEventOneOf4

  //#region enums
  type EventEnum = ThreadMessageIncompleteEnum of string  
  //#endregion

  type MessageStreamEvent_oneOf_4 = {
    Event : EventEnum;
    Data : MessageObject;
  }
  //#endregion
