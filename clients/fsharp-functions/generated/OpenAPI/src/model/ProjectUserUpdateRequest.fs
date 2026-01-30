namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ProjectUserUpdateRequest =

  //#region ProjectUserUpdateRequest

  [<CLIMutable>]
  type ProjectUserUpdateRequest = {
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
  }

  //#endregion
