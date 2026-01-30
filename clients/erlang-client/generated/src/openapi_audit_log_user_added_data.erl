-module(openapi_audit_log_user_added_data).

-export([encode/1]).

-export_type([openapi_audit_log_user_added_data/0]).

-type openapi_audit_log_user_added_data() ::
    #{ 'role' => binary()
     }.

encode(#{ 'role' := Role
        }) ->
    #{ 'role' => Role
     }.
