namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module ChatCompletionRequestFunctionMessage =

  //#region ChatCompletionRequestFunctionMessage

  //#region enums
  type RoleEnum = FunctionEnum of string  
  //#endregion

  type ChatCompletionRequestFunctionMessage = {
    Role : RoleEnum;
    Content : string option;
    Name : string;
  }
  //#endregion
