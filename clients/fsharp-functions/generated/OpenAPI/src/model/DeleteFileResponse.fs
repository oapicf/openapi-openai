namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeleteFileResponse =

  //#region DeleteFileResponse

  [<CLIMutable>]
  type DeleteFileResponse = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "deleted")>]
    Deleted : bool;
  }

  //#endregion
