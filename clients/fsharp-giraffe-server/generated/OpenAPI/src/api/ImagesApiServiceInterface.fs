namespace OpenAPI
open ImagesApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ImagesApiServiceInterface =

    //#region Service interface
    type IImagesApiService =
      abstract member CreateImage:HttpContext -> CreateImageArgs->CreateImageResult
      abstract member CreateImageEdit:HttpContext -> CreateImageEditArgs->CreateImageEditResult
      abstract member CreateImageVariation:HttpContext -> CreateImageVariationArgs->CreateImageVariationResult
    //#endregion