-module(openapi_create_completion_response_choices_inner).

-export([encode/1]).

-export_type([openapi_create_completion_response_choices_inner/0]).

-type openapi_create_completion_response_choices_inner() ::
    #{ 'finish_reason' := binary(),
       'index' := integer(),
       'logprobs' := openapi_create_completion_response_choices_inner_logprobs:openapi_create_completion_response_choices_inner_logprobs(),
       'text' := binary()
     }.

encode(#{ 'finish_reason' := FinishReason,
          'index' := Index,
          'logprobs' := Logprobs,
          'text' := Text
        }) ->
    #{ 'finish_reason' => FinishReason,
       'index' => Index,
       'logprobs' => Logprobs,
       'text' => Text
     }.
