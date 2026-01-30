namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.VectorStoreObject

module ListVectorStoresResponse =

  //#region ListVectorStoresResponse


  type ListVectorStoresResponse = {
    Object : string;
    Data : VectorStoreObject[];
    FirstId : string;
    LastId : string;
    HasMore : bool;
  }
  //#endregion
