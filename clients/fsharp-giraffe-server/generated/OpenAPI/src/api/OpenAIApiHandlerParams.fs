namespace OpenAPI

open OpenAPI.Model.CreateChatCompletionRequest
open OpenAPI.Model.CreateChatCompletionResponse
open OpenAPI.Model.CreateCompletionRequest
open OpenAPI.Model.CreateCompletionResponse
open OpenAPI.Model.CreateEditRequest
open OpenAPI.Model.CreateEditResponse
open OpenAPI.Model.CreateEmbeddingRequest
open OpenAPI.Model.CreateEmbeddingResponse
open OpenAPI.Model.CreateFineTuneRequest
open OpenAPI.Model.CreateImageRequest
open OpenAPI.Model.CreateModerationRequest
open OpenAPI.Model.CreateModerationResponse
open OpenAPI.Model.CreateTranscriptionRequestModel
open OpenAPI.Model.CreateTranscriptionResponse
open OpenAPI.Model.CreateTranslationResponse
open OpenAPI.Model.DeleteFileResponse
open OpenAPI.Model.DeleteModelResponse
open OpenAPI.Model.FineTune
open OpenAPI.Model.ImagesResponse
open OpenAPI.Model.ListFilesResponse
open OpenAPI.Model.ListFineTuneEventsResponse
open OpenAPI.Model.ListFineTunesResponse
open OpenAPI.Model.ListModelsResponse
open OpenAPI.Model.Model
open OpenAPI.Model.OpenAIFile
open OpenAPI.Model.int option
open OpenAPI.Model.string option
open System.Collections.Generic
open System

module OpenAIApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type CancelFineTunePathParams = {
      fineTuneId : string ;
    }
    //#endregion


    type CancelFineTuneStatusCode200Response = {
      content:FineTune;
      
    }
    type CancelFineTuneResult = CancelFineTuneStatusCode200 of CancelFineTuneStatusCode200Response

    type CancelFineTuneArgs = {
      pathParams:CancelFineTunePathParams;
    }

    //#region Body parameters
    [<CLIMutable>]
    type CreateChatCompletionBodyParams = CreateChatCompletionRequest
    //#endregion


    type CreateChatCompletionStatusCode200Response = {
      content:CreateChatCompletionResponse;
      
    }
    type CreateChatCompletionResult = CreateChatCompletionStatusCode200 of CreateChatCompletionStatusCode200Response

    type CreateChatCompletionArgs = {
      bodyParams:CreateChatCompletionBodyParams
    }

    //#region Body parameters
    [<CLIMutable>]
    type CreateCompletionBodyParams = CreateCompletionRequest
    //#endregion


    type CreateCompletionStatusCode200Response = {
      content:CreateCompletionResponse;
      
    }
    type CreateCompletionResult = CreateCompletionStatusCode200 of CreateCompletionStatusCode200Response

    type CreateCompletionArgs = {
      bodyParams:CreateCompletionBodyParams
    }

    //#region Body parameters
    [<CLIMutable>]
    type CreateEditBodyParams = CreateEditRequest
    //#endregion


    type CreateEditStatusCode200Response = {
      content:CreateEditResponse;
      
    }
    type CreateEditResult = CreateEditStatusCode200 of CreateEditStatusCode200Response

    type CreateEditArgs = {
      bodyParams:CreateEditBodyParams
    }

    //#region Body parameters
    [<CLIMutable>]
    type CreateEmbeddingBodyParams = CreateEmbeddingRequest
    //#endregion


    type CreateEmbeddingStatusCode200Response = {
      content:CreateEmbeddingResponse;
      
    }
    type CreateEmbeddingResult = CreateEmbeddingStatusCode200 of CreateEmbeddingStatusCode200Response

    type CreateEmbeddingArgs = {
      bodyParams:CreateEmbeddingBodyParams
    }

    //#region Form parameters
    [<CLIMutable>]
    type CreateFileFormParams = {
      file : System.IO.Stream ;
    //#endregion

    //#region Form parameters
      purpose : string ;
    }
    //#endregion


    type CreateFileStatusCode200Response = {
      content:OpenAIFile;
      
    }
    type CreateFileResult = CreateFileStatusCode200 of CreateFileStatusCode200Response

    type CreateFileArgs = {
      formParams:Result<CreateFileFormParams,string>
    }

    //#region Body parameters
    [<CLIMutable>]
    type CreateFineTuneBodyParams = CreateFineTuneRequest
    //#endregion


    type CreateFineTuneStatusCode200Response = {
      content:FineTune;
      
    }
    type CreateFineTuneResult = CreateFineTuneStatusCode200 of CreateFineTuneStatusCode200Response

    type CreateFineTuneArgs = {
      bodyParams:CreateFineTuneBodyParams
    }

    //#region Body parameters
    [<CLIMutable>]
    type CreateImageBodyParams = CreateImageRequest
    //#endregion


    type CreateImageStatusCode200Response = {
      content:ImagesResponse;
      
    }
    type CreateImageResult = CreateImageStatusCode200 of CreateImageStatusCode200Response

    type CreateImageArgs = {
      bodyParams:CreateImageBodyParams
    }

    //#region Form parameters
    [<CLIMutable>]
    type CreateImageEditFormParams = {
      image : System.IO.Stream ;
    //#endregion

    //#region Form parameters
      mask : System.IO.Stream option;
    //#endregion

    //#region Form parameters
      prompt : string ;
    //#endregion

    //#region Form parameters
      n : int option option;
    //#endregion

    //#region Form parameters
      size : string option option;
    //#endregion

    //#region Form parameters
      responseFormat : string option option;
    //#endregion

    //#region Form parameters
      user : string option;
    }
    //#endregion


    type CreateImageEditStatusCode200Response = {
      content:ImagesResponse;
      
    }
    type CreateImageEditResult = CreateImageEditStatusCode200 of CreateImageEditStatusCode200Response

    type CreateImageEditArgs = {
      formParams:Result<CreateImageEditFormParams,string>
    }

    //#region Form parameters
    [<CLIMutable>]
    type CreateImageVariationFormParams = {
      image : System.IO.Stream ;
    //#endregion

    //#region Form parameters
      n : int option option;
    //#endregion

    //#region Form parameters
      size : string option option;
    //#endregion

    //#region Form parameters
      responseFormat : string option option;
    //#endregion

    //#region Form parameters
      user : string option;
    }
    //#endregion


    type CreateImageVariationStatusCode200Response = {
      content:ImagesResponse;
      
    }
    type CreateImageVariationResult = CreateImageVariationStatusCode200 of CreateImageVariationStatusCode200Response

    type CreateImageVariationArgs = {
      formParams:Result<CreateImageVariationFormParams,string>
    }

    //#region Body parameters
    [<CLIMutable>]
    type CreateModerationBodyParams = CreateModerationRequest
    //#endregion


    type CreateModerationStatusCode200Response = {
      content:CreateModerationResponse;
      
    }
    type CreateModerationResult = CreateModerationStatusCode200 of CreateModerationStatusCode200Response

    type CreateModerationArgs = {
      bodyParams:CreateModerationBodyParams
    }

    //#region Form parameters
    [<CLIMutable>]
    type CreateTranscriptionFormParams = {
      file : System.IO.Stream ;
    //#endregion

    //#region Form parameters
      model : CreateTranscriptionRequestModel ;
    //#endregion

    //#region Form parameters
      prompt : string option;
    //#endregion

    //#region Form parameters
      responseFormat : string option;
    //#endregion

    //#region Form parameters
      temperature : decimal option;
    //#endregion

    //#region Form parameters
      language : string option;
    }
    //#endregion


    type CreateTranscriptionStatusCode200Response = {
      content:CreateTranscriptionResponse;
      
    }
    type CreateTranscriptionResult = CreateTranscriptionStatusCode200 of CreateTranscriptionStatusCode200Response

    type CreateTranscriptionArgs = {
      formParams:Result<CreateTranscriptionFormParams,string>
    }

    //#region Form parameters
    [<CLIMutable>]
    type CreateTranslationFormParams = {
      file : System.IO.Stream ;
    //#endregion

    //#region Form parameters
      model : CreateTranscriptionRequestModel ;
    //#endregion

    //#region Form parameters
      prompt : string option;
    //#endregion

    //#region Form parameters
      responseFormat : string option;
    //#endregion

    //#region Form parameters
      temperature : decimal option;
    }
    //#endregion


    type CreateTranslationStatusCode200Response = {
      content:CreateTranslationResponse;
      
    }
    type CreateTranslationResult = CreateTranslationStatusCode200 of CreateTranslationStatusCode200Response

    type CreateTranslationArgs = {
      formParams:Result<CreateTranslationFormParams,string>
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteFilePathParams = {
      fileId : string ;
    }
    //#endregion


    type DeleteFileStatusCode200Response = {
      content:DeleteFileResponse;
      
    }
    type DeleteFileResult = DeleteFileStatusCode200 of DeleteFileStatusCode200Response

    type DeleteFileArgs = {
      pathParams:DeleteFilePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteModelPathParams = {
      model : string ;
    }
    //#endregion


    type DeleteModelStatusCode200Response = {
      content:DeleteModelResponse;
      
    }
    type DeleteModelResult = DeleteModelStatusCode200 of DeleteModelStatusCode200Response

    type DeleteModelArgs = {
      pathParams:DeleteModelPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type DownloadFilePathParams = {
      fileId : string ;
    }
    //#endregion


    type DownloadFileStatusCode200Response = {
      content:string;
      
    }
    type DownloadFileResult = DownloadFileStatusCode200 of DownloadFileStatusCode200Response

    type DownloadFileArgs = {
      pathParams:DownloadFilePathParams;
    }


    type ListFilesStatusCode200Response = {
      content:ListFilesResponse;
      
    }
    type ListFilesResult = ListFilesStatusCode200 of ListFilesStatusCode200Response

    //#region Path parameters
    [<CLIMutable>]
    type ListFineTuneEventsPathParams = {
      fineTuneId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type ListFineTuneEventsQueryParams = {
      stream : bool option;

    }
    //#endregion


    type ListFineTuneEventsStatusCode200Response = {
      content:ListFineTuneEventsResponse;
      
    }
    type ListFineTuneEventsResult = ListFineTuneEventsStatusCode200 of ListFineTuneEventsStatusCode200Response

    type ListFineTuneEventsArgs = {
      pathParams:ListFineTuneEventsPathParams;
      queryParams:Result<ListFineTuneEventsQueryParams,string>;
    }


    type ListFineTunesStatusCode200Response = {
      content:ListFineTunesResponse;
      
    }
    type ListFineTunesResult = ListFineTunesStatusCode200 of ListFineTunesStatusCode200Response



    type ListModelsStatusCode200Response = {
      content:ListModelsResponse;
      
    }
    type ListModelsResult = ListModelsStatusCode200 of ListModelsStatusCode200Response

    //#region Path parameters
    [<CLIMutable>]
    type RetrieveFilePathParams = {
      fileId : string ;
    }
    //#endregion


    type RetrieveFileStatusCode200Response = {
      content:OpenAIFile;
      
    }
    type RetrieveFileResult = RetrieveFileStatusCode200 of RetrieveFileStatusCode200Response

    type RetrieveFileArgs = {
      pathParams:RetrieveFilePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type RetrieveFineTunePathParams = {
      fineTuneId : string ;
    }
    //#endregion


    type RetrieveFineTuneStatusCode200Response = {
      content:FineTune;
      
    }
    type RetrieveFineTuneResult = RetrieveFineTuneStatusCode200 of RetrieveFineTuneStatusCode200Response

    type RetrieveFineTuneArgs = {
      pathParams:RetrieveFineTunePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type RetrieveModelPathParams = {
      model : string ;
    }
    //#endregion


    type RetrieveModelStatusCode200Response = {
      content:Model;
      
    }
    type RetrieveModelResult = RetrieveModelStatusCode200 of RetrieveModelStatusCode200Response

    type RetrieveModelArgs = {
      pathParams:RetrieveModelPathParams;
    }
