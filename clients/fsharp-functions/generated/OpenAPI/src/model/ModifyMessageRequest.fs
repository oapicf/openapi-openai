namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ModifyMessageRequest =

  //#region ModifyMessageRequest

  [<CLIMutable>]
  type ModifyMessageRequest = {
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
  }

  //#endregion
