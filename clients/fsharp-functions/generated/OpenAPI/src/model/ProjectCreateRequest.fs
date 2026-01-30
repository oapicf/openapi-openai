namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ProjectCreateRequest =

  //#region ProjectCreateRequest

  [<CLIMutable>]
  type ProjectCreateRequest = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
