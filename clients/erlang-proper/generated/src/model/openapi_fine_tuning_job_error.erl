-module(openapi_fine_tuning_job_error).

-include("openapi.hrl").

-export([openapi_fine_tuning_job_error/0]).

-export([openapi_fine_tuning_job_error/1]).

-export_type([openapi_fine_tuning_job_error/0]).

-type openapi_fine_tuning_job_error() ::
  [ {'code', binary() }
  | {'message', binary() }
  | {'param', binary() }
  ].


openapi_fine_tuning_job_error() ->
    openapi_fine_tuning_job_error([]).

openapi_fine_tuning_job_error(Fields) ->
  Default = [ {'code', binary() }
            , {'message', binary() }
            , {'param', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

