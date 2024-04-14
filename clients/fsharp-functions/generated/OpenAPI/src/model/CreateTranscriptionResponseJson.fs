namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateTranscriptionResponseJson =

  //#region CreateTranscriptionResponseJson

  [<CLIMutable>]
  type CreateTranscriptionResponseJson = {
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
  }

  //#endregion
