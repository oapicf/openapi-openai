namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantObjectToolsInner
open OpenAPI.Model.string option

module ModifyAssistantRequest =

  //#region ModifyAssistantRequest


  type ModifyAssistantRequest = {
    Model : string;
    Name : string option;
    Description : string option;
    Instructions : string option;
    Tools : AssistantObjectToolsInner[];
    FileIds : string[];
    Metadata : obj;
  }
  //#endregion
