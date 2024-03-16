namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OpenAIFile

module ListFilesResponse =

  //#region ListFilesResponse

  [<CLIMutable>]
  type ListFilesResponse = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : OpenAIFile[];
  }

  //#endregion
