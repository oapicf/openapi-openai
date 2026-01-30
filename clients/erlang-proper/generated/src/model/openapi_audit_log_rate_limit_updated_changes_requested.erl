-module(openapi_audit_log_rate_limit_updated_changes_requested).

-include("openapi.hrl").

-export([openapi_audit_log_rate_limit_updated_changes_requested/0]).

-export([openapi_audit_log_rate_limit_updated_changes_requested/1]).

-export_type([openapi_audit_log_rate_limit_updated_changes_requested/0]).

-type openapi_audit_log_rate_limit_updated_changes_requested() ::
  [ {'max_requests_per_1_minute', integer() }
  | {'max_tokens_per_1_minute', integer() }
  | {'max_images_per_1_minute', integer() }
  | {'max_audio_megabytes_per_1_minute', integer() }
  | {'max_requests_per_1_day', integer() }
  | {'batch_1_day_max_input_tokens', integer() }
  ].


openapi_audit_log_rate_limit_updated_changes_requested() ->
    openapi_audit_log_rate_limit_updated_changes_requested([]).

openapi_audit_log_rate_limit_updated_changes_requested(Fields) ->
  Default = [ {'max_requests_per_1_minute', integer() }
            , {'max_tokens_per_1_minute', integer() }
            , {'max_images_per_1_minute', integer() }
            , {'max_audio_megabytes_per_1_minute', integer() }
            , {'max_requests_per_1_day', integer() }
            , {'batch_1_day_max_input_tokens', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

