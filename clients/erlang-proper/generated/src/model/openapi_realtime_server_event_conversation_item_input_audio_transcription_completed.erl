-module(openapi_realtime_server_event_conversation_item_input_audio_transcription_completed).

-include("openapi.hrl").

-export([openapi_realtime_server_event_conversation_item_input_audio_transcription_completed/0]).

-export([openapi_realtime_server_event_conversation_item_input_audio_transcription_completed/1]).

-export_type([openapi_realtime_server_event_conversation_item_input_audio_transcription_completed/0]).

-type openapi_realtime_server_event_conversation_item_input_audio_transcription_completed() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'item_id', binary() }
  | {'content_index', integer() }
  | {'transcript', binary() }
  ].


openapi_realtime_server_event_conversation_item_input_audio_transcription_completed() ->
    openapi_realtime_server_event_conversation_item_input_audio_transcription_completed([]).

openapi_realtime_server_event_conversation_item_input_audio_transcription_completed(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"conversation.item.input_audio_transcription.completed">>]) }
            , {'item_id', binary() }
            , {'content_index', integer() }
            , {'transcript', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

