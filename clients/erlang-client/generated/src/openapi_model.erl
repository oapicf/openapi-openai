-module(openapi_model).

-export([encode/1]).

-export_type([openapi_model/0]).

-type openapi_model() ::
    #{ 'id' := binary(),
       'created' := integer(),
       'object' := binary(),
       'owned_by' := binary()
     }.

encode(#{ 'id' := Id,
          'created' := Created,
          'object' := Object,
          'owned_by' := OwnedBy
        }) ->
    #{ 'id' => Id,
       'created' => Created,
       'object' => Object,
       'owned_by' => OwnedBy
     }.
