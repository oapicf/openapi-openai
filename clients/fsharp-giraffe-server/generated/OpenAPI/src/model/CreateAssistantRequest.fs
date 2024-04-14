namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantObjectToolsInner
open OpenAPI.Model.CreateAssistantRequestModel
open OpenAPI.Model.string option

module CreateAssistantRequest =

  //#region CreateAssistantRequest


  type CreateAssistantRequest = {
    Model : CreateAssistantRequestModel;
    Name : string option;
    Description : string option;
    Instructions : string option;
    Tools : AssistantObjectToolsInner[];
    FileIds : string[];
    Metadata : obj;
  }
  //#endregion
