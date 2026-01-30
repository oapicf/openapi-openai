-module(openapi_audit_log_login_failed).

-export([encode/1]).

-export_type([openapi_audit_log_login_failed/0]).

-type openapi_audit_log_login_failed() ::
    #{ 'error_code' => binary(),
       'error_message' => binary()
     }.

encode(#{ 'error_code' := ErrorCode,
          'error_message' := ErrorMessage
        }) ->
    #{ 'error_code' => ErrorCode,
       'error_message' => ErrorMessage
     }.
