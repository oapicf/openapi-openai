namespace OpenAPI
open AssistantsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module AssistantsApiServiceInterface =

    //#region Service interface
    type IAssistantsApiService =
      abstract member CancelRun : unit -> CancelRunResult
      abstract member CreateAssistant : CreateAssistantBodyParams -> CreateAssistantResult
      abstract member CreateAssistantFile : CreateAssistantFileBodyParams -> CreateAssistantFileResult
      abstract member CreateMessage : CreateMessageBodyParams -> CreateMessageResult
      abstract member CreateRun : CreateRunBodyParams -> CreateRunResult
      abstract member CreateThread : CreateThreadBodyParams -> CreateThreadResult
      abstract member CreateThreadAndRun : CreateThreadAndRunBodyParams -> CreateThreadAndRunResult
      abstract member DeleteAssistant : unit -> DeleteAssistantResult
      abstract member DeleteAssistantFile : unit -> DeleteAssistantFileResult
      abstract member DeleteThread : unit -> DeleteThreadResult
      abstract member GetAssistant : unit -> GetAssistantResult
      abstract member GetAssistantFile : unit -> GetAssistantFileResult
      abstract member GetMessage : unit -> GetMessageResult
      abstract member GetMessageFile : unit -> GetMessageFileResult
      abstract member GetRun : unit -> GetRunResult
      abstract member GetRunStep : unit -> GetRunStepResult
      abstract member GetThread : unit -> GetThreadResult
      abstract member ListAssistantFiles : unit -> ListAssistantFilesResult
      abstract member ListAssistants : unit -> ListAssistantsResult
      abstract member ListMessageFiles : unit -> ListMessageFilesResult
      abstract member ListMessages : unit -> ListMessagesResult
      abstract member ListRunSteps : unit -> ListRunStepsResult
      abstract member ListRuns : unit -> ListRunsResult
      abstract member ModifyAssistant : ModifyAssistantBodyParams -> ModifyAssistantResult
      abstract member ModifyMessage : ModifyMessageBodyParams -> ModifyMessageResult
      abstract member ModifyRun : ModifyRunBodyParams -> ModifyRunResult
      abstract member ModifyThread : ModifyThreadBodyParams -> ModifyThreadResult
      abstract member SubmitToolOuputsToRun : SubmitToolOuputsToRunBodyParams -> SubmitToolOuputsToRunResult
    //#endregion