-module(openapi_realtime_server_event_response_done).

-include("openapi.hrl").

-export([openapi_realtime_server_event_response_done/0]).

-export([openapi_realtime_server_event_response_done/1]).

-export_type([openapi_realtime_server_event_response_done/0]).

-type openapi_realtime_server_event_response_done() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'response', openapi_realtime_response:openapi_realtime_response() }
  ].


openapi_realtime_server_event_response_done() ->
    openapi_realtime_server_event_response_done([]).

openapi_realtime_server_event_response_done(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"response.done">>]) }
            , {'response', openapi_realtime_response:openapi_realtime_response() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

