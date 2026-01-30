namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatCompletionStreamOptions =

  //#region ChatCompletionStreamOptions

  [<CLIMutable>]
  type ChatCompletionStreamOptions = {
    [<JsonProperty(PropertyName = "include_usage")>]
    IncludeUsage : bool;
  }

  //#endregion
