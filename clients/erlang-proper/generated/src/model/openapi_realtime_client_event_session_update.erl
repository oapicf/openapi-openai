-module(openapi_realtime_client_event_session_update).

-include("openapi.hrl").

-export([openapi_realtime_client_event_session_update/0]).

-export([openapi_realtime_client_event_session_update/1]).

-export_type([openapi_realtime_client_event_session_update/0]).

-type openapi_realtime_client_event_session_update() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'session', openapi_realtime_session_create_request:openapi_realtime_session_create_request() }
  ].


openapi_realtime_client_event_session_update() ->
    openapi_realtime_client_event_session_update([]).

openapi_realtime_client_event_session_update(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"session.update">>]) }
            , {'session', openapi_realtime_session_create_request:openapi_realtime_session_create_request() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

