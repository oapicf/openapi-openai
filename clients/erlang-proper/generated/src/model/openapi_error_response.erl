-module(openapi_error_response).

-include("openapi.hrl").

-export([openapi_error_response/0]).

-export([openapi_error_response/1]).

-export_type([openapi_error_response/0]).

-type openapi_error_response() ::
  [ {'error', openapi_error:openapi_error() }
  ].


openapi_error_response() ->
    openapi_error_response([]).

openapi_error_response(Fields) ->
  Default = [ {'error', openapi_error:openapi_error() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

