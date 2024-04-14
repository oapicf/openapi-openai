-module(openapi_create_chat_completion_stream_response_choices_inner).

-export([encode/1]).

-export_type([openapi_create_chat_completion_stream_response_choices_inner/0]).

-type openapi_create_chat_completion_stream_response_choices_inner() ::
    #{ 'delta' := openapi_chat_completion_stream_response_delta:openapi_chat_completion_stream_response_delta(),
       'logprobs' => openapi_create_chat_completion_response_choices_inner_logprobs:openapi_create_chat_completion_response_choices_inner_logprobs(),
       'finish_reason' := binary(),
       'index' := integer()
     }.

encode(#{ 'delta' := Delta,
          'logprobs' := Logprobs,
          'finish_reason' := FinishReason,
          'index' := Index
        }) ->
    #{ 'delta' => Delta,
       'logprobs' => Logprobs,
       'finish_reason' => FinishReason,
       'index' => Index
     }.
