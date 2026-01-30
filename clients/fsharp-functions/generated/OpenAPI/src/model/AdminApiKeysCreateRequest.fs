namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdminApiKeysCreateRequest =

  //#region AdminApiKeysCreateRequest

  [<CLIMutable>]
  type AdminApiKeysCreateRequest = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
