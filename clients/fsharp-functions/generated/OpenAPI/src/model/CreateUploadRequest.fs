namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateUploadRequest =

  //#region CreateUploadRequest

  [<CLIMutable>]
  type CreateUploadRequest = {
    [<JsonProperty(PropertyName = "filename")>]
    Filename : string;
    [<JsonProperty(PropertyName = "purpose")>]
    Purpose : string;
    [<JsonProperty(PropertyName = "bytes")>]
    Bytes : int;
    [<JsonProperty(PropertyName = "mime_type")>]
    MimeType : string;
  }

  //#endregion
