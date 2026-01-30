namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeleteVectorStoreFileResponse =

  //#region DeleteVectorStoreFileResponse

  [<CLIMutable>]
  type DeleteVectorStoreFileResponse = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "deleted")>]
    Deleted : bool;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
  }

  //#endregion
