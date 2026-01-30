namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ProjectUpdateRequest =

  //#region ProjectUpdateRequest

  [<CLIMutable>]
  type ProjectUpdateRequest = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
