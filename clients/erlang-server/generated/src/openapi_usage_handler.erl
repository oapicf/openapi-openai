-module(openapi_usage_handler).
-moduledoc """
Exposes the following operation IDs:

- `GET` to `/organization/usage/audio_speeches`, OperationId: `usage-audio-speeches`:
Get audio speeches usage details for the organization..


- `GET` to `/organization/usage/audio_transcriptions`, OperationId: `usage-audio-transcriptions`:
Get audio transcriptions usage details for the organization..


- `GET` to `/organization/usage/code_interpreter_sessions`, OperationId: `usage-code-interpreter-sessions`:
Get code interpreter sessions usage details for the organization..


- `GET` to `/organization/usage/completions`, OperationId: `usage-completions`:
Get completions usage details for the organization..


- `GET` to `/organization/costs`, OperationId: `usage-costs`:
Get costs details for the organization..


- `GET` to `/organization/usage/embeddings`, OperationId: `usage-embeddings`:
Get embeddings usage details for the organization..


- `GET` to `/organization/usage/images`, OperationId: `usage-images`:
Get images usage details for the organization..


- `GET` to `/organization/usage/moderations`, OperationId: `usage-moderations`:
Get moderations usage details for the organization..


- `GET` to `/organization/usage/vector_stores`, OperationId: `usage-vector-stores`:
Get vector stores usage details for the organization..


""".

-behaviour(cowboy_rest).

-include_lib("kernel/include/logger.hrl").

%% Cowboy REST callbacks
-export([init/2]).
-export([allowed_methods/2]).
-export([content_types_accepted/2]).
-export([content_types_provided/2]).
-export([delete_resource/2]).
-export([is_authorized/2]).
-export([valid_content_headers/2]).
-export([handle_type_accepted/2, handle_type_provided/2]).

-ignore_xref([handle_type_accepted/2, handle_type_provided/2]).

-export_type([class/0, operation_id/0]).

-type class() :: 'usage'.

-type operation_id() ::
    'usage-audio-speeches' %% Get audio speeches usage details for the organization.
    | 'usage-audio-transcriptions' %% Get audio transcriptions usage details for the organization.
    | 'usage-code-interpreter-sessions' %% Get code interpreter sessions usage details for the organization.
    | 'usage-completions' %% Get completions usage details for the organization.
    | 'usage-costs' %% Get costs details for the organization.
    | 'usage-embeddings' %% Get embeddings usage details for the organization.
    | 'usage-images' %% Get images usage details for the organization.
    | 'usage-moderations' %% Get moderations usage details for the organization.
    | 'usage-vector-stores'. %% Get vector stores usage details for the organization.


-record(state,
        {operation_id :: operation_id(),
         accept_callback :: openapi_logic_handler:accept_callback(),
         provide_callback :: openapi_logic_handler:provide_callback(),
         api_key_callback :: openapi_logic_handler:api_key_callback(),
         context = #{} :: openapi_logic_handler:context()}).

-type state() :: #state{}.

-spec init(cowboy_req:req(), openapi_router:init_opts()) ->
    {cowboy_rest, cowboy_req:req(), state()}.
init(Req, {Operations, Module}) ->
    Method = cowboy_req:method(Req),
    OperationID = maps:get(Method, Operations, undefined),
    ?LOG_INFO(#{what => "Attempt to process operation",
                method => Method,
                operation_id => OperationID}),
    State = #state{operation_id = OperationID,
                   accept_callback = fun Module:accept_callback/4,
                   provide_callback = fun Module:provide_callback/4,
                   api_key_callback = fun Module:api_key_callback/2},
    {cowboy_rest, Req, State}.

-spec allowed_methods(cowboy_req:req(), state()) ->
    {[binary()], cowboy_req:req(), state()}.
allowed_methods(Req, #state{operation_id = 'usage-audio-speeches'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'usage-audio-transcriptions'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'usage-code-interpreter-sessions'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'usage-completions'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'usage-costs'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'usage-embeddings'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'usage-images'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'usage-moderations'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'usage-vector-stores'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req0,
              #state{operation_id = 'usage-audio-speeches' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'usage-audio-transcriptions' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'usage-code-interpreter-sessions' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'usage-completions' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'usage-costs' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'usage-embeddings' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'usage-images' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'usage-moderations' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'usage-vector-stores' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'usage-audio-speeches'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'usage-audio-transcriptions'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'usage-code-interpreter-sessions'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'usage-completions'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'usage-costs'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'usage-embeddings'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'usage-images'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'usage-moderations'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'usage-vector-stores'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'usage-audio-speeches'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'usage-audio-transcriptions'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'usage-code-interpreter-sessions'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'usage-completions'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'usage-costs'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'usage-embeddings'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'usage-images'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'usage-moderations'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'usage-vector-stores'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'usage-audio-speeches'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'usage-audio-transcriptions'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'usage-code-interpreter-sessions'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'usage-completions'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'usage-costs'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'usage-embeddings'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'usage-images'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'usage-moderations'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'usage-vector-stores'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, State) ->
    {[], Req, State}.

-spec delete_resource(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
delete_resource(Req, State) ->
    {Res, Req1, State1} = handle_type_accepted(Req, State),
    {true =:= Res, Req1, State1}.

-spec handle_type_accepted(cowboy_req:req(), state()) ->
    { openapi_logic_handler:accept_callback_return(), cowboy_req:req(), state()}.
handle_type_accepted(Req, #state{operation_id = OperationID,
                                 accept_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(usage, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(usage, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
