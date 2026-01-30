namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateMessageRequest
open OpenAPI.Model.CreateThreadRequestToolResources

module CreateThreadRequest =

  //#region CreateThreadRequest

  [<CLIMutable>]
  type CreateThreadRequest = {
    [<JsonProperty(PropertyName = "messages")>]
    Messages : CreateMessageRequest[];
    [<JsonProperty(PropertyName = "tool_resources")>]
    ToolResources : CreateThreadRequestToolResources;
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
  }

  //#endregion
