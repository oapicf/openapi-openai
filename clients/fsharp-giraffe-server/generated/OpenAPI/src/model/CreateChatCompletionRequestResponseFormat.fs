namespace OpenAPI.Model

open System
open System.Collections.Generic

module CreateChatCompletionRequestResponseFormat =

  //#region CreateChatCompletionRequestResponseFormat

  //#region enums
  type TypeEnum = TextEnum of string  |  JsonObjectEnum of string  
  //#endregion

  type CreateChatCompletionRequest_response_format = {
    Type : TypeEnum;
  }
  //#endregion
