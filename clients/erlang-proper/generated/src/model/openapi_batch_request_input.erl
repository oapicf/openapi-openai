-module(openapi_batch_request_input).

-include("openapi.hrl").

-export([openapi_batch_request_input/0]).

-export([openapi_batch_request_input/1]).

-export_type([openapi_batch_request_input/0]).

-type openapi_batch_request_input() ::
  [ {'custom_id', binary() }
  | {'method', binary() }
  | {'url', binary() }
  ].


openapi_batch_request_input() ->
    openapi_batch_request_input([]).

openapi_batch_request_input(Fields) ->
  Default = [ {'custom_id', binary() }
            , {'method', elements([<<"POST">>]) }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

