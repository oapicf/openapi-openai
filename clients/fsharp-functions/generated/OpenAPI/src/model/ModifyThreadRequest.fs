namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ModifyThreadRequest =

  //#region ModifyThreadRequest

  [<CLIMutable>]
  type ModifyThreadRequest = {
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
  }

  //#endregion
