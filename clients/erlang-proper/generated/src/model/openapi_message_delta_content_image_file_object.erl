-module(openapi_message_delta_content_image_file_object).

-include("openapi.hrl").

-export([openapi_message_delta_content_image_file_object/0]).

-export([openapi_message_delta_content_image_file_object/1]).

-export_type([openapi_message_delta_content_image_file_object/0]).

-type openapi_message_delta_content_image_file_object() ::
  [ {'index', integer() }
  | {'type', binary() }
  | {'image_file', openapi_message_delta_content_image_file_object_image_file:openapi_message_delta_content_image_file_object_image_file() }
  ].


openapi_message_delta_content_image_file_object() ->
    openapi_message_delta_content_image_file_object([]).

openapi_message_delta_content_image_file_object(Fields) ->
  Default = [ {'index', integer() }
            , {'type', elements([<<"image_file">>]) }
            , {'image_file', openapi_message_delta_content_image_file_object_image_file:openapi_message_delta_content_image_file_object_image_file() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

