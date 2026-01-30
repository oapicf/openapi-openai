namespace OpenAPI

open System
open System.Net.Http
open System.Security.Claims
open System.Threading
open Microsoft.AspNetCore
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.Http
open Microsoft.AspNetCore.Http.Features
open Microsoft.AspNetCore.Authentication
open Microsoft.AspNetCore.Authentication.Cookies
open Microsoft.Extensions.Configuration
open Microsoft.Extensions.Logging
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open System.Diagnostics
open Giraffe.GiraffeViewEngine
open AspNet.Security.ApiKey.Providers

open AssistantsApiHandlerParams
open AudioApiHandlerParams
open AuditLogsApiHandlerParams
open BatchApiHandlerParams
open ChatApiHandlerParams
open CompletionsApiHandlerParams
open DefaultApiHandlerParams
open EmbeddingsApiHandlerParams
open FilesApiHandlerParams
open FineTuningApiHandlerParams
open ImagesApiHandlerParams
open InvitesApiHandlerParams
open ModelsApiHandlerParams
open ModerationsApiHandlerParams
open ProjectsApiHandlerParams
open RealtimeApiHandlerParams
open UploadsApiHandlerParams
open UsageApiHandlerParams
open UsersApiHandlerParams
open VectorStoresApiHandlerParams
open Giraffe

module App =

  // ---------------------------------
  // Error handler
  // ---------------------------------

  let errorHandler (ex : Exception) (logger : ILogger) =
    logger.LogError(EventId(), ex, "An unhandled exception has occurred while executing the request.")
    clearResponse >=> setStatusCode 500 >=> text ex.Message

  // ---------------------------------
  // Web app
  // ---------------------------------

  let HttpGet = GET
  let HttpPost = POST
  let HttpPut = PUT
  let HttpDelete = DELETE

  let authFailure : HttpHandler =
    setStatusCode 401 >=> text "You must be authenticated to access this resource."

  let webApp =
    choose (CustomHandlers.handlers @ [
      HttpPost >=> routeBind<CancelRunPathParams> "/v1/threads/{thread_id}/runs/{run_id}/cancel"  (fun x -> (fun x ->  >=>  AssistantsApiHandler.CancelRun x) x);
      HttpPost >=> route "/v1/assistants" >=>  >=>  AssistantsApiHandler.CreateAssistant;
      HttpPost >=> routeBind<CreateMessagePathParams> "/v1/threads/{thread_id}/messages"  (fun x ->  >=>  AssistantsApiHandler.CreateMessage x);
      HttpPost >=> routeBind<CreateRunPathParams> "/v1/threads/{thread_id}/runs"  (fun x ->  >=>  AssistantsApiHandler.CreateRun x);
      HttpPost >=> route "/v1/threads" >=>  >=>  AssistantsApiHandler.CreateThread;
      HttpPost >=> route "/v1/threads/runs" >=>  >=>  AssistantsApiHandler.CreateThreadAndRun;
      HttpDelete >=> routeBind<DeleteAssistantPathParams> "/v1/assistants/{assistant_id}"  (fun x ->  >=>  AssistantsApiHandler.DeleteAssistant x);
      HttpDelete >=> routeBind<DeleteMessagePathParams> "/v1/threads/{thread_id}/messages/{message_id}"  (fun x -> (fun x ->  >=>  AssistantsApiHandler.DeleteMessage x) x);
      HttpDelete >=> routeBind<DeleteThreadPathParams> "/v1/threads/{thread_id}"  (fun x ->  >=>  AssistantsApiHandler.DeleteThread x);
      HttpGet >=> routeBind<GetAssistantPathParams> "/v1/assistants/{assistant_id}"  (fun x ->  >=>  AssistantsApiHandler.GetAssistant x);
      HttpGet >=> routeBind<GetMessagePathParams> "/v1/threads/{thread_id}/messages/{message_id}"  (fun x -> (fun x ->  >=>  AssistantsApiHandler.GetMessage x) x);
      HttpGet >=> routeBind<GetRunPathParams> "/v1/threads/{thread_id}/runs/{run_id}"  (fun x -> (fun x ->  >=>  AssistantsApiHandler.GetRun x) x);
      HttpGet >=> routeBind<GetRunStepPathParams> "/v1/threads/{thread_id}/runs/{run_id}/steps/{step_id}"  (fun x -> (fun x -> (fun x ->  >=>  AssistantsApiHandler.GetRunStep x) x) x);
      HttpGet >=> routeBind<GetThreadPathParams> "/v1/threads/{thread_id}"  (fun x ->  >=>  AssistantsApiHandler.GetThread x);
      HttpGet >=> route "/v1/assistants" >=>  >=>  AssistantsApiHandler.ListAssistants;
      HttpGet >=> routeBind<ListMessagesPathParams> "/v1/threads/{thread_id}/messages"  (fun x ->  >=>  AssistantsApiHandler.ListMessages x);
      HttpGet >=> routeBind<ListRunStepsPathParams> "/v1/threads/{thread_id}/runs/{run_id}/steps"  (fun x -> (fun x ->  >=>  AssistantsApiHandler.ListRunSteps x) x);
      HttpGet >=> routeBind<ListRunsPathParams> "/v1/threads/{thread_id}/runs"  (fun x ->  >=>  AssistantsApiHandler.ListRuns x);
      HttpPost >=> routeBind<ModifyAssistantPathParams> "/v1/assistants/{assistant_id}"  (fun x ->  >=>  AssistantsApiHandler.ModifyAssistant x);
      HttpPost >=> routeBind<ModifyMessagePathParams> "/v1/threads/{thread_id}/messages/{message_id}"  (fun x -> (fun x ->  >=>  AssistantsApiHandler.ModifyMessage x) x);
      HttpPost >=> routeBind<ModifyRunPathParams> "/v1/threads/{thread_id}/runs/{run_id}"  (fun x -> (fun x ->  >=>  AssistantsApiHandler.ModifyRun x) x);
      HttpPost >=> routeBind<ModifyThreadPathParams> "/v1/threads/{thread_id}"  (fun x ->  >=>  AssistantsApiHandler.ModifyThread x);
      HttpPost >=> routeBind<SubmitToolOuputsToRunPathParams> "/v1/threads/{thread_id}/runs/{run_id}/submit_tool_outputs"  (fun x -> (fun x ->  >=>  AssistantsApiHandler.SubmitToolOuputsToRun x) x);
      HttpPost >=> route "/v1/audio/speech" >=>  >=>  AudioApiHandler.CreateSpeech;
      HttpPost >=> route "/v1/audio/transcriptions" >=>  >=>  AudioApiHandler.CreateTranscription;
      HttpPost >=> route "/v1/audio/translations" >=>  >=>  AudioApiHandler.CreateTranslation;
      HttpGet >=> route "/v1/organization/audit_logs" >=>  >=>  AuditLogsApiHandler.ListAuditLogs;
      HttpPost >=> routeBind<CancelBatchPathParams> "/v1/batches/{batch_id}/cancel"  (fun x ->  >=>  BatchApiHandler.CancelBatch x);
      HttpPost >=> route "/v1/batches" >=>  >=>  BatchApiHandler.CreateBatch;
      HttpGet >=> route "/v1/batches" >=>  >=>  BatchApiHandler.ListBatches;
      HttpGet >=> routeBind<RetrieveBatchPathParams> "/v1/batches/{batch_id}"  (fun x ->  >=>  BatchApiHandler.RetrieveBatch x);
      HttpPost >=> route "/v1/chat/completions" >=>  >=>  ChatApiHandler.CreateChatCompletion;
      HttpPost >=> route "/v1/completions" >=>  >=>  CompletionsApiHandler.CreateCompletion;
      HttpPost >=> route "/v1/organization/admin_api_keys" >=>  >=>  DefaultApiHandler.AdminApiKeysCreate;
      HttpDelete >=> routeBind<AdminApiKeysDeletePathParams> "/v1/organization/admin_api_keys/{key_id}"  (fun x ->  >=>  DefaultApiHandler.AdminApiKeysDelete x);
      HttpGet >=> routeBind<AdminApiKeysGetPathParams> "/v1/organization/admin_api_keys/{key_id}"  (fun x ->  >=>  DefaultApiHandler.AdminApiKeysGet x);
      HttpGet >=> route "/v1/organization/admin_api_keys" >=>  >=>  DefaultApiHandler.AdminApiKeysList;
      HttpPost >=> route "/v1/embeddings" >=>  >=>  EmbeddingsApiHandler.CreateEmbedding;
      HttpPost >=> route "/v1/files" >=>  >=>  FilesApiHandler.CreateFile;
      HttpDelete >=> routeBind<DeleteFilePathParams> "/v1/files/{file_id}"  (fun x ->  >=>  FilesApiHandler.DeleteFile x);
      HttpGet >=> routeBind<DownloadFilePathParams> "/v1/files/{file_id}/content"  (fun x ->  >=>  FilesApiHandler.DownloadFile x);
      HttpGet >=> route "/v1/files" >=>  >=>  FilesApiHandler.ListFiles;
      HttpGet >=> routeBind<RetrieveFilePathParams> "/v1/files/{file_id}"  (fun x ->  >=>  FilesApiHandler.RetrieveFile x);
      HttpPost >=> routeBind<CancelFineTuningJobPathParams> "/v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel"  (fun x ->  >=>  FineTuningApiHandler.CancelFineTuningJob x);
      HttpPost >=> route "/v1/fine_tuning/jobs" >=>  >=>  FineTuningApiHandler.CreateFineTuningJob;
      HttpGet >=> routeBind<ListFineTuningEventsPathParams> "/v1/fine_tuning/jobs/{fine_tuning_job_id}/events"  (fun x ->  >=>  FineTuningApiHandler.ListFineTuningEvents x);
      HttpGet >=> routeBind<ListFineTuningJobCheckpointsPathParams> "/v1/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints"  (fun x ->  >=>  FineTuningApiHandler.ListFineTuningJobCheckpoints x);
      HttpGet >=> route "/v1/fine_tuning/jobs" >=>  >=>  FineTuningApiHandler.ListPaginatedFineTuningJobs;
      HttpGet >=> routeBind<RetrieveFineTuningJobPathParams> "/v1/fine_tuning/jobs/{fine_tuning_job_id}"  (fun x ->  >=>  FineTuningApiHandler.RetrieveFineTuningJob x);
      HttpPost >=> route "/v1/images/generations" >=>  >=>  ImagesApiHandler.CreateImage;
      HttpPost >=> route "/v1/images/edits" >=>  >=>  ImagesApiHandler.CreateImageEdit;
      HttpPost >=> route "/v1/images/variations" >=>  >=>  ImagesApiHandler.CreateImageVariation;
      HttpDelete >=> routeBind<DeleteInvitePathParams> "/v1/organization/invites/{invite_id}"  (fun x ->  >=>  InvitesApiHandler.DeleteInvite x);
      HttpPost >=> route "/v1/organization/invites" >=>  >=>  InvitesApiHandler.InviteUser;
      HttpGet >=> route "/v1/organization/invites" >=>  >=>  InvitesApiHandler.ListInvites;
      HttpGet >=> routeBind<RetrieveInvitePathParams> "/v1/organization/invites/{invite_id}"  (fun x ->  >=>  InvitesApiHandler.RetrieveInvite x);
      HttpDelete >=> routeBind<DeleteModelPathParams> "/v1/models/{model}"  (fun x ->  >=>  ModelsApiHandler.DeleteModel x);
      HttpGet >=> route "/v1/models" >=>  >=>  ModelsApiHandler.ListModels;
      HttpGet >=> routeBind<RetrieveModelPathParams> "/v1/models/{model}"  (fun x ->  >=>  ModelsApiHandler.RetrieveModel x);
      HttpPost >=> route "/v1/moderations" >=>  >=>  ModerationsApiHandler.CreateModeration;
      HttpPost >=> routeBind<ArchiveProjectPathParams> "/v1/organization/projects/{project_id}/archive"  (fun x ->  >=>  ProjectsApiHandler.ArchiveProject x);
      HttpPost >=> route "/v1/organization/projects" >=>  >=>  ProjectsApiHandler.CreateProject;
      HttpPost >=> routeBind<CreateProjectServiceAccountPathParams> "/v1/organization/projects/{project_id}/service_accounts"  (fun x ->  >=>  ProjectsApiHandler.CreateProjectServiceAccount x);
      HttpPost >=> routeBind<CreateProjectUserPathParams> "/v1/organization/projects/{project_id}/users"  (fun x ->  >=>  ProjectsApiHandler.CreateProjectUser x);
      HttpDelete >=> routeBind<DeleteProjectApiKeyPathParams> "/v1/organization/projects/{project_id}/api_keys/{key_id}"  (fun x -> (fun x ->  >=>  ProjectsApiHandler.DeleteProjectApiKey x) x);
      HttpDelete >=> routeBind<DeleteProjectServiceAccountPathParams> "/v1/organization/projects/{project_id}/service_accounts/{service_account_id}"  (fun x -> (fun x ->  >=>  ProjectsApiHandler.DeleteProjectServiceAccount x) x);
      HttpDelete >=> routeBind<DeleteProjectUserPathParams> "/v1/organization/projects/{project_id}/users/{user_id}"  (fun x -> (fun x ->  >=>  ProjectsApiHandler.DeleteProjectUser x) x);
      HttpGet >=> routeBind<ListProjectApiKeysPathParams> "/v1/organization/projects/{project_id}/api_keys"  (fun x ->  >=>  ProjectsApiHandler.ListProjectApiKeys x);
      HttpGet >=> routeBind<ListProjectRateLimitsPathParams> "/v1/organization/projects/{project_id}/rate_limits"  (fun x ->  >=>  ProjectsApiHandler.ListProjectRateLimits x);
      HttpGet >=> routeBind<ListProjectServiceAccountsPathParams> "/v1/organization/projects/{project_id}/service_accounts"  (fun x ->  >=>  ProjectsApiHandler.ListProjectServiceAccounts x);
      HttpGet >=> routeBind<ListProjectUsersPathParams> "/v1/organization/projects/{project_id}/users"  (fun x ->  >=>  ProjectsApiHandler.ListProjectUsers x);
      HttpGet >=> route "/v1/organization/projects" >=>  >=>  ProjectsApiHandler.ListProjects;
      HttpPost >=> routeBind<ModifyProjectPathParams> "/v1/organization/projects/{project_id}"  (fun x ->  >=>  ProjectsApiHandler.ModifyProject x);
      HttpPost >=> routeBind<ModifyProjectUserPathParams> "/v1/organization/projects/{project_id}/users/{user_id}"  (fun x -> (fun x ->  >=>  ProjectsApiHandler.ModifyProjectUser x) x);
      HttpGet >=> routeBind<RetrieveProjectPathParams> "/v1/organization/projects/{project_id}"  (fun x ->  >=>  ProjectsApiHandler.RetrieveProject x);
      HttpGet >=> routeBind<RetrieveProjectApiKeyPathParams> "/v1/organization/projects/{project_id}/api_keys/{key_id}"  (fun x -> (fun x ->  >=>  ProjectsApiHandler.RetrieveProjectApiKey x) x);
      HttpGet >=> routeBind<RetrieveProjectServiceAccountPathParams> "/v1/organization/projects/{project_id}/service_accounts/{service_account_id}"  (fun x -> (fun x ->  >=>  ProjectsApiHandler.RetrieveProjectServiceAccount x) x);
      HttpGet >=> routeBind<RetrieveProjectUserPathParams> "/v1/organization/projects/{project_id}/users/{user_id}"  (fun x -> (fun x ->  >=>  ProjectsApiHandler.RetrieveProjectUser x) x);
      HttpPost >=> routeBind<UpdateProjectRateLimitsPathParams> "/v1/organization/projects/{project_id}/rate_limits/{rate_limit_id}"  (fun x -> (fun x ->  >=>  ProjectsApiHandler.UpdateProjectRateLimits x) x);
      HttpPost >=> route "/v1/realtime/sessions" >=>  >=>  RealtimeApiHandler.CreateRealtimeSession;
      HttpPost >=> routeBind<AddUploadPartPathParams> "/v1/uploads/{upload_id}/parts"  (fun x ->  >=>  UploadsApiHandler.AddUploadPart x);
      HttpPost >=> routeBind<CancelUploadPathParams> "/v1/uploads/{upload_id}/cancel"  (fun x ->  >=>  UploadsApiHandler.CancelUpload x);
      HttpPost >=> routeBind<CompleteUploadPathParams> "/v1/uploads/{upload_id}/complete"  (fun x ->  >=>  UploadsApiHandler.CompleteUpload x);
      HttpPost >=> route "/v1/uploads" >=>  >=>  UploadsApiHandler.CreateUpload;
      HttpGet >=> route "/v1/organization/usage/audio_speeches" >=>  >=>  UsageApiHandler.UsageAudioSpeeches;
      HttpGet >=> route "/v1/organization/usage/audio_transcriptions" >=>  >=>  UsageApiHandler.UsageAudioTranscriptions;
      HttpGet >=> route "/v1/organization/usage/code_interpreter_sessions" >=>  >=>  UsageApiHandler.UsageCodeInterpreterSessions;
      HttpGet >=> route "/v1/organization/usage/completions" >=>  >=>  UsageApiHandler.UsageCompletions;
      HttpGet >=> route "/v1/organization/costs" >=>  >=>  UsageApiHandler.UsageCosts;
      HttpGet >=> route "/v1/organization/usage/embeddings" >=>  >=>  UsageApiHandler.UsageEmbeddings;
      HttpGet >=> route "/v1/organization/usage/images" >=>  >=>  UsageApiHandler.UsageImages;
      HttpGet >=> route "/v1/organization/usage/moderations" >=>  >=>  UsageApiHandler.UsageModerations;
      HttpGet >=> route "/v1/organization/usage/vector_stores" >=>  >=>  UsageApiHandler.UsageVectorStores;
      HttpDelete >=> routeBind<DeleteUserPathParams> "/v1/organization/users/{user_id}"  (fun x ->  >=>  UsersApiHandler.DeleteUser x);
      HttpGet >=> route "/v1/organization/users" >=>  >=>  UsersApiHandler.ListUsers;
      HttpPost >=> routeBind<ModifyUserPathParams> "/v1/organization/users/{user_id}"  (fun x ->  >=>  UsersApiHandler.ModifyUser x);
      HttpGet >=> routeBind<RetrieveUserPathParams> "/v1/organization/users/{user_id}"  (fun x ->  >=>  UsersApiHandler.RetrieveUser x);
      HttpPost >=> routeBind<CancelVectorStoreFileBatchPathParams> "/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel"  (fun x -> (fun x ->  >=>  VectorStoresApiHandler.CancelVectorStoreFileBatch x) x);
      HttpPost >=> route "/v1/vector_stores" >=>  >=>  VectorStoresApiHandler.CreateVectorStore;
      HttpPost >=> routeBind<CreateVectorStoreFilePathParams> "/v1/vector_stores/{vector_store_id}/files"  (fun x ->  >=>  VectorStoresApiHandler.CreateVectorStoreFile x);
      HttpPost >=> routeBind<CreateVectorStoreFileBatchPathParams> "/v1/vector_stores/{vector_store_id}/file_batches"  (fun x ->  >=>  VectorStoresApiHandler.CreateVectorStoreFileBatch x);
      HttpDelete >=> routeBind<DeleteVectorStorePathParams> "/v1/vector_stores/{vector_store_id}"  (fun x ->  >=>  VectorStoresApiHandler.DeleteVectorStore x);
      HttpDelete >=> routeBind<DeleteVectorStoreFilePathParams> "/v1/vector_stores/{vector_store_id}/files/{file_id}"  (fun x -> (fun x ->  >=>  VectorStoresApiHandler.DeleteVectorStoreFile x) x);
      HttpGet >=> routeBind<GetVectorStorePathParams> "/v1/vector_stores/{vector_store_id}"  (fun x ->  >=>  VectorStoresApiHandler.GetVectorStore x);
      HttpGet >=> routeBind<GetVectorStoreFilePathParams> "/v1/vector_stores/{vector_store_id}/files/{file_id}"  (fun x -> (fun x ->  >=>  VectorStoresApiHandler.GetVectorStoreFile x) x);
      HttpGet >=> routeBind<GetVectorStoreFileBatchPathParams> "/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}"  (fun x -> (fun x ->  >=>  VectorStoresApiHandler.GetVectorStoreFileBatch x) x);
      HttpGet >=> routeBind<ListFilesInVectorStoreBatchPathParams> "/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/files"  (fun x -> (fun x ->  >=>  VectorStoresApiHandler.ListFilesInVectorStoreBatch x) x);
      HttpGet >=> routeBind<ListVectorStoreFilesPathParams> "/v1/vector_stores/{vector_store_id}/files"  (fun x ->  >=>  VectorStoresApiHandler.ListVectorStoreFiles x);
      HttpGet >=> route "/v1/vector_stores" >=>  >=>  VectorStoresApiHandler.ListVectorStores;
      HttpPost >=> routeBind<ModifyVectorStorePathParams> "/v1/vector_stores/{vector_store_id}"  (fun x ->  >=>  VectorStoresApiHandler.ModifyVectorStore x);
      RequestErrors.notFound (text "Not Found")
    ])
  // ---------------------------------
  // Main
  // ---------------------------------

  let configureApp (app : IApplicationBuilder) =
    app.UseGiraffeErrorHandler(errorHandler)
      .UseStaticFiles()
      .UseAuthentication()
      .UseResponseCaching() |> ignore
    CustomHandlers.configureApp app |> ignore
    app.UseGiraffe webApp |> ignore


  let configureServices (services : IServiceCollection) =
    services
          .AddResponseCaching()
          .AddGiraffe()
          |> AuthSchemes.configureServices
          |> CustomHandlers.configureServices services
          |> ignore
    services.AddDataProtection() |> ignore

  let configureLogging (loggerBuilder : ILoggingBuilder) =
    loggerBuilder.AddFilter(fun lvl -> lvl.Equals LogLevel.Error)
                  .AddConsole()
                  .AddDebug() |> ignore

  [<EntryPoint>]
  let main _ =
    let builder = WebHost.CreateDefaultBuilder()
                    .Configure(Action<IApplicationBuilder> configureApp)
                    .ConfigureServices(configureServices)
                    .ConfigureLogging(configureLogging)
                    |> CustomHandlers.configureWebHost
    builder.Build()
            .Run()
    0