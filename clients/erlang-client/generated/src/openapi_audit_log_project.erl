-module(openapi_audit_log_project).

-export([encode/1]).

-export_type([openapi_audit_log_project/0]).

-type openapi_audit_log_project() ::
    #{ 'id' => binary(),
       'name' => binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name
        }) ->
    #{ 'id' => Id,
       'name' => Name
     }.
