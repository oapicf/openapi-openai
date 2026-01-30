-module(openapi_create_message_request_attachments_inner).

-include("openapi.hrl").

-export([openapi_create_message_request_attachments_inner/0]).

-export([openapi_create_message_request_attachments_inner/1]).

-export_type([openapi_create_message_request_attachments_inner/0]).

-type openapi_create_message_request_attachments_inner() ::
  [ {'file_id', binary() }
  | {'tools', list(openapi_create_message_request_attachments_inner_tools_inner:openapi_create_message_request_attachments_inner_tools_inner()) }
  ].


openapi_create_message_request_attachments_inner() ->
    openapi_create_message_request_attachments_inner([]).

openapi_create_message_request_attachments_inner(Fields) ->
  Default = [ {'file_id', binary() }
            , {'tools', list(openapi_create_message_request_attachments_inner_tools_inner:openapi_create_message_request_attachments_inner_tools_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

