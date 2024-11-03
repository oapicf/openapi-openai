namespace OpenAPI
open ImagesApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ImagesApiServiceInterface =

    //#region Service interface
    type IImagesApiService =
      abstract member CreateImage : CreateImageBodyParams -> CreateImageResult
      abstract member CreateImageEdit : unit -> CreateImageEditResult
      abstract member CreateImageVariation : unit -> CreateImageVariationResult
    //#endregion