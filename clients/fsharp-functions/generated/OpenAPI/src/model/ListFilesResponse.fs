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
    [<JsonProperty(PropertyName = "first_id")>]
    FirstId : string;
    [<JsonProperty(PropertyName = "last_id")>]
    LastId : string;
    [<JsonProperty(PropertyName = "has_more")>]
    HasMore : bool;
  }

  //#endregion
