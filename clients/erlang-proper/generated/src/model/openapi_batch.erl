-module(openapi_batch).

-include("openapi.hrl").

-export([openapi_batch/0]).

-export([openapi_batch/1]).

-export_type([openapi_batch/0]).

-type openapi_batch() ::
  [ {'id', binary() }
  | {'object', binary() }
  | {'endpoint', binary() }
  | {'errors', openapi_batch_errors:openapi_batch_errors() }
  | {'input_file_id', binary() }
  | {'completion_window', binary() }
  | {'status', binary() }
  | {'output_file_id', binary() }
  | {'error_file_id', binary() }
  | {'created_at', integer() }
  | {'in_progress_at', integer() }
  | {'expires_at', integer() }
  | {'finalizing_at', integer() }
  | {'completed_at', integer() }
  | {'failed_at', integer() }
  | {'expired_at', integer() }
  | {'cancelling_at', integer() }
  | {'cancelled_at', integer() }
  | {'request_counts', openapi_batch_request_counts:openapi_batch_request_counts() }
  | {'metadata', map() }
  ].


openapi_batch() ->
    openapi_batch([]).

openapi_batch(Fields) ->
  Default = [ {'id', binary() }
            , {'object', elements([<<"batch">>]) }
            , {'endpoint', binary() }
            , {'errors', openapi_batch_errors:openapi_batch_errors() }
            , {'input_file_id', binary() }
            , {'completion_window', binary() }
            , {'status', elements([<<"validating">>, <<"failed">>, <<"in_progress">>, <<"finalizing">>, <<"completed">>, <<"expired">>, <<"cancelling">>, <<"cancelled">>]) }
            , {'output_file_id', binary() }
            , {'error_file_id', binary() }
            , {'created_at', integer() }
            , {'in_progress_at', integer() }
            , {'expires_at', integer() }
            , {'finalizing_at', integer() }
            , {'completed_at', integer() }
            , {'failed_at', integer() }
            , {'expired_at', integer() }
            , {'cancelling_at', integer() }
            , {'cancelled_at', integer() }
            , {'request_counts', openapi_batch_request_counts:openapi_batch_request_counts() }
            , {'metadata', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

