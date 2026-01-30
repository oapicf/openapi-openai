-module(openapi_realtime_client_event_response_cancel).

-include("openapi.hrl").

-export([openapi_realtime_client_event_response_cancel/0]).

-export([openapi_realtime_client_event_response_cancel/1]).

-export_type([openapi_realtime_client_event_response_cancel/0]).

-type openapi_realtime_client_event_response_cancel() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'response_id', binary() }
  ].


openapi_realtime_client_event_response_cancel() ->
    openapi_realtime_client_event_response_cancel([]).

openapi_realtime_client_event_response_cancel(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"response.cancel">>]) }
            , {'response_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

