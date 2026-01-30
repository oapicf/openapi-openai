-module(openapi_realtime_server_event_response_content_part_done_part).

-include("openapi.hrl").

-export([openapi_realtime_server_event_response_content_part_done_part/0]).

-export([openapi_realtime_server_event_response_content_part_done_part/1]).

-export_type([openapi_realtime_server_event_response_content_part_done_part/0]).

-type openapi_realtime_server_event_response_content_part_done_part() ::
  [ {'type', binary() }
  | {'text', binary() }
  | {'audio', binary() }
  | {'transcript', binary() }
  ].


openapi_realtime_server_event_response_content_part_done_part() ->
    openapi_realtime_server_event_response_content_part_done_part([]).

openapi_realtime_server_event_response_content_part_done_part(Fields) ->
  Default = [ {'type', elements([<<"audio">>, <<"text">>]) }
            , {'text', binary() }
            , {'audio', binary() }
            , {'transcript', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

