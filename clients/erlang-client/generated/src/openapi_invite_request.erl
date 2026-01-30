-module(openapi_invite_request).

-export([encode/1]).

-export_type([openapi_invite_request/0]).

-type openapi_invite_request() ::
    #{ 'email' := binary(),
       'role' := binary(),
       'projects' => list()
     }.

encode(#{ 'email' := Email,
          'role' := Role,
          'projects' := Projects
        }) ->
    #{ 'email' => Email,
       'role' => Role,
       'projects' => Projects
     }.
