-module(openapi_create_image_request).

-include("openapi.hrl").

-export([openapi_create_image_request/0]).

-export([openapi_create_image_request/1]).

-export_type([openapi_create_image_request/0]).

-type openapi_create_image_request() ::
  [ {'prompt', binary() }
  | {'n', integer() }
  | {'size', binary() }
  | {'response_format', binary() }
  | {'user', binary() }
  ].


openapi_create_image_request() ->
    openapi_create_image_request([]).

openapi_create_image_request(Fields) ->
  Default = [ {'prompt', binary() }
            , {'n', integer(1, 10) }
            , {'size', elements([<<"256x256">>, <<"512x512">>, <<"1024x1024">>]) }
            , {'response_format', elements([<<"url">>, <<"b64_json">>]) }
            , {'user', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

