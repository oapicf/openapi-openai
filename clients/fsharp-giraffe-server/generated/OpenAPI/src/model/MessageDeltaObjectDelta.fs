namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageDeltaObjectDeltaContentInner

module MessageDeltaObjectDelta =

  //#region MessageDeltaObjectDelta

  //#region enums
  type RoleEnum = UserEnum of string  |  AssistantEnum of string  
  //#endregion

  type MessageDeltaObject_delta = {
    Role : RoleEnum;
    Content : MessageDeltaObjectDeltaContentInner[];
    FileIds : string[];
  }
  //#endregion
