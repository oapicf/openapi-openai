namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ProjectUserCreateRequest =

  //#region ProjectUserCreateRequest

  [<CLIMutable>]
  type ProjectUserCreateRequest = {
    [<JsonProperty(PropertyName = "user_id")>]
    UserId : string;
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
  }

  //#endregion
