namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.InviteRequestProjectsInner

module InviteRequest =

  //#region InviteRequest

  [<CLIMutable>]
  type InviteRequest = {
    [<JsonProperty(PropertyName = "email")>]
    Email : string;
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "projects")>]
    Projects : InviteRequestProjectsInner[];
  }

  //#endregion
