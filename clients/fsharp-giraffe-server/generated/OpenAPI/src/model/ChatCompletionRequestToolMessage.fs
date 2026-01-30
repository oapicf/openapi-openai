namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionRequestToolMessageContent

module ChatCompletionRequestToolMessage =

  //#region ChatCompletionRequestToolMessage

  //#region enums
  type RoleEnum = ToolEnum of string  
  //#endregion

  type ChatCompletionRequestToolMessage = {
    Role : RoleEnum;
    Content : ChatCompletionRequestToolMessageContent;
    ToolCallId : string;
  }
  //#endregion
