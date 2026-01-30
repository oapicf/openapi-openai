namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateChatCompletionRequestAudio =

  //#region CreateChatCompletionRequestAudio

  [<CLIMutable>]
  type CreateChatCompletionRequestAudio = {
    [<JsonProperty(PropertyName = "voice")>]
    Voice : string;
    [<JsonProperty(PropertyName = "format")>]
    Format : string;
  }

  //#endregion
