namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdminApiKey

module ApiKeyList =

  //#region ApiKeyList

  [<CLIMutable>]
  type ApiKeyList = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : AdminApiKey[];
    [<JsonProperty(PropertyName = "has_more")>]
    HasMore : bool;
    [<JsonProperty(PropertyName = "first_id")>]
    FirstId : string;
    [<JsonProperty(PropertyName = "last_id")>]
    LastId : string;
  }

  //#endregion
