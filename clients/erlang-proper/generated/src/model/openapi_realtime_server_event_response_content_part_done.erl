-module(openapi_realtime_server_event_response_content_part_done).

-include("openapi.hrl").

-export([openapi_realtime_server_event_response_content_part_done/0]).

-export([openapi_realtime_server_event_response_content_part_done/1]).

-export_type([openapi_realtime_server_event_response_content_part_done/0]).

-type openapi_realtime_server_event_response_content_part_done() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'response_id', binary() }
  | {'item_id', binary() }
  | {'output_index', integer() }
  | {'content_index', integer() }
  | {'part', openapi_realtime_server_event_response_content_part_done_part:openapi_realtime_server_event_response_content_part_done_part() }
  ].


openapi_realtime_server_event_response_content_part_done() ->
    openapi_realtime_server_event_response_content_part_done([]).

openapi_realtime_server_event_response_content_part_done(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"response.content_part.done">>]) }
            , {'response_id', binary() }
            , {'item_id', binary() }
            , {'output_index', integer() }
            , {'content_index', integer() }
            , {'part', openapi_realtime_server_event_response_content_part_done_part:openapi_realtime_server_event_response_content_part_done_part() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

