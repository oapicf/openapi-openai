-module(openapi_audit_log_api_key_created_data).

-export([encode/1]).

-export_type([openapi_audit_log_api_key_created_data/0]).

-type openapi_audit_log_api_key_created_data() ::
    #{ 'scopes' => list()
     }.

encode(#{ 'scopes' := Scopes
        }) ->
    #{ 'scopes' => Scopes
     }.
