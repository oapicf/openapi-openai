namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssistantObjectToolsInner
open OpenAPI.Model.AssistantsApiResponseFormatOption
open OpenAPI.Model.ModifyAssistantRequestToolResources
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module ModifyAssistantRequest =

  //#region ModifyAssistantRequest

  [<CLIMutable>]
  type ModifyAssistantRequest = {
    [<JsonProperty(PropertyName = "model")>]
    Model : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string option;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "instructions")>]
    Instructions : string option;
    [<JsonProperty(PropertyName = "tools")>]
    Tools : AssistantObjectToolsInner[];
    [<JsonProperty(PropertyName = "tool_resources")>]
    ToolResources : ModifyAssistantRequestToolResources;
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
