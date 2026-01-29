namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateEmbeddingResponseUsage
open OpenAPI.Model.Embedding

module CreateEmbeddingResponse =

  //#region CreateEmbeddingResponse

  //#region enums
  type ObjectEnum = ListEnum of string  
  //#endregion

  type CreateEmbeddingResponse = {
    Data : Embedding[];
    Model : string;
    Object : ObjectEnum;
    Usage : CreateEmbeddingResponseUsage;
  }
  //#endregion
