namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantObject

module ListAssistantsResponse =

  //#region ListAssistantsResponse


  type ListAssistantsResponse = {
    Object : string;
    Data : AssistantObject[];
    FirstId : string;
    LastId : string;
    HasMore : bool;
  }
  //#endregion
