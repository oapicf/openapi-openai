-module(openapi_create_run_request).

-include("openapi.hrl").

-export([openapi_create_run_request/0]).

-export([openapi_create_run_request/1]).

-export_type([openapi_create_run_request/0]).

-type openapi_create_run_request() ::
  [ {'assistant_id', binary() }
  | {'model', openapi_create_run_request_model:openapi_create_run_request_model() }
  | {'instructions', binary() }
  | {'additional_instructions', binary() }
  | {'additional_messages', list(openapi_create_message_request:openapi_create_message_request()) }
  | {'tools', list(openapi_assistant_object_tools_inner:openapi_assistant_object_tools_inner()) }
  | {'metadata', map() }
  | {'temperature', integer() }
  | {'top_p', integer() }
  | {'stream', boolean() }
  | {'max_prompt_tokens', integer() }
  | {'max_completion_tokens', integer() }
  | {'truncation_strategy', openapi_truncation_object:openapi_truncation_object() }
  | {'tool_choice', openapi_assistants_api_tool_choice_option:openapi_assistants_api_tool_choice_option() }
  | {'parallel_tool_calls', boolean() }
  | {'response_format', openapi_assistants_api_response_format_option:openapi_assistants_api_response_format_option() }
  ].


openapi_create_run_request() ->
    openapi_create_run_request([]).

openapi_create_run_request(Fields) ->
  Default = [ {'assistant_id', binary() }
            , {'model', openapi_create_run_request_model:openapi_create_run_request_model() }
            , {'instructions', binary() }
            , {'additional_instructions', binary() }
            , {'additional_messages', list(openapi_create_message_request:openapi_create_message_request()) }
            , {'tools', list(openapi_assistant_object_tools_inner:openapi_assistant_object_tools_inner()) }
            , {'metadata', map() }
            , {'temperature', integer() }
            , {'top_p', integer() }
            , {'stream', boolean() }
            , {'max_prompt_tokens', integer(256) }
            , {'max_completion_tokens', integer(256) }
            , {'truncation_strategy', openapi_truncation_object:openapi_truncation_object() }
            , {'tool_choice', openapi_assistants_api_tool_choice_option:openapi_assistants_api_tool_choice_option() }
            , {'parallel_tool_calls', boolean() }
            , {'response_format', openapi_assistants_api_response_format_option:openapi_assistants_api_response_format_option() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

