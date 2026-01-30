-module(openapi_projects_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/organization/projects/:project_id/archive`, OperationId: `archive-project`:
Archives a project in the organization. Archived projects cannot be used or updated..


- `POST` to `/organization/projects`, OperationId: `create-project`:
Create a new project in the organization. Projects can be created and archived, but cannot be deleted..


- `POST` to `/organization/projects/:project_id/service_accounts`, OperationId: `create-project-service-account`:
Creates a new service account in the project. This also returns an unredacted API key for the service account..


- `POST` to `/organization/projects/:project_id/users`, OperationId: `create-project-user`:
Adds a user to the project. Users must already be members of the organization to be added to a project..


- `DELETE` to `/organization/projects/:project_id/api_keys/:key_id`, OperationId: `delete-project-api-key`:
Deletes an API key from the project..


- `DELETE` to `/organization/projects/:project_id/service_accounts/:service_account_id`, OperationId: `delete-project-service-account`:
Deletes a service account from the project..


- `DELETE` to `/organization/projects/:project_id/users/:user_id`, OperationId: `delete-project-user`:
Deletes a user from the project..


- `GET` to `/organization/projects/:project_id/api_keys`, OperationId: `list-project-api-keys`:
Returns a list of API keys in the project..


- `GET` to `/organization/projects/:project_id/rate_limits`, OperationId: `list-project-rate-limits`:
Returns the rate limits per model for a project..


- `GET` to `/organization/projects/:project_id/service_accounts`, OperationId: `list-project-service-accounts`:
Returns a list of service accounts in the project..


- `GET` to `/organization/projects/:project_id/users`, OperationId: `list-project-users`:
Returns a list of users in the project..


- `GET` to `/organization/projects`, OperationId: `list-projects`:
Returns a list of projects..


- `POST` to `/organization/projects/:project_id`, OperationId: `modify-project`:
Modifies a project in the organization..


- `POST` to `/organization/projects/:project_id/users/:user_id`, OperationId: `modify-project-user`:
Modifies a user&#39;s role in the project..


- `GET` to `/organization/projects/:project_id`, OperationId: `retrieve-project`:
Retrieves a project..


- `GET` to `/organization/projects/:project_id/api_keys/:key_id`, OperationId: `retrieve-project-api-key`:
Retrieves an API key in the project..


- `GET` to `/organization/projects/:project_id/service_accounts/:service_account_id`, OperationId: `retrieve-project-service-account`:
Retrieves a service account in the project..


- `GET` to `/organization/projects/:project_id/users/:user_id`, OperationId: `retrieve-project-user`:
Retrieves a user in the project..


- `POST` to `/organization/projects/:project_id/rate_limits/:rate_limit_id`, OperationId: `update-project-rate-limits`:
Updates a project rate limit..


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

-type class() :: 'projects'.

-type operation_id() ::
    'archive-project' %% Archives a project in the organization. Archived projects cannot be used or updated.
    | 'create-project' %% Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
    | 'create-project-service-account' %% Creates a new service account in the project. This also returns an unredacted API key for the service account.
    | 'create-project-user' %% Adds a user to the project. Users must already be members of the organization to be added to a project.
    | 'delete-project-api-key' %% Deletes an API key from the project.
    | 'delete-project-service-account' %% Deletes a service account from the project.
    | 'delete-project-user' %% Deletes a user from the project.
    | 'list-project-api-keys' %% Returns a list of API keys in the project.
    | 'list-project-rate-limits' %% Returns the rate limits per model for a project.
    | 'list-project-service-accounts' %% Returns a list of service accounts in the project.
    | 'list-project-users' %% Returns a list of users in the project.
    | 'list-projects' %% Returns a list of projects.
    | 'modify-project' %% Modifies a project in the organization.
    | 'modify-project-user' %% Modifies a user&#39;s role in the project.
    | 'retrieve-project' %% Retrieves a project.
    | 'retrieve-project-api-key' %% Retrieves an API key in the project.
    | 'retrieve-project-service-account' %% Retrieves a service account in the project.
    | 'retrieve-project-user' %% Retrieves a user in the project.
    | 'update-project-rate-limits'. %% Updates a project rate limit.


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
allowed_methods(Req, #state{operation_id = 'archive-project'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'create-project'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'create-project-service-account'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'create-project-user'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'delete-project-api-key'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'delete-project-service-account'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'delete-project-user'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'list-project-api-keys'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'list-project-rate-limits'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'list-project-service-accounts'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'list-project-users'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'list-projects'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'modify-project'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'modify-project-user'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'retrieve-project'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'retrieve-project-api-key'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'retrieve-project-service-account'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'retrieve-project-user'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'update-project-rate-limits'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req0,
              #state{operation_id = 'archive-project' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'create-project' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'create-project-service-account' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'create-project-user' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'delete-project-api-key' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'delete-project-service-account' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'delete-project-user' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'list-project-api-keys' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'list-project-rate-limits' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'list-project-service-accounts' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'list-project-users' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'list-projects' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'modify-project' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'modify-project-user' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'retrieve-project' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'retrieve-project-api-key' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'retrieve-project-service-account' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'retrieve-project-user' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'update-project-rate-limits' = OperationID,
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
content_types_accepted(Req, #state{operation_id = 'archive-project'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'create-project'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'create-project-service-account'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'create-project-user'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'delete-project-api-key'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'delete-project-service-account'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'delete-project-user'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'list-project-api-keys'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'list-project-rate-limits'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'list-project-service-accounts'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'list-project-users'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'list-projects'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'modify-project'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'modify-project-user'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'retrieve-project'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'retrieve-project-api-key'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'retrieve-project-service-account'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'retrieve-project-user'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'update-project-rate-limits'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'archive-project'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'create-project'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'create-project-service-account'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'create-project-user'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'delete-project-api-key'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'delete-project-service-account'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'delete-project-user'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'list-project-api-keys'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'list-project-rate-limits'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'list-project-service-accounts'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'list-project-users'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'list-projects'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'modify-project'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'modify-project-user'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'retrieve-project'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'retrieve-project-api-key'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'retrieve-project-service-account'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'retrieve-project-user'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'update-project-rate-limits'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'archive-project'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'create-project'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'create-project-service-account'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'create-project-user'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'delete-project-api-key'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'delete-project-service-account'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'delete-project-user'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'list-project-api-keys'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'list-project-rate-limits'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'list-project-service-accounts'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'list-project-users'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'list-projects'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'modify-project'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'modify-project-user'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'retrieve-project'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'retrieve-project-api-key'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'retrieve-project-service-account'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'retrieve-project-user'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'update-project-rate-limits'} = State) ->
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
    {Res, Req1, Context1} = Handler(projects, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(projects, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
