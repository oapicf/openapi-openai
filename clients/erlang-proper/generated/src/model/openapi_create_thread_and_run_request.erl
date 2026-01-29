-module(openapi_create_thread_and_run_request).

-include("openapi.hrl").

-export([openapi_create_thread_and_run_request/0]).

-export([openapi_create_thread_and_run_request/1]).

-export_type([openapi_create_thread_and_run_request/0]).

-type openapi_create_thread_and_run_request() ::
  [ {'assistant_id', binary() }
  | {'thread', openapi_create_thread_request:openapi_create_thread_request() }
  | {'model', openapi_create_run_request_model:openapi_create_run_request_model() }
  | {'instructions', binary() }
  | {'tools', list(openapi_create_thread_and_run_request_tools_inner:openapi_create_thread_and_run_request_tools_inner()) }
  | {'metadata', map() }
  | {'temperature', integer() }
  | {'stream', boolean() }
  | {'max_prompt_tokens', integer() }
  | {'max_completion_tokens', integer() }
  | {'truncation_strategy', openapi_truncation_object:openapi_truncation_object() }
  | {'tool_choice', openapi_assistants_api_tool_choice_option:openapi_assistants_api_tool_choice_option() }
  | {'response_format', openapi_assistants_api_response_format_option:openapi_assistants_api_response_format_option() }
  ].


openapi_create_thread_and_run_request() ->
    openapi_create_thread_and_run_request([]).

openapi_create_thread_and_run_request(Fields) ->
  Default = [ {'assistant_id', binary() }
            , {'thread', openapi_create_thread_request:openapi_create_thread_request() }
            , {'model', openapi_create_run_request_model:openapi_create_run_request_model() }
            , {'instructions', binary() }
            , {'tools', list(openapi_create_thread_and_run_request_tools_inner:openapi_create_thread_and_run_request_tools_inner()) }
            , {'metadata', map() }
            , {'temperature', integer() }
            , {'stream', boolean() }
            , {'max_prompt_tokens', integer(256) }
            , {'max_completion_tokens', integer(256) }
            , {'truncation_strategy', openapi_truncation_object:openapi_truncation_object() }
            , {'tool_choice', openapi_assistants_api_tool_choice_option:openapi_assistants_api_tool_choice_option() }
            , {'response_format', openapi_assistants_api_response_format_option:openapi_assistants_api_response_format_option() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

