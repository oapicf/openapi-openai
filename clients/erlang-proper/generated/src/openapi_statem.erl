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
%% cancel_fine_tune
%%==============================================================================

cancel_fine_tune(FineTuneId) ->
  openapi_api:cancel_fine_tune(FineTuneId).

cancel_fine_tune_args(_S) ->
  [binary()].

%%==============================================================================
%% create_chat_completion
%%==============================================================================

create_chat_completion(OpenapiCreateChatCompletionRequest) ->
  openapi_api:create_chat_completion(OpenapiCreateChatCompletionRequest).

create_chat_completion_args(_S) ->
  [openapi_create_chat_completion_request:openapi_create_chat_completion_request()].

%%==============================================================================
%% create_completion
%%==============================================================================

create_completion(OpenapiCreateCompletionRequest) ->
  openapi_api:create_completion(OpenapiCreateCompletionRequest).

create_completion_args(_S) ->
  [openapi_create_completion_request:openapi_create_completion_request()].

%%==============================================================================
%% create_edit
%%==============================================================================

create_edit(OpenapiCreateEditRequest) ->
  openapi_api:create_edit(OpenapiCreateEditRequest).

create_edit_args(_S) ->
  [openapi_create_edit_request:openapi_create_edit_request()].

%%==============================================================================
%% create_embedding
%%==============================================================================

create_embedding(OpenapiCreateEmbeddingRequest) ->
  openapi_api:create_embedding(OpenapiCreateEmbeddingRequest).

create_embedding_args(_S) ->
  [openapi_create_embedding_request:openapi_create_embedding_request()].

%%==============================================================================
%% create_file
%%==============================================================================

create_file(File, Purpose) ->
  openapi_api:create_file(File, Purpose).

create_file_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% create_fine_tune
%%==============================================================================

create_fine_tune(OpenapiCreateFineTuneRequest) ->
  openapi_api:create_fine_tune(OpenapiCreateFineTuneRequest).

create_fine_tune_args(_S) ->
  [openapi_create_fine_tune_request:openapi_create_fine_tune_request()].

%%==============================================================================
%% create_image
%%==============================================================================

create_image(OpenapiCreateImageRequest) ->
  openapi_api:create_image(OpenapiCreateImageRequest).

create_image_args(_S) ->
  [openapi_create_image_request:openapi_create_image_request()].

%%==============================================================================
%% create_image_edit
%%==============================================================================

create_image_edit(Image, Prompt) ->
  openapi_api:create_image_edit(Image, Prompt).

create_image_edit_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% create_image_variation
%%==============================================================================

create_image_variation(Image) ->
  openapi_api:create_image_variation(Image).

create_image_variation_args(_S) ->
  [binary()].

%%==============================================================================
%% create_moderation
%%==============================================================================

create_moderation(OpenapiCreateModerationRequest) ->
  openapi_api:create_moderation(OpenapiCreateModerationRequest).

create_moderation_args(_S) ->
  [openapi_create_moderation_request:openapi_create_moderation_request()].

%%==============================================================================
%% create_transcription
%%==============================================================================

create_transcription(File, Model) ->
  openapi_api:create_transcription(File, Model).

create_transcription_args(_S) ->
  [binary(), openapi_create_transcription_request_model:openapi_create_transcription_request_model()].

%%==============================================================================
%% create_translation
%%==============================================================================

create_translation(File, Model) ->
  openapi_api:create_translation(File, Model).

create_translation_args(_S) ->
  [binary(), openapi_create_transcription_request_model:openapi_create_transcription_request_model()].

%%==============================================================================
%% delete_file
%%==============================================================================

delete_file(FileId) ->
  openapi_api:delete_file(FileId).

delete_file_args(_S) ->
  [binary()].

%%==============================================================================
%% delete_model
%%==============================================================================

delete_model(Model) ->
  openapi_api:delete_model(Model).

delete_model_args(_S) ->
  [binary()].

%%==============================================================================
%% download_file
%%==============================================================================

download_file(FileId) ->
  openapi_api:download_file(FileId).

download_file_args(_S) ->
  [binary()].

%%==============================================================================
%% list_files
%%==============================================================================

list_files() ->
  openapi_api:list_files().

list_files_args(_S) ->
  [].

%%==============================================================================
%% list_fine_tune_events
%%==============================================================================

list_fine_tune_events(FineTuneId) ->
  openapi_api:list_fine_tune_events(FineTuneId).

list_fine_tune_events_args(_S) ->
  [binary()].

%%==============================================================================
%% list_fine_tunes
%%==============================================================================

list_fine_tunes() ->
  openapi_api:list_fine_tunes().

list_fine_tunes_args(_S) ->
  [].

%%==============================================================================
%% list_models
%%==============================================================================

list_models() ->
  openapi_api:list_models().

list_models_args(_S) ->
  [].

%%==============================================================================
%% retrieve_file
%%==============================================================================

retrieve_file(FileId) ->
  openapi_api:retrieve_file(FileId).

retrieve_file_args(_S) ->
  [binary()].

%%==============================================================================
%% retrieve_fine_tune
%%==============================================================================

retrieve_fine_tune(FineTuneId) ->
  openapi_api:retrieve_fine_tune(FineTuneId).

retrieve_fine_tune_args(_S) ->
  [binary()].

%%==============================================================================
%% retrieve_model
%%==============================================================================

retrieve_model(Model) ->
  openapi_api:retrieve_model(Model).

retrieve_model_args(_S) ->
  [binary()].

