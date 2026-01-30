-module(openapi_auto_chunking_strategy_request_param).

-include("openapi.hrl").

-export([openapi_auto_chunking_strategy_request_param/0]).

-export([openapi_auto_chunking_strategy_request_param/1]).

-export_type([openapi_auto_chunking_strategy_request_param/0]).

-type openapi_auto_chunking_strategy_request_param() ::
  [ {'type', binary() }
  ].


openapi_auto_chunking_strategy_request_param() ->
    openapi_auto_chunking_strategy_request_param([]).

openapi_auto_chunking_strategy_request_param(Fields) ->
  Default = [ {'type', elements([<<"auto">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

