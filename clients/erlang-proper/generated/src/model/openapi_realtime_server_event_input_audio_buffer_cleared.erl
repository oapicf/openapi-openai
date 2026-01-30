-module(openapi_realtime_server_event_input_audio_buffer_cleared).

-include("openapi.hrl").

-export([openapi_realtime_server_event_input_audio_buffer_cleared/0]).

-export([openapi_realtime_server_event_input_audio_buffer_cleared/1]).

-export_type([openapi_realtime_server_event_input_audio_buffer_cleared/0]).

-type openapi_realtime_server_event_input_audio_buffer_cleared() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  ].


openapi_realtime_server_event_input_audio_buffer_cleared() ->
    openapi_realtime_server_event_input_audio_buffer_cleared([]).

openapi_realtime_server_event_input_audio_buffer_cleared(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"input_audio_buffer.cleared">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

