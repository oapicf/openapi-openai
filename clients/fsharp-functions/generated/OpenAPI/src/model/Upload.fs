namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OpenAIFile

module Upload =

  //#region Upload

  [<CLIMutable>]
  type Upload = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "filename")>]
    Filename : string;
    [<JsonProperty(PropertyName = "bytes")>]
    Bytes : int;
    [<JsonProperty(PropertyName = "purpose")>]
    Purpose : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "expires_at")>]
    ExpiresAt : int;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "file")>]
    File : OpenAIFile;
  }

  //#endregion
