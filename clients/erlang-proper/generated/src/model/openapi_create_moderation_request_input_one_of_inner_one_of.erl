-module(openapi_create_moderation_request_input_one_of_inner_one_of).

-include("openapi.hrl").

-export([openapi_create_moderation_request_input_one_of_inner_one_of/0]).

-export([openapi_create_moderation_request_input_one_of_inner_one_of/1]).

-export_type([openapi_create_moderation_request_input_one_of_inner_one_of/0]).

-type openapi_create_moderation_request_input_one_of_inner_one_of() ::
  [ {'type', binary() }
  | {'image_url', openapi_create_moderation_request_input_one_of_inner_one_of_image_url:openapi_create_moderation_request_input_one_of_inner_one_of_image_url() }
  ].


openapi_create_moderation_request_input_one_of_inner_one_of() ->
    openapi_create_moderation_request_input_one_of_inner_one_of([]).

openapi_create_moderation_request_input_one_of_inner_one_of(Fields) ->
  Default = [ {'type', elements([<<"image_url">>]) }
            , {'image_url', openapi_create_moderation_request_input_one_of_inner_one_of_image_url:openapi_create_moderation_request_input_one_of_inner_one_of_image_url() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

