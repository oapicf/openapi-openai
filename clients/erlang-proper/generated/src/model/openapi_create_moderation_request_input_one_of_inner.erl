-module(openapi_create_moderation_request_input_one_of_inner).

-include("openapi.hrl").

-export([openapi_create_moderation_request_input_one_of_inner/0]).

-export([openapi_create_moderation_request_input_one_of_inner/1]).

-export_type([openapi_create_moderation_request_input_one_of_inner/0]).

-type openapi_create_moderation_request_input_one_of_inner() ::
  [ {'type', binary() }
  | {'image_url', openapi_create_moderation_request_input_one_of_inner_one_of_image_url:openapi_create_moderation_request_input_one_of_inner_one_of_image_url() }
  | {'text', binary() }
  ].


openapi_create_moderation_request_input_one_of_inner() ->
    openapi_create_moderation_request_input_one_of_inner([]).

openapi_create_moderation_request_input_one_of_inner(Fields) ->
  Default = [ {'type', elements([<<"image_url">>, <<"text">>]) }
            , {'image_url', openapi_create_moderation_request_input_one_of_inner_one_of_image_url:openapi_create_moderation_request_input_one_of_inner_one_of_image_url() }
            , {'text', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

