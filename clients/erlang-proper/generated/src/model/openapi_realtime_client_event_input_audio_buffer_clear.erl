-module(openapi_realtime_client_event_input_audio_buffer_clear).

-include("openapi.hrl").

-export([openapi_realtime_client_event_input_audio_buffer_clear/0]).

-export([openapi_realtime_client_event_input_audio_buffer_clear/1]).

-export_type([openapi_realtime_client_event_input_audio_buffer_clear/0]).

-type openapi_realtime_client_event_input_audio_buffer_clear() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  ].


openapi_realtime_client_event_input_audio_buffer_clear() ->
    openapi_realtime_client_event_input_audio_buffer_clear([]).

openapi_realtime_client_event_input_audio_buffer_clear(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"input_audio_buffer.clear">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

