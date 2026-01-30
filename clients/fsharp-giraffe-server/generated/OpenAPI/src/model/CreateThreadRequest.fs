namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateMessageRequest
open OpenAPI.Model.CreateThreadRequestToolResources

module CreateThreadRequest =

  //#region CreateThreadRequest


  type CreateThreadRequest = {
    Messages : CreateMessageRequest[];
    ToolResources : CreateThreadRequestToolResources;
    Metadata : obj;
  }
  //#endregion
