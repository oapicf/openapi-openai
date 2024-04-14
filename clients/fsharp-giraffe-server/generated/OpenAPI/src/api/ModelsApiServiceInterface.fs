namespace OpenAPI
open ModelsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ModelsApiServiceInterface =

    //#region Service interface
    type IModelsApiService =
      abstract member DeleteModel:HttpContext -> DeleteModelArgs->DeleteModelResult
      abstract member ListModels:HttpContext ->ListModelsResult
      abstract member RetrieveModel:HttpContext -> RetrieveModelArgs->RetrieveModelResult
    //#endregion