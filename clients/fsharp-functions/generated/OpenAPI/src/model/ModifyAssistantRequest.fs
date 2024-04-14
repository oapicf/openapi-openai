namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssistantObjectToolsInner
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
    [<JsonProperty(PropertyName = "file_ids")>]
    FileIds : string[];
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
  }

  //#endregion
