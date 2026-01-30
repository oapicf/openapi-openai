-module(openapi_realtime_server_event_rate_limits_updated_rate_limits_inner).

-include("openapi.hrl").

-export([openapi_realtime_server_event_rate_limits_updated_rate_limits_inner/0]).

-export([openapi_realtime_server_event_rate_limits_updated_rate_limits_inner/1]).

-export_type([openapi_realtime_server_event_rate_limits_updated_rate_limits_inner/0]).

-type openapi_realtime_server_event_rate_limits_updated_rate_limits_inner() ::
  [ {'name', binary() }
  | {'limit', integer() }
  | {'remaining', integer() }
  | {'reset_seconds', integer() }
  ].


openapi_realtime_server_event_rate_limits_updated_rate_limits_inner() ->
    openapi_realtime_server_event_rate_limits_updated_rate_limits_inner([]).

openapi_realtime_server_event_rate_limits_updated_rate_limits_inner(Fields) ->
  Default = [ {'name', elements([<<"requests">>, <<"tokens">>]) }
            , {'limit', integer() }
            , {'remaining', integer() }
            , {'reset_seconds', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

