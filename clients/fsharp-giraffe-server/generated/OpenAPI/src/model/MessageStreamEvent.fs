namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageObject
open OpenAPI.Model.MessageStreamEventOneOf
open OpenAPI.Model.MessageStreamEventOneOf1
open OpenAPI.Model.MessageStreamEventOneOf2
open OpenAPI.Model.MessageStreamEventOneOf3
open OpenAPI.Model.MessageStreamEventOneOf4

module MessageStreamEvent =

  //#region MessageStreamEvent

  //#region enums
  type EventEnum = ThreadMessageIncompleteEnum of string  
  //#endregion

  type MessageStreamEvent = {
    Event : EventEnum;
    Data : MessageObject;
  }
  //#endregion
