-module(openapi_run_step_object).

-include("openapi.hrl").

-export([openapi_run_step_object/0]).

-export([openapi_run_step_object/1]).

-export_type([openapi_run_step_object/0]).

-type openapi_run_step_object() ::
  [ {'id', binary() }
  | {'object', binary() }
  | {'created_at', integer() }
  | {'assistant_id', binary() }
  | {'thread_id', binary() }
  | {'run_id', binary() }
  | {'type', binary() }
  | {'status', binary() }
  | {'step_details', openapi_run_step_object_step_details:openapi_run_step_object_step_details() }
  | {'last_error', openapi_run_step_object_last_error:openapi_run_step_object_last_error() }
  | {'expired_at', integer() }
  | {'cancelled_at', integer() }
  | {'failed_at', integer() }
  | {'completed_at', integer() }
  | {'metadata', map() }
  | {'usage', openapi_run_step_completion_usage:openapi_run_step_completion_usage() }
  ].


openapi_run_step_object() ->
    openapi_run_step_object([]).

openapi_run_step_object(Fields) ->
  Default = [ {'id', binary() }
            , {'object', elements([<<"thread.run.step">>]) }
            , {'created_at', integer() }
            , {'assistant_id', binary() }
            , {'thread_id', binary() }
            , {'run_id', binary() }
            , {'type', elements([<<"message_creation">>, <<"tool_calls">>]) }
            , {'status', elements([<<"in_progress">>, <<"cancelled">>, <<"failed">>, <<"completed">>, <<"expired">>]) }
            , {'step_details', openapi_run_step_object_step_details:openapi_run_step_object_step_details() }
            , {'last_error', openapi_run_step_object_last_error:openapi_run_step_object_last_error() }
            , {'expired_at', integer() }
            , {'cancelled_at', integer() }
            , {'failed_at', integer() }
            , {'completed_at', integer() }
            , {'metadata', map() }
            , {'usage', openapi_run_step_completion_usage:openapi_run_step_completion_usage() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

