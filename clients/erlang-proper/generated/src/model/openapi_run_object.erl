-module(openapi_run_object).

-include("openapi.hrl").

-export([openapi_run_object/0]).

-export([openapi_run_object/1]).

-export_type([openapi_run_object/0]).

-type openapi_run_object() ::
  [ {'id', binary() }
  | {'object', binary() }
  | {'created_at', integer() }
  | {'thread_id', binary() }
  | {'assistant_id', binary() }
  | {'status', binary() }
  | {'required_action', openapi_run_object_required_action:openapi_run_object_required_action() }
  | {'last_error', openapi_run_object_last_error:openapi_run_object_last_error() }
  | {'expires_at', integer() }
  | {'started_at', integer() }
  | {'cancelled_at', integer() }
  | {'failed_at', integer() }
  | {'completed_at', integer() }
  | {'incomplete_details', openapi_run_object_incomplete_details:openapi_run_object_incomplete_details() }
  | {'model', binary() }
  | {'instructions', binary() }
  | {'tools', list(openapi_assistant_object_tools_inner:openapi_assistant_object_tools_inner()) }
  | {'file_ids', list(binary()) }
  | {'metadata', map() }
  | {'usage', openapi_run_completion_usage:openapi_run_completion_usage() }
  | {'temperature', integer() }
  | {'max_prompt_tokens', integer() }
  | {'max_completion_tokens', integer() }
  | {'truncation_strategy', openapi_truncation_object:openapi_truncation_object() }
  | {'tool_choice', openapi_assistants_api_tool_choice_option:openapi_assistants_api_tool_choice_option() }
  | {'response_format', openapi_assistants_api_response_format_option:openapi_assistants_api_response_format_option() }
  ].


openapi_run_object() ->
    openapi_run_object([]).

openapi_run_object(Fields) ->
  Default = [ {'id', binary() }
            , {'object', elements([<<"thread.run">>]) }
            , {'created_at', integer() }
            , {'thread_id', binary() }
            , {'assistant_id', binary() }
            , {'status', elements([<<"queued">>, <<"in_progress">>, <<"requires_action">>, <<"cancelling">>, <<"cancelled">>, <<"failed">>, <<"completed">>, <<"expired">>]) }
            , {'required_action', openapi_run_object_required_action:openapi_run_object_required_action() }
            , {'last_error', openapi_run_object_last_error:openapi_run_object_last_error() }
            , {'expires_at', integer() }
            , {'started_at', integer() }
            , {'cancelled_at', integer() }
            , {'failed_at', integer() }
            , {'completed_at', integer() }
            , {'incomplete_details', openapi_run_object_incomplete_details:openapi_run_object_incomplete_details() }
            , {'model', binary() }
            , {'instructions', binary() }
            , {'tools', list(openapi_assistant_object_tools_inner:openapi_assistant_object_tools_inner()) }
            , {'file_ids', list(binary()) }
            , {'metadata', map() }
            , {'usage', openapi_run_completion_usage:openapi_run_completion_usage() }
            , {'temperature', integer() }
            , {'max_prompt_tokens', integer(256) }
            , {'max_completion_tokens', integer(256) }
            , {'truncation_strategy', openapi_truncation_object:openapi_truncation_object() }
            , {'tool_choice', openapi_assistants_api_tool_choice_option:openapi_assistants_api_tool_choice_option() }
            , {'response_format', openapi_assistants_api_response_format_option:openapi_assistants_api_response_format_option() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

