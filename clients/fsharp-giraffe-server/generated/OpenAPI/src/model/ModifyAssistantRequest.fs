namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantObjectToolsInner
open OpenAPI.Model.AssistantsApiResponseFormatOption
open OpenAPI.Model.ModifyAssistantRequestToolResources
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module ModifyAssistantRequest =

  //#region ModifyAssistantRequest


  type ModifyAssistantRequest = {
    Model : string;
    Name : string option;
    Description : string option;
    Instructions : string option;
    Tools : AssistantObjectToolsInner[];
    ToolResources : ModifyAssistantRequestToolResources;
    Metadata : obj;
    Temperature : decimal option;
    TopP : decimal option;
    ResponseFormat : AssistantsApiResponseFormatOption;
  }
  //#endregion
