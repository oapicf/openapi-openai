namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssistantObjectToolResources
open OpenAPI.Model.AssistantObjectToolsInner
open OpenAPI.Model.AssistantsApiResponseFormatOption
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module AssistantObject =

  //#region AssistantObject

  [<CLIMutable>]
  type AssistantObject = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string option;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "model")>]
    Model : string;
    [<JsonProperty(PropertyName = "instructions")>]
    Instructions : string option;
    [<JsonProperty(PropertyName = "tools")>]
    Tools : AssistantObjectToolsInner[];
    [<JsonProperty(PropertyName = "tool_resources")>]
    ToolResources : AssistantObjectToolResources;
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
    [<JsonProperty(PropertyName = "temperature")>]
    Temperature : decimal option;
    [<JsonProperty(PropertyName = "top_p")>]
    TopP : decimal option;
    [<JsonProperty(PropertyName = "response_format")>]
    ResponseFormat : AssistantsApiResponseFormatOption;
  }

  //#endregion
