namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssistantObjectToolsInner
open OpenAPI.Model.CreateAssistantRequestModel
open OpenAPI.Model.string option

module CreateAssistantRequest =

  //#region CreateAssistantRequest

  [<CLIMutable>]
  type CreateAssistantRequest = {
    [<JsonProperty(PropertyName = "model")>]
    Model : CreateAssistantRequestModel;
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
