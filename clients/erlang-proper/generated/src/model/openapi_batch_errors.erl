-module(openapi_batch_errors).

-include("openapi.hrl").

-export([openapi_batch_errors/0]).

-export([openapi_batch_errors/1]).

-export_type([openapi_batch_errors/0]).

-type openapi_batch_errors() ::
  [ {'object', binary() }
  | {'data', list(openapi_batch_errors_data_inner:openapi_batch_errors_data_inner()) }
  ].


openapi_batch_errors() ->
    openapi_batch_errors([]).

openapi_batch_errors(Fields) ->
  Default = [ {'object', binary() }
            , {'data', list(openapi_batch_errors_data_inner:openapi_batch_errors_data_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

