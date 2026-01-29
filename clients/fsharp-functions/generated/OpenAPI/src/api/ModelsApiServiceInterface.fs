namespace OpenAPI
open ModelsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ModelsApiServiceInterface =

    //#region Service interface
    type IModelsApiService =
      abstract member DeleteModel : unit -> DeleteModelResult
      abstract member ListModels : unit -> ListModelsResult
      abstract member RetrieveModel : unit -> RetrieveModelResult
    //#endregion