namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ModifyThreadRequestToolResources

module ModifyThreadRequest =

  //#region ModifyThreadRequest

  [<CLIMutable>]
  type ModifyThreadRequest = {
    [<JsonProperty(PropertyName = "tool_resources")>]
    ToolResources : ModifyThreadRequestToolResources;
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
  }

  //#endregion
