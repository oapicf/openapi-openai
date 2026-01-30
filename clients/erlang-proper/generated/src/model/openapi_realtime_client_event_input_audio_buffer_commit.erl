-module(openapi_realtime_client_event_input_audio_buffer_commit).

-include("openapi.hrl").

-export([openapi_realtime_client_event_input_audio_buffer_commit/0]).

-export([openapi_realtime_client_event_input_audio_buffer_commit/1]).

-export_type([openapi_realtime_client_event_input_audio_buffer_commit/0]).

-type openapi_realtime_client_event_input_audio_buffer_commit() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  ].


openapi_realtime_client_event_input_audio_buffer_commit() ->
    openapi_realtime_client_event_input_audio_buffer_commit([]).

openapi_realtime_client_event_input_audio_buffer_commit(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"input_audio_buffer.commit">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

