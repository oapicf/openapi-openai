-module(openapi_message_content_image_url_object_image_url).

-include("openapi.hrl").

-export([openapi_message_content_image_url_object_image_url/0]).

-export([openapi_message_content_image_url_object_image_url/1]).

-export_type([openapi_message_content_image_url_object_image_url/0]).

-type openapi_message_content_image_url_object_image_url() ::
  [ {'url', openapi_u_ri:openapi_u_ri() }
  | {'detail', binary() }
  ].


openapi_message_content_image_url_object_image_url() ->
    openapi_message_content_image_url_object_image_url([]).

openapi_message_content_image_url_object_image_url(Fields) ->
  Default = [ {'url', binary() }
            , {'detail', elements([<<"auto">>, <<"low">>, <<"high">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

