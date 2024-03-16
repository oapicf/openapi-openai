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
        'CancelFineTune' => #{
            path => "/v1/fine-tunes/:fine_tune_id/cancel",
            method => <<"POST">>,
            handler => 'openapi_open_ai_handler'
        },
        'CreateChatCompletion' => #{
            path => "/v1/chat/completions",
            method => <<"POST">>,
            handler => 'openapi_open_ai_handler'
        },
        'CreateCompletion' => #{
            path => "/v1/completions",
            method => <<"POST">>,
            handler => 'openapi_open_ai_handler'
        },
        'CreateEdit' => #{
            path => "/v1/edits",
            method => <<"POST">>,
            handler => 'openapi_open_ai_handler'
        },
        'CreateEmbedding' => #{
            path => "/v1/embeddings",
            method => <<"POST">>,
            handler => 'openapi_open_ai_handler'
        },
        'CreateFile' => #{
            path => "/v1/files",
            method => <<"POST">>,
            handler => 'openapi_open_ai_handler'
        },
        'CreateFineTune' => #{
            path => "/v1/fine-tunes",
            method => <<"POST">>,
            handler => 'openapi_open_ai_handler'
        },
        'CreateImage' => #{
            path => "/v1/images/generations",
            method => <<"POST">>,
            handler => 'openapi_open_ai_handler'
        },
        'CreateImageEdit' => #{
            path => "/v1/images/edits",
            method => <<"POST">>,
            handler => 'openapi_open_ai_handler'
        },
        'CreateImageVariation' => #{
            path => "/v1/images/variations",
            method => <<"POST">>,
            handler => 'openapi_open_ai_handler'
        },
        'CreateModeration' => #{
            path => "/v1/moderations",
            method => <<"POST">>,
            handler => 'openapi_open_ai_handler'
        },
        'CreateTranscription' => #{
            path => "/v1/audio/transcriptions",
            method => <<"POST">>,
            handler => 'openapi_open_ai_handler'
        },
        'CreateTranslation' => #{
            path => "/v1/audio/translations",
            method => <<"POST">>,
            handler => 'openapi_open_ai_handler'
        },
        'DeleteFile' => #{
            path => "/v1/files/:file_id",
            method => <<"DELETE">>,
            handler => 'openapi_open_ai_handler'
        },
        'DeleteModel' => #{
            path => "/v1/models/:model",
            method => <<"DELETE">>,
            handler => 'openapi_open_ai_handler'
        },
        'DownloadFile' => #{
            path => "/v1/files/:file_id/content",
            method => <<"GET">>,
            handler => 'openapi_open_ai_handler'
        },
        'ListFiles' => #{
            path => "/v1/files",
            method => <<"GET">>,
            handler => 'openapi_open_ai_handler'
        },
        'ListFineTuneEvents' => #{
            path => "/v1/fine-tunes/:fine_tune_id/events",
            method => <<"GET">>,
            handler => 'openapi_open_ai_handler'
        },
        'ListFineTunes' => #{
            path => "/v1/fine-tunes",
            method => <<"GET">>,
            handler => 'openapi_open_ai_handler'
        },
        'ListModels' => #{
            path => "/v1/models",
            method => <<"GET">>,
            handler => 'openapi_open_ai_handler'
        },
        'RetrieveFile' => #{
            path => "/v1/files/:file_id",
            method => <<"GET">>,
            handler => 'openapi_open_ai_handler'
        },
        'RetrieveFineTune' => #{
            path => "/v1/fine-tunes/:fine_tune_id",
            method => <<"GET">>,
            handler => 'openapi_open_ai_handler'
        },
        'RetrieveModel' => #{
            path => "/v1/models/:model",
            method => <<"GET">>,
            handler => 'openapi_open_ai_handler'
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
