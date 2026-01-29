-module(openapi_create_chat_completion_response_choices_inner).

-export([encode/1]).

-export_type([openapi_create_chat_completion_response_choices_inner/0]).

-type openapi_create_chat_completion_response_choices_inner() ::
    #{ 'finish_reason' := binary(),
       'index' := integer(),
       'message' := openapi_chat_completion_response_message:openapi_chat_completion_response_message(),
       'logprobs' := openapi_create_chat_completion_response_choices_inner_logprobs:openapi_create_chat_completion_response_choices_inner_logprobs()
     }.

encode(#{ 'finish_reason' := FinishReason,
          'index' := Index,
          'message' := Message,
          'logprobs' := Logprobs
        }) ->
    #{ 'finish_reason' => FinishReason,
       'index' => Index,
       'message' => Message,
       'logprobs' => Logprobs
     }.
