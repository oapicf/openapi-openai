namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ModifyThreadRequestToolResources

module ModifyThreadRequest =

  //#region ModifyThreadRequest


  type ModifyThreadRequest = {
    ToolResources : ModifyThreadRequestToolResources;
    Metadata : obj;
  }
  //#endregion
