-module(openapi_create_moderation_request_input_one_of_inner_one_of_1).

-include("openapi.hrl").

-export([openapi_create_moderation_request_input_one_of_inner_one_of_1/0]).

-export([openapi_create_moderation_request_input_one_of_inner_one_of_1/1]).

-export_type([openapi_create_moderation_request_input_one_of_inner_one_of_1/0]).

-type openapi_create_moderation_request_input_one_of_inner_one_of_1() ::
  [ {'type', binary() }
  | {'text', binary() }
  ].


openapi_create_moderation_request_input_one_of_inner_one_of_1() ->
    openapi_create_moderation_request_input_one_of_inner_one_of_1([]).

openapi_create_moderation_request_input_one_of_inner_one_of_1(Fields) ->
  Default = [ {'type', elements([<<"text">>]) }
            , {'text', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

