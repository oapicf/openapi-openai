-module(openapi_vector_stores_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/vector_stores/:vector_store_id/file_batches/:batch_id/cancel`, OperationId: `cancelVectorStoreFileBatch`:
Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible..


- `POST` to `/vector_stores`, OperationId: `createVectorStore`:
Create a vector store..


- `POST` to `/vector_stores/:vector_store_id/files`, OperationId: `createVectorStoreFile`:
Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object)..


- `POST` to `/vector_stores/:vector_store_id/file_batches`, OperationId: `createVectorStoreFileBatch`:
Create a vector store file batch..


- `DELETE` to `/vector_stores/:vector_store_id`, OperationId: `deleteVectorStore`:
Delete a vector store..


- `DELETE` to `/vector_stores/:vector_store_id/files/:file_id`, OperationId: `deleteVectorStoreFile`:
Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint..


- `GET` to `/vector_stores/:vector_store_id`, OperationId: `getVectorStore`:
Retrieves a vector store..


- `GET` to `/vector_stores/:vector_store_id/files/:file_id`, OperationId: `getVectorStoreFile`:
Retrieves a vector store file..


- `GET` to `/vector_stores/:vector_store_id/file_batches/:batch_id`, OperationId: `getVectorStoreFileBatch`:
Retrieves a vector store file batch..


- `GET` to `/vector_stores/:vector_store_id/file_batches/:batch_id/files`, OperationId: `listFilesInVectorStoreBatch`:
Returns a list of vector store files in a batch..


- `GET` to `/vector_stores/:vector_store_id/files`, OperationId: `listVectorStoreFiles`:
Returns a list of vector store files..


- `GET` to `/vector_stores`, OperationId: `listVectorStores`:
Returns a list of vector stores..


- `POST` to `/vector_stores/:vector_store_id`, OperationId: `modifyVectorStore`:
Modifies a vector store..


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

-type class() :: 'vectorStores'.

-type operation_id() ::
    'cancelVectorStoreFileBatch' %% Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
    | 'createVectorStore' %% Create a vector store.
    | 'createVectorStoreFile' %% Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
    | 'createVectorStoreFileBatch' %% Create a vector store file batch.
    | 'deleteVectorStore' %% Delete a vector store.
    | 'deleteVectorStoreFile' %% Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
    | 'getVectorStore' %% Retrieves a vector store.
    | 'getVectorStoreFile' %% Retrieves a vector store file.
    | 'getVectorStoreFileBatch' %% Retrieves a vector store file batch.
    | 'listFilesInVectorStoreBatch' %% Returns a list of vector store files in a batch.
    | 'listVectorStoreFiles' %% Returns a list of vector store files.
    | 'listVectorStores' %% Returns a list of vector stores.
    | 'modifyVectorStore'. %% Modifies a vector store.


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
allowed_methods(Req, #state{operation_id = 'cancelVectorStoreFileBatch'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createVectorStore'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createVectorStoreFile'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createVectorStoreFileBatch'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteVectorStore'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteVectorStoreFile'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getVectorStore'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getVectorStoreFile'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getVectorStoreFileBatch'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'listFilesInVectorStoreBatch'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'listVectorStoreFiles'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'listVectorStores'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'modifyVectorStore'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req0,
              #state{operation_id = 'cancelVectorStoreFileBatch' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'createVectorStore' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'createVectorStoreFile' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'createVectorStoreFileBatch' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'deleteVectorStore' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'deleteVectorStoreFile' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getVectorStore' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getVectorStoreFile' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getVectorStoreFileBatch' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'listFilesInVectorStoreBatch' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'listVectorStoreFiles' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'listVectorStores' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'modifyVectorStore' = OperationID,
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
content_types_accepted(Req, #state{operation_id = 'cancelVectorStoreFileBatch'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createVectorStore'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'createVectorStoreFile'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'createVectorStoreFileBatch'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteVectorStore'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteVectorStoreFile'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getVectorStore'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getVectorStoreFile'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getVectorStoreFileBatch'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'listFilesInVectorStoreBatch'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'listVectorStoreFiles'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'listVectorStores'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'modifyVectorStore'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'cancelVectorStoreFileBatch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createVectorStore'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createVectorStoreFile'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createVectorStoreFileBatch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteVectorStore'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteVectorStoreFile'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getVectorStore'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getVectorStoreFile'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getVectorStoreFileBatch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'listFilesInVectorStoreBatch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'listVectorStoreFiles'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'listVectorStores'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'modifyVectorStore'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'cancelVectorStoreFileBatch'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createVectorStore'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createVectorStoreFile'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createVectorStoreFileBatch'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteVectorStore'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteVectorStoreFile'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getVectorStore'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getVectorStoreFile'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getVectorStoreFileBatch'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'listFilesInVectorStoreBatch'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'listVectorStoreFiles'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'listVectorStores'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'modifyVectorStore'} = State) ->
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
    {Res, Req1, Context1} = Handler(vectorStores, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(vectorStores, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
