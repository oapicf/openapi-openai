namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module InviteProjectsInner =

  //#region InviteProjectsInner

  [<CLIMutable>]
  type InviteProjectsInner = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
  }

  //#endregion
