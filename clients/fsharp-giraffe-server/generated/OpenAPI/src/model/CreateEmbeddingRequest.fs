namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateEmbeddingRequestInput
open OpenAPI.Model.CreateEmbeddingRequestModel

module CreateEmbeddingRequest =

  //#region CreateEmbeddingRequest

  //#region enums
  type EncodingFormatEnum = FloatEnum of string  |  Base64Enum of string  
  //#endregion

  type CreateEmbeddingRequest = {
    Input : CreateEmbeddingRequestInput;
    Model : CreateEmbeddingRequestModel;
    EncodingFormat : EncodingFormatEnum;
    Dimensions : int;
    User : string;
  }
  //#endregion
