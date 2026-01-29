namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ThreadObject =

  //#region ThreadObject

  [<CLIMutable>]
  type ThreadObject = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
  }

  //#endregion
