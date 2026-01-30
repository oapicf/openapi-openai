namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module InviteRequestProjectsInner =

  //#region InviteRequestProjectsInner

  [<CLIMutable>]
  type InviteRequestProjectsInner = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
  }

  //#endregion
