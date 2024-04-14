namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionFunctionCallOption

module CreateChatCompletionRequestFunctionCall =

  //#region CreateChatCompletionRequestFunctionCall

  [<CLIMutable>]
  type CreateChatCompletionRequestFunctionCall = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
