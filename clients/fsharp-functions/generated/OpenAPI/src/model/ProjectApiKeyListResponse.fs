namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ProjectApiKey

module ProjectApiKeyListResponse =

  //#region ProjectApiKeyListResponse

  [<CLIMutable>]
  type ProjectApiKeyListResponse = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : ProjectApiKey[];
    [<JsonProperty(PropertyName = "first_id")>]
    FirstId : string;
    [<JsonProperty(PropertyName = "last_id")>]
    LastId : string;
    [<JsonProperty(PropertyName = "has_more")>]
    HasMore : bool;
  }

  //#endregion
