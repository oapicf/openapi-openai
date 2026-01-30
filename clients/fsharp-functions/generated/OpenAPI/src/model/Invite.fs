namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.InviteProjectsInner

module Invite =

  //#region Invite

  [<CLIMutable>]
  type Invite = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "email")>]
    Email : string;
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "invited_at")>]
    InvitedAt : int;
    [<JsonProperty(PropertyName = "expires_at")>]
    ExpiresAt : int;
    [<JsonProperty(PropertyName = "accepted_at")>]
    AcceptedAt : int;
    [<JsonProperty(PropertyName = "projects")>]
    Projects : InviteProjectsInner[];
  }

  //#endregion
