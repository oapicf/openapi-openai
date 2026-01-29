-module(openapi_run_object_incomplete_details).

-include("openapi.hrl").

-export([openapi_run_object_incomplete_details/0]).

-export([openapi_run_object_incomplete_details/1]).

-export_type([openapi_run_object_incomplete_details/0]).

-type openapi_run_object_incomplete_details() ::
  [ {'reason', binary() }
  ].


openapi_run_object_incomplete_details() ->
    openapi_run_object_incomplete_details([]).

openapi_run_object_incomplete_details(Fields) ->
  Default = [ {'reason', elements([<<"max_completion_tokens">>, <<"max_prompt_tokens">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

