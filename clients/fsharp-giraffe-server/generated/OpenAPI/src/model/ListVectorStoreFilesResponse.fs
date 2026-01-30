namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.VectorStoreFileObject

module ListVectorStoreFilesResponse =

  //#region ListVectorStoreFilesResponse


  type ListVectorStoreFilesResponse = {
    Object : string;
    Data : VectorStoreFileObject[];
    FirstId : string;
    LastId : string;
    HasMore : bool;
  }
  //#endregion
