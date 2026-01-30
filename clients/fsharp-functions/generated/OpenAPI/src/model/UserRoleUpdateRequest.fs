namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UserRoleUpdateRequest =

  //#region UserRoleUpdateRequest

  [<CLIMutable>]
  type UserRoleUpdateRequest = {
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
  }

  //#endregion
