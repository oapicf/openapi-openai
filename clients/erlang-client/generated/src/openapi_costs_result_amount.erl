-module(openapi_costs_result_amount).

-export([encode/1]).

-export_type([openapi_costs_result_amount/0]).

-type openapi_costs_result_amount() ::
    #{ 'value' => integer(),
       'currency' => binary()
     }.

encode(#{ 'value' := Value,
          'currency' := Currency
        }) ->
    #{ 'value' => Value,
       'currency' => Currency
     }.
