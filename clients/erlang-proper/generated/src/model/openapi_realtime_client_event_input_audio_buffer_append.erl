-module(openapi_realtime_client_event_input_audio_buffer_append).

-include("openapi.hrl").

-export([openapi_realtime_client_event_input_audio_buffer_append/0]).

-export([openapi_realtime_client_event_input_audio_buffer_append/1]).

-export_type([openapi_realtime_client_event_input_audio_buffer_append/0]).

-type openapi_realtime_client_event_input_audio_buffer_append() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'audio', binary() }
  ].


openapi_realtime_client_event_input_audio_buffer_append() ->
    openapi_realtime_client_event_input_audio_buffer_append([]).

openapi_realtime_client_event_input_audio_buffer_append(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"input_audio_buffer.append">>]) }
            , {'audio', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

