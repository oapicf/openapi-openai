-module(openapi_assistants_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/threads/:thread_id/runs/:run_id/cancel`, OperationId: `cancelRun`:
Cancels a run that is &#x60;in_progress&#x60;..


- `POST` to `/assistants`, OperationId: `createAssistant`:
Create an assistant with a model and instructions..


- `POST` to `/assistants/:assistant_id/files`, OperationId: `createAssistantFile`:
Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants)..


- `POST` to `/threads/:thread_id/messages`, OperationId: `createMessage`:
Create a message..


- `POST` to `/threads/:thread_id/runs`, OperationId: `createRun`:
Create a run..


- `POST` to `/threads`, OperationId: `createThread`:
Create a thread..


- `POST` to `/threads/runs`, OperationId: `createThreadAndRun`:
Create a thread and run it in one request..


- `DELETE` to `/assistants/:assistant_id`, OperationId: `deleteAssistant`:
Delete an assistant..


- `DELETE` to `/assistants/:assistant_id/files/:file_id`, OperationId: `deleteAssistantFile`:
Delete an assistant file..


- `DELETE` to `/threads/:thread_id`, OperationId: `deleteThread`:
Delete a thread..


- `GET` to `/assistants/:assistant_id`, OperationId: `getAssistant`:
Retrieves an assistant..


- `GET` to `/assistants/:assistant_id/files/:file_id`, OperationId: `getAssistantFile`:
Retrieves an AssistantFile..


- `GET` to `/threads/:thread_id/messages/:message_id`, OperationId: `getMessage`:
Retrieve a message..


- `GET` to `/threads/:thread_id/messages/:message_id/files/:file_id`, OperationId: `getMessageFile`:
Retrieves a message file..


- `GET` to `/threads/:thread_id/runs/:run_id`, OperationId: `getRun`:
Retrieves a run..


- `GET` to `/threads/:thread_id/runs/:run_id/steps/:step_id`, OperationId: `getRunStep`:
Retrieves a run step..


- `GET` to `/threads/:thread_id`, OperationId: `getThread`:
Retrieves a thread..


- `GET` to `/assistants/:assistant_id/files`, OperationId: `listAssistantFiles`:
Returns a list of assistant files..


- `GET` to `/assistants`, OperationId: `listAssistants`:
Returns a list of assistants..


- `GET` to `/threads/:thread_id/messages/:message_id/files`, OperationId: `listMessageFiles`:
Returns a list of message files..


- `GET` to `/threads/:thread_id/messages`, OperationId: `listMessages`:
Returns a list of messages for a given thread..


- `GET` to `/threads/:thread_id/runs/:run_id/steps`, OperationId: `listRunSteps`:
Returns a list of run steps belonging to a run..


- `GET` to `/threads/:thread_id/runs`, OperationId: `listRuns`:
Returns a list of runs belonging to a thread..


- `POST` to `/assistants/:assistant_id`, OperationId: `modifyAssistant`:
Modifies an assistant..


- `POST` to `/threads/:thread_id/messages/:message_id`, OperationId: `modifyMessage`:
Modifies a message..


- `POST` to `/threads/:thread_id/runs/:run_id`, OperationId: `modifyRun`:
Modifies a run..


- `POST` to `/threads/:thread_id`, OperationId: `modifyThread`:
Modifies a thread..


- `POST` to `/threads/:thread_id/runs/:run_id/submit_tool_outputs`, OperationId: `submitToolOuputsToRun`:
When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. .


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

-type class() :: 'assistants'.

-type operation_id() ::
    'cancelRun' %% Cancels a run that is &#x60;in_progress&#x60;.
    | 'createAssistant' %% Create an assistant with a model and instructions.
    | 'createAssistantFile' %% Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
    | 'createMessage' %% Create a message.
    | 'createRun' %% Create a run.
    | 'createThread' %% Create a thread.
    | 'createThreadAndRun' %% Create a thread and run it in one request.
    | 'deleteAssistant' %% Delete an assistant.
    | 'deleteAssistantFile' %% Delete an assistant file.
    | 'deleteThread' %% Delete a thread.
    | 'getAssistant' %% Retrieves an assistant.
    | 'getAssistantFile' %% Retrieves an AssistantFile.
    | 'getMessage' %% Retrieve a message.
    | 'getMessageFile' %% Retrieves a message file.
    | 'getRun' %% Retrieves a run.
    | 'getRunStep' %% Retrieves a run step.
    | 'getThread' %% Retrieves a thread.
    | 'listAssistantFiles' %% Returns a list of assistant files.
    | 'listAssistants' %% Returns a list of assistants.
    | 'listMessageFiles' %% Returns a list of message files.
    | 'listMessages' %% Returns a list of messages for a given thread.
    | 'listRunSteps' %% Returns a list of run steps belonging to a run.
    | 'listRuns' %% Returns a list of runs belonging to a thread.
    | 'modifyAssistant' %% Modifies an assistant.
    | 'modifyMessage' %% Modifies a message.
    | 'modifyRun' %% Modifies a run.
    | 'modifyThread' %% Modifies a thread.
    | 'submitToolOuputsToRun'. %% When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 


-record(state,
        {operation_id :: operation_id(),
         accept_callback :: openapi_logic_handler:accept_callback(),
         provide_callback :: openapi_logic_handler:provide_callback(),
         api_key_handler :: openapi_logic_handler:api_key_callback(),
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
                   api_key_handler = fun Module:authorize_api_key/2},
    {cowboy_rest, Req, State}.

-spec allowed_methods(cowboy_req:req(), state()) ->
    {[binary()], cowboy_req:req(), state()}.
allowed_methods(Req, #state{operation_id = 'cancelRun'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createAssistant'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createAssistantFile'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createMessage'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createRun'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createThread'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createThreadAndRun'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteAssistant'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteAssistantFile'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteThread'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getAssistant'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getAssistantFile'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getMessage'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getMessageFile'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getRun'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getRunStep'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getThread'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'listAssistantFiles'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'listAssistants'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'listMessageFiles'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'listMessages'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'listRunSteps'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'listRuns'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'modifyAssistant'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'modifyMessage'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'modifyRun'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'modifyThread'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'submitToolOuputsToRun'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req0,
              #state{operation_id = 'cancelRun' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'createAssistant' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'createAssistantFile' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'createMessage' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'createRun' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'createThread' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'createThreadAndRun' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'deleteAssistant' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'deleteAssistantFile' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'deleteThread' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getAssistant' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getAssistantFile' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getMessage' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getMessageFile' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getRun' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getRunStep' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getThread' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'listAssistantFiles' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'listAssistants' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'listMessageFiles' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'listMessages' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'listRunSteps' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'listRuns' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'modifyAssistant' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'modifyMessage' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'modifyRun' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'modifyThread' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'submitToolOuputsToRun' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'cancelRun'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createAssistant'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'createAssistantFile'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'createMessage'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'createRun'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'createThread'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'createThreadAndRun'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteAssistant'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteAssistantFile'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteThread'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getAssistant'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getAssistantFile'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getMessage'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getMessageFile'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getRun'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getRunStep'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getThread'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'listAssistantFiles'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'listAssistants'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'listMessageFiles'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'listMessages'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'listRunSteps'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'listRuns'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'modifyAssistant'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'modifyMessage'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'modifyRun'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'modifyThread'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'submitToolOuputsToRun'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'cancelRun'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createAssistant'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createAssistantFile'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createMessage'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createRun'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createThread'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createThreadAndRun'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteAssistant'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteAssistantFile'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteThread'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getAssistant'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getAssistantFile'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getMessage'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getMessageFile'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getRun'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getRunStep'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getThread'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'listAssistantFiles'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'listAssistants'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'listMessageFiles'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'listMessages'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'listRunSteps'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'listRuns'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'modifyAssistant'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'modifyMessage'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'modifyRun'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'modifyThread'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'submitToolOuputsToRun'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'cancelRun'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createAssistant'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createAssistantFile'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createMessage'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createRun'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createThread'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createThreadAndRun'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteAssistant'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteAssistantFile'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteThread'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getAssistant'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getAssistantFile'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getMessage'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getMessageFile'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getRun'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getRunStep'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getThread'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'listAssistantFiles'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'listAssistants'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'listMessageFiles'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'listMessages'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'listRunSteps'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'listRuns'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'modifyAssistant'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'modifyMessage'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'modifyRun'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'modifyThread'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'submitToolOuputsToRun'} = State) ->
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
    {Res, Req1, Context1} = Handler(assistants, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    {cowboy_req:resp_body(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(assistants, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
