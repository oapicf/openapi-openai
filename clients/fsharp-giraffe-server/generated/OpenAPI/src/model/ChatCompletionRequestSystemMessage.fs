namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionRequestSystemMessageContent

module ChatCompletionRequestSystemMessage =

  //#region ChatCompletionRequestSystemMessage

  //#region enums
  type RoleEnum = SystemEnum of string  
  //#endregion

  type ChatCompletionRequestSystemMessage = {
    Content : ChatCompletionRequestSystemMessageContent;
    Role : RoleEnum;
    Name : string;
  }
  //#endregion
