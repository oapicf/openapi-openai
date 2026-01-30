-module(openapi_audit_log_invite_sent_data).

-export([encode/1]).

-export_type([openapi_audit_log_invite_sent_data/0]).

-type openapi_audit_log_invite_sent_data() ::
    #{ 'email' => binary(),
       'role' => binary()
     }.

encode(#{ 'email' := Email,
          'role' := Role
        }) ->
    #{ 'email' => Email,
       'role' => Role
     }.
