namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.int option

module Project =

  //#region Project

  [<CLIMutable>]
  type Project = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "archived_at")>]
    ArchivedAt : int option;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
  }

  //#endregion
