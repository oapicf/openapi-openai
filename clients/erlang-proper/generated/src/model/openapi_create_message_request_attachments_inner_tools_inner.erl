-module(openapi_create_message_request_attachments_inner_tools_inner).

-include("openapi.hrl").

-export([openapi_create_message_request_attachments_inner_tools_inner/0]).

-export([openapi_create_message_request_attachments_inner_tools_inner/1]).

-export_type([openapi_create_message_request_attachments_inner_tools_inner/0]).

-type openapi_create_message_request_attachments_inner_tools_inner() ::
  [ {'type', binary() }
  ].


openapi_create_message_request_attachments_inner_tools_inner() ->
    openapi_create_message_request_attachments_inner_tools_inner([]).

openapi_create_message_request_attachments_inner_tools_inner(Fields) ->
  Default = [ {'type', elements([<<"code_interpreter">>, <<"file_search">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

