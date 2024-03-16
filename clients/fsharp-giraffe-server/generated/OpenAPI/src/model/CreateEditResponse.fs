namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateCompletionResponseUsage
open OpenAPI.Model.CreateEditResponseChoicesInner

module CreateEditResponse =

  //#region CreateEditResponse


  type CreateEditResponse = {
    Object : string;
    Created : int;
    Choices : CreateEditResponseChoicesInner[];
    Usage : CreateCompletionResponseUsage;
  }
  //#endregion
