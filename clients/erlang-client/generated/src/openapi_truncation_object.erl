-module(openapi_truncation_object).

-export([encode/1]).

-export_type([openapi_truncation_object/0]).

-type openapi_truncation_object() ::
    #{ 'type' => binary(),
       'last_messages' => integer()
     }.

encode(#{ 'type' := Type,
          'last_messages' := LastMessages
        }) ->
    #{ 'type' => Type,
       'last_messages' => LastMessages
     }.
