-module(openapi_model).

-export([encode/1]).

-export_type([openapi_model/0]).

-type openapi_model() ::
    #{ 'id' := binary(),
       'object' := binary(),
       'created' := integer(),
       'owned_by' := binary()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'created' := Created,
          'owned_by' := OwnedBy
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'created' => Created,
       'owned_by' => OwnedBy
     }.
