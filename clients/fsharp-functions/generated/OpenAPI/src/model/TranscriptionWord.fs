namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TranscriptionWord =

  //#region TranscriptionWord

  [<CLIMutable>]
  type TranscriptionWord = {
    [<JsonProperty(PropertyName = "word")>]
    Word : string;
    [<JsonProperty(PropertyName = "start")>]
    Start : float;
    [<JsonProperty(PropertyName = "end")>]
    End : float;
  }

  //#endregion
