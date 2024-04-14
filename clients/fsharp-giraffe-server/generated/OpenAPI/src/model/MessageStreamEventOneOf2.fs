namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageDeltaObject

module MessageStreamEventOneOf2 =

  //#region MessageStreamEventOneOf2

  //#region enums
  type EventEnum = ThreadMessageDeltaEnum of string  
  //#endregion

  type MessageStreamEvent_oneOf_2 = {
    Event : EventEnum;
    Data : MessageDeltaObject;
  }
  //#endregion
