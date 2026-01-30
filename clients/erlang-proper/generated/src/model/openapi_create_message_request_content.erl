-module(openapi_create_message_request_content).

-include("openapi.hrl").

-export([openapi_create_message_request_content/0]).

-export([openapi_create_message_request_content/1]).

-export_type([openapi_create_message_request_content/0]).

-type openapi_create_message_request_content() ::
  [ 
  ].


openapi_create_message_request_content() ->
    openapi_create_message_request_content([]).

openapi_create_message_request_content(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

