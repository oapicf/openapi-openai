namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionRequestDeveloperMessageContent

module ChatCompletionRequestDeveloperMessage =

  //#region ChatCompletionRequestDeveloperMessage

  //#region enums
  type RoleEnum = DeveloperEnum of string  
  //#endregion

  type ChatCompletionRequestDeveloperMessage = {
    Content : ChatCompletionRequestDeveloperMessageContent;
    Role : RoleEnum;
    Name : string;
  }
  //#endregion
