-module(openapi_usage_time_bucket).

-include("openapi.hrl").

-export([openapi_usage_time_bucket/0]).

-export([openapi_usage_time_bucket/1]).

-export_type([openapi_usage_time_bucket/0]).

-type openapi_usage_time_bucket() ::
  [ {'object', binary() }
  | {'start_time', integer() }
  | {'end_time', integer() }
  | {'result', list(openapi_usage_time_bucket_result_inner:openapi_usage_time_bucket_result_inner()) }
  ].


openapi_usage_time_bucket() ->
    openapi_usage_time_bucket([]).

openapi_usage_time_bucket(Fields) ->
  Default = [ {'object', elements([<<"bucket">>]) }
            , {'start_time', integer() }
            , {'end_time', integer() }
            , {'result', list(openapi_usage_time_bucket_result_inner:openapi_usage_time_bucket_result_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

