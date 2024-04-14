package org.openapitools

// TODO: properly handle custom imports
import java.io._
import java.util.UUID
import java.time._
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}

import org.openapitools.models._

trait DataAccessor {
    // TODO: apiInfo -> apis -> operations = TODO error
    private object TODO extends CommonError("Not implemented") {
        def message = "Not implemented"
    }

        /**
        * 
        * @return A RunObject
        */
        def Assistants_cancelRun(threadId: String, runId: String): Either[CommonError,RunObject] = Left(TODO)

        /**
        * 
        * @return A AssistantObject
        */
        def Assistants_createAssistant(createAssistantRequest: CreateAssistantRequest): Either[CommonError,AssistantObject] = Left(TODO)

        /**
        * 
        * @return A AssistantFileObject
        */
        def Assistants_createAssistantFile(assistantId: String, createAssistantFileRequest: CreateAssistantFileRequest): Either[CommonError,AssistantFileObject] = Left(TODO)

        /**
        * 
        * @return A MessageObject
        */
        def Assistants_createMessage(threadId: String, createMessageRequest: CreateMessageRequest): Either[CommonError,MessageObject] = Left(TODO)

        /**
        * 
        * @return A RunObject
        */
        def Assistants_createRun(threadId: String, createRunRequest: CreateRunRequest): Either[CommonError,RunObject] = Left(TODO)

        /**
        * 
        * @return A ThreadObject
        */
        def Assistants_createThread(createThreadRequest: CreateThreadRequest): Either[CommonError,ThreadObject] = Left(TODO)

        /**
        * 
        * @return A RunObject
        */
        def Assistants_createThreadAndRun(createThreadAndRunRequest: CreateThreadAndRunRequest): Either[CommonError,RunObject] = Left(TODO)

        /**
        * 
        * @return A DeleteAssistantResponse
        */
        def Assistants_deleteAssistant(assistantId: String): Either[CommonError,DeleteAssistantResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteAssistantFileResponse
        */
        def Assistants_deleteAssistantFile(assistantId: String, fileId: String): Either[CommonError,DeleteAssistantFileResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteThreadResponse
        */
        def Assistants_deleteThread(threadId: String): Either[CommonError,DeleteThreadResponse] = Left(TODO)

        /**
        * 
        * @return A AssistantObject
        */
        def Assistants_getAssistant(assistantId: String): Either[CommonError,AssistantObject] = Left(TODO)

        /**
        * 
        * @return A AssistantFileObject
        */
        def Assistants_getAssistantFile(assistantId: String, fileId: String): Either[CommonError,AssistantFileObject] = Left(TODO)

        /**
        * 
        * @return A MessageObject
        */
        def Assistants_getMessage(threadId: String, messageId: String): Either[CommonError,MessageObject] = Left(TODO)

        /**
        * 
        * @return A MessageFileObject
        */
        def Assistants_getMessageFile(threadId: String, messageId: String, fileId: String): Either[CommonError,MessageFileObject] = Left(TODO)

        /**
        * 
        * @return A RunObject
        */
        def Assistants_getRun(threadId: String, runId: String): Either[CommonError,RunObject] = Left(TODO)

        /**
        * 
        * @return A RunStepObject
        */
        def Assistants_getRunStep(threadId: String, runId: String, stepId: String): Either[CommonError,RunStepObject] = Left(TODO)

        /**
        * 
        * @return A ThreadObject
        */
        def Assistants_getThread(threadId: String): Either[CommonError,ThreadObject] = Left(TODO)

        /**
        * 
        * @return A ListAssistantFilesResponse
        */
        def Assistants_listAssistantFiles(assistantId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String]): Either[CommonError,ListAssistantFilesResponse] = Left(TODO)

        /**
        * 
        * @return A ListAssistantsResponse
        */
        def Assistants_listAssistants(limit: Option[Int], order: Option[String], after: Option[String], before: Option[String]): Either[CommonError,ListAssistantsResponse] = Left(TODO)

        /**
        * 
        * @return A ListMessageFilesResponse
        */
        def Assistants_listMessageFiles(threadId: String, messageId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String]): Either[CommonError,ListMessageFilesResponse] = Left(TODO)

        /**
        * 
        * @return A ListMessagesResponse
        */
        def Assistants_listMessages(threadId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String], runId: Option[String]): Either[CommonError,ListMessagesResponse] = Left(TODO)

        /**
        * 
        * @return A ListRunStepsResponse
        */
        def Assistants_listRunSteps(threadId: String, runId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String]): Either[CommonError,ListRunStepsResponse] = Left(TODO)

        /**
        * 
        * @return A ListRunsResponse
        */
        def Assistants_listRuns(threadId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String]): Either[CommonError,ListRunsResponse] = Left(TODO)

        /**
        * 
        * @return A AssistantObject
        */
        def Assistants_modifyAssistant(assistantId: String, modifyAssistantRequest: ModifyAssistantRequest): Either[CommonError,AssistantObject] = Left(TODO)

        /**
        * 
        * @return A MessageObject
        */
        def Assistants_modifyMessage(threadId: String, messageId: String, modifyMessageRequest: ModifyMessageRequest): Either[CommonError,MessageObject] = Left(TODO)

        /**
        * 
        * @return A RunObject
        */
        def Assistants_modifyRun(threadId: String, runId: String, modifyRunRequest: ModifyRunRequest): Either[CommonError,RunObject] = Left(TODO)

        /**
        * 
        * @return A ThreadObject
        */
        def Assistants_modifyThread(threadId: String, modifyThreadRequest: ModifyThreadRequest): Either[CommonError,ThreadObject] = Left(TODO)

        /**
        * 
        * @return A RunObject
        */
        def Assistants_submitToolOuputsToRun(threadId: String, runId: String, submitToolOutputsRunRequest: SubmitToolOutputsRunRequest): Either[CommonError,RunObject] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Audio_createSpeech(createSpeechRequest: CreateSpeechRequest): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A CreateTranscription200Response
        */
        def Audio_createTranscription(file: FileUpload, model: CreateTranscriptionRequestModel, language: Option[String], prompt: Option[String], responseFormat: Option[String], temperature: Option[BigDecimal], timestampGranularitiesLeft_Square_BracketRight_Square_Bracket: Seq[String]): Either[CommonError,CreateTranscription200Response] = Left(TODO)

        /**
        * 
        * @return A CreateTranslation200Response
        */
        def Audio_createTranslation(file: FileUpload, model: CreateTranscriptionRequestModel, prompt: Option[String], responseFormat: Option[String], temperature: Option[BigDecimal]): Either[CommonError,CreateTranslation200Response] = Left(TODO)

        /**
        * 
        * @return A CreateChatCompletionResponse
        */
        def Chat_createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest): Either[CommonError,CreateChatCompletionResponse] = Left(TODO)

        /**
        * 
        * @return A CreateCompletionResponse
        */
        def Completions_createCompletion(createCompletionRequest: CreateCompletionRequest): Either[CommonError,CreateCompletionResponse] = Left(TODO)

        /**
        * 
        * @return A CreateEmbeddingResponse
        */
        def Embeddings_createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest): Either[CommonError,CreateEmbeddingResponse] = Left(TODO)

        /**
        * 
        * @return A OpenAIFile
        */
        def Files_createFile(file: FileUpload, purpose: String): Either[CommonError,OpenAIFile] = Left(TODO)

        /**
        * 
        * @return A DeleteFileResponse
        */
        def Files_deleteFile(fileId: String): Either[CommonError,DeleteFileResponse] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Files_downloadFile(fileId: String): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A ListFilesResponse
        */
        def Files_listFiles(purpose: Option[String]): Either[CommonError,ListFilesResponse] = Left(TODO)

        /**
        * 
        * @return A OpenAIFile
        */
        def Files_retrieveFile(fileId: String): Either[CommonError,OpenAIFile] = Left(TODO)

        /**
        * 
        * @return A FineTuningJob
        */
        def FineTuning_cancelFineTuningJob(fineTuningJobId: String): Either[CommonError,FineTuningJob] = Left(TODO)

        /**
        * 
        * @return A FineTuningJob
        */
        def FineTuning_createFineTuningJob(createFineTuningJobRequest: CreateFineTuningJobRequest): Either[CommonError,FineTuningJob] = Left(TODO)

        /**
        * 
        * @return A ListFineTuningJobEventsResponse
        */
        def FineTuning_listFineTuningEvents(fineTuningJobId: String, after: Option[String], limit: Option[Int]): Either[CommonError,ListFineTuningJobEventsResponse] = Left(TODO)

        /**
        * 
        * @return A ListFineTuningJobCheckpointsResponse
        */
        def FineTuning_listFineTuningJobCheckpoints(fineTuningJobId: String, after: Option[String], limit: Option[Int]): Either[CommonError,ListFineTuningJobCheckpointsResponse] = Left(TODO)

        /**
        * 
        * @return A ListPaginatedFineTuningJobsResponse
        */
        def FineTuning_listPaginatedFineTuningJobs(after: Option[String], limit: Option[Int]): Either[CommonError,ListPaginatedFineTuningJobsResponse] = Left(TODO)

        /**
        * 
        * @return A FineTuningJob
        */
        def FineTuning_retrieveFineTuningJob(fineTuningJobId: String): Either[CommonError,FineTuningJob] = Left(TODO)

        /**
        * 
        * @return A ImagesResponse
        */
        def Images_createImage(createImageRequest: CreateImageRequest): Either[CommonError,ImagesResponse] = Left(TODO)

        /**
        * 
        * @return A ImagesResponse
        */
        def Images_createImageEdit(image: FileUpload, prompt: String, mask: FileUpload, model: CreateImageEditRequestModel, n: Option[Int], size: Option[String], responseFormat: Option[String], user: Option[String]): Either[CommonError,ImagesResponse] = Left(TODO)

        /**
        * 
        * @return A ImagesResponse
        */
        def Images_createImageVariation(image: FileUpload, model: CreateImageEditRequestModel, n: Option[Int], responseFormat: Option[String], size: Option[String], user: Option[String]): Either[CommonError,ImagesResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteModelResponse
        */
        def Models_deleteModel(model: String): Either[CommonError,DeleteModelResponse] = Left(TODO)

        /**
        * 
        * @return A ListModelsResponse
        */
        def Models_listModels(): Either[CommonError,ListModelsResponse] = Left(TODO)

        /**
        * 
        * @return A Model
        */
        def Models_retrieveModel(model: String): Either[CommonError,Model] = Left(TODO)

        /**
        * 
        * @return A CreateModerationResponse
        */
        def Moderations_createModeration(createModerationRequest: CreateModerationRequest): Either[CommonError,CreateModerationResponse] = Left(TODO)

}