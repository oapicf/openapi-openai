-module(openapi_api).

-export([request_params/1]).
-export([request_param_info/2]).
-export([populate_request/3]).
-export([validate_response/4]).
%% exported to silence openapi complains
-export([get_value/3, validate_response_body/4]).

-type operation_id() :: atom().
-type request_param() :: atom().

-export_type([operation_id/0]).

-spec request_params(OperationID :: operation_id()) -> [Param :: request_param()].


request_params('CancelFineTune') ->
    [
        'fine_tune_id'
    ];

request_params('CreateChatCompletion') ->
    [
        'CreateChatCompletionRequest'
    ];

request_params('CreateCompletion') ->
    [
        'CreateCompletionRequest'
    ];

request_params('CreateEdit') ->
    [
        'CreateEditRequest'
    ];

request_params('CreateEmbedding') ->
    [
        'CreateEmbeddingRequest'
    ];

request_params('CreateFile') ->
    [
        'file',
        'purpose'
    ];

request_params('CreateFineTune') ->
    [
        'CreateFineTuneRequest'
    ];

request_params('CreateImage') ->
    [
        'CreateImageRequest'
    ];

request_params('CreateImageEdit') ->
    [
        'image',
        'prompt',
        'mask',
        'n',
        'size',
        'response_format',
        'user'
    ];

request_params('CreateImageVariation') ->
    [
        'image',
        'n',
        'size',
        'response_format',
        'user'
    ];

request_params('CreateModeration') ->
    [
        'CreateModerationRequest'
    ];

request_params('CreateTranscription') ->
    [
        'file',
        'model',
        'prompt',
        'response_format',
        'temperature',
        'language'
    ];

request_params('CreateTranslation') ->
    [
        'file',
        'model',
        'prompt',
        'response_format',
        'temperature'
    ];

request_params('DeleteFile') ->
    [
        'file_id'
    ];

request_params('DeleteModel') ->
    [
        'model'
    ];

request_params('DownloadFile') ->
    [
        'file_id'
    ];

request_params('ListFiles') ->
    [
    ];

request_params('ListFineTuneEvents') ->
    [
        'fine_tune_id',
        'stream'
    ];

request_params('ListFineTunes') ->
    [
    ];

request_params('ListModels') ->
    [
    ];

request_params('RetrieveFile') ->
    [
        'file_id'
    ];

request_params('RetrieveFineTune') ->
    [
        'fine_tune_id'
    ];

request_params('RetrieveModel') ->
    [
        'model'
    ];

request_params(_) ->
    error(unknown_operation).

-type rule() ::
    {type, 'binary'} |
    {type, 'integer'} |
    {type, 'float'} |
    {type, 'binary'} |
    {type, 'boolean'} |
    {type, 'date'} |
    {type, 'datetime'} |
    {enum, [atom()]} |
    {max, Max :: number()} |
    {exclusive_max, Max :: number()} |
    {min, Min :: number()} |
    {exclusive_min, Min :: number()} |
    {max_length, MaxLength :: integer()} |
    {min_length, MaxLength :: integer()} |
    {pattern, Pattern :: string()} |
    schema |
    required |
    not_required.

-spec request_param_info(OperationID :: operation_id(), Name :: request_param()) -> #{
    source => qs_val | binding | header | body,
    rules => [rule()]
}.



request_param_info('CancelFineTune', 'fine_tune_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateChatCompletion', 'CreateChatCompletionRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CreateCompletion', 'CreateCompletionRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CreateEdit', 'CreateEditRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CreateEmbedding', 'CreateEmbeddingRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CreateFile', 'file') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateFile', 'purpose') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateFineTune', 'CreateFineTuneRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CreateImage', 'CreateImageRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CreateImageEdit', 'image') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateImageEdit', 'prompt') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateImageEdit', 'mask') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('CreateImageEdit', 'n') ->
    #{
        source =>   body,
        rules => [
            {type, 'integer'},
            {max, 10 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('CreateImageEdit', 'size') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            {enum, ['256x256', '512x512', '1024x1024'] },
            not_required
        ]
    };

request_param_info('CreateImageEdit', 'response_format') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            {enum, ['url', 'b64_json'] },
            not_required
        ]
    };

request_param_info('CreateImageEdit', 'user') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('CreateImageVariation', 'image') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateImageVariation', 'n') ->
    #{
        source =>   body,
        rules => [
            {type, 'integer'},
            {max, 10 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('CreateImageVariation', 'size') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            {enum, ['256x256', '512x512', '1024x1024'] },
            not_required
        ]
    };

request_param_info('CreateImageVariation', 'response_format') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            {enum, ['url', 'b64_json'] },
            not_required
        ]
    };

request_param_info('CreateImageVariation', 'user') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('CreateModeration', 'CreateModerationRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CreateTranscription', 'file') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateTranscription', 'model') ->
    #{
        source =>   body,
        rules => [
            required
        ]
    };

request_param_info('CreateTranscription', 'prompt') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('CreateTranscription', 'response_format') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('CreateTranscription', 'temperature') ->
    #{
        source =>   body,
        rules => [
            not_required
        ]
    };

request_param_info('CreateTranscription', 'language') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('CreateTranslation', 'file') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateTranslation', 'model') ->
    #{
        source =>   body,
        rules => [
            required
        ]
    };

request_param_info('CreateTranslation', 'prompt') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('CreateTranslation', 'response_format') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('CreateTranslation', 'temperature') ->
    #{
        source =>   body,
        rules => [
            not_required
        ]
    };

request_param_info('DeleteFile', 'file_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeleteModel', 'model') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DownloadFile', 'file_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('ListFineTuneEvents', 'fine_tune_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('ListFineTuneEvents', 'stream') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('RetrieveFile', 'file_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('RetrieveFineTune', 'fine_tune_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('RetrieveModel', 'model') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info(OperationID, Name) ->
    error({unknown_param, OperationID, Name}).

-spec populate_request(
    OperationID :: operation_id(),
    Req :: cowboy_req:req(),
    ValidatorState :: jesse_state:state()
) ->
    {ok, Model :: #{}, Req :: cowboy_req:req()} |
    {error, Reason :: any(), Req :: cowboy_req:req()}.

populate_request(OperationID, Req, ValidatorState) ->
    Params = request_params(OperationID),
    populate_request_params(OperationID, Params, Req, ValidatorState, #{}).

populate_request_params(_, [], Req, _, Model) ->
    {ok, Model, Req};

populate_request_params(OperationID, [FieldParams | T], Req0, ValidatorState, Model) ->
    case populate_request_param(OperationID, FieldParams, Req0, ValidatorState) of
        {ok, K, V, Req} ->
            populate_request_params(OperationID, T, Req, ValidatorState, maps:put(K, V, Model));
        Error ->
            Error
    end.

populate_request_param(OperationID, Name, Req0, ValidatorState) ->
    #{rules := Rules, source := Source} = request_param_info(OperationID, Name),
    case get_value(Source, Name, Req0) of
        {error, Reason, Req} ->
            {error, Reason, Req};
        {Value, Req} ->
            case prepare_param(Rules, Name, Value, ValidatorState) of
                {ok, Result} -> {ok, Name, Result, Req};
                {error, Reason} ->
                    {error, Reason, Req}
            end
    end.

-spec validate_response(
    OperationID :: operation_id(),
    Code :: 200..599,
    Body :: jesse:json_term(),
    ValidatorState :: jesse_state:state()
) -> ok | no_return().


validate_response('CancelFineTune', 200, Body, ValidatorState) ->
    validate_response_body('FineTune', 'FineTune', Body, ValidatorState);

validate_response('CreateChatCompletion', 200, Body, ValidatorState) ->
    validate_response_body('CreateChatCompletionResponse', 'CreateChatCompletionResponse', Body, ValidatorState);

validate_response('CreateCompletion', 200, Body, ValidatorState) ->
    validate_response_body('CreateCompletionResponse', 'CreateCompletionResponse', Body, ValidatorState);

validate_response('CreateEdit', 200, Body, ValidatorState) ->
    validate_response_body('CreateEditResponse', 'CreateEditResponse', Body, ValidatorState);

validate_response('CreateEmbedding', 200, Body, ValidatorState) ->
    validate_response_body('CreateEmbeddingResponse', 'CreateEmbeddingResponse', Body, ValidatorState);

validate_response('CreateFile', 200, Body, ValidatorState) ->
    validate_response_body('OpenAIFile', 'OpenAIFile', Body, ValidatorState);

validate_response('CreateFineTune', 200, Body, ValidatorState) ->
    validate_response_body('FineTune', 'FineTune', Body, ValidatorState);

validate_response('CreateImage', 200, Body, ValidatorState) ->
    validate_response_body('ImagesResponse', 'ImagesResponse', Body, ValidatorState);

validate_response('CreateImageEdit', 200, Body, ValidatorState) ->
    validate_response_body('ImagesResponse', 'ImagesResponse', Body, ValidatorState);

validate_response('CreateImageVariation', 200, Body, ValidatorState) ->
    validate_response_body('ImagesResponse', 'ImagesResponse', Body, ValidatorState);

validate_response('CreateModeration', 200, Body, ValidatorState) ->
    validate_response_body('CreateModerationResponse', 'CreateModerationResponse', Body, ValidatorState);

validate_response('CreateTranscription', 200, Body, ValidatorState) ->
    validate_response_body('CreateTranscriptionResponse', 'CreateTranscriptionResponse', Body, ValidatorState);

validate_response('CreateTranslation', 200, Body, ValidatorState) ->
    validate_response_body('CreateTranslationResponse', 'CreateTranslationResponse', Body, ValidatorState);

validate_response('DeleteFile', 200, Body, ValidatorState) ->
    validate_response_body('DeleteFileResponse', 'DeleteFileResponse', Body, ValidatorState);

validate_response('DeleteModel', 200, Body, ValidatorState) ->
    validate_response_body('DeleteModelResponse', 'DeleteModelResponse', Body, ValidatorState);

validate_response('DownloadFile', 200, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('ListFiles', 200, Body, ValidatorState) ->
    validate_response_body('ListFilesResponse', 'ListFilesResponse', Body, ValidatorState);

validate_response('ListFineTuneEvents', 200, Body, ValidatorState) ->
    validate_response_body('ListFineTuneEventsResponse', 'ListFineTuneEventsResponse', Body, ValidatorState);

validate_response('ListFineTunes', 200, Body, ValidatorState) ->
    validate_response_body('ListFineTunesResponse', 'ListFineTunesResponse', Body, ValidatorState);

validate_response('ListModels', 200, Body, ValidatorState) ->
    validate_response_body('ListModelsResponse', 'ListModelsResponse', Body, ValidatorState);

validate_response('RetrieveFile', 200, Body, ValidatorState) ->
    validate_response_body('OpenAIFile', 'OpenAIFile', Body, ValidatorState);

validate_response('RetrieveFineTune', 200, Body, ValidatorState) ->
    validate_response_body('FineTune', 'FineTune', Body, ValidatorState);

validate_response('RetrieveModel', 200, Body, ValidatorState) ->
    validate_response_body('Model', 'Model', Body, ValidatorState);


validate_response(_OperationID, _Code, _Body, _ValidatorState) ->
    ok.

validate_response_body('list', ReturnBaseType, Body, ValidatorState) ->
    [
        validate(schema, ReturnBaseType, Item, ValidatorState)
    || Item <- Body];

validate_response_body(_, ReturnBaseType, Body, ValidatorState) ->
    validate(schema, ReturnBaseType, Body, ValidatorState).

%%%
validate(Rule = required, Name, Value, _ValidatorState) ->
    case Value of
        undefined -> validation_error(Rule, Name);
        _ -> ok
    end;

validate(not_required, _Name, _Value, _ValidatorState) ->
    ok;

validate(_, _Name, undefined, _ValidatorState) ->
    ok;

validate(Rule = {type, 'integer'}, Name, Value, _ValidatorState) ->
    try
        {ok, openapi_utils:to_int(Value)}
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'float'}, Name, Value, _ValidatorState) ->
    try
        {ok, openapi_utils:to_float(Value)}
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'binary'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(_Rule = {type, 'boolean'}, _Name, Value, _ValidatorState) when is_boolean(Value) ->
    {ok, Value};

validate(Rule = {type, 'boolean'}, Name, Value, _ValidatorState) ->
    V = binary_to_lower(Value),
    try
        case binary_to_existing_atom(V, utf8) of
            B when is_boolean(B) -> {ok, B};
            _ -> validation_error(Rule, Name)
        end
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'date'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {type, 'datetime'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {enum, Values}, Name, Value, _ValidatorState) ->
    try
        FormattedValue = erlang:binary_to_existing_atom(Value, utf8),
        case lists:member(FormattedValue, Values) of
            true -> {ok, FormattedValue};
            false -> validation_error(Rule, Name)
        end
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {max, Max}, Name, Value, _ValidatorState) ->
    case Value =< Max of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {exclusive_max, ExclusiveMax}, Name, Value, _ValidatorState) ->
    case Value > ExclusiveMax of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {min, Min}, Name, Value, _ValidatorState) ->
    case Value >= Min of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {exclusive_min, ExclusiveMin}, Name, Value, _ValidatorState) ->
    case Value =< ExclusiveMin of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {max_length, MaxLength}, Name, Value, _ValidatorState) ->
    case size(Value) =< MaxLength of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {min_length, MinLength}, Name, Value, _ValidatorState) ->
    case size(Value) >= MinLength of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {pattern, Pattern}, Name, Value, _ValidatorState) ->
    {ok, MP} = re:compile(Pattern),
    case re:run(Value, MP) of
        {match, _} -> ok;
        _ -> validation_error(Rule, Name)
    end;

validate(Rule = schema, Name, Value, ValidatorState) ->
    Definition =  list_to_binary("#/components/schemas/" ++ openapi_utils:to_list(Name)),
    try
        _ = validate_with_schema(Value, Definition, ValidatorState),
        ok
    catch
        throw:[{schema_invalid, _, Error} | _] ->
            Info = #{
                type => schema_invalid,
                error => Error
            },
            validation_error(Rule, Name, Info);
        throw:[{data_invalid, Schema, Error, _, Path} | _] ->
            Info = #{
                type => data_invalid,
                error => Error,
                schema => Schema,
                path => Path
            },
            validation_error(Rule, Name, Info)
    end;

validate(Rule, Name, _Value, _ValidatorState) ->
    error_logger:info_msg("Can't validate ~p with ~p", [Name, Rule]),
    error({unknown_validation_rule, Rule}).

-spec validation_error(Rule :: any(), Name :: any()) -> no_return().

validation_error(ViolatedRule, Name) ->
    validation_error(ViolatedRule, Name, #{}).

-spec validation_error(Rule :: any(), Name :: any(), Info :: #{}) -> no_return().

validation_error(ViolatedRule, Name, Info) ->
    throw({wrong_param, Name, ViolatedRule, Info}).

-spec get_value(body | qs_val | header | binding, Name :: any(), Req0 :: cowboy_req:req()) ->
    {Value :: any(), Req :: cowboy_req:req()} |
    {error, Reason :: any(), Req :: cowboy_req:req()}.
get_value(body, _Name, Req0) ->
    {ok, Body, Req} = cowboy_req:read_body(Req0),
    case prepare_body(Body) of
        {error, Reason} ->
            {error, Reason, Req};
        Value ->
            {Value, Req}
    end;

get_value(qs_val, Name, Req) ->
    QS = cowboy_req:parse_qs(Req),
    Value = openapi_utils:get_opt(openapi_utils:to_qs(Name), QS),
    {Value, Req};

get_value(header, Name, Req) ->
    Headers = cowboy_req:headers(Req),
    Value =  maps:get(openapi_utils:to_header(Name), Headers, undefined),
    {Value, Req};

get_value(binding, Name, Req) ->
    Value = cowboy_req:binding(openapi_utils:to_binding(Name), Req),
    {Value, Req}.

prepare_body(Body) ->
    case Body of
        <<"">> -> <<"">>;
        _ ->
            try
                jsx:decode(Body, [return_maps])
            catch
              error:_ ->
                {error, {invalid_body, not_json, Body}}
            end
    end.

validate_with_schema(Body, Definition, ValidatorState) ->
    jesse_schema_validator:validate_with_state(
        [{<<"$ref">>, Definition}],
        Body,
        ValidatorState
    ).

prepare_param(Rules, Name, Value, ValidatorState) ->
    try
        Result = lists:foldl(
            fun(Rule, Acc) ->
                case validate(Rule, Name, Acc, ValidatorState) of
                    ok -> Acc;
                    {ok, Prepared} -> Prepared
                end
            end,
            Value,
            Rules
        ),
        {ok, Result}
    catch
        throw:Reason ->
            {error, Reason}
    end.

binary_to_lower(V) when is_binary(V) ->
    list_to_binary(string:to_lower(openapi_utils:to_list(V))).
