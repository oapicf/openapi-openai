namespace OpenAPI.Model

open System
open System.Collections.Generic

module ChatCompletionRequestToolMessage =

  //#region ChatCompletionRequestToolMessage

  //#region enums
  type RoleEnum = ToolEnum of string  
  //#endregion

  type ChatCompletionRequestToolMessage = {
    Role : RoleEnum;
    Content : string;
    ToolCallId : string;
  }
  //#endregion
