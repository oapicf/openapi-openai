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
open AssistantsApiHandlerParams
open AssistantsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module AssistantsApiServiceImplementation =

    //#region Service implementation
    type AssistantsApiServiceImpl() =
      interface IAssistantsApiService with

        member this.CancelRun ctx args =
            let content = "OK" :> obj :?> RunObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CancelRunStatusCode200 { content = content }

        member this.CreateAssistant ctx args =
            let content = "OK" :> obj :?> AssistantObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateAssistantStatusCode200 { content = content }

        member this.CreateMessage ctx args =
            let content = "OK" :> obj :?> MessageObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateMessageStatusCode200 { content = content }

        member this.CreateRun ctx args =
            let content = "OK" :> obj :?> RunObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateRunStatusCode200 { content = content }

        member this.CreateThread ctx args =
            let content = "OK" :> obj :?> ThreadObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateThreadStatusCode200 { content = content }

        member this.CreateThreadAndRun ctx args =
            let content = "OK" :> obj :?> RunObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateThreadAndRunStatusCode200 { content = content }

        member this.DeleteAssistant ctx args =
            let content = "OK" :> obj :?> DeleteAssistantResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteAssistantStatusCode200 { content = content }

        member this.DeleteMessage ctx args =
            let content = "OK" :> obj :?> DeleteMessageResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteMessageStatusCode200 { content = content }

        member this.DeleteThread ctx args =
            let content = "OK" :> obj :?> DeleteThreadResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteThreadStatusCode200 { content = content }

        member this.GetAssistant ctx args =
            let content = "OK" :> obj :?> AssistantObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetAssistantStatusCode200 { content = content }

        member this.GetMessage ctx args =
            let content = "OK" :> obj :?> MessageObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetMessageStatusCode200 { content = content }

        member this.GetRun ctx args =
            let content = "OK" :> obj :?> RunObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetRunStatusCode200 { content = content }

        member this.GetRunStep ctx args =
            let content = "OK" :> obj :?> RunStepObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetRunStepStatusCode200 { content = content }

        member this.GetThread ctx args =
            let content = "OK" :> obj :?> ThreadObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetThreadStatusCode200 { content = content }

        member this.ListAssistants ctx args =
            let content = "OK" :> obj :?> ListAssistantsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListAssistantsStatusCode200 { content = content }

        member this.ListMessages ctx args =
            let content = "OK" :> obj :?> ListMessagesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListMessagesStatusCode200 { content = content }

        member this.ListRunSteps ctx args =
            let content = "OK" :> obj :?> ListRunStepsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListRunStepsStatusCode200 { content = content }

        member this.ListRuns ctx args =
            let content = "OK" :> obj :?> ListRunsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListRunsStatusCode200 { content = content }

        member this.ModifyAssistant ctx args =
            let content = "OK" :> obj :?> AssistantObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ModifyAssistantStatusCode200 { content = content }

        member this.ModifyMessage ctx args =
            let content = "OK" :> obj :?> MessageObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ModifyMessageStatusCode200 { content = content }

        member this.ModifyRun ctx args =
            let content = "OK" :> obj :?> RunObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ModifyRunStatusCode200 { content = content }

        member this.ModifyThread ctx args =
            let content = "OK" :> obj :?> ThreadObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ModifyThreadStatusCode200 { content = content }

        member this.SubmitToolOuputsToRun ctx args =
            let content = "OK" :> obj :?> RunObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SubmitToolOuputsToRunStatusCode200 { content = content }

      //#endregion

    let AssistantsApiService = AssistantsApiServiceImpl() :> IAssistantsApiService