namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantFileObject

module ListAssistantFilesResponse =

  //#region ListAssistantFilesResponse


  type ListAssistantFilesResponse = {
    Object : string;
    Data : AssistantFileObject[];
    FirstId : string;
    LastId : string;
    HasMore : bool;
  }
  //#endregion
