namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateMessageRequest

module CreateThreadRequest =

  //#region CreateThreadRequest


  type CreateThreadRequest = {
    Messages : CreateMessageRequest[];
    Metadata : obj;
  }
  //#endregion
