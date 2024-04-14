-module(openapi_chat_completion_request_message_content_part_image).

-include("openapi.hrl").

-export([openapi_chat_completion_request_message_content_part_image/0]).

-export([openapi_chat_completion_request_message_content_part_image/1]).

-export_type([openapi_chat_completion_request_message_content_part_image/0]).

-type openapi_chat_completion_request_message_content_part_image() ::
  [ {'type', binary() }
  | {'image_url', openapi_chat_completion_request_message_content_part_image_image_url:openapi_chat_completion_request_message_content_part_image_image_url() }
  ].


openapi_chat_completion_request_message_content_part_image() ->
    openapi_chat_completion_request_message_content_part_image([]).

openapi_chat_completion_request_message_content_part_image(Fields) ->
  Default = [ {'type', elements([<<"image_url">>]) }
            , {'image_url', openapi_chat_completion_request_message_content_part_image_image_url:openapi_chat_completion_request_message_content_part_image_image_url() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

