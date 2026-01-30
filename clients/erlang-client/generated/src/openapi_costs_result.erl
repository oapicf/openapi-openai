-module(openapi_costs_result).

-export([encode/1]).

-export_type([openapi_costs_result/0]).

-type openapi_costs_result() ::
    #{ 'object' := binary(),
       'amount' => openapi_costs_result_amount:openapi_costs_result_amount(),
       'line_item' => binary(),
       'project_id' => binary()
     }.

encode(#{ 'object' := Object,
          'amount' := Amount,
          'line_item' := LineItem,
          'project_id' := ProjectId
        }) ->
    #{ 'object' => Object,
       'amount' => Amount,
       'line_item' => LineItem,
       'project_id' => ProjectId
     }.
