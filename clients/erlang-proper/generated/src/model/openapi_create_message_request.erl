-module(openapi_create_message_request).

-include("openapi.hrl").

-export([openapi_create_message_request/0]).

-export([openapi_create_message_request/1]).

-export_type([openapi_create_message_request/0]).

-type openapi_create_message_request() ::
  [ {'role', binary() }
  | {'content', binary() }
  | {'file_ids', list(binary()) }
  | {'metadata', map() }
  ].


openapi_create_message_request() ->
    openapi_create_message_request([]).

openapi_create_message_request(Fields) ->
  Default = [ {'role', elements([<<"user">>, <<"assistant">>]) }
            , {'content', binary(1, 256000) }
            , {'file_ids', list(binary(), 1, 10) }
            , {'metadata', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

