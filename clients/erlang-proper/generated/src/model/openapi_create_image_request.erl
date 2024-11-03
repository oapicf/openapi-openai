-module(openapi_create_image_request).

-include("openapi.hrl").

-export([openapi_create_image_request/0]).

-export([openapi_create_image_request/1]).

-export_type([openapi_create_image_request/0]).

-type openapi_create_image_request() ::
  [ {'prompt', binary() }
  | {'model', openapi_create_image_request_model:openapi_create_image_request_model() }
  | {'n', integer() }
  | {'quality', binary() }
  | {'response_format', binary() }
  | {'size', binary() }
  | {'style', binary() }
  | {'user', binary() }
  ].


openapi_create_image_request() ->
    openapi_create_image_request([]).

openapi_create_image_request(Fields) ->
  Default = [ {'prompt', binary() }
            , {'model', openapi_create_image_request_model:openapi_create_image_request_model() }
            , {'n', integer(1, 10) }
            , {'quality', elements([<<"standard">>, <<"hd">>]) }
            , {'response_format', elements([<<"url">>, <<"b64_json">>]) }
            , {'size', elements([<<"256x256">>, <<"512x512">>, <<"1024x1024">>, <<"1792x1024">>, <<"1024x1792">>]) }
            , {'style', elements([<<"vivid">>, <<"natural">>]) }
            , {'user', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

