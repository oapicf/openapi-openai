namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageObject

module MessageStreamEventOneOf =

  //#region MessageStreamEventOneOf

  //#region enums
  type EventEnum = ThreadMessageCreatedEnum of string  
  //#endregion

  type MessageStreamEvent_oneOf = {
    Event : EventEnum;
    Data : MessageObject;
  }
  //#endregion
