namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.VectorStoreExpirationAfter
open OpenAPI.Model.string option

module UpdateVectorStoreRequest =

  //#region UpdateVectorStoreRequest


  type UpdateVectorStoreRequest = {
    Name : string option;
    ExpiresAfter : VectorStoreExpirationAfter;
    Metadata : obj;
  }
  //#endregion
