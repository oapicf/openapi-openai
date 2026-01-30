-module(openapi_chat_completion_request_user_message_content_part).

-include("openapi.hrl").

-export([openapi_chat_completion_request_user_message_content_part/0]).

-export([openapi_chat_completion_request_user_message_content_part/1]).

-export_type([openapi_chat_completion_request_user_message_content_part/0]).

-type openapi_chat_completion_request_user_message_content_part() ::
  [ {'type', binary() }
  | {'text', binary() }
  | {'image_url', openapi_chat_completion_request_message_content_part_image_image_url:openapi_chat_completion_request_message_content_part_image_image_url() }
  | {'input_audio', openapi_chat_completion_request_message_content_part_audio_input_audio:openapi_chat_completion_request_message_content_part_audio_input_audio() }
  ].


openapi_chat_completion_request_user_message_content_part() ->
    openapi_chat_completion_request_user_message_content_part([]).

openapi_chat_completion_request_user_message_content_part(Fields) ->
  Default = [ {'type', elements([<<"text">>, <<"image_url">>, <<"input_audio">>]) }
            , {'text', binary() }
            , {'image_url', openapi_chat_completion_request_message_content_part_image_image_url:openapi_chat_completion_request_message_content_part_image_image_url() }
            , {'input_audio', openapi_chat_completion_request_message_content_part_audio_input_audio:openapi_chat_completion_request_message_content_part_audio_input_audio() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

