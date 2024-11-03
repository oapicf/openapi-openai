namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantObjectToolsInner
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
    FileIds : string[];
    Metadata : obj;
  }
  //#endregion
