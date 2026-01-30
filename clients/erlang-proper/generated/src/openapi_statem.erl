-module(openapi_statem).

-behaviour(proper_statem).

-include("openapi.hrl").
-include_lib("proper/include/proper_common.hrl").
-include_lib("stdlib/include/assert.hrl").

-compile(export_all).
-compile(nowarn_export_all).

-include("openapi_statem.hrl").

%%==============================================================================
%% The statem's property
%%==============================================================================

prop_main() ->
  setup(),
  ?FORALL( Cmds
         , proper_statem:commands(?MODULE)
         , begin
             cleanup(),
             { History
             , State
             , Result
             } = proper_statem:run_commands(?MODULE, Cmds),
             ?WHENFAIL(
                io:format("History: ~p\nState: ~p\nResult: ~p\nCmds: ~p\n",
                          [ History
                          , State
                          , Result
                          , proper_statem:command_names(Cmds)
                          ]),
                proper:aggregate( proper_statem:command_names(Cmds)
                                , Result =:= ok
                                )
               )
           end
         ).

%%==============================================================================
%% Setup
%%==============================================================================

setup() -> ok.

%%==============================================================================
%% Cleanup
%%==============================================================================

cleanup() -> ok.

%%==============================================================================
%% Initial State
%%==============================================================================

initial_state() -> #{}.

%%==============================================================================
%% cancel_vector_store_file_batch
%%==============================================================================

cancel_vector_store_file_batch(VectorStoreId, BatchId) ->
  openapi_api:cancel_vector_store_file_batch(VectorStoreId, BatchId).

cancel_vector_store_file_batch_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% create_vector_store
%%==============================================================================

create_vector_store(OpenapiCreateVectorStoreRequest) ->
  openapi_api:create_vector_store(OpenapiCreateVectorStoreRequest).

create_vector_store_args(_S) ->
  [openapi_create_vector_store_request:openapi_create_vector_store_request()].

%%==============================================================================
%% create_vector_store_file
%%==============================================================================

create_vector_store_file(VectorStoreId, OpenapiCreateVectorStoreFileRequest) ->
  openapi_api:create_vector_store_file(VectorStoreId, OpenapiCreateVectorStoreFileRequest).

create_vector_store_file_args(_S) ->
  [binary(), openapi_create_vector_store_file_request:openapi_create_vector_store_file_request()].

%%==============================================================================
%% create_vector_store_file_batch
%%==============================================================================

create_vector_store_file_batch(VectorStoreId, OpenapiCreateVectorStoreFileBatchRequest) ->
  openapi_api:create_vector_store_file_batch(VectorStoreId, OpenapiCreateVectorStoreFileBatchRequest).

create_vector_store_file_batch_args(_S) ->
  [binary(), openapi_create_vector_store_file_batch_request:openapi_create_vector_store_file_batch_request()].

%%==============================================================================
%% delete_vector_store
%%==============================================================================

delete_vector_store(VectorStoreId) ->
  openapi_api:delete_vector_store(VectorStoreId).

delete_vector_store_args(_S) ->
  [binary()].

%%==============================================================================
%% delete_vector_store_file
%%==============================================================================

delete_vector_store_file(VectorStoreId, FileId) ->
  openapi_api:delete_vector_store_file(VectorStoreId, FileId).

delete_vector_store_file_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% get_vector_store
%%==============================================================================

get_vector_store(VectorStoreId) ->
  openapi_api:get_vector_store(VectorStoreId).

get_vector_store_args(_S) ->
  [binary()].

%%==============================================================================
%% get_vector_store_file
%%==============================================================================

get_vector_store_file(VectorStoreId, FileId) ->
  openapi_api:get_vector_store_file(VectorStoreId, FileId).

get_vector_store_file_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% get_vector_store_file_batch
%%==============================================================================

get_vector_store_file_batch(VectorStoreId, BatchId) ->
  openapi_api:get_vector_store_file_batch(VectorStoreId, BatchId).

get_vector_store_file_batch_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% list_files_in_vector_store_batch
%%==============================================================================

list_files_in_vector_store_batch(VectorStoreId, BatchId) ->
  openapi_api:list_files_in_vector_store_batch(VectorStoreId, BatchId).

list_files_in_vector_store_batch_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% list_vector_store_files
%%==============================================================================

list_vector_store_files(VectorStoreId) ->
  openapi_api:list_vector_store_files(VectorStoreId).

list_vector_store_files_args(_S) ->
  [binary()].

%%==============================================================================
%% list_vector_stores
%%==============================================================================

list_vector_stores() ->
  openapi_api:list_vector_stores().

list_vector_stores_args(_S) ->
  [].

%%==============================================================================
%% modify_vector_store
%%==============================================================================

modify_vector_store(VectorStoreId, OpenapiUpdateVectorStoreRequest) ->
  openapi_api:modify_vector_store(VectorStoreId, OpenapiUpdateVectorStoreRequest).

modify_vector_store_args(_S) ->
  [binary(), openapi_update_vector_store_request:openapi_update_vector_store_request()].

