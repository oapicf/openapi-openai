namespace OpenAPI

open OpenAPI.Model.AudioResponseFormat
open OpenAPI.Model.CreateSpeechRequest
open OpenAPI.Model.CreateTranscription200Response
open OpenAPI.Model.CreateTranscriptionRequestModel
open OpenAPI.Model.CreateTranslation200Response
open System.Collections.Generic
open System

module AudioApiHandlerParams =


    //#region Body parameters
    [<CLIMutable>]
    type CreateSpeechBodyParams = CreateSpeechRequest
    //#endregion


    type CreateSpeechStatusCode200Response = {
      content:System.IO.Stream;
      
    }
    type CreateSpeechResult = CreateSpeechStatusCode200 of CreateSpeechStatusCode200Response

    type CreateSpeechArgs = {
      bodyParams:CreateSpeechBodyParams
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
      language : string option;
    //#endregion

    //#region Form parameters
      prompt : string option;
    //#endregion

    //#region Form parameters
      responseFormat : AudioResponseFormat option;
    //#endregion

    //#region Form parameters
      temperature : decimal option;
    //#endregion

    //#region Form parameters
      timestampGranularities : string[] option;
    }
    //#endregion


    type CreateTranscriptionStatusCode200Response = {
      content:CreateTranscription200Response;
      
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
      responseFormat : AudioResponseFormat option;
    //#endregion

    //#region Form parameters
      temperature : decimal option;
    }
    //#endregion


    type CreateTranslationStatusCode200Response = {
      content:CreateTranslation200Response;
      
    }
    type CreateTranslationResult = CreateTranslationStatusCode200 of CreateTranslationStatusCode200Response

    type CreateTranslationArgs = {
      formParams:Result<CreateTranslationFormParams,string>
    }
