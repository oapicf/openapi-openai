-module(openapi_message_delta_content_image_file_object_image_file).

-include("openapi.hrl").

-export([openapi_message_delta_content_image_file_object_image_file/0]).

-export([openapi_message_delta_content_image_file_object_image_file/1]).

-export_type([openapi_message_delta_content_image_file_object_image_file/0]).

-type openapi_message_delta_content_image_file_object_image_file() ::
  [ {'file_id', binary() }
  | {'detail', binary() }
  ].


openapi_message_delta_content_image_file_object_image_file() ->
    openapi_message_delta_content_image_file_object_image_file([]).

openapi_message_delta_content_image_file_object_image_file(Fields) ->
  Default = [ {'file_id', binary() }
            , {'detail', elements([<<"auto">>, <<"low">>, <<"high">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

