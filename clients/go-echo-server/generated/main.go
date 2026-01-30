package main

import (
	"github.com/oapicf/openapi-openai/handlers"
	"github.com/labstack/echo/v4"
	"github.com/labstack/echo/v4/middleware"
)

func main() {
	e := echo.New()

	//todo: handle the error!
	c, _ := handlers.NewContainer()

	// Middleware
	e.Use(middleware.Logger())
	e.Use(middleware.Recover())


	// CancelRun - Cancels a run that is `in_progress`.
	e.POST("/v1/threads/:thread_id/runs/:run_id/cancel", c.CancelRun)

	// CreateAssistant - Create an assistant with a model and instructions.
	e.POST("/v1/assistants", c.CreateAssistant)

	// CreateMessage - Create a message.
	e.POST("/v1/threads/:thread_id/messages", c.CreateMessage)

	// CreateRun - Create a run.
	e.POST("/v1/threads/:thread_id/runs", c.CreateRun)

	// CreateThread - Create a thread.
	e.POST("/v1/threads", c.CreateThread)

	// CreateThreadAndRun - Create a thread and run it in one request.
	e.POST("/v1/threads/runs", c.CreateThreadAndRun)

	// DeleteAssistant - Delete an assistant.
	e.DELETE("/v1/assistants/:assistant_id", c.DeleteAssistant)

	// DeleteMessage - Deletes a message.
	e.DELETE("/v1/threads/:thread_id/messages/:message_id", c.DeleteMessage)

	// DeleteThread - Delete a thread.
	e.DELETE("/v1/threads/:thread_id", c.DeleteThread)

	// GetAssistant - Retrieves an assistant.
	e.GET("/v1/assistants/:assistant_id", c.GetAssistant)

	// GetMessage - Retrieve a message.
	e.GET("/v1/threads/:thread_id/messages/:message_id", c.GetMessage)

	// GetRun - Retrieves a run.
	e.GET("/v1/threads/:thread_id/runs/:run_id", c.GetRun)

	// GetRunStep - Retrieves a run step.
	e.GET("/v1/threads/:thread_id/runs/:run_id/steps/:step_id", c.GetRunStep)

	// GetThread - Retrieves a thread.
	e.GET("/v1/threads/:thread_id", c.GetThread)

	// ListAssistants - Returns a list of assistants.
	e.GET("/v1/assistants", c.ListAssistants)

	// ListMessages - Returns a list of messages for a given thread.
	e.GET("/v1/threads/:thread_id/messages", c.ListMessages)

	// ListRunSteps - Returns a list of run steps belonging to a run.
	e.GET("/v1/threads/:thread_id/runs/:run_id/steps", c.ListRunSteps)

	// ListRuns - Returns a list of runs belonging to a thread.
	e.GET("/v1/threads/:thread_id/runs", c.ListRuns)

	// ModifyAssistant - Modifies an assistant.
	e.POST("/v1/assistants/:assistant_id", c.ModifyAssistant)

	// ModifyMessage - Modifies a message.
	e.POST("/v1/threads/:thread_id/messages/:message_id", c.ModifyMessage)

	// ModifyRun - Modifies a run.
	e.POST("/v1/threads/:thread_id/runs/:run_id", c.ModifyRun)

	// ModifyThread - Modifies a thread.
	e.POST("/v1/threads/:thread_id", c.ModifyThread)

	// SubmitToolOuputsToRun - When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
	e.POST("/v1/threads/:thread_id/runs/:run_id/submit_tool_outputs", c.SubmitToolOuputsToRun)

	// CreateSpeech - Generates audio from the input text.
	e.POST("/v1/audio/speech", c.CreateSpeech)

	// CreateTranscription - Transcribes audio into the input language.
	e.POST("/v1/audio/transcriptions", c.CreateTranscription)

	// CreateTranslation - Translates audio into English.
	e.POST("/v1/audio/translations", c.CreateTranslation)

	// ListAuditLogs - List user actions and configuration changes within this organization.
	e.GET("/v1/organization/audit_logs", c.ListAuditLogs)

	// CancelBatch - Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
	e.POST("/v1/batches/:batch_id/cancel", c.CancelBatch)

	// CreateBatch - Creates and executes a batch from an uploaded file of requests
	e.POST("/v1/batches", c.CreateBatch)

	// ListBatches - List your organization's batches.
	e.GET("/v1/batches", c.ListBatches)

	// RetrieveBatch - Retrieves a batch.
	e.GET("/v1/batches/:batch_id", c.RetrieveBatch)

	// CreateChatCompletion - Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
	e.POST("/v1/chat/completions", c.CreateChatCompletion)

	// CreateCompletion - Creates a completion for the provided prompt and parameters.
	e.POST("/v1/completions", c.CreateCompletion)

	// AdminApiKeysCreate - Create an organization admin API key
	e.POST("/v1/organization/admin_api_keys", c.AdminApiKeysCreate)

	// AdminApiKeysDelete - Delete an organization admin API key
	e.DELETE("/v1/organization/admin_api_keys/:key_id", c.AdminApiKeysDelete)

	// AdminApiKeysGet - Retrieve a single organization API key
	e.GET("/v1/organization/admin_api_keys/:key_id", c.AdminApiKeysGet)

	// AdminApiKeysList - List organization API keys
	e.GET("/v1/organization/admin_api_keys", c.AdminApiKeysList)

	// CreateEmbedding - Creates an embedding vector representing the input text.
	e.POST("/v1/embeddings", c.CreateEmbedding)

	// CreateFile - Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
	e.POST("/v1/files", c.CreateFile)

	// DeleteFile - Delete a file.
	e.DELETE("/v1/files/:file_id", c.DeleteFile)

	// DownloadFile - Returns the contents of the specified file.
	e.GET("/v1/files/:file_id/content", c.DownloadFile)

	// ListFiles - Returns a list of files.
	e.GET("/v1/files", c.ListFiles)

	// RetrieveFile - Returns information about a specific file.
	e.GET("/v1/files/:file_id", c.RetrieveFile)

	// CancelFineTuningJob - Immediately cancel a fine-tune job. 
	e.POST("/v1/fine_tuning/jobs/:fine_tuning_job_id/cancel", c.CancelFineTuningJob)

	// CreateFineTuningJob - Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
	e.POST("/v1/fine_tuning/jobs", c.CreateFineTuningJob)

	// ListFineTuningEvents - Get status updates for a fine-tuning job. 
	e.GET("/v1/fine_tuning/jobs/:fine_tuning_job_id/events", c.ListFineTuningEvents)

	// ListFineTuningJobCheckpoints - List checkpoints for a fine-tuning job. 
	e.GET("/v1/fine_tuning/jobs/:fine_tuning_job_id/checkpoints", c.ListFineTuningJobCheckpoints)

	// ListPaginatedFineTuningJobs - List your organization's fine-tuning jobs 
	e.GET("/v1/fine_tuning/jobs", c.ListPaginatedFineTuningJobs)

	// RetrieveFineTuningJob - Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
	e.GET("/v1/fine_tuning/jobs/:fine_tuning_job_id", c.RetrieveFineTuningJob)

	// CreateImage - Creates an image given a prompt.
	e.POST("/v1/images/generations", c.CreateImage)

	// CreateImageEdit - Creates an edited or extended image given an original image and a prompt.
	e.POST("/v1/images/edits", c.CreateImageEdit)

	// CreateImageVariation - Creates a variation of a given image.
	e.POST("/v1/images/variations", c.CreateImageVariation)

	// DeleteInvite - Delete an invite. If the invite has already been accepted, it cannot be deleted.
	e.DELETE("/v1/organization/invites/:invite_id", c.DeleteInvite)

	// InviteUser - Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
	e.POST("/v1/organization/invites", c.InviteUser)

	// ListInvites - Returns a list of invites in the organization.
	e.GET("/v1/organization/invites", c.ListInvites)

	// RetrieveInvite - Retrieves an invite.
	e.GET("/v1/organization/invites/:invite_id", c.RetrieveInvite)

	// DeleteModel - Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
	e.DELETE("/v1/models/:model", c.DeleteModel)

	// ListModels - Lists the currently available models, and provides basic information about each one such as the owner and availability.
	e.GET("/v1/models", c.ListModels)

	// RetrieveModel - Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
	e.GET("/v1/models/:model", c.RetrieveModel)

	// CreateModeration - Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
	e.POST("/v1/moderations", c.CreateModeration)

	// ArchiveProject - Archives a project in the organization. Archived projects cannot be used or updated.
	e.POST("/v1/organization/projects/:project_id/archive", c.ArchiveProject)

	// CreateProject - Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
	e.POST("/v1/organization/projects", c.CreateProject)

	// CreateProjectServiceAccount - Creates a new service account in the project. This also returns an unredacted API key for the service account.
	e.POST("/v1/organization/projects/:project_id/service_accounts", c.CreateProjectServiceAccount)

	// CreateProjectUser - Adds a user to the project. Users must already be members of the organization to be added to a project.
	e.POST("/v1/organization/projects/:project_id/users", c.CreateProjectUser)

	// DeleteProjectApiKey - Deletes an API key from the project.
	e.DELETE("/v1/organization/projects/:project_id/api_keys/:key_id", c.DeleteProjectApiKey)

	// DeleteProjectServiceAccount - Deletes a service account from the project.
	e.DELETE("/v1/organization/projects/:project_id/service_accounts/:service_account_id", c.DeleteProjectServiceAccount)

	// DeleteProjectUser - Deletes a user from the project.
	e.DELETE("/v1/organization/projects/:project_id/users/:user_id", c.DeleteProjectUser)

	// ListProjectApiKeys - Returns a list of API keys in the project.
	e.GET("/v1/organization/projects/:project_id/api_keys", c.ListProjectApiKeys)

	// ListProjectRateLimits - Returns the rate limits per model for a project.
	e.GET("/v1/organization/projects/:project_id/rate_limits", c.ListProjectRateLimits)

	// ListProjectServiceAccounts - Returns a list of service accounts in the project.
	e.GET("/v1/organization/projects/:project_id/service_accounts", c.ListProjectServiceAccounts)

	// ListProjectUsers - Returns a list of users in the project.
	e.GET("/v1/organization/projects/:project_id/users", c.ListProjectUsers)

	// ListProjects - Returns a list of projects.
	e.GET("/v1/organization/projects", c.ListProjects)

	// ModifyProject - Modifies a project in the organization.
	e.POST("/v1/organization/projects/:project_id", c.ModifyProject)

	// ModifyProjectUser - Modifies a user's role in the project.
	e.POST("/v1/organization/projects/:project_id/users/:user_id", c.ModifyProjectUser)

	// RetrieveProject - Retrieves a project.
	e.GET("/v1/organization/projects/:project_id", c.RetrieveProject)

	// RetrieveProjectApiKey - Retrieves an API key in the project.
	e.GET("/v1/organization/projects/:project_id/api_keys/:key_id", c.RetrieveProjectApiKey)

	// RetrieveProjectServiceAccount - Retrieves a service account in the project.
	e.GET("/v1/organization/projects/:project_id/service_accounts/:service_account_id", c.RetrieveProjectServiceAccount)

	// RetrieveProjectUser - Retrieves a user in the project.
	e.GET("/v1/organization/projects/:project_id/users/:user_id", c.RetrieveProjectUser)

	// UpdateProjectRateLimits - Updates a project rate limit.
	e.POST("/v1/organization/projects/:project_id/rate_limits/:rate_limit_id", c.UpdateProjectRateLimits)

	// CreateRealtimeSession - Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
	e.POST("/v1/realtime/sessions", c.CreateRealtimeSession)

	// AddUploadPart - Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
	e.POST("/v1/uploads/:upload_id/parts", c.AddUploadPart)

	// CancelUpload - Cancels the Upload. No Parts may be added after an Upload is cancelled. 
	e.POST("/v1/uploads/:upload_id/cancel", c.CancelUpload)

	// CompleteUpload - Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
	e.POST("/v1/uploads/:upload_id/complete", c.CompleteUpload)

	// CreateUpload - Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
	e.POST("/v1/uploads", c.CreateUpload)

	// UsageAudioSpeeches - Get audio speeches usage details for the organization.
	e.GET("/v1/organization/usage/audio_speeches", c.UsageAudioSpeeches)

	// UsageAudioTranscriptions - Get audio transcriptions usage details for the organization.
	e.GET("/v1/organization/usage/audio_transcriptions", c.UsageAudioTranscriptions)

	// UsageCodeInterpreterSessions - Get code interpreter sessions usage details for the organization.
	e.GET("/v1/organization/usage/code_interpreter_sessions", c.UsageCodeInterpreterSessions)

	// UsageCompletions - Get completions usage details for the organization.
	e.GET("/v1/organization/usage/completions", c.UsageCompletions)

	// UsageCosts - Get costs details for the organization.
	e.GET("/v1/organization/costs", c.UsageCosts)

	// UsageEmbeddings - Get embeddings usage details for the organization.
	e.GET("/v1/organization/usage/embeddings", c.UsageEmbeddings)

	// UsageImages - Get images usage details for the organization.
	e.GET("/v1/organization/usage/images", c.UsageImages)

	// UsageModerations - Get moderations usage details for the organization.
	e.GET("/v1/organization/usage/moderations", c.UsageModerations)

	// UsageVectorStores - Get vector stores usage details for the organization.
	e.GET("/v1/organization/usage/vector_stores", c.UsageVectorStores)

	// DeleteUser - Deletes a user from the organization.
	e.DELETE("/v1/organization/users/:user_id", c.DeleteUser)

	// ListUsers - Lists all of the users in the organization.
	e.GET("/v1/organization/users", c.ListUsers)

	// ModifyUser - Modifies a user's role in the organization.
	e.POST("/v1/organization/users/:user_id", c.ModifyUser)

	// RetrieveUser - Retrieves a user by their identifier.
	e.GET("/v1/organization/users/:user_id", c.RetrieveUser)

	// CancelVectorStoreFileBatch - Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
	e.POST("/v1/vector_stores/:vector_store_id/file_batches/:batch_id/cancel", c.CancelVectorStoreFileBatch)

	// CreateVectorStore - Create a vector store.
	e.POST("/v1/vector_stores", c.CreateVectorStore)

	// CreateVectorStoreFile - Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
	e.POST("/v1/vector_stores/:vector_store_id/files", c.CreateVectorStoreFile)

	// CreateVectorStoreFileBatch - Create a vector store file batch.
	e.POST("/v1/vector_stores/:vector_store_id/file_batches", c.CreateVectorStoreFileBatch)

	// DeleteVectorStore - Delete a vector store.
	e.DELETE("/v1/vector_stores/:vector_store_id", c.DeleteVectorStore)

	// DeleteVectorStoreFile - Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
	e.DELETE("/v1/vector_stores/:vector_store_id/files/:file_id", c.DeleteVectorStoreFile)

	// GetVectorStore - Retrieves a vector store.
	e.GET("/v1/vector_stores/:vector_store_id", c.GetVectorStore)

	// GetVectorStoreFile - Retrieves a vector store file.
	e.GET("/v1/vector_stores/:vector_store_id/files/:file_id", c.GetVectorStoreFile)

	// GetVectorStoreFileBatch - Retrieves a vector store file batch.
	e.GET("/v1/vector_stores/:vector_store_id/file_batches/:batch_id", c.GetVectorStoreFileBatch)

	// ListFilesInVectorStoreBatch - Returns a list of vector store files in a batch.
	e.GET("/v1/vector_stores/:vector_store_id/file_batches/:batch_id/files", c.ListFilesInVectorStoreBatch)

	// ListVectorStoreFiles - Returns a list of vector store files.
	e.GET("/v1/vector_stores/:vector_store_id/files", c.ListVectorStoreFiles)

	// ListVectorStores - Returns a list of vector stores.
	e.GET("/v1/vector_stores", c.ListVectorStores)

	// ModifyVectorStore - Modifies a vector store.
	e.POST("/v1/vector_stores/:vector_store_id", c.ModifyVectorStore)


	// Start server
	e.Logger.Fatal(e.Start(":8080"))
}
