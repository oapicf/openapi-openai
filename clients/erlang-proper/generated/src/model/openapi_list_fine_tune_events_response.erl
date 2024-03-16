-module(openapi_list_fine_tune_events_response).

-include("openapi.hrl").

-export([openapi_list_fine_tune_events_response/0]).

-export([openapi_list_fine_tune_events_response/1]).

-export_type([openapi_list_fine_tune_events_response/0]).

-type openapi_list_fine_tune_events_response() ::
  [ {'object', binary() }
  | {'data', list(openapi_fine_tune_event:openapi_fine_tune_event()) }
  ].


openapi_list_fine_tune_events_response() ->
    openapi_list_fine_tune_events_response([]).

openapi_list_fine_tune_events_response(Fields) ->
  Default = [ {'object', binary() }
            , {'data', list(openapi_fine_tune_event:openapi_fine_tune_event()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

