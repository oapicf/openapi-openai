namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ModifyRunRequest =

  //#region ModifyRunRequest

  [<CLIMutable>]
  type ModifyRunRequest = {
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
  }

  //#endregion
