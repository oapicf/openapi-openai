namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OpenAIFile =

  //#region OpenAIFile

  [<CLIMutable>]
  type OpenAIFile = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "bytes")>]
    Bytes : int;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "filename")>]
    Filename : string;
    [<JsonProperty(PropertyName = "purpose")>]
    Purpose : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "status_details")>]
    StatusDetails : obj;
  }

  //#endregion
