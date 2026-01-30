-module(openapi_chunking_strategy_request_param).

-include("openapi.hrl").

-export([openapi_chunking_strategy_request_param/0]).

-export([openapi_chunking_strategy_request_param/1]).

-export_type([openapi_chunking_strategy_request_param/0]).

-type openapi_chunking_strategy_request_param() ::
  [ {'type', binary() }
  | {'static', openapi_static_chunking_strategy:openapi_static_chunking_strategy() }
  ].


openapi_chunking_strategy_request_param() ->
    openapi_chunking_strategy_request_param([]).

openapi_chunking_strategy_request_param(Fields) ->
  Default = [ {'type', elements([<<"auto">>, <<"static">>]) }
            , {'static', openapi_static_chunking_strategy:openapi_static_chunking_strategy() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

