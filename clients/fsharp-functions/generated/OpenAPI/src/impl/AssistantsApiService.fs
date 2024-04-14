namespace OpenAPI
open OpenAPI.Model.AssistantFileObject
open OpenAPI.Model.AssistantObject
open OpenAPI.Model.CreateAssistantFileRequest
open OpenAPI.Model.CreateAssistantRequest
open OpenAPI.Model.CreateMessageRequest
open OpenAPI.Model.CreateRunRequest
open OpenAPI.Model.CreateThreadAndRunRequest
open OpenAPI.Model.CreateThreadRequest
open OpenAPI.Model.DeleteAssistantFileResponse
open OpenAPI.Model.DeleteAssistantResponse
open OpenAPI.Model.DeleteThreadResponse
open OpenAPI.Model.ListAssistantFilesResponse
open OpenAPI.Model.ListAssistantsResponse
open OpenAPI.Model.ListMessageFilesResponse
open OpenAPI.Model.ListMessagesResponse
open OpenAPI.Model.ListRunStepsResponse
open OpenAPI.Model.ListRunsResponse
open OpenAPI.Model.MessageFileObject
open OpenAPI.Model.MessageObject
open OpenAPI.Model.ModifyAssistantRequest
open OpenAPI.Model.ModifyMessageRequest
open OpenAPI.Model.ModifyRunRequest
open OpenAPI.Model.ModifyThreadRequest
open OpenAPI.Model.RunObject
open OpenAPI.Model.RunStepObject
open OpenAPI.Model.SubmitToolOutputsRunRequest
open OpenAPI.Model.ThreadObject
open AssistantsApiHandlerParams
open AssistantsApiServiceInterface
open System.Collections.Generic
open System

module AssistantsApiServiceImplementation =

    //#region Service implementation
    type AssistantsApiServiceImpl() =
      interface IAssistantsApiService with

        member this.CancelRun () =
            let content = "OK" :> obj :?> RunObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CancelRunStatusCode200 { content = content }

        member this.CreateAssistant (parameters:CreateAssistantBodyParams) =
            let content = "OK" :> obj :?> AssistantObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateAssistantStatusCode200 { content = content }

        member this.CreateAssistantFile (parameters:CreateAssistantFileBodyParams) =
            let content = "OK" :> obj :?> AssistantFileObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateAssistantFileStatusCode200 { content = content }

        member this.CreateMessage (parameters:CreateMessageBodyParams) =
            let content = "OK" :> obj :?> MessageObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateMessageStatusCode200 { content = content }

        member this.CreateRun (parameters:CreateRunBodyParams) =
            let content = "OK" :> obj :?> RunObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateRunStatusCode200 { content = content }

        member this.CreateThread (parameters:CreateThreadBodyParams) =
            let content = "OK" :> obj :?> ThreadObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateThreadStatusCode200 { content = content }

        member this.CreateThreadAndRun (parameters:CreateThreadAndRunBodyParams) =
            let content = "OK" :> obj :?> RunObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateThreadAndRunStatusCode200 { content = content }

        member this.DeleteAssistant () =
            let content = "OK" :> obj :?> DeleteAssistantResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteAssistantStatusCode200 { content = content }

        member this.DeleteAssistantFile () =
            let content = "OK" :> obj :?> DeleteAssistantFileResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteAssistantFileStatusCode200 { content = content }

        member this.DeleteThread () =
            let content = "OK" :> obj :?> DeleteThreadResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteThreadStatusCode200 { content = content }

        member this.GetAssistant () =
            let content = "OK" :> obj :?> AssistantObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetAssistantStatusCode200 { content = content }

        member this.GetAssistantFile () =
            let content = "OK" :> obj :?> AssistantFileObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetAssistantFileStatusCode200 { content = content }

        member this.GetMessage () =
            let content = "OK" :> obj :?> MessageObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetMessageStatusCode200 { content = content }

        member this.GetMessageFile () =
            let content = "OK" :> obj :?> MessageFileObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetMessageFileStatusCode200 { content = content }

        member this.GetRun () =
            let content = "OK" :> obj :?> RunObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetRunStatusCode200 { content = content }

        member this.GetRunStep () =
            let content = "OK" :> obj :?> RunStepObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetRunStepStatusCode200 { content = content }

        member this.GetThread () =
            let content = "OK" :> obj :?> ThreadObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetThreadStatusCode200 { content = content }

        member this.ListAssistantFiles () =
            let content = "OK" :> obj :?> ListAssistantFilesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListAssistantFilesStatusCode200 { content = content }

        member this.ListAssistants () =
            let content = "OK" :> obj :?> ListAssistantsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListAssistantsStatusCode200 { content = content }

        member this.ListMessageFiles () =
            let content = "OK" :> obj :?> ListMessageFilesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListMessageFilesStatusCode200 { content = content }

        member this.ListMessages () =
            let content = "OK" :> obj :?> ListMessagesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListMessagesStatusCode200 { content = content }

        member this.ListRunSteps () =
            let content = "OK" :> obj :?> ListRunStepsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListRunStepsStatusCode200 { content = content }

        member this.ListRuns () =
            let content = "OK" :> obj :?> ListRunsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListRunsStatusCode200 { content = content }

        member this.ModifyAssistant (parameters:ModifyAssistantBodyParams) =
            let content = "OK" :> obj :?> AssistantObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ModifyAssistantStatusCode200 { content = content }

        member this.ModifyMessage (parameters:ModifyMessageBodyParams) =
            let content = "OK" :> obj :?> MessageObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ModifyMessageStatusCode200 { content = content }

        member this.ModifyRun (parameters:ModifyRunBodyParams) =
            let content = "OK" :> obj :?> RunObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ModifyRunStatusCode200 { content = content }

        member this.ModifyThread (parameters:ModifyThreadBodyParams) =
            let content = "OK" :> obj :?> ThreadObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ModifyThreadStatusCode200 { content = content }

        member this.SubmitToolOuputsToRun (parameters:SubmitToolOuputsToRunBodyParams) =
            let content = "OK" :> obj :?> RunObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SubmitToolOuputsToRunStatusCode200 { content = content }

      //#endregion

    let AssistantsApiService = AssistantsApiServiceImpl() :> IAssistantsApiService