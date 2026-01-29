-module(openapi_run_step_completion_usage).

-include("openapi.hrl").

-export([openapi_run_step_completion_usage/0]).

-export([openapi_run_step_completion_usage/1]).

-export_type([openapi_run_step_completion_usage/0]).

-type openapi_run_step_completion_usage() ::
  [ {'completion_tokens', integer() }
  | {'prompt_tokens', integer() }
  | {'total_tokens', integer() }
  ].


openapi_run_step_completion_usage() ->
    openapi_run_step_completion_usage([]).

openapi_run_step_completion_usage(Fields) ->
  Default = [ {'completion_tokens', integer() }
            , {'prompt_tokens', integer() }
            , {'total_tokens', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

