-module(openapi_create_completion_response_choices_inner).

-export([encode/1]).

-export_type([openapi_create_completion_response_choices_inner/0]).

-type openapi_create_completion_response_choices_inner() ::
    #{ 'text' := binary(),
       'index' := integer(),
       'logprobs' := openapi_create_completion_response_choices_inner_logprobs:openapi_create_completion_response_choices_inner_logprobs(),
       'finish_reason' := binary()
     }.

encode(#{ 'text' := Text,
          'index' := Index,
          'logprobs' := Logprobs,
          'finish_reason' := FinishReason
        }) ->
    #{ 'text' => Text,
       'index' => Index,
       'logprobs' => Logprobs,
       'finish_reason' => FinishReason
     }.
