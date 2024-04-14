namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.int option

module TruncationObject =

  //#region TruncationObject

  //#region enums
  type TypeEnum = AutoEnum of string  |  LastMessagesEnum of string  
  //#endregion

  type TruncationObject = {
    Type : TypeEnum;
    LastMessages : int option;
  }
  //#endregion
