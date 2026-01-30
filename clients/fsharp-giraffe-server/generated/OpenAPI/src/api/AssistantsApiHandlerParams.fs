namespace OpenAPI

open OpenAPI.Model.AssistantObject
open OpenAPI.Model.CreateAssistantRequest
open OpenAPI.Model.CreateMessageRequest
open OpenAPI.Model.CreateRunRequest
open OpenAPI.Model.CreateThreadAndRunRequest
open OpenAPI.Model.CreateThreadRequest
open OpenAPI.Model.DeleteAssistantResponse
open OpenAPI.Model.DeleteMessageResponse
open OpenAPI.Model.DeleteThreadResponse
open OpenAPI.Model.ListAssistantsResponse
open OpenAPI.Model.ListMessagesResponse
open OpenAPI.Model.ListRunStepsResponse
open OpenAPI.Model.ListRunsResponse
open OpenAPI.Model.MessageObject
open OpenAPI.Model.ModifyAssistantRequest
open OpenAPI.Model.ModifyMessageRequest
open OpenAPI.Model.ModifyRunRequest
open OpenAPI.Model.ModifyThreadRequest
open OpenAPI.Model.RunObject
open OpenAPI.Model.RunStepObject
open OpenAPI.Model.SubmitToolOutputsRunRequest
open OpenAPI.Model.ThreadObject
open System.Collections.Generic
open System

module AssistantsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type CancelRunPathParams = {
      threadId : string ;
    //#endregion
      runId : string ;
    }
    //#endregion


    type CancelRunStatusCode200Response = {
      content:RunObject;
      
    }
    type CancelRunResult = CancelRunStatusCode200 of CancelRunStatusCode200Response

    type CancelRunArgs = {
      pathParams:CancelRunPathParams;
    }

    //#region Body parameters
    [<CLIMutable>]
    type CreateAssistantBodyParams = CreateAssistantRequest
    //#endregion


    type CreateAssistantStatusCode200Response = {
      content:AssistantObject;
      
    }
    type CreateAssistantResult = CreateAssistantStatusCode200 of CreateAssistantStatusCode200Response

    type CreateAssistantArgs = {
      bodyParams:CreateAssistantBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CreateMessagePathParams = {
      threadId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CreateMessageBodyParams = CreateMessageRequest
    //#endregion


    type CreateMessageStatusCode200Response = {
      content:MessageObject;
      
    }
    type CreateMessageResult = CreateMessageStatusCode200 of CreateMessageStatusCode200Response

    type CreateMessageArgs = {
      pathParams:CreateMessagePathParams;
      bodyParams:CreateMessageBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CreateRunPathParams = {
      threadId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CreateRunQueryParams = {
      include : string[] option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CreateRunBodyParams = CreateRunRequest
    //#endregion


    type CreateRunStatusCode200Response = {
      content:RunObject;
      
    }
    type CreateRunResult = CreateRunStatusCode200 of CreateRunStatusCode200Response

    type CreateRunArgs = {
      pathParams:CreateRunPathParams;
      queryParams:Result<CreateRunQueryParams,string>;
      bodyParams:CreateRunBodyParams
    }

    //#region Body parameters
    [<CLIMutable>]
    type CreateThreadBodyParams = CreateThreadRequest
    //#endregion


    type CreateThreadStatusCode200Response = {
      content:ThreadObject;
      
    }
    type CreateThreadResult = CreateThreadStatusCode200 of CreateThreadStatusCode200Response

    type CreateThreadArgs = {
      bodyParams:CreateThreadBodyParams
    }

    //#region Body parameters
    [<CLIMutable>]
    type CreateThreadAndRunBodyParams = CreateThreadAndRunRequest
    //#endregion


    type CreateThreadAndRunStatusCode200Response = {
      content:RunObject;
      
    }
    type CreateThreadAndRunResult = CreateThreadAndRunStatusCode200 of CreateThreadAndRunStatusCode200Response

    type CreateThreadAndRunArgs = {
      bodyParams:CreateThreadAndRunBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteAssistantPathParams = {
      assistantId : string ;
    }
    //#endregion


    type DeleteAssistantStatusCode200Response = {
      content:DeleteAssistantResponse;
      
    }
    type DeleteAssistantResult = DeleteAssistantStatusCode200 of DeleteAssistantStatusCode200Response

    type DeleteAssistantArgs = {
      pathParams:DeleteAssistantPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteMessagePathParams = {
      threadId : string ;
    //#endregion
      messageId : string ;
    }
    //#endregion


    type DeleteMessageStatusCode200Response = {
      content:DeleteMessageResponse;
      
    }
    type DeleteMessageResult = DeleteMessageStatusCode200 of DeleteMessageStatusCode200Response

    type DeleteMessageArgs = {
      pathParams:DeleteMessagePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteThreadPathParams = {
      threadId : string ;
    }
    //#endregion


    type DeleteThreadStatusCode200Response = {
      content:DeleteThreadResponse;
      
    }
    type DeleteThreadResult = DeleteThreadStatusCode200 of DeleteThreadStatusCode200Response

    type DeleteThreadArgs = {
      pathParams:DeleteThreadPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetAssistantPathParams = {
      assistantId : string ;
    }
    //#endregion


    type GetAssistantStatusCode200Response = {
      content:AssistantObject;
      
    }
    type GetAssistantResult = GetAssistantStatusCode200 of GetAssistantStatusCode200Response

    type GetAssistantArgs = {
      pathParams:GetAssistantPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetMessagePathParams = {
      threadId : string ;
    //#endregion
      messageId : string ;
    }
    //#endregion


    type GetMessageStatusCode200Response = {
      content:MessageObject;
      
    }
    type GetMessageResult = GetMessageStatusCode200 of GetMessageStatusCode200Response

    type GetMessageArgs = {
      pathParams:GetMessagePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetRunPathParams = {
      threadId : string ;
    //#endregion
      runId : string ;
    }
    //#endregion


    type GetRunStatusCode200Response = {
      content:RunObject;
      
    }
    type GetRunResult = GetRunStatusCode200 of GetRunStatusCode200Response

    type GetRunArgs = {
      pathParams:GetRunPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetRunStepPathParams = {
      threadId : string ;
    //#endregion
      runId : string ;
    //#endregion
      stepId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetRunStepQueryParams = {
      include : string[] option;

    }
    //#endregion


    type GetRunStepStatusCode200Response = {
      content:RunStepObject;
      
    }
    type GetRunStepResult = GetRunStepStatusCode200 of GetRunStepStatusCode200Response

    type GetRunStepArgs = {
      pathParams:GetRunStepPathParams;
      queryParams:Result<GetRunStepQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetThreadPathParams = {
      threadId : string ;
    }
    //#endregion


    type GetThreadStatusCode200Response = {
      content:ThreadObject;
      
    }
    type GetThreadResult = GetThreadStatusCode200 of GetThreadStatusCode200Response

    type GetThreadArgs = {
      pathParams:GetThreadPathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type ListAssistantsQueryParams = {
      limit : int option;


      order : string option;


      after : string option;


      before : string option;

    }
    //#endregion


    type ListAssistantsStatusCode200Response = {
      content:ListAssistantsResponse;
      
    }
    type ListAssistantsResult = ListAssistantsStatusCode200 of ListAssistantsStatusCode200Response

    type ListAssistantsArgs = {
      queryParams:Result<ListAssistantsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ListMessagesPathParams = {
      threadId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type ListMessagesQueryParams = {
      limit : int option;


      order : string option;


      after : string option;


      before : string option;


      runId : string option;

    }
    //#endregion


    type ListMessagesStatusCode200Response = {
      content:ListMessagesResponse;
      
    }
    type ListMessagesResult = ListMessagesStatusCode200 of ListMessagesStatusCode200Response

    type ListMessagesArgs = {
      pathParams:ListMessagesPathParams;
      queryParams:Result<ListMessagesQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ListRunStepsPathParams = {
      threadId : string ;
    //#endregion
      runId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type ListRunStepsQueryParams = {
      limit : int option;


      order : string option;


      after : string option;


      before : string option;


      include : string[] option;

    }
    //#endregion


    type ListRunStepsStatusCode200Response = {
      content:ListRunStepsResponse;
      
    }
    type ListRunStepsResult = ListRunStepsStatusCode200 of ListRunStepsStatusCode200Response

    type ListRunStepsArgs = {
      pathParams:ListRunStepsPathParams;
      queryParams:Result<ListRunStepsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ListRunsPathParams = {
      threadId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type ListRunsQueryParams = {
      limit : int option;


      order : string option;


      after : string option;


      before : string option;

    }
    //#endregion


    type ListRunsStatusCode200Response = {
      content:ListRunsResponse;
      
    }
    type ListRunsResult = ListRunsStatusCode200 of ListRunsStatusCode200Response

    type ListRunsArgs = {
      pathParams:ListRunsPathParams;
      queryParams:Result<ListRunsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ModifyAssistantPathParams = {
      assistantId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ModifyAssistantBodyParams = ModifyAssistantRequest
    //#endregion


    type ModifyAssistantStatusCode200Response = {
      content:AssistantObject;
      
    }
    type ModifyAssistantResult = ModifyAssistantStatusCode200 of ModifyAssistantStatusCode200Response

    type ModifyAssistantArgs = {
      pathParams:ModifyAssistantPathParams;
      bodyParams:ModifyAssistantBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type ModifyMessagePathParams = {
      threadId : string ;
    //#endregion
      messageId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ModifyMessageBodyParams = ModifyMessageRequest
    //#endregion


    type ModifyMessageStatusCode200Response = {
      content:MessageObject;
      
    }
    type ModifyMessageResult = ModifyMessageStatusCode200 of ModifyMessageStatusCode200Response

    type ModifyMessageArgs = {
      pathParams:ModifyMessagePathParams;
      bodyParams:ModifyMessageBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type ModifyRunPathParams = {
      threadId : string ;
    //#endregion
      runId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ModifyRunBodyParams = ModifyRunRequest
    //#endregion


    type ModifyRunStatusCode200Response = {
      content:RunObject;
      
    }
    type ModifyRunResult = ModifyRunStatusCode200 of ModifyRunStatusCode200Response

    type ModifyRunArgs = {
      pathParams:ModifyRunPathParams;
      bodyParams:ModifyRunBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type ModifyThreadPathParams = {
      threadId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ModifyThreadBodyParams = ModifyThreadRequest
    //#endregion


    type ModifyThreadStatusCode200Response = {
      content:ThreadObject;
      
    }
    type ModifyThreadResult = ModifyThreadStatusCode200 of ModifyThreadStatusCode200Response

    type ModifyThreadArgs = {
      pathParams:ModifyThreadPathParams;
      bodyParams:ModifyThreadBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type SubmitToolOuputsToRunPathParams = {
      threadId : string ;
    //#endregion
      runId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type SubmitToolOuputsToRunBodyParams = SubmitToolOutputsRunRequest
    //#endregion


    type SubmitToolOuputsToRunStatusCode200Response = {
      content:RunObject;
      
    }
    type SubmitToolOuputsToRunResult = SubmitToolOuputsToRunStatusCode200 of SubmitToolOuputsToRunStatusCode200Response

    type SubmitToolOuputsToRunArgs = {
      pathParams:SubmitToolOuputsToRunPathParams;
      bodyParams:SubmitToolOuputsToRunBodyParams
    }
