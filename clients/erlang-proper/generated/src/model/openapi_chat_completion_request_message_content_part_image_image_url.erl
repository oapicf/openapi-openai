-module(openapi_chat_completion_request_message_content_part_image_image_url).

-include("openapi.hrl").

-export([openapi_chat_completion_request_message_content_part_image_image_url/0]).

-export([openapi_chat_completion_request_message_content_part_image_image_url/1]).

-export_type([openapi_chat_completion_request_message_content_part_image_image_url/0]).

-type openapi_chat_completion_request_message_content_part_image_image_url() ::
  [ {'url', openapi_u_ri:openapi_u_ri() }
  | {'detail', binary() }
  ].


openapi_chat_completion_request_message_content_part_image_image_url() ->
    openapi_chat_completion_request_message_content_part_image_image_url([]).

openapi_chat_completion_request_message_content_part_image_image_url(Fields) ->
  Default = [ {'url', binary() }
            , {'detail', elements([<<"auto">>, <<"low">>, <<"high">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

