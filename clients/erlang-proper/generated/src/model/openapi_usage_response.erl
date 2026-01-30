-module(openapi_usage_response).

-include("openapi.hrl").

-export([openapi_usage_response/0]).

-export([openapi_usage_response/1]).

-export_type([openapi_usage_response/0]).

-type openapi_usage_response() ::
  [ {'object', binary() }
  | {'data', list(openapi_usage_time_bucket:openapi_usage_time_bucket()) }
  | {'has_more', boolean() }
  | {'next_page', binary() }
  ].


openapi_usage_response() ->
    openapi_usage_response([]).

openapi_usage_response(Fields) ->
  Default = [ {'object', elements([<<"page">>]) }
            , {'data', list(openapi_usage_time_bucket:openapi_usage_time_bucket()) }
            , {'has_more', boolean() }
            , {'next_page', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

