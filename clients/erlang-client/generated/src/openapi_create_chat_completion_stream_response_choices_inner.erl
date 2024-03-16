-module(openapi_create_chat_completion_stream_response_choices_inner).

-export([encode/1]).

-export_type([openapi_create_chat_completion_stream_response_choices_inner/0]).

-type openapi_create_chat_completion_stream_response_choices_inner() ::
    #{ 'index' => integer(),
       'delta' => openapi_chat_completion_stream_response_delta:openapi_chat_completion_stream_response_delta(),
       'finish_reason' => binary()
     }.

encode(#{ 'index' := Index,
          'delta' := Delta,
          'finish_reason' := FinishReason
        }) ->
    #{ 'index' => Index,
       'delta' => Delta,
       'finish_reason' => FinishReason
     }.
