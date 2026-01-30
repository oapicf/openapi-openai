-module(openapi_realtime_server_event_response_created).

-include("openapi.hrl").

-export([openapi_realtime_server_event_response_created/0]).

-export([openapi_realtime_server_event_response_created/1]).

-export_type([openapi_realtime_server_event_response_created/0]).

-type openapi_realtime_server_event_response_created() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'response', openapi_realtime_response:openapi_realtime_response() }
  ].


openapi_realtime_server_event_response_created() ->
    openapi_realtime_server_event_response_created([]).

openapi_realtime_server_event_response_created(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"response.created">>]) }
            , {'response', openapi_realtime_response:openapi_realtime_response() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

