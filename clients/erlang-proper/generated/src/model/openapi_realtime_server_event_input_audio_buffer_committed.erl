-module(openapi_realtime_server_event_input_audio_buffer_committed).

-include("openapi.hrl").

-export([openapi_realtime_server_event_input_audio_buffer_committed/0]).

-export([openapi_realtime_server_event_input_audio_buffer_committed/1]).

-export_type([openapi_realtime_server_event_input_audio_buffer_committed/0]).

-type openapi_realtime_server_event_input_audio_buffer_committed() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'previous_item_id', binary() }
  | {'item_id', binary() }
  ].


openapi_realtime_server_event_input_audio_buffer_committed() ->
    openapi_realtime_server_event_input_audio_buffer_committed([]).

openapi_realtime_server_event_input_audio_buffer_committed(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"input_audio_buffer.committed">>]) }
            , {'previous_item_id', binary() }
            , {'item_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

