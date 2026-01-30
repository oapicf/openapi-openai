-module(openapi_array_of_content_parts_inner).

-include("openapi.hrl").

-export([openapi_array_of_content_parts_inner/0]).

-export([openapi_array_of_content_parts_inner/1]).

-export_type([openapi_array_of_content_parts_inner/0]).

-type openapi_array_of_content_parts_inner() ::
  [ {'type', binary() }
  | {'image_file', openapi_message_content_image_file_object_image_file:openapi_message_content_image_file_object_image_file() }
  | {'image_url', openapi_message_content_image_url_object_image_url:openapi_message_content_image_url_object_image_url() }
  | {'text', binary() }
  ].


openapi_array_of_content_parts_inner() ->
    openapi_array_of_content_parts_inner([]).

openapi_array_of_content_parts_inner(Fields) ->
  Default = [ {'type', elements([<<"image_file">>, <<"image_url">>, <<"text">>]) }
            , {'image_file', openapi_message_content_image_file_object_image_file:openapi_message_content_image_file_object_image_file() }
            , {'image_url', openapi_message_content_image_url_object_image_url:openapi_message_content_image_url_object_image_url() }
            , {'text', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

