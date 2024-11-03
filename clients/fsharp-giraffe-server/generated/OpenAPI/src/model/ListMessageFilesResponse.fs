namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageFileObject

module ListMessageFilesResponse =

  //#region ListMessageFilesResponse


  type ListMessageFilesResponse = {
    Object : string;
    Data : MessageFileObject[];
    FirstId : string;
    LastId : string;
    HasMore : bool;
  }
  //#endregion
