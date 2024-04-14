namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CompletionUsage
open OpenAPI.Model.CreateCompletionResponseChoicesInner

module CreateCompletionResponse =

  //#region CreateCompletionResponse

  //#region enums
  type ObjectEnum = TextCompletionEnum of string  
  //#endregion

  type CreateCompletionResponse = {
    Id : string;
    Choices : CreateCompletionResponseChoicesInner[];
    Created : int;
    Model : string;
    SystemFingerprint : string;
    Object : ObjectEnum;
    Usage : CompletionUsage;
  }
  //#endregion
