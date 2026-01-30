namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantObjectToolResources
open OpenAPI.Model.AssistantObjectToolsInner
open OpenAPI.Model.AssistantsApiResponseFormatOption
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module AssistantObject =

  //#region AssistantObject

  //#region enums
  type ObjectEnum = AssistantEnum of string  
  //#endregion

  type AssistantObject = {
    Id : string;
    Object : ObjectEnum;
    CreatedAt : int;
    Name : string option;
    Description : string option;
    Model : string;
    Instructions : string option;
    Tools : AssistantObjectToolsInner[];
    ToolResources : AssistantObjectToolResources;
    Metadata : obj;
    Temperature : decimal option;
    TopP : decimal option;
    ResponseFormat : AssistantsApiResponseFormatOption;
  }
  //#endregion
