-module(openapi_message_object_content_inner).

-include("openapi.hrl").

-export([openapi_message_object_content_inner/0]).

-export([openapi_message_object_content_inner/1]).

-export_type([openapi_message_object_content_inner/0]).

-type openapi_message_object_content_inner() ::
  [ {'type', binary() }
  | {'image_file', openapi_message_content_image_file_object_image_file:openapi_message_content_image_file_object_image_file() }
  | {'image_url', openapi_message_content_image_url_object_image_url:openapi_message_content_image_url_object_image_url() }
  | {'text', openapi_message_content_text_object_text:openapi_message_content_text_object_text() }
  | {'refusal', binary() }
  ].


openapi_message_object_content_inner() ->
    openapi_message_object_content_inner([]).

openapi_message_object_content_inner(Fields) ->
  Default = [ {'type', elements([<<"image_file">>, <<"image_url">>, <<"text">>, <<"refusal">>]) }
            , {'image_file', openapi_message_content_image_file_object_image_file:openapi_message_content_image_file_object_image_file() }
            , {'image_url', openapi_message_content_image_url_object_image_url:openapi_message_content_image_url_object_image_url() }
            , {'text', openapi_message_content_text_object_text:openapi_message_content_text_object_text() }
            , {'refusal', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

