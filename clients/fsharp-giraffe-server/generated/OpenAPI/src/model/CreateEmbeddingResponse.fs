namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateEmbeddingResponseDataInner
open OpenAPI.Model.CreateEmbeddingResponseUsage

module CreateEmbeddingResponse =

  //#region CreateEmbeddingResponse


  type CreateEmbeddingResponse = {
    Object : string;
    Model : string;
    Data : CreateEmbeddingResponseDataInner[];
    Usage : CreateEmbeddingResponseUsage;
  }
  //#endregion
