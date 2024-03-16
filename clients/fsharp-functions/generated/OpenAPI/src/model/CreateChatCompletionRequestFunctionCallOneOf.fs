namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateChatCompletionRequestFunctionCallOneOf =

  //#region CreateChatCompletionRequestFunctionCallOneOf

  [<CLIMutable>]
  type CreateChatCompletionRequestFunctionCallOneOf = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
