namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateCompletionResponseChoicesInner
open OpenAPI.Model.CreateCompletionResponseUsage

module CreateCompletionResponse =

  //#region CreateCompletionResponse


  type CreateCompletionResponse = {
    Id : string;
    Object : string;
    Created : int;
    Model : string;
    Choices : CreateCompletionResponseChoicesInner[];
    Usage : CreateCompletionResponseUsage;
  }
  //#endregion
