namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageDeltaObjectDelta

module MessageDeltaObject =

  //#region MessageDeltaObject

  //#region enums
  type ObjectEnum = ThreadMessageDeltaEnum of string  
  //#endregion

  type MessageDeltaObject = {
    Id : string;
    Object : ObjectEnum;
    Delta : MessageDeltaObjectDelta;
  }
  //#endregion
