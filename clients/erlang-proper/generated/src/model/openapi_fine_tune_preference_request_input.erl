-module(openapi_fine_tune_preference_request_input).

-include("openapi.hrl").

-export([openapi_fine_tune_preference_request_input/0]).

-export([openapi_fine_tune_preference_request_input/1]).

-export_type([openapi_fine_tune_preference_request_input/0]).

-type openapi_fine_tune_preference_request_input() ::
  [ {'input', openapi_fine_tune_preference_request_input_input:openapi_fine_tune_preference_request_input_input() }
  | {'preferred_completion', list(openapi_fine_tune_preference_request_input_preferred_completion_inner:openapi_fine_tune_preference_request_input_preferred_completion_inner()) }
  | {'non_preferred_completion', list(openapi_fine_tune_preference_request_input_preferred_completion_inner:openapi_fine_tune_preference_request_input_preferred_completion_inner()) }
  ].


openapi_fine_tune_preference_request_input() ->
    openapi_fine_tune_preference_request_input([]).

openapi_fine_tune_preference_request_input(Fields) ->
  Default = [ {'input', openapi_fine_tune_preference_request_input_input:openapi_fine_tune_preference_request_input_input() }
            , {'preferred_completion', list(openapi_fine_tune_preference_request_input_preferred_completion_inner:openapi_fine_tune_preference_request_input_preferred_completion_inner()) }
            , {'non_preferred_completion', list(openapi_fine_tune_preference_request_input_preferred_completion_inner:openapi_fine_tune_preference_request_input_preferred_completion_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

