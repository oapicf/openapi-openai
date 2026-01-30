-module(openapi_api).
-moduledoc """
This module offers an API for JSON schema validation, using `jesse` under the hood.

If validation is desired, a jesse state can be loaded using `prepare_validator/1`,
and request and response can be validated using `populate_request/3`
and `validate_response/4` respectively.

For example, the user-defined `Module:accept_callback/4` can be implemented as follows:
```
-spec accept_callback(
        Class :: openapi_api:class(),
        OperationID :: openapi_api:operation_id(),
        Req :: cowboy_req:req(),
        Context :: openapi_logic_handler:context()) ->
    {openapi_logic_handler:accept_callback_return(),
     cowboy_req:req(),
     openapi_logic_handler:context()}.
accept_callback(Class, OperationID, Req0, Context0) ->
    ValidatorState = openapi_api:prepare_validator(),
    case openapi_api:populate_request(OperationID, Req0, ValidatorState) of
        {ok, Model, Req1} ->
            Context1 = maps:merge(Context0, Model),
            case do_accept_callback(Class, OperationID, Req1, Context1) of
                {false, Req2, Context2} ->
                    {false, Req2, Context2};
                {{true, Code, Body}, Req2, Context2} ->
                    case validate_response(OperationID, Code, Body, ValidatorState) of
                        ok ->
                            process_response({ok, Code, Body}, Req2, Context2);
                        {error, Reason} ->
                            process_response({error, Reason}, Req2, Context2)
                    end
            end;
        {error, Reason, Req1} ->
            process_response({error, Reason}, Req1, Context0)
    end.
```
""".

-export([prepare_validator/0, prepare_validator/1, prepare_validator/2]).
-export([populate_request/3, validate_response/4]).

-ignore_xref([populate_request/3, validate_response/4]).
-ignore_xref([prepare_validator/0, prepare_validator/1, prepare_validator/2]).

-type class() ::
    'assistants'
    | 'audio'
    | 'auditLogs'
    | 'batch'
    | 'chat'
    | 'completions'
    | 'default'
    | 'embeddings'
    | 'files'
    | 'fineTuning'
    | 'images'
    | 'invites'
    | 'models'
    | 'moderations'
    | 'projects'
    | 'realtime'
    | 'uploads'
    | 'usage'
    | 'users'
    | 'vectorStores'.


-type operation_id() ::
    'cancelRun' | %% Cancels a run that is &#x60;in_progress&#x60;.
    'createAssistant' | %% Create an assistant with a model and instructions.
    'createMessage' | %% Create a message.
    'createRun' | %% Create a run.
    'createThread' | %% Create a thread.
    'createThreadAndRun' | %% Create a thread and run it in one request.
    'deleteAssistant' | %% Delete an assistant.
    'deleteMessage' | %% Deletes a message.
    'deleteThread' | %% Delete a thread.
    'getAssistant' | %% Retrieves an assistant.
    'getMessage' | %% Retrieve a message.
    'getRun' | %% Retrieves a run.
    'getRunStep' | %% Retrieves a run step.
    'getThread' | %% Retrieves a thread.
    'listAssistants' | %% Returns a list of assistants.
    'listMessages' | %% Returns a list of messages for a given thread.
    'listRunSteps' | %% Returns a list of run steps belonging to a run.
    'listRuns' | %% Returns a list of runs belonging to a thread.
    'modifyAssistant' | %% Modifies an assistant.
    'modifyMessage' | %% Modifies a message.
    'modifyRun' | %% Modifies a run.
    'modifyThread' | %% Modifies a thread.
    'submitToolOuputsToRun' | %% When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 
    'createSpeech' | %% Generates audio from the input text.
    'createTranscription' | %% Transcribes audio into the input language.
    'createTranslation' | %% Translates audio into English.
    'list-audit-logs' | %% List user actions and configuration changes within this organization.
    'cancelBatch' | %% Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
    'createBatch' | %% Creates and executes a batch from an uploaded file of requests
    'listBatches' | %% List your organization&#39;s batches.
    'retrieveBatch' | %% Retrieves a batch.
    'createChatCompletion' | %% Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
    'createCompletion' | %% Creates a completion for the provided prompt and parameters.
    'admin-api-keys-create' | %% Create an organization admin API key
    'admin-api-keys-delete' | %% Delete an organization admin API key
    'admin-api-keys-get' | %% Retrieve a single organization API key
    'admin-api-keys-list' | %% List organization API keys
    'createEmbedding' | %% Creates an embedding vector representing the input text.
    'createFile' | %% Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
    'deleteFile' | %% Delete a file.
    'downloadFile' | %% Returns the contents of the specified file.
    'listFiles' | %% Returns a list of files.
    'retrieveFile' | %% Returns information about a specific file.
    'cancelFineTuningJob' | %% Immediately cancel a fine-tune job. 
    'createFineTuningJob' | %% Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    'listFineTuningEvents' | %% Get status updates for a fine-tuning job. 
    'listFineTuningJobCheckpoints' | %% List checkpoints for a fine-tuning job. 
    'listPaginatedFineTuningJobs' | %% List your organization&#39;s fine-tuning jobs 
    'retrieveFineTuningJob' | %% Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    'createImage' | %% Creates an image given a prompt.
    'createImageEdit' | %% Creates an edited or extended image given an original image and a prompt.
    'createImageVariation' | %% Creates a variation of a given image.
    'delete-invite' | %% Delete an invite. If the invite has already been accepted, it cannot be deleted.
    'inviteUser' | %% Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
    'list-invites' | %% Returns a list of invites in the organization.
    'retrieve-invite' | %% Retrieves an invite.
    'deleteModel' | %% Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
    'listModels' | %% Lists the currently available models, and provides basic information about each one such as the owner and availability.
    'retrieveModel' | %% Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    'createModeration' | %% Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
    'archive-project' | %% Archives a project in the organization. Archived projects cannot be used or updated.
    'create-project' | %% Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
    'create-project-service-account' | %% Creates a new service account in the project. This also returns an unredacted API key for the service account.
    'create-project-user' | %% Adds a user to the project. Users must already be members of the organization to be added to a project.
    'delete-project-api-key' | %% Deletes an API key from the project.
    'delete-project-service-account' | %% Deletes a service account from the project.
    'delete-project-user' | %% Deletes a user from the project.
    'list-project-api-keys' | %% Returns a list of API keys in the project.
    'list-project-rate-limits' | %% Returns the rate limits per model for a project.
    'list-project-service-accounts' | %% Returns a list of service accounts in the project.
    'list-project-users' | %% Returns a list of users in the project.
    'list-projects' | %% Returns a list of projects.
    'modify-project' | %% Modifies a project in the organization.
    'modify-project-user' | %% Modifies a user&#39;s role in the project.
    'retrieve-project' | %% Retrieves a project.
    'retrieve-project-api-key' | %% Retrieves an API key in the project.
    'retrieve-project-service-account' | %% Retrieves a service account in the project.
    'retrieve-project-user' | %% Retrieves a user in the project.
    'update-project-rate-limits' | %% Updates a project rate limit.
    'create-realtime-session' | %% Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
    'addUploadPart' | %% Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
    'cancelUpload' | %% Cancels the Upload. No Parts may be added after an Upload is cancelled. 
    'completeUpload' | %% Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
    'createUpload' | %% Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
    'usage-audio-speeches' | %% Get audio speeches usage details for the organization.
    'usage-audio-transcriptions' | %% Get audio transcriptions usage details for the organization.
    'usage-code-interpreter-sessions' | %% Get code interpreter sessions usage details for the organization.
    'usage-completions' | %% Get completions usage details for the organization.
    'usage-costs' | %% Get costs details for the organization.
    'usage-embeddings' | %% Get embeddings usage details for the organization.
    'usage-images' | %% Get images usage details for the organization.
    'usage-moderations' | %% Get moderations usage details for the organization.
    'usage-vector-stores' | %% Get vector stores usage details for the organization.
    'delete-user' | %% Deletes a user from the organization.
    'list-users' | %% Lists all of the users in the organization.
    'modify-user' | %% Modifies a user&#39;s role in the organization.
    'retrieve-user' | %% Retrieves a user by their identifier.
    'cancelVectorStoreFileBatch' | %% Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
    'createVectorStore' | %% Create a vector store.
    'createVectorStoreFile' | %% Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
    'createVectorStoreFileBatch' | %% Create a vector store file batch.
    'deleteVectorStore' | %% Delete a vector store.
    'deleteVectorStoreFile' | %% Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
    'getVectorStore' | %% Retrieves a vector store.
    'getVectorStoreFile' | %% Retrieves a vector store file.
    'getVectorStoreFileBatch' | %% Retrieves a vector store file batch.
    'listFilesInVectorStoreBatch' | %% Returns a list of vector store files in a batch.
    'listVectorStoreFiles' | %% Returns a list of vector store files.
    'listVectorStores' | %% Returns a list of vector stores.
    'modifyVectorStore' | %% Modifies a vector store.
    {error, unknown_operation}.

-type request_param() :: atom().

-export_type([class/0, operation_id/0]).

-dialyzer({nowarn_function, [validate_response_body/4]}).

-type rule() ::
    {type, binary} |
    {type, byte} |
    {type, integer} |
    {type, float} |
    {type, boolean} |
    {type, date} |
    {type, datetime} |
    {enum, [atom()]} |
    {max, Max :: number()} |
    {exclusive_max, Max :: number()} |
    {min, Min :: number()} |
    {exclusive_min, Min :: number()} |
    {max_length, MaxLength :: integer()} |
    {min_length, MaxLength :: integer()} |
    {pattern, Pattern :: string()} |
    {schema, object | list, binary()} |
    schema |
    required |
    not_required.

-doc #{equiv => prepare_validator/2}.
-spec prepare_validator() -> jesse_state:state().
prepare_validator() ->
    prepare_validator(<<"http://json-schema.org/draft-06/schema#">>).

-doc #{equiv => prepare_validator/2}.
-spec prepare_validator(binary()) -> jesse_state:state().
prepare_validator(SchemaVer) ->
    prepare_validator(get_openapi_path(), SchemaVer).

-doc """
Loads the JSON schema and the desired validation draft into a `t:jesse_state:state/0`.
""".
-spec prepare_validator(file:name_all(), binary()) -> jesse_state:state().
prepare_validator(OpenApiPath, SchemaVer) ->
    {ok, FileContents} = file:read_file(OpenApiPath),
    R = json:decode(FileContents),
    jesse_state:new(R, [{default_schema_ver, SchemaVer}]).

-doc """
Automatically loads the entire body from the cowboy req
and validates the JSON body against the schema.
""".
-spec populate_request(
        OperationID :: operation_id(),
        Req :: cowboy_req:req(),
        ValidatorState :: jesse_state:state()) ->
    {ok, Model :: #{}, Req :: cowboy_req:req()} |
    {error, Reason :: any(), Req :: cowboy_req:req()}.
populate_request(OperationID, Req, ValidatorState) ->
    Params = request_params(OperationID),
    populate_request_params(OperationID, Params, Req, ValidatorState, #{}).

-doc """
Validates that the provided `Code` and `Body` comply with the `ValidatorState` schema
for the `OperationID` operation.
""".
-spec validate_response(
        OperationID :: operation_id(),
        Code :: 200..599,
        Body :: jesse:json_term(),
        ValidatorState :: jesse_state:state()) ->
    ok | {ok, term()} | [ok | {ok, term()}] | no_return().
validate_response('cancelRun', 200, Body, ValidatorState) ->
    validate_response_body('RunObject', 'RunObject', Body, ValidatorState);
validate_response('createAssistant', 200, Body, ValidatorState) ->
    validate_response_body('AssistantObject', 'AssistantObject', Body, ValidatorState);
validate_response('createMessage', 200, Body, ValidatorState) ->
    validate_response_body('MessageObject', 'MessageObject', Body, ValidatorState);
validate_response('createRun', 200, Body, ValidatorState) ->
    validate_response_body('RunObject', 'RunObject', Body, ValidatorState);
validate_response('createThread', 200, Body, ValidatorState) ->
    validate_response_body('ThreadObject', 'ThreadObject', Body, ValidatorState);
validate_response('createThreadAndRun', 200, Body, ValidatorState) ->
    validate_response_body('RunObject', 'RunObject', Body, ValidatorState);
validate_response('deleteAssistant', 200, Body, ValidatorState) ->
    validate_response_body('DeleteAssistantResponse', 'DeleteAssistantResponse', Body, ValidatorState);
validate_response('deleteMessage', 200, Body, ValidatorState) ->
    validate_response_body('DeleteMessageResponse', 'DeleteMessageResponse', Body, ValidatorState);
validate_response('deleteThread', 200, Body, ValidatorState) ->
    validate_response_body('DeleteThreadResponse', 'DeleteThreadResponse', Body, ValidatorState);
validate_response('getAssistant', 200, Body, ValidatorState) ->
    validate_response_body('AssistantObject', 'AssistantObject', Body, ValidatorState);
validate_response('getMessage', 200, Body, ValidatorState) ->
    validate_response_body('MessageObject', 'MessageObject', Body, ValidatorState);
validate_response('getRun', 200, Body, ValidatorState) ->
    validate_response_body('RunObject', 'RunObject', Body, ValidatorState);
validate_response('getRunStep', 200, Body, ValidatorState) ->
    validate_response_body('RunStepObject', 'RunStepObject', Body, ValidatorState);
validate_response('getThread', 200, Body, ValidatorState) ->
    validate_response_body('ThreadObject', 'ThreadObject', Body, ValidatorState);
validate_response('listAssistants', 200, Body, ValidatorState) ->
    validate_response_body('ListAssistantsResponse', 'ListAssistantsResponse', Body, ValidatorState);
validate_response('listMessages', 200, Body, ValidatorState) ->
    validate_response_body('ListMessagesResponse', 'ListMessagesResponse', Body, ValidatorState);
validate_response('listRunSteps', 200, Body, ValidatorState) ->
    validate_response_body('ListRunStepsResponse', 'ListRunStepsResponse', Body, ValidatorState);
validate_response('listRuns', 200, Body, ValidatorState) ->
    validate_response_body('ListRunsResponse', 'ListRunsResponse', Body, ValidatorState);
validate_response('modifyAssistant', 200, Body, ValidatorState) ->
    validate_response_body('AssistantObject', 'AssistantObject', Body, ValidatorState);
validate_response('modifyMessage', 200, Body, ValidatorState) ->
    validate_response_body('MessageObject', 'MessageObject', Body, ValidatorState);
validate_response('modifyRun', 200, Body, ValidatorState) ->
    validate_response_body('RunObject', 'RunObject', Body, ValidatorState);
validate_response('modifyThread', 200, Body, ValidatorState) ->
    validate_response_body('ThreadObject', 'ThreadObject', Body, ValidatorState);
validate_response('submitToolOuputsToRun', 200, Body, ValidatorState) ->
    validate_response_body('RunObject', 'RunObject', Body, ValidatorState);
validate_response('createSpeech', 200, Body, ValidatorState) ->
    validate_response_body('file', 'file', Body, ValidatorState);
validate_response('createTranscription', 200, Body, ValidatorState) ->
    validate_response_body('createTranscription_200_response', 'createTranscription_200_response', Body, ValidatorState);
validate_response('createTranslation', 200, Body, ValidatorState) ->
    validate_response_body('createTranslation_200_response', 'createTranslation_200_response', Body, ValidatorState);
validate_response('list-audit-logs', 200, Body, ValidatorState) ->
    validate_response_body('ListAuditLogsResponse', 'ListAuditLogsResponse', Body, ValidatorState);
validate_response('cancelBatch', 200, Body, ValidatorState) ->
    validate_response_body('Batch', 'Batch', Body, ValidatorState);
validate_response('createBatch', 200, Body, ValidatorState) ->
    validate_response_body('Batch', 'Batch', Body, ValidatorState);
validate_response('listBatches', 200, Body, ValidatorState) ->
    validate_response_body('ListBatchesResponse', 'ListBatchesResponse', Body, ValidatorState);
validate_response('retrieveBatch', 200, Body, ValidatorState) ->
    validate_response_body('Batch', 'Batch', Body, ValidatorState);
validate_response('createChatCompletion', 200, Body, ValidatorState) ->
    validate_response_body('CreateChatCompletionResponse', 'CreateChatCompletionResponse', Body, ValidatorState);
validate_response('createCompletion', 200, Body, ValidatorState) ->
    validate_response_body('CreateCompletionResponse', 'CreateCompletionResponse', Body, ValidatorState);
validate_response('admin-api-keys-create', 200, Body, ValidatorState) ->
    validate_response_body('AdminApiKey', 'AdminApiKey', Body, ValidatorState);
validate_response('admin-api-keys-delete', 200, Body, ValidatorState) ->
    validate_response_body('admin_api_keys_delete_200_response', 'admin_api_keys_delete_200_response', Body, ValidatorState);
validate_response('admin-api-keys-get', 200, Body, ValidatorState) ->
    validate_response_body('AdminApiKey', 'AdminApiKey', Body, ValidatorState);
validate_response('admin-api-keys-list', 200, Body, ValidatorState) ->
    validate_response_body('ApiKeyList', 'ApiKeyList', Body, ValidatorState);
validate_response('createEmbedding', 200, Body, ValidatorState) ->
    validate_response_body('CreateEmbeddingResponse', 'CreateEmbeddingResponse', Body, ValidatorState);
validate_response('createFile', 200, Body, ValidatorState) ->
    validate_response_body('OpenAIFile', 'OpenAIFile', Body, ValidatorState);
validate_response('deleteFile', 200, Body, ValidatorState) ->
    validate_response_body('DeleteFileResponse', 'DeleteFileResponse', Body, ValidatorState);
validate_response('downloadFile', 200, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('listFiles', 200, Body, ValidatorState) ->
    validate_response_body('ListFilesResponse', 'ListFilesResponse', Body, ValidatorState);
validate_response('retrieveFile', 200, Body, ValidatorState) ->
    validate_response_body('OpenAIFile', 'OpenAIFile', Body, ValidatorState);
validate_response('cancelFineTuningJob', 200, Body, ValidatorState) ->
    validate_response_body('FineTuningJob', 'FineTuningJob', Body, ValidatorState);
validate_response('createFineTuningJob', 200, Body, ValidatorState) ->
    validate_response_body('FineTuningJob', 'FineTuningJob', Body, ValidatorState);
validate_response('listFineTuningEvents', 200, Body, ValidatorState) ->
    validate_response_body('ListFineTuningJobEventsResponse', 'ListFineTuningJobEventsResponse', Body, ValidatorState);
validate_response('listFineTuningJobCheckpoints', 200, Body, ValidatorState) ->
    validate_response_body('ListFineTuningJobCheckpointsResponse', 'ListFineTuningJobCheckpointsResponse', Body, ValidatorState);
validate_response('listPaginatedFineTuningJobs', 200, Body, ValidatorState) ->
    validate_response_body('ListPaginatedFineTuningJobsResponse', 'ListPaginatedFineTuningJobsResponse', Body, ValidatorState);
validate_response('retrieveFineTuningJob', 200, Body, ValidatorState) ->
    validate_response_body('FineTuningJob', 'FineTuningJob', Body, ValidatorState);
validate_response('createImage', 200, Body, ValidatorState) ->
    validate_response_body('ImagesResponse', 'ImagesResponse', Body, ValidatorState);
validate_response('createImageEdit', 200, Body, ValidatorState) ->
    validate_response_body('ImagesResponse', 'ImagesResponse', Body, ValidatorState);
validate_response('createImageVariation', 200, Body, ValidatorState) ->
    validate_response_body('ImagesResponse', 'ImagesResponse', Body, ValidatorState);
validate_response('delete-invite', 200, Body, ValidatorState) ->
    validate_response_body('InviteDeleteResponse', 'InviteDeleteResponse', Body, ValidatorState);
validate_response('inviteUser', 200, Body, ValidatorState) ->
    validate_response_body('Invite', 'Invite', Body, ValidatorState);
validate_response('list-invites', 200, Body, ValidatorState) ->
    validate_response_body('InviteListResponse', 'InviteListResponse', Body, ValidatorState);
validate_response('retrieve-invite', 200, Body, ValidatorState) ->
    validate_response_body('Invite', 'Invite', Body, ValidatorState);
validate_response('deleteModel', 200, Body, ValidatorState) ->
    validate_response_body('DeleteModelResponse', 'DeleteModelResponse', Body, ValidatorState);
validate_response('listModels', 200, Body, ValidatorState) ->
    validate_response_body('ListModelsResponse', 'ListModelsResponse', Body, ValidatorState);
validate_response('retrieveModel', 200, Body, ValidatorState) ->
    validate_response_body('Model', 'Model', Body, ValidatorState);
validate_response('createModeration', 200, Body, ValidatorState) ->
    validate_response_body('CreateModerationResponse', 'CreateModerationResponse', Body, ValidatorState);
validate_response('archive-project', 200, Body, ValidatorState) ->
    validate_response_body('Project', 'Project', Body, ValidatorState);
validate_response('create-project', 200, Body, ValidatorState) ->
    validate_response_body('Project', 'Project', Body, ValidatorState);
validate_response('create-project-service-account', 200, Body, ValidatorState) ->
    validate_response_body('ProjectServiceAccountCreateResponse', 'ProjectServiceAccountCreateResponse', Body, ValidatorState);
validate_response('create-project-service-account', 400, Body, ValidatorState) ->
    validate_response_body('ErrorResponse', 'ErrorResponse', Body, ValidatorState);
validate_response('create-project-user', 200, Body, ValidatorState) ->
    validate_response_body('ProjectUser', 'ProjectUser', Body, ValidatorState);
validate_response('create-project-user', 400, Body, ValidatorState) ->
    validate_response_body('ErrorResponse', 'ErrorResponse', Body, ValidatorState);
validate_response('delete-project-api-key', 200, Body, ValidatorState) ->
    validate_response_body('ProjectApiKeyDeleteResponse', 'ProjectApiKeyDeleteResponse', Body, ValidatorState);
validate_response('delete-project-api-key', 400, Body, ValidatorState) ->
    validate_response_body('ErrorResponse', 'ErrorResponse', Body, ValidatorState);
validate_response('delete-project-service-account', 200, Body, ValidatorState) ->
    validate_response_body('ProjectServiceAccountDeleteResponse', 'ProjectServiceAccountDeleteResponse', Body, ValidatorState);
validate_response('delete-project-user', 200, Body, ValidatorState) ->
    validate_response_body('ProjectUserDeleteResponse', 'ProjectUserDeleteResponse', Body, ValidatorState);
validate_response('delete-project-user', 400, Body, ValidatorState) ->
    validate_response_body('ErrorResponse', 'ErrorResponse', Body, ValidatorState);
validate_response('list-project-api-keys', 200, Body, ValidatorState) ->
    validate_response_body('ProjectApiKeyListResponse', 'ProjectApiKeyListResponse', Body, ValidatorState);
validate_response('list-project-rate-limits', 200, Body, ValidatorState) ->
    validate_response_body('ProjectRateLimitListResponse', 'ProjectRateLimitListResponse', Body, ValidatorState);
validate_response('list-project-service-accounts', 200, Body, ValidatorState) ->
    validate_response_body('ProjectServiceAccountListResponse', 'ProjectServiceAccountListResponse', Body, ValidatorState);
validate_response('list-project-service-accounts', 400, Body, ValidatorState) ->
    validate_response_body('ErrorResponse', 'ErrorResponse', Body, ValidatorState);
validate_response('list-project-users', 200, Body, ValidatorState) ->
    validate_response_body('ProjectUserListResponse', 'ProjectUserListResponse', Body, ValidatorState);
validate_response('list-project-users', 400, Body, ValidatorState) ->
    validate_response_body('ErrorResponse', 'ErrorResponse', Body, ValidatorState);
validate_response('list-projects', 200, Body, ValidatorState) ->
    validate_response_body('ProjectListResponse', 'ProjectListResponse', Body, ValidatorState);
validate_response('modify-project', 200, Body, ValidatorState) ->
    validate_response_body('Project', 'Project', Body, ValidatorState);
validate_response('modify-project', 400, Body, ValidatorState) ->
    validate_response_body('ErrorResponse', 'ErrorResponse', Body, ValidatorState);
validate_response('modify-project-user', 200, Body, ValidatorState) ->
    validate_response_body('ProjectUser', 'ProjectUser', Body, ValidatorState);
validate_response('modify-project-user', 400, Body, ValidatorState) ->
    validate_response_body('ErrorResponse', 'ErrorResponse', Body, ValidatorState);
validate_response('retrieve-project', 200, Body, ValidatorState) ->
    validate_response_body('Project', 'Project', Body, ValidatorState);
validate_response('retrieve-project-api-key', 200, Body, ValidatorState) ->
    validate_response_body('ProjectApiKey', 'ProjectApiKey', Body, ValidatorState);
validate_response('retrieve-project-service-account', 200, Body, ValidatorState) ->
    validate_response_body('ProjectServiceAccount', 'ProjectServiceAccount', Body, ValidatorState);
validate_response('retrieve-project-user', 200, Body, ValidatorState) ->
    validate_response_body('ProjectUser', 'ProjectUser', Body, ValidatorState);
validate_response('update-project-rate-limits', 200, Body, ValidatorState) ->
    validate_response_body('ProjectRateLimit', 'ProjectRateLimit', Body, ValidatorState);
validate_response('update-project-rate-limits', 400, Body, ValidatorState) ->
    validate_response_body('ErrorResponse', 'ErrorResponse', Body, ValidatorState);
validate_response('create-realtime-session', 200, Body, ValidatorState) ->
    validate_response_body('RealtimeSessionCreateResponse', 'RealtimeSessionCreateResponse', Body, ValidatorState);
validate_response('addUploadPart', 200, Body, ValidatorState) ->
    validate_response_body('UploadPart', 'UploadPart', Body, ValidatorState);
validate_response('cancelUpload', 200, Body, ValidatorState) ->
    validate_response_body('Upload', 'Upload', Body, ValidatorState);
validate_response('completeUpload', 200, Body, ValidatorState) ->
    validate_response_body('Upload', 'Upload', Body, ValidatorState);
validate_response('createUpload', 200, Body, ValidatorState) ->
    validate_response_body('Upload', 'Upload', Body, ValidatorState);
validate_response('usage-audio-speeches', 200, Body, ValidatorState) ->
    validate_response_body('UsageResponse', 'UsageResponse', Body, ValidatorState);
validate_response('usage-audio-transcriptions', 200, Body, ValidatorState) ->
    validate_response_body('UsageResponse', 'UsageResponse', Body, ValidatorState);
validate_response('usage-code-interpreter-sessions', 200, Body, ValidatorState) ->
    validate_response_body('UsageResponse', 'UsageResponse', Body, ValidatorState);
validate_response('usage-completions', 200, Body, ValidatorState) ->
    validate_response_body('UsageResponse', 'UsageResponse', Body, ValidatorState);
validate_response('usage-costs', 200, Body, ValidatorState) ->
    validate_response_body('UsageResponse', 'UsageResponse', Body, ValidatorState);
validate_response('usage-embeddings', 200, Body, ValidatorState) ->
    validate_response_body('UsageResponse', 'UsageResponse', Body, ValidatorState);
validate_response('usage-images', 200, Body, ValidatorState) ->
    validate_response_body('UsageResponse', 'UsageResponse', Body, ValidatorState);
validate_response('usage-moderations', 200, Body, ValidatorState) ->
    validate_response_body('UsageResponse', 'UsageResponse', Body, ValidatorState);
validate_response('usage-vector-stores', 200, Body, ValidatorState) ->
    validate_response_body('UsageResponse', 'UsageResponse', Body, ValidatorState);
validate_response('delete-user', 200, Body, ValidatorState) ->
    validate_response_body('UserDeleteResponse', 'UserDeleteResponse', Body, ValidatorState);
validate_response('list-users', 200, Body, ValidatorState) ->
    validate_response_body('UserListResponse', 'UserListResponse', Body, ValidatorState);
validate_response('modify-user', 200, Body, ValidatorState) ->
    validate_response_body('User', 'User', Body, ValidatorState);
validate_response('retrieve-user', 200, Body, ValidatorState) ->
    validate_response_body('User', 'User', Body, ValidatorState);
validate_response('cancelVectorStoreFileBatch', 200, Body, ValidatorState) ->
    validate_response_body('VectorStoreFileBatchObject', 'VectorStoreFileBatchObject', Body, ValidatorState);
validate_response('createVectorStore', 200, Body, ValidatorState) ->
    validate_response_body('VectorStoreObject', 'VectorStoreObject', Body, ValidatorState);
validate_response('createVectorStoreFile', 200, Body, ValidatorState) ->
    validate_response_body('VectorStoreFileObject', 'VectorStoreFileObject', Body, ValidatorState);
validate_response('createVectorStoreFileBatch', 200, Body, ValidatorState) ->
    validate_response_body('VectorStoreFileBatchObject', 'VectorStoreFileBatchObject', Body, ValidatorState);
validate_response('deleteVectorStore', 200, Body, ValidatorState) ->
    validate_response_body('DeleteVectorStoreResponse', 'DeleteVectorStoreResponse', Body, ValidatorState);
validate_response('deleteVectorStoreFile', 200, Body, ValidatorState) ->
    validate_response_body('DeleteVectorStoreFileResponse', 'DeleteVectorStoreFileResponse', Body, ValidatorState);
validate_response('getVectorStore', 200, Body, ValidatorState) ->
    validate_response_body('VectorStoreObject', 'VectorStoreObject', Body, ValidatorState);
validate_response('getVectorStoreFile', 200, Body, ValidatorState) ->
    validate_response_body('VectorStoreFileObject', 'VectorStoreFileObject', Body, ValidatorState);
validate_response('getVectorStoreFileBatch', 200, Body, ValidatorState) ->
    validate_response_body('VectorStoreFileBatchObject', 'VectorStoreFileBatchObject', Body, ValidatorState);
validate_response('listFilesInVectorStoreBatch', 200, Body, ValidatorState) ->
    validate_response_body('ListVectorStoreFilesResponse', 'ListVectorStoreFilesResponse', Body, ValidatorState);
validate_response('listVectorStoreFiles', 200, Body, ValidatorState) ->
    validate_response_body('ListVectorStoreFilesResponse', 'ListVectorStoreFilesResponse', Body, ValidatorState);
validate_response('listVectorStores', 200, Body, ValidatorState) ->
    validate_response_body('ListVectorStoresResponse', 'ListVectorStoresResponse', Body, ValidatorState);
validate_response('modifyVectorStore', 200, Body, ValidatorState) ->
    validate_response_body('VectorStoreObject', 'VectorStoreObject', Body, ValidatorState);
validate_response(_OperationID, _Code, _Body, _ValidatorState) ->
    ok.

%%%
-spec request_params(OperationID :: operation_id()) -> [Param :: request_param()].
request_params('cancelRun') ->
    [
        'thread_id',
        'run_id'
    ];
request_params('createAssistant') ->
    [
        'CreateAssistantRequest'
    ];
request_params('createMessage') ->
    [
        'thread_id',
        'CreateMessageRequest'
    ];
request_params('createRun') ->
    [
        'thread_id',
        'CreateRunRequest',
        'include[]'
    ];
request_params('createThread') ->
    [
        'CreateThreadRequest'
    ];
request_params('createThreadAndRun') ->
    [
        'CreateThreadAndRunRequest'
    ];
request_params('deleteAssistant') ->
    [
        'assistant_id'
    ];
request_params('deleteMessage') ->
    [
        'thread_id',
        'message_id'
    ];
request_params('deleteThread') ->
    [
        'thread_id'
    ];
request_params('getAssistant') ->
    [
        'assistant_id'
    ];
request_params('getMessage') ->
    [
        'thread_id',
        'message_id'
    ];
request_params('getRun') ->
    [
        'thread_id',
        'run_id'
    ];
request_params('getRunStep') ->
    [
        'thread_id',
        'run_id',
        'step_id',
        'include[]'
    ];
request_params('getThread') ->
    [
        'thread_id'
    ];
request_params('listAssistants') ->
    [
        'limit',
        'order',
        'after',
        'before'
    ];
request_params('listMessages') ->
    [
        'thread_id',
        'limit',
        'order',
        'after',
        'before',
        'run_id'
    ];
request_params('listRunSteps') ->
    [
        'thread_id',
        'run_id',
        'limit',
        'order',
        'after',
        'before',
        'include[]'
    ];
request_params('listRuns') ->
    [
        'thread_id',
        'limit',
        'order',
        'after',
        'before'
    ];
request_params('modifyAssistant') ->
    [
        'assistant_id',
        'ModifyAssistantRequest'
    ];
request_params('modifyMessage') ->
    [
        'thread_id',
        'message_id',
        'ModifyMessageRequest'
    ];
request_params('modifyRun') ->
    [
        'thread_id',
        'run_id',
        'ModifyRunRequest'
    ];
request_params('modifyThread') ->
    [
        'thread_id',
        'ModifyThreadRequest'
    ];
request_params('submitToolOuputsToRun') ->
    [
        'thread_id',
        'run_id',
        'SubmitToolOutputsRunRequest'
    ];
request_params('createSpeech') ->
    [
        'CreateSpeechRequest'
    ];
request_params('createTranscription') ->
    [
        'file',
        'model',
        'language',
        'prompt',
        'response_format',
        'temperature',
        'timestamp_granularities[]'
    ];
request_params('createTranslation') ->
    [
        'file',
        'model',
        'prompt',
        'response_format',
        'temperature'
    ];
request_params('list-audit-logs') ->
    [
        'effective_at',
        'project_ids[]',
        'event_types[]',
        'actor_ids[]',
        'actor_emails[]',
        'resource_ids[]',
        'limit',
        'after',
        'before'
    ];
request_params('cancelBatch') ->
    [
        'batch_id'
    ];
request_params('createBatch') ->
    [
        'createBatch_request'
    ];
request_params('listBatches') ->
    [
        'after',
        'limit'
    ];
request_params('retrieveBatch') ->
    [
        'batch_id'
    ];
request_params('createChatCompletion') ->
    [
        'CreateChatCompletionRequest'
    ];
request_params('createCompletion') ->
    [
        'CreateCompletionRequest'
    ];
request_params('admin-api-keys-create') ->
    [
        'admin_api_keys_create_request'
    ];
request_params('admin-api-keys-delete') ->
    [
        'key_id'
    ];
request_params('admin-api-keys-get') ->
    [
        'key_id'
    ];
request_params('admin-api-keys-list') ->
    [
        'after',
        'order',
        'limit'
    ];
request_params('createEmbedding') ->
    [
        'CreateEmbeddingRequest'
    ];
request_params('createFile') ->
    [
        'file',
        'purpose'
    ];
request_params('deleteFile') ->
    [
        'file_id'
    ];
request_params('downloadFile') ->
    [
        'file_id'
    ];
request_params('listFiles') ->
    [
        'purpose',
        'limit',
        'order',
        'after'
    ];
request_params('retrieveFile') ->
    [
        'file_id'
    ];
request_params('cancelFineTuningJob') ->
    [
        'fine_tuning_job_id'
    ];
request_params('createFineTuningJob') ->
    [
        'CreateFineTuningJobRequest'
    ];
request_params('listFineTuningEvents') ->
    [
        'fine_tuning_job_id',
        'after',
        'limit'
    ];
request_params('listFineTuningJobCheckpoints') ->
    [
        'fine_tuning_job_id',
        'after',
        'limit'
    ];
request_params('listPaginatedFineTuningJobs') ->
    [
        'after',
        'limit'
    ];
request_params('retrieveFineTuningJob') ->
    [
        'fine_tuning_job_id'
    ];
request_params('createImage') ->
    [
        'CreateImageRequest'
    ];
request_params('createImageEdit') ->
    [
        'image',
        'prompt',
        'mask',
        'model',
        'n',
        'size',
        'response_format',
        'user'
    ];
request_params('createImageVariation') ->
    [
        'image',
        'model',
        'n',
        'response_format',
        'size',
        'user'
    ];
request_params('delete-invite') ->
    [
        'invite_id'
    ];
request_params('inviteUser') ->
    [
        'InviteRequest'
    ];
request_params('list-invites') ->
    [
        'limit',
        'after'
    ];
request_params('retrieve-invite') ->
    [
        'invite_id'
    ];
request_params('deleteModel') ->
    [
        'model'
    ];
request_params('listModels') ->
    [
    ];
request_params('retrieveModel') ->
    [
        'model'
    ];
request_params('createModeration') ->
    [
        'CreateModerationRequest'
    ];
request_params('archive-project') ->
    [
        'project_id'
    ];
request_params('create-project') ->
    [
        'ProjectCreateRequest'
    ];
request_params('create-project-service-account') ->
    [
        'project_id',
        'ProjectServiceAccountCreateRequest'
    ];
request_params('create-project-user') ->
    [
        'project_id',
        'ProjectUserCreateRequest'
    ];
request_params('delete-project-api-key') ->
    [
        'project_id',
        'key_id'
    ];
request_params('delete-project-service-account') ->
    [
        'project_id',
        'service_account_id'
    ];
request_params('delete-project-user') ->
    [
        'project_id',
        'user_id'
    ];
request_params('list-project-api-keys') ->
    [
        'project_id',
        'limit',
        'after'
    ];
request_params('list-project-rate-limits') ->
    [
        'project_id',
        'limit',
        'after',
        'before'
    ];
request_params('list-project-service-accounts') ->
    [
        'project_id',
        'limit',
        'after'
    ];
request_params('list-project-users') ->
    [
        'project_id',
        'limit',
        'after'
    ];
request_params('list-projects') ->
    [
        'limit',
        'after',
        'include_archived'
    ];
request_params('modify-project') ->
    [
        'project_id',
        'ProjectUpdateRequest'
    ];
request_params('modify-project-user') ->
    [
        'project_id',
        'user_id',
        'ProjectUserUpdateRequest'
    ];
request_params('retrieve-project') ->
    [
        'project_id'
    ];
request_params('retrieve-project-api-key') ->
    [
        'project_id',
        'key_id'
    ];
request_params('retrieve-project-service-account') ->
    [
        'project_id',
        'service_account_id'
    ];
request_params('retrieve-project-user') ->
    [
        'project_id',
        'user_id'
    ];
request_params('update-project-rate-limits') ->
    [
        'project_id',
        'rate_limit_id',
        'ProjectRateLimitUpdateRequest'
    ];
request_params('create-realtime-session') ->
    [
        'RealtimeSessionCreateRequest'
    ];
request_params('addUploadPart') ->
    [
        'upload_id',
        'data'
    ];
request_params('cancelUpload') ->
    [
        'upload_id'
    ];
request_params('completeUpload') ->
    [
        'upload_id',
        'CompleteUploadRequest'
    ];
request_params('createUpload') ->
    [
        'CreateUploadRequest'
    ];
request_params('usage-audio-speeches') ->
    [
        'start_time',
        'end_time',
        'bucket_width',
        'project_ids',
        'user_ids',
        'api_key_ids',
        'models',
        'group_by',
        'limit',
        'page'
    ];
request_params('usage-audio-transcriptions') ->
    [
        'start_time',
        'end_time',
        'bucket_width',
        'project_ids',
        'user_ids',
        'api_key_ids',
        'models',
        'group_by',
        'limit',
        'page'
    ];
request_params('usage-code-interpreter-sessions') ->
    [
        'start_time',
        'end_time',
        'bucket_width',
        'project_ids',
        'group_by',
        'limit',
        'page'
    ];
request_params('usage-completions') ->
    [
        'start_time',
        'end_time',
        'bucket_width',
        'project_ids',
        'user_ids',
        'api_key_ids',
        'models',
        'batch',
        'group_by',
        'limit',
        'page'
    ];
request_params('usage-costs') ->
    [
        'start_time',
        'end_time',
        'bucket_width',
        'project_ids',
        'group_by',
        'limit',
        'page'
    ];
request_params('usage-embeddings') ->
    [
        'start_time',
        'end_time',
        'bucket_width',
        'project_ids',
        'user_ids',
        'api_key_ids',
        'models',
        'group_by',
        'limit',
        'page'
    ];
request_params('usage-images') ->
    [
        'start_time',
        'end_time',
        'bucket_width',
        'sources',
        'sizes',
        'project_ids',
        'user_ids',
        'api_key_ids',
        'models',
        'group_by',
        'limit',
        'page'
    ];
request_params('usage-moderations') ->
    [
        'start_time',
        'end_time',
        'bucket_width',
        'project_ids',
        'user_ids',
        'api_key_ids',
        'models',
        'group_by',
        'limit',
        'page'
    ];
request_params('usage-vector-stores') ->
    [
        'start_time',
        'end_time',
        'bucket_width',
        'project_ids',
        'group_by',
        'limit',
        'page'
    ];
request_params('delete-user') ->
    [
        'user_id'
    ];
request_params('list-users') ->
    [
        'limit',
        'after'
    ];
request_params('modify-user') ->
    [
        'user_id',
        'UserRoleUpdateRequest'
    ];
request_params('retrieve-user') ->
    [
        'user_id'
    ];
request_params('cancelVectorStoreFileBatch') ->
    [
        'vector_store_id',
        'batch_id'
    ];
request_params('createVectorStore') ->
    [
        'CreateVectorStoreRequest'
    ];
request_params('createVectorStoreFile') ->
    [
        'vector_store_id',
        'CreateVectorStoreFileRequest'
    ];
request_params('createVectorStoreFileBatch') ->
    [
        'vector_store_id',
        'CreateVectorStoreFileBatchRequest'
    ];
request_params('deleteVectorStore') ->
    [
        'vector_store_id'
    ];
request_params('deleteVectorStoreFile') ->
    [
        'vector_store_id',
        'file_id'
    ];
request_params('getVectorStore') ->
    [
        'vector_store_id'
    ];
request_params('getVectorStoreFile') ->
    [
        'vector_store_id',
        'file_id'
    ];
request_params('getVectorStoreFileBatch') ->
    [
        'vector_store_id',
        'batch_id'
    ];
request_params('listFilesInVectorStoreBatch') ->
    [
        'vector_store_id',
        'batch_id',
        'limit',
        'order',
        'after',
        'before',
        'filter'
    ];
request_params('listVectorStoreFiles') ->
    [
        'vector_store_id',
        'limit',
        'order',
        'after',
        'before',
        'filter'
    ];
request_params('listVectorStores') ->
    [
        'limit',
        'order',
        'after',
        'before'
    ];
request_params('modifyVectorStore') ->
    [
        'vector_store_id',
        'UpdateVectorStoreRequest'
    ];
request_params(_) ->
    error(unknown_operation).

-spec request_param_info(OperationID :: operation_id(), Name :: request_param()) ->
    #{source => qs_val | binding | header | body, rules => [rule()]}.
request_param_info('cancelRun', 'thread_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('cancelRun', 'run_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('createAssistant', 'CreateAssistantRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateAssistantRequest">>},
            required
        ]
    };
request_param_info('createMessage', 'thread_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('createMessage', 'CreateMessageRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateMessageRequest">>},
            required
        ]
    };
request_param_info('createRun', 'thread_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('createRun', 'CreateRunRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateRunRequest">>},
            required
        ]
    };
request_param_info('createRun', 'include[]') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['step_details.tool_calls[*].file_search.results[*].content'] },
            not_required
        ]
    };
request_param_info('createThread', 'CreateThreadRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateThreadRequest">>},
            not_required
        ]
    };
request_param_info('createThreadAndRun', 'CreateThreadAndRunRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateThreadAndRunRequest">>},
            required
        ]
    };
request_param_info('deleteAssistant', 'assistant_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('deleteMessage', 'thread_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('deleteMessage', 'message_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('deleteThread', 'thread_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getAssistant', 'assistant_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getMessage', 'thread_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getMessage', 'message_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getRun', 'thread_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getRun', 'run_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getRunStep', 'thread_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getRunStep', 'run_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getRunStep', 'step_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getRunStep', 'include[]') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['step_details.tool_calls[*].file_search.results[*].content'] },
            not_required
        ]
    };
request_param_info('getThread', 'thread_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('listAssistants', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('listAssistants', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['asc', 'desc'] },
            not_required
        ]
    };
request_param_info('listAssistants', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('listAssistants', 'before') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('listMessages', 'thread_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('listMessages', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('listMessages', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['asc', 'desc'] },
            not_required
        ]
    };
request_param_info('listMessages', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('listMessages', 'before') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('listMessages', 'run_id') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('listRunSteps', 'thread_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('listRunSteps', 'run_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('listRunSteps', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('listRunSteps', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['asc', 'desc'] },
            not_required
        ]
    };
request_param_info('listRunSteps', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('listRunSteps', 'before') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('listRunSteps', 'include[]') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['step_details.tool_calls[*].file_search.results[*].content'] },
            not_required
        ]
    };
request_param_info('listRuns', 'thread_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('listRuns', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('listRuns', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['asc', 'desc'] },
            not_required
        ]
    };
request_param_info('listRuns', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('listRuns', 'before') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('modifyAssistant', 'assistant_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('modifyAssistant', 'ModifyAssistantRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ModifyAssistantRequest">>},
            required
        ]
    };
request_param_info('modifyMessage', 'thread_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('modifyMessage', 'message_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('modifyMessage', 'ModifyMessageRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ModifyMessageRequest">>},
            required
        ]
    };
request_param_info('modifyRun', 'thread_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('modifyRun', 'run_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('modifyRun', 'ModifyRunRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ModifyRunRequest">>},
            required
        ]
    };
request_param_info('modifyThread', 'thread_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('modifyThread', 'ModifyThreadRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ModifyThreadRequest">>},
            required
        ]
    };
request_param_info('submitToolOuputsToRun', 'thread_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('submitToolOuputsToRun', 'run_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('submitToolOuputsToRun', 'SubmitToolOutputsRunRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/SubmitToolOutputsRunRequest">>},
            required
        ]
    };
request_param_info('createSpeech', 'CreateSpeechRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateSpeechRequest">>},
            required
        ]
    };
request_param_info('createTranscription', 'file') ->
    #{
        source => body,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('createTranscription', 'model') ->
    #{
        source => body,
        rules => [
            required
        ]
    };
request_param_info('createTranscription', 'language') ->
    #{
        source => body,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('createTranscription', 'prompt') ->
    #{
        source => body,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('createTranscription', 'response_format') ->
    #{
        source => body,
        rules => [
            not_required
        ]
    };
request_param_info('createTranscription', 'temperature') ->
    #{
        source => body,
        rules => [
            not_required
        ]
    };
request_param_info('createTranscription', 'timestamp_granularities[]') ->
    #{
        source => body,
        rules => [
            {enum, ['word', 'segment'] },
            not_required
        ]
    };
request_param_info('createTranslation', 'file') ->
    #{
        source => body,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('createTranslation', 'model') ->
    #{
        source => body,
        rules => [
            required
        ]
    };
request_param_info('createTranslation', 'prompt') ->
    #{
        source => body,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('createTranslation', 'response_format') ->
    #{
        source => body,
        rules => [
            not_required
        ]
    };
request_param_info('createTranslation', 'temperature') ->
    #{
        source => body,
        rules => [
            not_required
        ]
    };
request_param_info('list-audit-logs', 'effective_at') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('list-audit-logs', 'project_ids[]') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('list-audit-logs', 'event_types[]') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('list-audit-logs', 'actor_ids[]') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('list-audit-logs', 'actor_emails[]') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('list-audit-logs', 'resource_ids[]') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('list-audit-logs', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('list-audit-logs', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('list-audit-logs', 'before') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('cancelBatch', 'batch_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('createBatch', 'createBatch_request') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/createBatch_request">>},
            required
        ]
    };
request_param_info('listBatches', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('listBatches', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('retrieveBatch', 'batch_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('createChatCompletion', 'CreateChatCompletionRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateChatCompletionRequest">>},
            required
        ]
    };
request_param_info('createCompletion', 'CreateCompletionRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateCompletionRequest">>},
            required
        ]
    };
request_param_info('admin-api-keys-create', 'admin_api_keys_create_request') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/admin_api_keys_create_request">>},
            required
        ]
    };
request_param_info('admin-api-keys-delete', 'key_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('admin-api-keys-get', 'key_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('admin-api-keys-list', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('admin-api-keys-list', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['asc', 'desc'] },
            not_required
        ]
    };
request_param_info('admin-api-keys-list', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('createEmbedding', 'CreateEmbeddingRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateEmbeddingRequest">>},
            required
        ]
    };
request_param_info('createFile', 'file') ->
    #{
        source => body,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('createFile', 'purpose') ->
    #{
        source => body,
        rules => [
            {type, binary},
            {enum, ['assistants', 'batch', 'fine-tune', 'vision'] },
            required
        ]
    };
request_param_info('deleteFile', 'file_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('downloadFile', 'file_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('listFiles', 'purpose') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('listFiles', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('listFiles', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['asc', 'desc'] },
            not_required
        ]
    };
request_param_info('listFiles', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('retrieveFile', 'file_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('cancelFineTuningJob', 'fine_tuning_job_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('createFineTuningJob', 'CreateFineTuningJobRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateFineTuningJobRequest">>},
            required
        ]
    };
request_param_info('listFineTuningEvents', 'fine_tuning_job_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('listFineTuningEvents', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('listFineTuningEvents', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('listFineTuningJobCheckpoints', 'fine_tuning_job_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('listFineTuningJobCheckpoints', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('listFineTuningJobCheckpoints', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('listPaginatedFineTuningJobs', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('listPaginatedFineTuningJobs', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('retrieveFineTuningJob', 'fine_tuning_job_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('createImage', 'CreateImageRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateImageRequest">>},
            required
        ]
    };
request_param_info('createImageEdit', 'image') ->
    #{
        source => body,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('createImageEdit', 'prompt') ->
    #{
        source => body,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('createImageEdit', 'mask') ->
    #{
        source => body,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('createImageEdit', 'model') ->
    #{
        source => body,
        rules => [
            not_required
        ]
    };
request_param_info('createImageEdit', 'n') ->
    #{
        source => body,
        rules => [
            {type, integer},
            {max, 10},
            {min, 1},
            not_required
        ]
    };
request_param_info('createImageEdit', 'size') ->
    #{
        source => body,
        rules => [
            {type, binary},
            {enum, ['256x256', '512x512', '1024x1024'] },
            not_required
        ]
    };
request_param_info('createImageEdit', 'response_format') ->
    #{
        source => body,
        rules => [
            {type, binary},
            {enum, ['url', 'b64_json'] },
            not_required
        ]
    };
request_param_info('createImageEdit', 'user') ->
    #{
        source => body,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('createImageVariation', 'image') ->
    #{
        source => body,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('createImageVariation', 'model') ->
    #{
        source => body,
        rules => [
            not_required
        ]
    };
request_param_info('createImageVariation', 'n') ->
    #{
        source => body,
        rules => [
            {type, integer},
            {max, 10},
            {min, 1},
            not_required
        ]
    };
request_param_info('createImageVariation', 'response_format') ->
    #{
        source => body,
        rules => [
            {type, binary},
            {enum, ['url', 'b64_json'] },
            not_required
        ]
    };
request_param_info('createImageVariation', 'size') ->
    #{
        source => body,
        rules => [
            {type, binary},
            {enum, ['256x256', '512x512', '1024x1024'] },
            not_required
        ]
    };
request_param_info('createImageVariation', 'user') ->
    #{
        source => body,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('delete-invite', 'invite_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('inviteUser', 'InviteRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/InviteRequest">>},
            required
        ]
    };
request_param_info('list-invites', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('list-invites', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('retrieve-invite', 'invite_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('deleteModel', 'model') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('retrieveModel', 'model') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('createModeration', 'CreateModerationRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateModerationRequest">>},
            required
        ]
    };
request_param_info('archive-project', 'project_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('create-project', 'ProjectCreateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ProjectCreateRequest">>},
            required
        ]
    };
request_param_info('create-project-service-account', 'project_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('create-project-service-account', 'ProjectServiceAccountCreateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ProjectServiceAccountCreateRequest">>},
            required
        ]
    };
request_param_info('create-project-user', 'project_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('create-project-user', 'ProjectUserCreateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ProjectUserCreateRequest">>},
            required
        ]
    };
request_param_info('delete-project-api-key', 'project_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('delete-project-api-key', 'key_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('delete-project-service-account', 'project_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('delete-project-service-account', 'service_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('delete-project-user', 'project_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('delete-project-user', 'user_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('list-project-api-keys', 'project_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('list-project-api-keys', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('list-project-api-keys', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('list-project-rate-limits', 'project_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('list-project-rate-limits', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('list-project-rate-limits', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('list-project-rate-limits', 'before') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('list-project-service-accounts', 'project_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('list-project-service-accounts', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('list-project-service-accounts', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('list-project-users', 'project_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('list-project-users', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('list-project-users', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('list-projects', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('list-projects', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('list-projects', 'include_archived') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('modify-project', 'project_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('modify-project', 'ProjectUpdateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ProjectUpdateRequest">>},
            required
        ]
    };
request_param_info('modify-project-user', 'project_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('modify-project-user', 'user_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('modify-project-user', 'ProjectUserUpdateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ProjectUserUpdateRequest">>},
            required
        ]
    };
request_param_info('retrieve-project', 'project_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('retrieve-project-api-key', 'project_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('retrieve-project-api-key', 'key_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('retrieve-project-service-account', 'project_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('retrieve-project-service-account', 'service_account_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('retrieve-project-user', 'project_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('retrieve-project-user', 'user_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('update-project-rate-limits', 'project_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('update-project-rate-limits', 'rate_limit_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('update-project-rate-limits', 'ProjectRateLimitUpdateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/ProjectRateLimitUpdateRequest">>},
            required
        ]
    };
request_param_info('create-realtime-session', 'RealtimeSessionCreateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/RealtimeSessionCreateRequest">>},
            required
        ]
    };
request_param_info('addUploadPart', 'upload_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('addUploadPart', 'data') ->
    #{
        source => body,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('cancelUpload', 'upload_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('completeUpload', 'upload_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('completeUpload', 'CompleteUploadRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CompleteUploadRequest">>},
            required
        ]
    };
request_param_info('createUpload', 'CreateUploadRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateUploadRequest">>},
            required
        ]
    };
request_param_info('usage-audio-speeches', 'start_time') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            required
        ]
    };
request_param_info('usage-audio-speeches', 'end_time') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('usage-audio-speeches', 'bucket_width') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['1m', '1h', '1d'] },
            not_required
        ]
    };
request_param_info('usage-audio-speeches', 'project_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-audio-speeches', 'user_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-audio-speeches', 'api_key_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-audio-speeches', 'models') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-audio-speeches', 'group_by') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['project_id', 'user_id', 'api_key_id', 'model'] },
            not_required
        ]
    };
request_param_info('usage-audio-speeches', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('usage-audio-speeches', 'page') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('usage-audio-transcriptions', 'start_time') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            required
        ]
    };
request_param_info('usage-audio-transcriptions', 'end_time') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('usage-audio-transcriptions', 'bucket_width') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['1m', '1h', '1d'] },
            not_required
        ]
    };
request_param_info('usage-audio-transcriptions', 'project_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-audio-transcriptions', 'user_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-audio-transcriptions', 'api_key_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-audio-transcriptions', 'models') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-audio-transcriptions', 'group_by') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['project_id', 'user_id', 'api_key_id', 'model'] },
            not_required
        ]
    };
request_param_info('usage-audio-transcriptions', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('usage-audio-transcriptions', 'page') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('usage-code-interpreter-sessions', 'start_time') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            required
        ]
    };
request_param_info('usage-code-interpreter-sessions', 'end_time') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('usage-code-interpreter-sessions', 'bucket_width') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['1m', '1h', '1d'] },
            not_required
        ]
    };
request_param_info('usage-code-interpreter-sessions', 'project_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-code-interpreter-sessions', 'group_by') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['project_id'] },
            not_required
        ]
    };
request_param_info('usage-code-interpreter-sessions', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('usage-code-interpreter-sessions', 'page') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('usage-completions', 'start_time') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            required
        ]
    };
request_param_info('usage-completions', 'end_time') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('usage-completions', 'bucket_width') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['1m', '1h', '1d'] },
            not_required
        ]
    };
request_param_info('usage-completions', 'project_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-completions', 'user_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-completions', 'api_key_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-completions', 'models') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-completions', 'batch') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('usage-completions', 'group_by') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['project_id', 'user_id', 'api_key_id', 'model', 'batch'] },
            not_required
        ]
    };
request_param_info('usage-completions', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('usage-completions', 'page') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('usage-costs', 'start_time') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            required
        ]
    };
request_param_info('usage-costs', 'end_time') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('usage-costs', 'bucket_width') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['1d'] },
            not_required
        ]
    };
request_param_info('usage-costs', 'project_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-costs', 'group_by') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['project_id', 'line_item'] },
            not_required
        ]
    };
request_param_info('usage-costs', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('usage-costs', 'page') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('usage-embeddings', 'start_time') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            required
        ]
    };
request_param_info('usage-embeddings', 'end_time') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('usage-embeddings', 'bucket_width') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['1m', '1h', '1d'] },
            not_required
        ]
    };
request_param_info('usage-embeddings', 'project_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-embeddings', 'user_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-embeddings', 'api_key_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-embeddings', 'models') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-embeddings', 'group_by') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['project_id', 'user_id', 'api_key_id', 'model'] },
            not_required
        ]
    };
request_param_info('usage-embeddings', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('usage-embeddings', 'page') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('usage-images', 'start_time') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            required
        ]
    };
request_param_info('usage-images', 'end_time') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('usage-images', 'bucket_width') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['1m', '1h', '1d'] },
            not_required
        ]
    };
request_param_info('usage-images', 'sources') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['image.generation', 'image.edit', 'image.variation'] },
            not_required
        ]
    };
request_param_info('usage-images', 'sizes') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['256x256', '512x512', '1024x1024', '1792x1792', '1024x1792'] },
            not_required
        ]
    };
request_param_info('usage-images', 'project_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-images', 'user_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-images', 'api_key_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-images', 'models') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-images', 'group_by') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['project_id', 'user_id', 'api_key_id', 'model', 'size', 'source'] },
            not_required
        ]
    };
request_param_info('usage-images', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('usage-images', 'page') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('usage-moderations', 'start_time') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            required
        ]
    };
request_param_info('usage-moderations', 'end_time') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('usage-moderations', 'bucket_width') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['1m', '1h', '1d'] },
            not_required
        ]
    };
request_param_info('usage-moderations', 'project_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-moderations', 'user_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-moderations', 'api_key_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-moderations', 'models') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-moderations', 'group_by') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['project_id', 'user_id', 'api_key_id', 'model'] },
            not_required
        ]
    };
request_param_info('usage-moderations', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('usage-moderations', 'page') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('usage-vector-stores', 'start_time') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            required
        ]
    };
request_param_info('usage-vector-stores', 'end_time') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('usage-vector-stores', 'bucket_width') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['1m', '1h', '1d'] },
            not_required
        ]
    };
request_param_info('usage-vector-stores', 'project_ids') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('usage-vector-stores', 'group_by') ->
    #{
        source => qs_val,
        rules => [
            {enum, ['project_id'] },
            not_required
        ]
    };
request_param_info('usage-vector-stores', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('usage-vector-stores', 'page') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('delete-user', 'user_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('list-users', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('list-users', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('modify-user', 'user_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('modify-user', 'UserRoleUpdateRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/UserRoleUpdateRequest">>},
            required
        ]
    };
request_param_info('retrieve-user', 'user_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('cancelVectorStoreFileBatch', 'vector_store_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('cancelVectorStoreFileBatch', 'batch_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('createVectorStore', 'CreateVectorStoreRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateVectorStoreRequest">>},
            required
        ]
    };
request_param_info('createVectorStoreFile', 'vector_store_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('createVectorStoreFile', 'CreateVectorStoreFileRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateVectorStoreFileRequest">>},
            required
        ]
    };
request_param_info('createVectorStoreFileBatch', 'vector_store_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('createVectorStoreFileBatch', 'CreateVectorStoreFileBatchRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateVectorStoreFileBatchRequest">>},
            required
        ]
    };
request_param_info('deleteVectorStore', 'vector_store_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('deleteVectorStoreFile', 'vector_store_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('deleteVectorStoreFile', 'file_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getVectorStore', 'vector_store_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getVectorStoreFile', 'vector_store_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getVectorStoreFile', 'file_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getVectorStoreFileBatch', 'vector_store_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getVectorStoreFileBatch', 'batch_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('listFilesInVectorStoreBatch', 'vector_store_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('listFilesInVectorStoreBatch', 'batch_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('listFilesInVectorStoreBatch', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('listFilesInVectorStoreBatch', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['asc', 'desc'] },
            not_required
        ]
    };
request_param_info('listFilesInVectorStoreBatch', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('listFilesInVectorStoreBatch', 'before') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('listFilesInVectorStoreBatch', 'filter') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['in_progress', 'completed', 'failed', 'cancelled'] },
            not_required
        ]
    };
request_param_info('listVectorStoreFiles', 'vector_store_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('listVectorStoreFiles', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('listVectorStoreFiles', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['asc', 'desc'] },
            not_required
        ]
    };
request_param_info('listVectorStoreFiles', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('listVectorStoreFiles', 'before') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('listVectorStoreFiles', 'filter') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['in_progress', 'completed', 'failed', 'cancelled'] },
            not_required
        ]
    };
request_param_info('listVectorStores', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('listVectorStores', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['asc', 'desc'] },
            not_required
        ]
    };
request_param_info('listVectorStores', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('listVectorStores', 'before') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('modifyVectorStore', 'vector_store_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('modifyVectorStore', 'UpdateVectorStoreRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/UpdateVectorStoreRequest">>},
            required
        ]
    };
request_param_info(OperationID, Name) ->
    error({unknown_param, OperationID, Name}).

-spec populate_request_params(
        operation_id(), [request_param()], cowboy_req:req(), jesse_state:state(), map()) ->
    {ok, map(), cowboy_req:req()} | {error, _, cowboy_req:req()}.
populate_request_params(_, [], Req, _, Model) ->
    {ok, Model, Req};
populate_request_params(OperationID, [ReqParamName | T], Req0, ValidatorState, Model0) ->
    case populate_request_param(OperationID, ReqParamName, Req0, ValidatorState) of
        {ok, V, Req} ->
            Model = Model0#{ReqParamName => V},
            populate_request_params(OperationID, T, Req, ValidatorState, Model);
        Error ->
            Error
    end.

-spec populate_request_param(
        operation_id(), request_param(), cowboy_req:req(), jesse_state:state()) ->
    {ok, term(), cowboy_req:req()} | {error, term(), cowboy_req:req()}.
populate_request_param(OperationID, ReqParamName, Req0, ValidatorState) ->
    #{rules := Rules, source := Source} = request_param_info(OperationID, ReqParamName),
    case get_value(Source, ReqParamName, Req0) of
        {error, Reason, Req} ->
            {error, Reason, Req};
        {Value, Req} ->
            case prepare_param(Rules, ReqParamName, Value, ValidatorState) of
                {ok, Result} -> {ok, Result, Req};
                {error, Reason} ->
                    {error, Reason, Req}
            end
    end.

validate_response_body(list, ReturnBaseType, Body, ValidatorState) ->
    [
        validate(schema, Item, ReturnBaseType, ValidatorState)
    || Item <- Body];

validate_response_body(_, ReturnBaseType, Body, ValidatorState) ->
    validate(schema, Body, ReturnBaseType, ValidatorState).

-spec validate(rule(), term(), request_param(), jesse_state:state()) ->
    ok | {ok, term()}.
validate(required, undefined, ReqParamName, _) ->
    validation_error(required, ReqParamName, undefined);
validate(required, _Value, _, _) ->
    ok;
validate(not_required, _Value, _, _) ->
    ok;
validate(_, undefined, _, _) ->
    ok;
validate({type, boolean}, Value, _, _) when is_boolean(Value) ->
    ok;
validate({type, integer}, Value, _, _) when is_integer(Value) ->
    ok;
validate({type, float}, Value, _, _) when is_float(Value) ->
    ok;
validate({type, binary}, Value, _, _) when is_binary(Value) ->
    ok;
validate({max, Max}, Value, _, _) when Value =< Max ->
    ok;
validate({min, Min}, Value, _, _) when Min =< Value ->
    ok;
validate({exclusive_max, Max}, Value, _, _) when Value < Max ->
    ok;
validate({exclusive_min, Min}, Value, _, _) when Min < Value ->
    ok;
validate({max_length, MaxLength}, Value, _, _) when is_binary(Value), byte_size(Value) =< MaxLength ->
    ok;
validate({min_length, MinLength}, Value, _, _) when is_binary(Value), MinLength =< byte_size(Value) ->
    ok;
validate(Rule = {type, byte}, Value, ReqParamName, _) when is_binary(Value) ->
    try base64:decode(Value) of
        Decoded -> {ok, Decoded}
    catch error:_Error -> validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {type, boolean}, Value, ReqParamName, _) when is_binary(Value) ->
    case to_binary(string:lowercase(Value)) of
        <<"true">> -> {ok, true};
        <<"false">> -> {ok, false};
        _ -> validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {type, integer}, Value, ReqParamName, _) when is_binary(Value) ->
    try
        {ok, binary_to_integer(Value)}
    catch
        error:badarg ->
            validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {type, float}, Value, ReqParamName, _) when is_binary(Value) ->
    try
        {ok, binary_to_float(Value)}
    catch
        error:badarg ->
            validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {type, date}, Value, ReqParamName, _) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {type, datetime}, Value, ReqParamName, _) ->
    try calendar:rfc3339_to_system_time(binary_to_list(Value)) of
        _ -> ok
    catch error:_Error -> validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {enum, Values}, Value, ReqParamName, _) ->
    try
        FormattedValue = erlang:binary_to_existing_atom(Value, utf8),
        case lists:member(FormattedValue, Values) of
            true -> {ok, FormattedValue};
            false -> validation_error(Rule, ReqParamName, Value)
        end
    catch
        error:badarg ->
            validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {pattern, Pattern}, Value, ReqParamName, _) ->
    {ok, MP} = re:compile(Pattern),
    case re:run(Value, MP) of
        {match, _} -> ok;
        _ -> validation_error(Rule, ReqParamName, Value)
    end;
validate(schema, Value, ReqParamName, ValidatorState) ->
    Definition = iolist_to_binary(["#/components/schemas/", atom_to_binary(ReqParamName, utf8)]),
    validate({schema, object, Definition}, Value, ReqParamName, ValidatorState);
validate({schema, list, Definition}, Value, ReqParamName, ValidatorState) ->
    lists:foreach(
      fun(Item) ->
              validate({schema, object, Definition}, Item, ReqParamName, ValidatorState)
      end, Value);
validate(Rule = {schema, object, Definition}, Value, ReqParamName, ValidatorState) ->
    try
        _ = validate_with_schema(Value, Definition, ValidatorState),
        ok
    catch
        throw:[{schema_invalid, _, Error} | _] ->
            Info = #{
                type => schema_invalid,
                error => Error
            },
            validation_error(Rule, ReqParamName, Value, Info);
        throw:[{data_invalid, Schema, Error, _, Path} | _] ->
            Info = #{
                type => data_invalid,
                error => Error,
                schema => Schema,
                path => Path
            },
            validation_error(Rule, ReqParamName, Value, Info)
    end;
validate(Rule, Value, ReqParamName, _) ->
    validation_error(Rule, ReqParamName, Value).

-spec validation_error(rule(), request_param(), term()) -> no_return().
validation_error(ViolatedRule, Name, Value) ->
    validation_error(ViolatedRule, Name, Value, #{}).

-spec validation_error(rule(), request_param(), term(), Info :: #{_ := _}) -> no_return().
validation_error(ViolatedRule, Name, Value, Info) ->
    throw({wrong_param, Name, Value, ViolatedRule, Info}).

-spec get_value(body | qs_val | header | binding, request_param(), cowboy_req:req()) ->
    {any(), cowboy_req:req()} |
    {error, any(), cowboy_req:req()}.
get_value(body, _Name, Req0) ->
    {ok, Body, Req} = read_entire_body(Req0),
    case prepare_body(Body) of
        {error, Reason} ->
            {error, Reason, Req};
        Value ->
            {Value, Req}
    end;
get_value(qs_val, Name, Req) ->
    QS = cowboy_req:parse_qs(Req),
    Value = get_opt(to_qs(Name), QS),
    {Value, Req};
get_value(header, Name, Req) ->
    Headers = cowboy_req:headers(Req),
    Value = maps:get(to_header(Name), Headers, undefined),
    {Value, Req};
get_value(binding, Name, Req) ->
    Value = cowboy_req:binding(Name, Req),
    {Value, Req}.

-spec read_entire_body(cowboy_req:req()) -> {ok, binary(), cowboy_req:req()}.
read_entire_body(Req) ->
    read_entire_body(Req, []).

-spec read_entire_body(cowboy_req:req(), iodata()) -> {ok, binary(), cowboy_req:req()}.
read_entire_body(Request, Acc) -> % {
    case cowboy_req:read_body(Request) of
        {ok, Data, NewRequest} ->
            {ok, iolist_to_binary(lists:reverse([Data | Acc])), NewRequest};
        {more, Data, NewRequest} ->
            read_entire_body(NewRequest, [Data | Acc])
    end.

prepare_body(<<>>) ->
    <<>>;
prepare_body(Body) ->
    try
        json:decode(Body)
    catch
        error:Error ->
            {error, {invalid_json, Body, Error}}
    end.

validate_with_schema(Body, Definition, ValidatorState) ->
    jesse_schema_validator:validate_with_state(
        [{<<"$ref">>, Definition}],
        Body,
        ValidatorState
    ).

-spec prepare_param([rule()], request_param(), term(), jesse_state:state()) ->
    {ok, term()} | {error, Reason :: any()}.
prepare_param(Rules, ReqParamName, Value, ValidatorState) ->
    Fun = fun(Rule, Acc) ->
        case validate(Rule, Acc, ReqParamName, ValidatorState) of
            ok -> Acc;
            {ok, Prepared} -> Prepared
        end
    end,
    try
        Result = lists:foldl(Fun, Value, Rules),
        {ok, Result}
    catch
        throw:Reason ->
            {error, Reason}
    end.

-spec to_binary(iodata()) -> binary().
to_binary(V) when is_binary(V)  -> V;
to_binary(V) when is_list(V)    -> iolist_to_binary(V).

-spec to_header(request_param()) -> binary().
to_header(Name) ->
    to_binary(string:lowercase(atom_to_binary(Name, utf8))).

-spec to_qs(request_param()) -> binary().
to_qs(Name) ->
    atom_to_binary(Name, utf8).

-spec get_opt(any(), []) -> any().
get_opt(Key, Opts) ->
    get_opt(Key, Opts, undefined).

-spec get_opt(any(), [], any()) -> any().
get_opt(Key, Opts, Default) ->
    case lists:keyfind(Key, 1, Opts) of
        {_, Value} -> Value;
        false -> Default
    end.

get_openapi_path() ->
    {ok, AppName} = application:get_application(?MODULE),
    filename:join(priv_dir(AppName), "openapi.json").

-include_lib("kernel/include/file.hrl").

-spec priv_dir(Application :: atom()) -> file:name_all().
priv_dir(AppName) ->
    case code:priv_dir(AppName) of
        Value when is_list(Value) ->
            Value ++ "/";
        _Error ->
            select_priv_dir([filename:join(["apps", atom_to_list(AppName), "priv"]), "priv"])
     end.

select_priv_dir(Paths) ->
    case lists:dropwhile(fun test_priv_dir/1, Paths) of
        [Path | _] -> Path;
        _          -> exit(no_priv_dir)
    end.

test_priv_dir(Path) ->
    case file:read_file_info(Path) of
        {ok, #file_info{type = directory}} ->
            false;
        _ ->
            true
    end.
