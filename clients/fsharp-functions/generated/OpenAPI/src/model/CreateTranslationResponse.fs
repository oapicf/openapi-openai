namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateTranslationResponse =

  //#region CreateTranslationResponse

  [<CLIMutable>]
  type CreateTranslationResponse = {
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
  }

  //#endregion
