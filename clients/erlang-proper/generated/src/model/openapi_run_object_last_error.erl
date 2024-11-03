-module(openapi_run_object_last_error).

-include("openapi.hrl").

-export([openapi_run_object_last_error/0]).

-export([openapi_run_object_last_error/1]).

-export_type([openapi_run_object_last_error/0]).

-type openapi_run_object_last_error() ::
  [ {'code', binary() }
  | {'message', binary() }
  ].


openapi_run_object_last_error() ->
    openapi_run_object_last_error([]).

openapi_run_object_last_error(Fields) ->
  Default = [ {'code', elements([<<"server_error">>, <<"rate_limit_exceeded">>, <<"invalid_prompt">>]) }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

