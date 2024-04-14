-module(openapi_router).

-export([get_paths/1, get_validator_state/0]).

-type operations() :: #{
    Method :: binary() => openapi_api:operation_id()
}.

-type init_opts()  :: {
    Operations :: operations(),
    LogicHandler :: atom(),
    ValidatorMod :: module()
}.

-export_type([init_opts/0]).

-spec get_paths(LogicHandler :: atom()) ->  [{'_',[{
    Path :: string(),
    Handler :: atom(),
    InitOpts :: init_opts()
}]}].

get_paths(LogicHandler) ->
    ValidatorState = prepare_validator(),
    PreparedPaths = maps:fold(
        fun(Path, #{operations := Operations, handler := Handler}, Acc) ->
            [{Path, Handler, Operations} | Acc]
        end,
        [],
        group_paths()
    ),
    [
        {'_',
            [{P, H, {O, LogicHandler, ValidatorState}} || {P, H, O} <- PreparedPaths]
        }
    ].

group_paths() ->
    maps:fold(
        fun(OperationID, #{path := Path, method := Method, handler := Handler}, Acc) ->
            case maps:find(Path, Acc) of
                {ok, PathInfo0 = #{operations := Operations0}} ->
                    Operations = Operations0#{Method => OperationID},
                    PathInfo = PathInfo0#{operations => Operations},
                    Acc#{Path => PathInfo};
                error ->
                    Operations = #{Method => OperationID},
                    PathInfo = #{handler => Handler, operations => Operations},
                    Acc#{Path => PathInfo}
            end
        end,
        #{},
        get_operations()
    ).

get_operations() ->
    #{ 
        'CancelRun' => #{
            path => "/v1/threads/:thread_id/runs/:run_id/cancel",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
        'CreateAssistant' => #{
            path => "/v1/assistants",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
        'CreateAssistantFile' => #{
            path => "/v1/assistants/:assistant_id/files",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
        'CreateMessage' => #{
            path => "/v1/threads/:thread_id/messages",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
        'CreateRun' => #{
            path => "/v1/threads/:thread_id/runs",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
        'CreateThread' => #{
            path => "/v1/threads",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
        'CreateThreadAndRun' => #{
            path => "/v1/threads/runs",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
        'DeleteAssistant' => #{
            path => "/v1/assistants/:assistant_id",
            method => <<"DELETE">>,
            handler => 'openapi_assistants_handler'
        },
        'DeleteAssistantFile' => #{
            path => "/v1/assistants/:assistant_id/files/:file_id",
            method => <<"DELETE">>,
            handler => 'openapi_assistants_handler'
        },
        'DeleteThread' => #{
            path => "/v1/threads/:thread_id",
            method => <<"DELETE">>,
            handler => 'openapi_assistants_handler'
        },
        'GetAssistant' => #{
            path => "/v1/assistants/:assistant_id",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
        'GetAssistantFile' => #{
            path => "/v1/assistants/:assistant_id/files/:file_id",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
        'GetMessage' => #{
            path => "/v1/threads/:thread_id/messages/:message_id",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
        'GetMessageFile' => #{
            path => "/v1/threads/:thread_id/messages/:message_id/files/:file_id",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
        'GetRun' => #{
            path => "/v1/threads/:thread_id/runs/:run_id",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
        'GetRunStep' => #{
            path => "/v1/threads/:thread_id/runs/:run_id/steps/:step_id",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
        'GetThread' => #{
            path => "/v1/threads/:thread_id",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
        'ListAssistantFiles' => #{
            path => "/v1/assistants/:assistant_id/files",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
        'ListAssistants' => #{
            path => "/v1/assistants",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
        'ListMessageFiles' => #{
            path => "/v1/threads/:thread_id/messages/:message_id/files",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
        'ListMessages' => #{
            path => "/v1/threads/:thread_id/messages",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
        'ListRunSteps' => #{
            path => "/v1/threads/:thread_id/runs/:run_id/steps",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
        'ListRuns' => #{
            path => "/v1/threads/:thread_id/runs",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
        'ModifyAssistant' => #{
            path => "/v1/assistants/:assistant_id",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
        'ModifyMessage' => #{
            path => "/v1/threads/:thread_id/messages/:message_id",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
        'ModifyRun' => #{
            path => "/v1/threads/:thread_id/runs/:run_id",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
        'ModifyThread' => #{
            path => "/v1/threads/:thread_id",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
        'SubmitToolOuputsToRun' => #{
            path => "/v1/threads/:thread_id/runs/:run_id/submit_tool_outputs",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
        'CreateSpeech' => #{
            path => "/v1/audio/speech",
            method => <<"POST">>,
            handler => 'openapi_audio_handler'
        },
        'CreateTranscription' => #{
            path => "/v1/audio/transcriptions",
            method => <<"POST">>,
            handler => 'openapi_audio_handler'
        },
        'CreateTranslation' => #{
            path => "/v1/audio/translations",
            method => <<"POST">>,
            handler => 'openapi_audio_handler'
        },
        'CreateChatCompletion' => #{
            path => "/v1/chat/completions",
            method => <<"POST">>,
            handler => 'openapi_chat_handler'
        },
        'CreateCompletion' => #{
            path => "/v1/completions",
            method => <<"POST">>,
            handler => 'openapi_completions_handler'
        },
        'CreateEmbedding' => #{
            path => "/v1/embeddings",
            method => <<"POST">>,
            handler => 'openapi_embeddings_handler'
        },
        'CreateFile' => #{
            path => "/v1/files",
            method => <<"POST">>,
            handler => 'openapi_files_handler'
        },
        'DeleteFile' => #{
            path => "/v1/files/:file_id",
            method => <<"DELETE">>,
            handler => 'openapi_files_handler'
        },
        'DownloadFile' => #{
            path => "/v1/files/:file_id/content",
            method => <<"GET">>,
            handler => 'openapi_files_handler'
        },
        'ListFiles' => #{
            path => "/v1/files",
            method => <<"GET">>,
            handler => 'openapi_files_handler'
        },
        'RetrieveFile' => #{
            path => "/v1/files/:file_id",
            method => <<"GET">>,
            handler => 'openapi_files_handler'
        },
        'CancelFineTuningJob' => #{
            path => "/v1/fine_tuning/jobs/:fine_tuning_job_id/cancel",
            method => <<"POST">>,
            handler => 'openapi_fine_tuning_handler'
        },
        'CreateFineTuningJob' => #{
            path => "/v1/fine_tuning/jobs",
            method => <<"POST">>,
            handler => 'openapi_fine_tuning_handler'
        },
        'ListFineTuningEvents' => #{
            path => "/v1/fine_tuning/jobs/:fine_tuning_job_id/events",
            method => <<"GET">>,
            handler => 'openapi_fine_tuning_handler'
        },
        'ListFineTuningJobCheckpoints' => #{
            path => "/v1/fine_tuning/jobs/:fine_tuning_job_id/checkpoints",
            method => <<"GET">>,
            handler => 'openapi_fine_tuning_handler'
        },
        'ListPaginatedFineTuningJobs' => #{
            path => "/v1/fine_tuning/jobs",
            method => <<"GET">>,
            handler => 'openapi_fine_tuning_handler'
        },
        'RetrieveFineTuningJob' => #{
            path => "/v1/fine_tuning/jobs/:fine_tuning_job_id",
            method => <<"GET">>,
            handler => 'openapi_fine_tuning_handler'
        },
        'CreateImage' => #{
            path => "/v1/images/generations",
            method => <<"POST">>,
            handler => 'openapi_images_handler'
        },
        'CreateImageEdit' => #{
            path => "/v1/images/edits",
            method => <<"POST">>,
            handler => 'openapi_images_handler'
        },
        'CreateImageVariation' => #{
            path => "/v1/images/variations",
            method => <<"POST">>,
            handler => 'openapi_images_handler'
        },
        'DeleteModel' => #{
            path => "/v1/models/:model",
            method => <<"DELETE">>,
            handler => 'openapi_models_handler'
        },
        'ListModels' => #{
            path => "/v1/models",
            method => <<"GET">>,
            handler => 'openapi_models_handler'
        },
        'RetrieveModel' => #{
            path => "/v1/models/:model",
            method => <<"GET">>,
            handler => 'openapi_models_handler'
        },
        'CreateModeration' => #{
            path => "/v1/moderations",
            method => <<"POST">>,
            handler => 'openapi_moderations_handler'
        }
    }.

get_validator_state() ->
    persistent_term:get({?MODULE, validator_state}).


prepare_validator() ->
    R = jsx:decode(element(2, file:read_file(get_openapi_path()))),
    JesseState = jesse_state:new(R, [{default_schema_ver, <<"http://json-schema.org/draft-04/schema#">>}]),
    persistent_term:put({?MODULE, validator_state}, JesseState),
    ?MODULE.


get_openapi_path() ->
    {ok, AppName} = application:get_application(?MODULE),
    filename:join(openapi_utils:priv_dir(AppName), "openapi.json").
