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
    | 'chat'
    | 'completions'
    | 'embeddings'
    | 'files'
    | 'fineTuning'
    | 'images'
    | 'models'
    | 'moderations'.


-type operation_id() ::
    'cancelRun' | %% Cancels a run that is &#x60;in_progress&#x60;.
    'createAssistant' | %% Create an assistant with a model and instructions.
    'createAssistantFile' | %% Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
    'createMessage' | %% Create a message.
    'createRun' | %% Create a run.
    'createThread' | %% Create a thread.
    'createThreadAndRun' | %% Create a thread and run it in one request.
    'deleteAssistant' | %% Delete an assistant.
    'deleteAssistantFile' | %% Delete an assistant file.
    'deleteThread' | %% Delete a thread.
    'getAssistant' | %% Retrieves an assistant.
    'getAssistantFile' | %% Retrieves an AssistantFile.
    'getMessage' | %% Retrieve a message.
    'getMessageFile' | %% Retrieves a message file.
    'getRun' | %% Retrieves a run.
    'getRunStep' | %% Retrieves a run step.
    'getThread' | %% Retrieves a thread.
    'listAssistantFiles' | %% Returns a list of assistant files.
    'listAssistants' | %% Returns a list of assistants.
    'listMessageFiles' | %% Returns a list of message files.
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
    'createChatCompletion' | %% Creates a model response for the given chat conversation.
    'createCompletion' | %% Creates a completion for the provided prompt and parameters.
    'createEmbedding' | %% Creates an embedding vector representing the input text.
    'createFile' | %% Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
    'deleteFile' | %% Delete a file.
    'downloadFile' | %% Returns the contents of the specified file.
    'listFiles' | %% Returns a list of files that belong to the user&#39;s organization.
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
    'deleteModel' | %% Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
    'listModels' | %% Lists the currently available models, and provides basic information about each one such as the owner and availability.
    'retrieveModel' | %% Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    'createModeration' | %% Classifies if text is potentially harmful.
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
Loads the JSON schema and the desired validation draft into a `t:jesse_state:state()`.
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
validate_response('createAssistantFile', 200, Body, ValidatorState) ->
    validate_response_body('AssistantFileObject', 'AssistantFileObject', Body, ValidatorState);
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
validate_response('deleteAssistantFile', 200, Body, ValidatorState) ->
    validate_response_body('DeleteAssistantFileResponse', 'DeleteAssistantFileResponse', Body, ValidatorState);
validate_response('deleteThread', 200, Body, ValidatorState) ->
    validate_response_body('DeleteThreadResponse', 'DeleteThreadResponse', Body, ValidatorState);
validate_response('getAssistant', 200, Body, ValidatorState) ->
    validate_response_body('AssistantObject', 'AssistantObject', Body, ValidatorState);
validate_response('getAssistantFile', 200, Body, ValidatorState) ->
    validate_response_body('AssistantFileObject', 'AssistantFileObject', Body, ValidatorState);
validate_response('getMessage', 200, Body, ValidatorState) ->
    validate_response_body('MessageObject', 'MessageObject', Body, ValidatorState);
validate_response('getMessageFile', 200, Body, ValidatorState) ->
    validate_response_body('MessageFileObject', 'MessageFileObject', Body, ValidatorState);
validate_response('getRun', 200, Body, ValidatorState) ->
    validate_response_body('RunObject', 'RunObject', Body, ValidatorState);
validate_response('getRunStep', 200, Body, ValidatorState) ->
    validate_response_body('RunStepObject', 'RunStepObject', Body, ValidatorState);
validate_response('getThread', 200, Body, ValidatorState) ->
    validate_response_body('ThreadObject', 'ThreadObject', Body, ValidatorState);
validate_response('listAssistantFiles', 200, Body, ValidatorState) ->
    validate_response_body('ListAssistantFilesResponse', 'ListAssistantFilesResponse', Body, ValidatorState);
validate_response('listAssistants', 200, Body, ValidatorState) ->
    validate_response_body('ListAssistantsResponse', 'ListAssistantsResponse', Body, ValidatorState);
validate_response('listMessageFiles', 200, Body, ValidatorState) ->
    validate_response_body('ListMessageFilesResponse', 'ListMessageFilesResponse', Body, ValidatorState);
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
validate_response('createChatCompletion', 200, Body, ValidatorState) ->
    validate_response_body('CreateChatCompletionResponse', 'CreateChatCompletionResponse', Body, ValidatorState);
validate_response('createCompletion', 200, Body, ValidatorState) ->
    validate_response_body('CreateCompletionResponse', 'CreateCompletionResponse', Body, ValidatorState);
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
validate_response('deleteModel', 200, Body, ValidatorState) ->
    validate_response_body('DeleteModelResponse', 'DeleteModelResponse', Body, ValidatorState);
validate_response('listModels', 200, Body, ValidatorState) ->
    validate_response_body('ListModelsResponse', 'ListModelsResponse', Body, ValidatorState);
validate_response('retrieveModel', 200, Body, ValidatorState) ->
    validate_response_body('Model', 'Model', Body, ValidatorState);
validate_response('createModeration', 200, Body, ValidatorState) ->
    validate_response_body('CreateModerationResponse', 'CreateModerationResponse', Body, ValidatorState);
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
request_params('createAssistantFile') ->
    [
        'assistant_id',
        'CreateAssistantFileRequest'
    ];
request_params('createMessage') ->
    [
        'thread_id',
        'CreateMessageRequest'
    ];
request_params('createRun') ->
    [
        'thread_id',
        'CreateRunRequest'
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
request_params('deleteAssistantFile') ->
    [
        'assistant_id',
        'file_id'
    ];
request_params('deleteThread') ->
    [
        'thread_id'
    ];
request_params('getAssistant') ->
    [
        'assistant_id'
    ];
request_params('getAssistantFile') ->
    [
        'assistant_id',
        'file_id'
    ];
request_params('getMessage') ->
    [
        'thread_id',
        'message_id'
    ];
request_params('getMessageFile') ->
    [
        'thread_id',
        'message_id',
        'file_id'
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
        'step_id'
    ];
request_params('getThread') ->
    [
        'thread_id'
    ];
request_params('listAssistantFiles') ->
    [
        'assistant_id',
        'limit',
        'order',
        'after',
        'before'
    ];
request_params('listAssistants') ->
    [
        'limit',
        'order',
        'after',
        'before'
    ];
request_params('listMessageFiles') ->
    [
        'thread_id',
        'message_id',
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
        'before'
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
request_params('createChatCompletion') ->
    [
        'CreateChatCompletionRequest'
    ];
request_params('createCompletion') ->
    [
        'CreateCompletionRequest'
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
        'purpose'
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
request_param_info('createAssistantFile', 'assistant_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('createAssistantFile', 'CreateAssistantFileRequest') ->
    #{
        source => body,
        rules => [
            {schema, object, <<"#/components/schemas/CreateAssistantFileRequest">>},
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
request_param_info('deleteAssistantFile', 'assistant_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('deleteAssistantFile', 'file_id') ->
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
request_param_info('getAssistantFile', 'assistant_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getAssistantFile', 'file_id') ->
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
request_param_info('getMessageFile', 'thread_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getMessageFile', 'message_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getMessageFile', 'file_id') ->
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
request_param_info('getThread', 'thread_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('listAssistantFiles', 'assistant_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('listAssistantFiles', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('listAssistantFiles', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['asc', 'desc'] },
            not_required
        ]
    };
request_param_info('listAssistantFiles', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('listAssistantFiles', 'before') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
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
request_param_info('listMessageFiles', 'thread_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('listMessageFiles', 'message_id') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('listMessageFiles', 'limit') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('listMessageFiles', 'order') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            {enum, ['asc', 'desc'] },
            not_required
        ]
    };
request_param_info('listMessageFiles', 'after') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('listMessageFiles', 'before') ->
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
            {type, binary},
            {enum, ['json', 'text', 'srt', 'verbose_json', 'vtt'] },
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
            {type, binary},
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
            {enum, ['fine-tune', 'assistants'] },
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
            Model = maps:put(ReqParamName, V, Model0),
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
