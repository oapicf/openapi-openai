namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantObjectToolsInner
open OpenAPI.Model.AssistantsApiResponseFormatOption
open OpenAPI.Model.CreateAssistantRequestModel
open OpenAPI.Model.CreateAssistantRequestToolResources
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module CreateAssistantRequest =

  //#region CreateAssistantRequest


  type CreateAssistantRequest = {
    Model : CreateAssistantRequestModel;
    Name : string option;
    Description : string option;
    Instructions : string option;
    Tools : AssistantObjectToolsInner[];
    ToolResources : CreateAssistantRequestToolResources;
    Metadata : obj;
    Temperature : decimal option;
    TopP : decimal option;
    ResponseFormat : AssistantsApiResponseFormatOption;
  }
  //#endregion
