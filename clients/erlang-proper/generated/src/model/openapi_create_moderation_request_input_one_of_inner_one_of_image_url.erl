-module(openapi_create_moderation_request_input_one_of_inner_one_of_image_url).

-include("openapi.hrl").

-export([openapi_create_moderation_request_input_one_of_inner_one_of_image_url/0]).

-export([openapi_create_moderation_request_input_one_of_inner_one_of_image_url/1]).

-export_type([openapi_create_moderation_request_input_one_of_inner_one_of_image_url/0]).

-type openapi_create_moderation_request_input_one_of_inner_one_of_image_url() ::
  [ {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_create_moderation_request_input_one_of_inner_one_of_image_url() ->
    openapi_create_moderation_request_input_one_of_inner_one_of_image_url([]).

openapi_create_moderation_request_input_one_of_inner_one_of_image_url(Fields) ->
  Default = [ {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

