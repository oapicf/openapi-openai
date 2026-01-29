namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Image

module ImagesResponse =

  //#region ImagesResponse


  type ImagesResponse = {
    Created : int;
    Data : Image[];
  }
  //#endregion
