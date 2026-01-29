namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AssistantToolsCode =

  //#region AssistantToolsCode

  [<CLIMutable>]
  type AssistantToolsCode = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
