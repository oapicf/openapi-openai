namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateChatCompletionRequestResponseFormat =

  //#region CreateChatCompletionRequestResponseFormat

  [<CLIMutable>]
  type CreateChatCompletionRequestResponseFormat = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
