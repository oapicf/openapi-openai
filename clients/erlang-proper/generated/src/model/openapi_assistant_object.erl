-module(openapi_assistant_object).

-include("openapi.hrl").

-export([openapi_assistant_object/0]).

-export([openapi_assistant_object/1]).

-export_type([openapi_assistant_object/0]).

-type openapi_assistant_object() ::
  [ {'id', binary() }
  | {'object', binary() }
  | {'created_at', integer() }
  | {'name', binary() }
  | {'description', binary() }
  | {'model', binary() }
  | {'instructions', binary() }
  | {'tools', list(openapi_assistant_object_tools_inner:openapi_assistant_object_tools_inner()) }
  | {'tool_resources', openapi_assistant_object_tool_resources:openapi_assistant_object_tool_resources() }
  | {'metadata', map() }
  | {'temperature', integer() }
  | {'top_p', integer() }
  | {'response_format', openapi_assistants_api_response_format_option:openapi_assistants_api_response_format_option() }
  ].


openapi_assistant_object() ->
    openapi_assistant_object([]).

openapi_assistant_object(Fields) ->
  Default = [ {'id', binary() }
            , {'object', elements([<<"assistant">>]) }
            , {'created_at', integer() }
            , {'name', binary() }
            , {'description', binary() }
            , {'model', binary() }
            , {'instructions', binary() }
            , {'tools', list(openapi_assistant_object_tools_inner:openapi_assistant_object_tools_inner()) }
            , {'tool_resources', openapi_assistant_object_tool_resources:openapi_assistant_object_tool_resources() }
            , {'metadata', map() }
            , {'temperature', integer() }
            , {'top_p', integer() }
            , {'response_format', openapi_assistants_api_response_format_option:openapi_assistants_api_response_format_option() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

