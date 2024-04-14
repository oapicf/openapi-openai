namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionRequestUserMessageContent

module ChatCompletionRequestUserMessage =

  //#region ChatCompletionRequestUserMessage

  //#region enums
  type RoleEnum = UserEnum of string  
  //#endregion

  type ChatCompletionRequestUserMessage = {
    Content : ChatCompletionRequestUserMessageContent;
    Role : RoleEnum;
    Name : string;
  }
  //#endregion
