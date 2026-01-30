-module(openapi_fine_tune_completion_request_input).

-include("openapi.hrl").

-export([openapi_fine_tune_completion_request_input/0]).

-export([openapi_fine_tune_completion_request_input/1]).

-export_type([openapi_fine_tune_completion_request_input/0]).

-type openapi_fine_tune_completion_request_input() ::
  [ {'prompt', binary() }
  | {'completion', binary() }
  ].


openapi_fine_tune_completion_request_input() ->
    openapi_fine_tune_completion_request_input([]).

openapi_fine_tune_completion_request_input(Fields) ->
  Default = [ {'prompt', binary() }
            , {'completion', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

