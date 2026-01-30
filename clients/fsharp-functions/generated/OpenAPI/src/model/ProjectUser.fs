namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ProjectUser =

  //#region ProjectUser

  [<CLIMutable>]
  type ProjectUser = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "email")>]
    Email : string;
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "added_at")>]
    AddedAt : int;
  }

  //#endregion
