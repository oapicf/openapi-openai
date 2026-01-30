namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CompleteUploadRequest =

  //#region CompleteUploadRequest

  [<CLIMutable>]
  type CompleteUploadRequest = {
    [<JsonProperty(PropertyName = "part_ids")>]
    PartIds : string[];
    [<JsonProperty(PropertyName = "md5")>]
    Md5 : string;
  }

  //#endregion
