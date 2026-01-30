-module(openapi_fine_tune_completion_request_input).

-export([encode/1]).

-export_type([openapi_fine_tune_completion_request_input/0]).

-type openapi_fine_tune_completion_request_input() ::
    #{ 'prompt' => binary(),
       'completion' => binary()
     }.

encode(#{ 'prompt' := Prompt,
          'completion' := Completion
        }) ->
    #{ 'prompt' => Prompt,
       'completion' => Completion
     }.
