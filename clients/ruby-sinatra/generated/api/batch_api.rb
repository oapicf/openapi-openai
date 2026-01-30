require 'json'


MyApp.add_route('POST', '/v1/batches/{batch_id}/cancel', {
  "resourcePath" => "/Batch",
  "summary" => "Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.",
  "nickname" => "cancel_batch",
  "responseClass" => "Batch",
  "endpoint" => "/batches/{batch_id}/cancel",
  "notes" => "",
  "parameters" => [
    {
      "name" => "batch_id",
      "description" => "The ID of the batch to cancel.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/batches', {
  "resourcePath" => "/Batch",
  "summary" => "Creates and executes a batch from an uploaded file of requests",
  "nickname" => "create_batch",
  "responseClass" => "Batch",
  "endpoint" => "/batches",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateBatchRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/batches', {
  "resourcePath" => "/Batch",
  "summary" => "List your organization's batches.",
  "nickname" => "list_batches",
  "responseClass" => "ListBatchesResponse",
  "endpoint" => "/batches",
  "notes" => "",
  "parameters" => [
    {
      "name" => "after",
      "description" => "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/batches/{batch_id}', {
  "resourcePath" => "/Batch",
  "summary" => "Retrieves a batch.",
  "nickname" => "retrieve_batch",
  "responseClass" => "Batch",
  "endpoint" => "/batches/{batch_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "batch_id",
      "description" => "The ID of the batch to retrieve.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

