namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UploadPart =

  //#region UploadPart

  [<CLIMutable>]
  type UploadPart = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "upload_id")>]
    UploadId : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
  }

  //#endregion
