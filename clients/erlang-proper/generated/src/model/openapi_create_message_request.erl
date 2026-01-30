-module(openapi_create_message_request).

-include("openapi.hrl").

-export([openapi_create_message_request/0]).

-export([openapi_create_message_request/1]).

-export_type([openapi_create_message_request/0]).

-type openapi_create_message_request() ::
  [ {'role', binary() }
  | {'content', openapi_create_message_request_content:openapi_create_message_request_content() }
  | {'attachments', list(openapi_create_message_request_attachments_inner:openapi_create_message_request_attachments_inner()) }
  | {'metadata', map() }
  ].


openapi_create_message_request() ->
    openapi_create_message_request([]).

openapi_create_message_request(Fields) ->
  Default = [ {'role', elements([<<"user">>, <<"assistant">>]) }
            , {'content', openapi_create_message_request_content:openapi_create_message_request_content() }
            , {'attachments', list(openapi_create_message_request_attachments_inner:openapi_create_message_request_attachments_inner()) }
            , {'metadata', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

