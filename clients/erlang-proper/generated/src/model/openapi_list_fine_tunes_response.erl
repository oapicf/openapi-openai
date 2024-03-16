-module(openapi_list_fine_tunes_response).

-include("openapi.hrl").

-export([openapi_list_fine_tunes_response/0]).

-export([openapi_list_fine_tunes_response/1]).

-export_type([openapi_list_fine_tunes_response/0]).

-type openapi_list_fine_tunes_response() ::
  [ {'object', binary() }
  | {'data', list(openapi_fine_tune:openapi_fine_tune()) }
  ].


openapi_list_fine_tunes_response() ->
    openapi_list_fine_tunes_response([]).

openapi_list_fine_tunes_response(Fields) ->
  Default = [ {'object', binary() }
            , {'data', list(openapi_fine_tune:openapi_fine_tune()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

