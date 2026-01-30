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
        * @return A MessageObject
        */
        def Assistants_createMessage(threadId: String, createMessageRequest: CreateMessageRequest): Either[CommonError,MessageObject] = Left(TODO)

        /**
        * 
        * @return A RunObject
        */
        def Assistants_createRun(threadId: String, createRunRequest: CreateRunRequest, includeLeft_Square_BracketRight_Square_Bracket: Seq[String]): Either[CommonError,RunObject] = Left(TODO)

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
        * @return A DeleteMessageResponse
        */
        def Assistants_deleteMessage(threadId: String, messageId: String): Either[CommonError,DeleteMessageResponse] = Left(TODO)

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
        * @return A MessageObject
        */
        def Assistants_getMessage(threadId: String, messageId: String): Either[CommonError,MessageObject] = Left(TODO)

        /**
        * 
        * @return A RunObject
        */
        def Assistants_getRun(threadId: String, runId: String): Either[CommonError,RunObject] = Left(TODO)

        /**
        * 
        * @return A RunStepObject
        */
        def Assistants_getRunStep(threadId: String, runId: String, stepId: String, includeLeft_Square_BracketRight_Square_Bracket: Seq[String]): Either[CommonError,RunStepObject] = Left(TODO)

        /**
        * 
        * @return A ThreadObject
        */
        def Assistants_getThread(threadId: String): Either[CommonError,ThreadObject] = Left(TODO)

        /**
        * 
        * @return A ListAssistantsResponse
        */
        def Assistants_listAssistants(limit: Option[Int], order: Option[String], after: Option[String], before: Option[String]): Either[CommonError,ListAssistantsResponse] = Left(TODO)

        /**
        * 
        * @return A ListMessagesResponse
        */
        def Assistants_listMessages(threadId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String], runId: Option[String]): Either[CommonError,ListMessagesResponse] = Left(TODO)

        /**
        * 
        * @return A ListRunStepsResponse
        */
        def Assistants_listRunSteps(threadId: String, runId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String], includeLeft_Square_BracketRight_Square_Bracket: Seq[String]): Either[CommonError,ListRunStepsResponse] = Left(TODO)

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
        def Audio_createTranscription(file: FileUpload, model: CreateTranscriptionRequestModel, language: Option[String], prompt: Option[String], responseFormat: AudioResponseFormat, temperature: Option[BigDecimal], timestampGranularitiesLeft_Square_BracketRight_Square_Bracket: Seq[String]): Either[CommonError,CreateTranscription200Response] = Left(TODO)

        /**
        * 
        * @return A CreateTranslation200Response
        */
        def Audio_createTranslation(file: FileUpload, model: CreateTranscriptionRequestModel, prompt: Option[String], responseFormat: AudioResponseFormat, temperature: Option[BigDecimal]): Either[CommonError,CreateTranslation200Response] = Left(TODO)

        /**
        * 
        * @return A ListAuditLogsResponse
        */
        def AuditLogs_listAuditLogs(effectiveAt: Option[ListAuditLogsEffectiveAtParameter], projectIdsLeft_Square_BracketRight_Square_Bracket: Seq[String], eventTypesLeft_Square_BracketRight_Square_Bracket: Seq[AuditLogEventType], actorIdsLeft_Square_BracketRight_Square_Bracket: Seq[String], actorEmailsLeft_Square_BracketRight_Square_Bracket: Seq[String], resourceIdsLeft_Square_BracketRight_Square_Bracket: Seq[String], limit: Option[Int], after: Option[String], before: Option[String]): Either[CommonError,ListAuditLogsResponse] = Left(TODO)

        /**
        * 
        * @return A Batch
        */
        def Batch_cancelBatch(batchId: String): Either[CommonError,Batch] = Left(TODO)

        /**
        * 
        * @return A Batch
        */
        def Batch_createBatch(createBatchRequest: CreateBatchRequest): Either[CommonError,Batch] = Left(TODO)

        /**
        * 
        * @return A ListBatchesResponse
        */
        def Batch_listBatches(after: Option[String], limit: Option[Int]): Either[CommonError,ListBatchesResponse] = Left(TODO)

        /**
        * 
        * @return A Batch
        */
        def Batch_retrieveBatch(batchId: String): Either[CommonError,Batch] = Left(TODO)

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
        * @return A AdminApiKey
        */
        def Default_adminApiKeysCreate(adminApiKeysCreateRequest: AdminApiKeysCreateRequest): Either[CommonError,AdminApiKey] = Left(TODO)

        /**
        * 
        * @return A AdminApiKeysDelete200Response
        */
        def Default_adminApiKeysDelete(keyId: String): Either[CommonError,AdminApiKeysDelete200Response] = Left(TODO)

        /**
        * 
        * @return A AdminApiKey
        */
        def Default_adminApiKeysGet(keyId: String): Either[CommonError,AdminApiKey] = Left(TODO)

        /**
        * 
        * @return A ApiKeyList
        */
        def Default_adminApiKeysList(after: Option[String], order: Option[String], limit: Option[Int]): Either[CommonError,ApiKeyList] = Left(TODO)

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
        def Files_listFiles(purpose: Option[String], limit: Option[Int], order: Option[String], after: Option[String]): Either[CommonError,ListFilesResponse] = Left(TODO)

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
        * @return A InviteDeleteResponse
        */
        def Invites_deleteInvite(inviteId: String): Either[CommonError,InviteDeleteResponse] = Left(TODO)

        /**
        * 
        * @return A Invite
        */
        def Invites_inviteUser(inviteRequest: InviteRequest): Either[CommonError,Invite] = Left(TODO)

        /**
        * 
        * @return A InviteListResponse
        */
        def Invites_listInvites(limit: Option[Int], after: Option[String]): Either[CommonError,InviteListResponse] = Left(TODO)

        /**
        * 
        * @return A Invite
        */
        def Invites_retrieveInvite(inviteId: String): Either[CommonError,Invite] = Left(TODO)

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

        /**
        * 
        * @return A Project
        */
        def Projects_archiveProject(projectId: String): Either[CommonError,Project] = Left(TODO)

        /**
        * 
        * @return A Project
        */
        def Projects_createProject(projectCreateRequest: ProjectCreateRequest): Either[CommonError,Project] = Left(TODO)

        /**
        * 
        * @return A ProjectServiceAccountCreateResponse
        */
        def Projects_createProjectServiceAccount(projectId: String, projectServiceAccountCreateRequest: ProjectServiceAccountCreateRequest): Either[CommonError,ProjectServiceAccountCreateResponse] = Left(TODO)

        /**
        * 
        * @return A ProjectUser
        */
        def Projects_createProjectUser(projectId: String, projectUserCreateRequest: ProjectUserCreateRequest): Either[CommonError,ProjectUser] = Left(TODO)

        /**
        * 
        * @return A ProjectApiKeyDeleteResponse
        */
        def Projects_deleteProjectApiKey(projectId: String, keyId: String): Either[CommonError,ProjectApiKeyDeleteResponse] = Left(TODO)

        /**
        * 
        * @return A ProjectServiceAccountDeleteResponse
        */
        def Projects_deleteProjectServiceAccount(projectId: String, serviceAccountId: String): Either[CommonError,ProjectServiceAccountDeleteResponse] = Left(TODO)

        /**
        * 
        * @return A ProjectUserDeleteResponse
        */
        def Projects_deleteProjectUser(projectId: String, userId: String): Either[CommonError,ProjectUserDeleteResponse] = Left(TODO)

        /**
        * 
        * @return A ProjectApiKeyListResponse
        */
        def Projects_listProjectApiKeys(projectId: String, limit: Option[Int], after: Option[String]): Either[CommonError,ProjectApiKeyListResponse] = Left(TODO)

        /**
        * 
        * @return A ProjectRateLimitListResponse
        */
        def Projects_listProjectRateLimits(projectId: String, limit: Option[Int], after: Option[String], before: Option[String]): Either[CommonError,ProjectRateLimitListResponse] = Left(TODO)

        /**
        * 
        * @return A ProjectServiceAccountListResponse
        */
        def Projects_listProjectServiceAccounts(projectId: String, limit: Option[Int], after: Option[String]): Either[CommonError,ProjectServiceAccountListResponse] = Left(TODO)

        /**
        * 
        * @return A ProjectUserListResponse
        */
        def Projects_listProjectUsers(projectId: String, limit: Option[Int], after: Option[String]): Either[CommonError,ProjectUserListResponse] = Left(TODO)

        /**
        * 
        * @return A ProjectListResponse
        */
        def Projects_listProjects(limit: Option[Int], after: Option[String], includeArchived: Option[Boolean]): Either[CommonError,ProjectListResponse] = Left(TODO)

        /**
        * 
        * @return A Project
        */
        def Projects_modifyProject(projectId: String, projectUpdateRequest: ProjectUpdateRequest): Either[CommonError,Project] = Left(TODO)

        /**
        * 
        * @return A ProjectUser
        */
        def Projects_modifyProjectUser(projectId: String, userId: String, projectUserUpdateRequest: ProjectUserUpdateRequest): Either[CommonError,ProjectUser] = Left(TODO)

        /**
        * 
        * @return A Project
        */
        def Projects_retrieveProject(projectId: String): Either[CommonError,Project] = Left(TODO)

        /**
        * 
        * @return A ProjectApiKey
        */
        def Projects_retrieveProjectApiKey(projectId: String, keyId: String): Either[CommonError,ProjectApiKey] = Left(TODO)

        /**
        * 
        * @return A ProjectServiceAccount
        */
        def Projects_retrieveProjectServiceAccount(projectId: String, serviceAccountId: String): Either[CommonError,ProjectServiceAccount] = Left(TODO)

        /**
        * 
        * @return A ProjectUser
        */
        def Projects_retrieveProjectUser(projectId: String, userId: String): Either[CommonError,ProjectUser] = Left(TODO)

        /**
        * 
        * @return A ProjectRateLimit
        */
        def Projects_updateProjectRateLimits(projectId: String, rateLimitId: String, projectRateLimitUpdateRequest: ProjectRateLimitUpdateRequest): Either[CommonError,ProjectRateLimit] = Left(TODO)

        /**
        * 
        * @return A RealtimeSessionCreateResponse
        */
        def Realtime_createRealtimeSession(realtimeSessionCreateRequest: RealtimeSessionCreateRequest): Either[CommonError,RealtimeSessionCreateResponse] = Left(TODO)

        /**
        * 
        * @return A UploadPart
        */
        def Uploads_addUploadPart(uploadId: String, data: FileUpload): Either[CommonError,UploadPart] = Left(TODO)

        /**
        * 
        * @return A Upload
        */
        def Uploads_cancelUpload(uploadId: String): Either[CommonError,Upload] = Left(TODO)

        /**
        * 
        * @return A Upload
        */
        def Uploads_completeUpload(uploadId: String, completeUploadRequest: CompleteUploadRequest): Either[CommonError,Upload] = Left(TODO)

        /**
        * 
        * @return A Upload
        */
        def Uploads_createUpload(createUploadRequest: CreateUploadRequest): Either[CommonError,Upload] = Left(TODO)

        /**
        * 
        * @return A UsageResponse
        */
        def Usage_usageAudioSpeeches(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Seq[String], userIds: Seq[String], apiKeyIds: Seq[String], models: Seq[String], groupBy: Seq[String], limit: Option[Int], page: Option[String]): Either[CommonError,UsageResponse] = Left(TODO)

        /**
        * 
        * @return A UsageResponse
        */
        def Usage_usageAudioTranscriptions(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Seq[String], userIds: Seq[String], apiKeyIds: Seq[String], models: Seq[String], groupBy: Seq[String], limit: Option[Int], page: Option[String]): Either[CommonError,UsageResponse] = Left(TODO)

        /**
        * 
        * @return A UsageResponse
        */
        def Usage_usageCodeInterpreterSessions(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Seq[String], groupBy: Seq[String], limit: Option[Int], page: Option[String]): Either[CommonError,UsageResponse] = Left(TODO)

        /**
        * 
        * @return A UsageResponse
        */
        def Usage_usageCompletions(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Seq[String], userIds: Seq[String], apiKeyIds: Seq[String], models: Seq[String], batch: Option[Boolean], groupBy: Seq[String], limit: Option[Int], page: Option[String]): Either[CommonError,UsageResponse] = Left(TODO)

        /**
        * 
        * @return A UsageResponse
        */
        def Usage_usageCosts(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Seq[String], groupBy: Seq[String], limit: Option[Int], page: Option[String]): Either[CommonError,UsageResponse] = Left(TODO)

        /**
        * 
        * @return A UsageResponse
        */
        def Usage_usageEmbeddings(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Seq[String], userIds: Seq[String], apiKeyIds: Seq[String], models: Seq[String], groupBy: Seq[String], limit: Option[Int], page: Option[String]): Either[CommonError,UsageResponse] = Left(TODO)

        /**
        * 
        * @return A UsageResponse
        */
        def Usage_usageImages(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], sources: Seq[String], sizes: Seq[String], projectIds: Seq[String], userIds: Seq[String], apiKeyIds: Seq[String], models: Seq[String], groupBy: Seq[String], limit: Option[Int], page: Option[String]): Either[CommonError,UsageResponse] = Left(TODO)

        /**
        * 
        * @return A UsageResponse
        */
        def Usage_usageModerations(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Seq[String], userIds: Seq[String], apiKeyIds: Seq[String], models: Seq[String], groupBy: Seq[String], limit: Option[Int], page: Option[String]): Either[CommonError,UsageResponse] = Left(TODO)

        /**
        * 
        * @return A UsageResponse
        */
        def Usage_usageVectorStores(startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Seq[String], groupBy: Seq[String], limit: Option[Int], page: Option[String]): Either[CommonError,UsageResponse] = Left(TODO)

        /**
        * 
        * @return A UserDeleteResponse
        */
        def Users_deleteUser(userId: String): Either[CommonError,UserDeleteResponse] = Left(TODO)

        /**
        * 
        * @return A UserListResponse
        */
        def Users_listUsers(limit: Option[Int], after: Option[String]): Either[CommonError,UserListResponse] = Left(TODO)

        /**
        * 
        * @return A User
        */
        def Users_modifyUser(userId: String, userRoleUpdateRequest: UserRoleUpdateRequest): Either[CommonError,User] = Left(TODO)

        /**
        * 
        * @return A User
        */
        def Users_retrieveUser(userId: String): Either[CommonError,User] = Left(TODO)

        /**
        * 
        * @return A VectorStoreFileBatchObject
        */
        def VectorStores_cancelVectorStoreFileBatch(vectorStoreId: String, batchId: String): Either[CommonError,VectorStoreFileBatchObject] = Left(TODO)

        /**
        * 
        * @return A VectorStoreObject
        */
        def VectorStores_createVectorStore(createVectorStoreRequest: CreateVectorStoreRequest): Either[CommonError,VectorStoreObject] = Left(TODO)

        /**
        * 
        * @return A VectorStoreFileObject
        */
        def VectorStores_createVectorStoreFile(vectorStoreId: String, createVectorStoreFileRequest: CreateVectorStoreFileRequest): Either[CommonError,VectorStoreFileObject] = Left(TODO)

        /**
        * 
        * @return A VectorStoreFileBatchObject
        */
        def VectorStores_createVectorStoreFileBatch(vectorStoreId: String, createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest): Either[CommonError,VectorStoreFileBatchObject] = Left(TODO)

        /**
        * 
        * @return A DeleteVectorStoreResponse
        */
        def VectorStores_deleteVectorStore(vectorStoreId: String): Either[CommonError,DeleteVectorStoreResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteVectorStoreFileResponse
        */
        def VectorStores_deleteVectorStoreFile(vectorStoreId: String, fileId: String): Either[CommonError,DeleteVectorStoreFileResponse] = Left(TODO)

        /**
        * 
        * @return A VectorStoreObject
        */
        def VectorStores_getVectorStore(vectorStoreId: String): Either[CommonError,VectorStoreObject] = Left(TODO)

        /**
        * 
        * @return A VectorStoreFileObject
        */
        def VectorStores_getVectorStoreFile(vectorStoreId: String, fileId: String): Either[CommonError,VectorStoreFileObject] = Left(TODO)

        /**
        * 
        * @return A VectorStoreFileBatchObject
        */
        def VectorStores_getVectorStoreFileBatch(vectorStoreId: String, batchId: String): Either[CommonError,VectorStoreFileBatchObject] = Left(TODO)

        /**
        * 
        * @return A ListVectorStoreFilesResponse
        */
        def VectorStores_listFilesInVectorStoreBatch(vectorStoreId: String, batchId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String], filter: Option[String]): Either[CommonError,ListVectorStoreFilesResponse] = Left(TODO)

        /**
        * 
        * @return A ListVectorStoreFilesResponse
        */
        def VectorStores_listVectorStoreFiles(vectorStoreId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String], filter: Option[String]): Either[CommonError,ListVectorStoreFilesResponse] = Left(TODO)

        /**
        * 
        * @return A ListVectorStoresResponse
        */
        def VectorStores_listVectorStores(limit: Option[Int], order: Option[String], after: Option[String], before: Option[String]): Either[CommonError,ListVectorStoresResponse] = Left(TODO)

        /**
        * 
        * @return A VectorStoreObject
        */
        def VectorStores_modifyVectorStore(vectorStoreId: String, updateVectorStoreRequest: UpdateVectorStoreRequest): Either[CommonError,VectorStoreObject] = Left(TODO)

}