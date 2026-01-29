namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateTranslationResponseJson =

  //#region CreateTranslationResponseJson

  [<CLIMutable>]
  type CreateTranslationResponseJson = {
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
  }

  //#endregion
