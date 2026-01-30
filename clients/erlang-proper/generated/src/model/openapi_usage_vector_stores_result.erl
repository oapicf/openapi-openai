-module(openapi_usage_vector_stores_result).

-include("openapi.hrl").

-export([openapi_usage_vector_stores_result/0]).

-export([openapi_usage_vector_stores_result/1]).

-export_type([openapi_usage_vector_stores_result/0]).

-type openapi_usage_vector_stores_result() ::
  [ {'object', binary() }
  | {'usage_bytes', integer() }
  | {'project_id', binary() }
  ].


openapi_usage_vector_stores_result() ->
    openapi_usage_vector_stores_result([]).

openapi_usage_vector_stores_result(Fields) ->
  Default = [ {'object', elements([<<"organization.usage.vector_stores.result">>]) }
            , {'usage_bytes', integer() }
            , {'project_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

