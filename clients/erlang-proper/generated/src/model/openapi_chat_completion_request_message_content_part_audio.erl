-module(openapi_chat_completion_request_message_content_part_audio).

-include("openapi.hrl").

-export([openapi_chat_completion_request_message_content_part_audio/0]).

-export([openapi_chat_completion_request_message_content_part_audio/1]).

-export_type([openapi_chat_completion_request_message_content_part_audio/0]).

-type openapi_chat_completion_request_message_content_part_audio() ::
  [ {'type', binary() }
  | {'input_audio', openapi_chat_completion_request_message_content_part_audio_input_audio:openapi_chat_completion_request_message_content_part_audio_input_audio() }
  ].


openapi_chat_completion_request_message_content_part_audio() ->
    openapi_chat_completion_request_message_content_part_audio([]).

openapi_chat_completion_request_message_content_part_audio(Fields) ->
  Default = [ {'type', elements([<<"input_audio">>]) }
            , {'input_audio', openapi_chat_completion_request_message_content_part_audio_input_audio:openapi_chat_completion_request_message_content_part_audio_input_audio() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

