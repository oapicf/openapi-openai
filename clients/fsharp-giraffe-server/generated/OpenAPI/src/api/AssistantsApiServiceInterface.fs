namespace OpenAPI
open AssistantsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module AssistantsApiServiceInterface =

    //#region Service interface
    type IAssistantsApiService =
      abstract member CancelRun:HttpContext -> CancelRunArgs->CancelRunResult
      abstract member CreateAssistant:HttpContext -> CreateAssistantArgs->CreateAssistantResult
      abstract member CreateAssistantFile:HttpContext -> CreateAssistantFileArgs->CreateAssistantFileResult
      abstract member CreateMessage:HttpContext -> CreateMessageArgs->CreateMessageResult
      abstract member CreateRun:HttpContext -> CreateRunArgs->CreateRunResult
      abstract member CreateThread:HttpContext -> CreateThreadArgs->CreateThreadResult
      abstract member CreateThreadAndRun:HttpContext -> CreateThreadAndRunArgs->CreateThreadAndRunResult
      abstract member DeleteAssistant:HttpContext -> DeleteAssistantArgs->DeleteAssistantResult
      abstract member DeleteAssistantFile:HttpContext -> DeleteAssistantFileArgs->DeleteAssistantFileResult
      abstract member DeleteThread:HttpContext -> DeleteThreadArgs->DeleteThreadResult
      abstract member GetAssistant:HttpContext -> GetAssistantArgs->GetAssistantResult
      abstract member GetAssistantFile:HttpContext -> GetAssistantFileArgs->GetAssistantFileResult
      abstract member GetMessage:HttpContext -> GetMessageArgs->GetMessageResult
      abstract member GetMessageFile:HttpContext -> GetMessageFileArgs->GetMessageFileResult
      abstract member GetRun:HttpContext -> GetRunArgs->GetRunResult
      abstract member GetRunStep:HttpContext -> GetRunStepArgs->GetRunStepResult
      abstract member GetThread:HttpContext -> GetThreadArgs->GetThreadResult
      abstract member ListAssistantFiles:HttpContext -> ListAssistantFilesArgs->ListAssistantFilesResult
      abstract member ListAssistants:HttpContext -> ListAssistantsArgs->ListAssistantsResult
      abstract member ListMessageFiles:HttpContext -> ListMessageFilesArgs->ListMessageFilesResult
      abstract member ListMessages:HttpContext -> ListMessagesArgs->ListMessagesResult
      abstract member ListRunSteps:HttpContext -> ListRunStepsArgs->ListRunStepsResult
      abstract member ListRuns:HttpContext -> ListRunsArgs->ListRunsResult
      abstract member ModifyAssistant:HttpContext -> ModifyAssistantArgs->ModifyAssistantResult
      abstract member ModifyMessage:HttpContext -> ModifyMessageArgs->ModifyMessageResult
      abstract member ModifyRun:HttpContext -> ModifyRunArgs->ModifyRunResult
      abstract member ModifyThread:HttpContext -> ModifyThreadArgs->ModifyThreadResult
      abstract member SubmitToolOuputsToRun:HttpContext -> SubmitToolOuputsToRunArgs->SubmitToolOuputsToRunResult
    //#endregion