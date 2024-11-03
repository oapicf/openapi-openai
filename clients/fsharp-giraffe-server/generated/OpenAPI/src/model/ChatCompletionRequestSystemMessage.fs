namespace OpenAPI.Model

open System
open System.Collections.Generic

module ChatCompletionRequestSystemMessage =

  //#region ChatCompletionRequestSystemMessage

  //#region enums
  type RoleEnum = SystemEnum of string  
  //#endregion

  type ChatCompletionRequestSystemMessage = {
    Content : string;
    Role : RoleEnum;
    Name : string;
  }
  //#endregion
