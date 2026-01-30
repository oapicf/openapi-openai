-module(openapi_message_content_image_url_object).

-include("openapi.hrl").

-export([openapi_message_content_image_url_object/0]).

-export([openapi_message_content_image_url_object/1]).

-export_type([openapi_message_content_image_url_object/0]).

-type openapi_message_content_image_url_object() ::
  [ {'type', binary() }
  | {'image_url', openapi_message_content_image_url_object_image_url:openapi_message_content_image_url_object_image_url() }
  ].


openapi_message_content_image_url_object() ->
    openapi_message_content_image_url_object([]).

openapi_message_content_image_url_object(Fields) ->
  Default = [ {'type', elements([<<"image_url">>]) }
            , {'image_url', openapi_message_content_image_url_object_image_url:openapi_message_content_image_url_object_image_url() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

