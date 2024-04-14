-module(openapi_message_object_content_inner).

-include("openapi.hrl").

-export([openapi_message_object_content_inner/0]).

-export([openapi_message_object_content_inner/1]).

-export_type([openapi_message_object_content_inner/0]).

-type openapi_message_object_content_inner() ::
  [ {'type', binary() }
  | {'image_file', openapi_message_content_image_file_object_image_file:openapi_message_content_image_file_object_image_file() }
  | {'text', openapi_message_content_text_object_text:openapi_message_content_text_object_text() }
  ].


openapi_message_object_content_inner() ->
    openapi_message_object_content_inner([]).

openapi_message_object_content_inner(Fields) ->
  Default = [ {'type', elements([<<"image_file">>, <<"text">>]) }
            , {'image_file', openapi_message_content_image_file_object_image_file:openapi_message_content_image_file_object_image_file() }
            , {'text', openapi_message_content_text_object_text:openapi_message_content_text_object_text() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

