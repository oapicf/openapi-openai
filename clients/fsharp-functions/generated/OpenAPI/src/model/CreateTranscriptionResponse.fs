namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateTranscriptionResponse =

  //#region CreateTranscriptionResponse

  [<CLIMutable>]
  type CreateTranscriptionResponse = {
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
  }

  //#endregion
