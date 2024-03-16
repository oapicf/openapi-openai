namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ImagesResponseDataInner

module ImagesResponse =

  //#region ImagesResponse


  type ImagesResponse = {
    Created : int;
    Data : ImagesResponseDataInner[];
  }
  //#endregion
