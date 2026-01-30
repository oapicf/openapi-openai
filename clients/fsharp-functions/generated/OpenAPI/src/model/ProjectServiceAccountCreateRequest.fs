namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ProjectServiceAccountCreateRequest =

  //#region ProjectServiceAccountCreateRequest

  [<CLIMutable>]
  type ProjectServiceAccountCreateRequest = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
