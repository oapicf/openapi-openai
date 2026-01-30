-module(openapi_create_assistant_request).

-include("openapi.hrl").

-export([openapi_create_assistant_request/0]).

-export([openapi_create_assistant_request/1]).

-export_type([openapi_create_assistant_request/0]).

-type openapi_create_assistant_request() ::
  [ {'model', openapi_create_assistant_request_model:openapi_create_assistant_request_model() }
  | {'name', binary() }
  | {'description', binary() }
  | {'instructions', binary() }
  | {'tools', list(openapi_assistant_object_tools_inner:openapi_assistant_object_tools_inner()) }
  | {'tool_resources', openapi_create_assistant_request_tool_resources:openapi_create_assistant_request_tool_resources() }
  | {'metadata', map() }
  | {'temperature', integer() }
  | {'top_p', integer() }
  | {'response_format', openapi_assistants_api_response_format_option:openapi_assistants_api_response_format_option() }
  ].


openapi_create_assistant_request() ->
    openapi_create_assistant_request([]).

openapi_create_assistant_request(Fields) ->
  Default = [ {'model', openapi_create_assistant_request_model:openapi_create_assistant_request_model() }
            , {'name', binary() }
            , {'description', binary() }
            , {'instructions', binary() }
            , {'tools', list(openapi_assistant_object_tools_inner:openapi_assistant_object_tools_inner()) }
            , {'tool_resources', openapi_create_assistant_request_tool_resources:openapi_create_assistant_request_tool_resources() }
            , {'metadata', map() }
            , {'temperature', integer() }
            , {'top_p', integer() }
            , {'response_format', openapi_assistants_api_response_format_option:openapi_assistants_api_response_format_option() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

