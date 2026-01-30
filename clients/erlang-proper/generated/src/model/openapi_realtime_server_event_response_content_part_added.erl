-module(openapi_realtime_server_event_response_content_part_added).

-include("openapi.hrl").

-export([openapi_realtime_server_event_response_content_part_added/0]).

-export([openapi_realtime_server_event_response_content_part_added/1]).

-export_type([openapi_realtime_server_event_response_content_part_added/0]).

-type openapi_realtime_server_event_response_content_part_added() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'response_id', binary() }
  | {'item_id', binary() }
  | {'output_index', integer() }
  | {'content_index', integer() }
  | {'part', openapi_realtime_server_event_response_content_part_added_part:openapi_realtime_server_event_response_content_part_added_part() }
  ].


openapi_realtime_server_event_response_content_part_added() ->
    openapi_realtime_server_event_response_content_part_added([]).

openapi_realtime_server_event_response_content_part_added(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"response.content_part.added">>]) }
            , {'response_id', binary() }
            , {'item_id', binary() }
            , {'output_index', integer() }
            , {'content_index', integer() }
            , {'part', openapi_realtime_server_event_response_content_part_added_part:openapi_realtime_server_event_response_content_part_added_part() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

