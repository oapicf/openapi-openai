-module(openapi_realtime_server_event_rate_limits_updated).

-include("openapi.hrl").

-export([openapi_realtime_server_event_rate_limits_updated/0]).

-export([openapi_realtime_server_event_rate_limits_updated/1]).

-export_type([openapi_realtime_server_event_rate_limits_updated/0]).

-type openapi_realtime_server_event_rate_limits_updated() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'rate_limits', list(openapi_realtime_server_event_rate_limits_updated_rate_limits_inner:openapi_realtime_server_event_rate_limits_updated_rate_limits_inner()) }
  ].


openapi_realtime_server_event_rate_limits_updated() ->
    openapi_realtime_server_event_rate_limits_updated([]).

openapi_realtime_server_event_rate_limits_updated(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"rate_limits.updated">>]) }
            , {'rate_limits', list(openapi_realtime_server_event_rate_limits_updated_rate_limits_inner:openapi_realtime_server_event_rate_limits_updated_rate_limits_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

