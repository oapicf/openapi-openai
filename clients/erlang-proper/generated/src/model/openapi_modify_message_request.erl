-module(openapi_modify_message_request).

-include("openapi.hrl").

-export([openapi_modify_message_request/0]).

-export([openapi_modify_message_request/1]).

-export_type([openapi_modify_message_request/0]).

-type openapi_modify_message_request() ::
  [ {'metadata', map() }
  ].


openapi_modify_message_request() ->
    openapi_modify_message_request([]).

openapi_modify_message_request(Fields) ->
  Default = [ {'metadata', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

