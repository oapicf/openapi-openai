require 'json'


MyApp.add_route('POST', '/v1/organization/admin_api_keys', {
  "resourcePath" => "/Default",
  "summary" => "Create an organization admin API key",
  "nickname" => "admin_api_keys_create",
  "responseClass" => "AdminApiKey",
  "endpoint" => "/organization/admin_api_keys",
  "notes" => "Create a new admin-level API key for the organization.",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "AdminApiKeysCreateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/organization/admin_api_keys/{key_id}', {
  "resourcePath" => "/Default",
  "summary" => "Delete an organization admin API key",
  "nickname" => "admin_api_keys_delete",
  "responseClass" => "admin_api_keys_delete_200_response",
  "endpoint" => "/organization/admin_api_keys/{key_id}",
  "notes" => "Delete the specified admin API key.",
  "parameters" => [
    {
      "name" => "key_id",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/admin_api_keys/{key_id}', {
  "resourcePath" => "/Default",
  "summary" => "Retrieve a single organization API key",
  "nickname" => "admin_api_keys_get",
  "responseClass" => "AdminApiKey",
  "endpoint" => "/organization/admin_api_keys/{key_id}",
  "notes" => "Get details for a specific organization API key by its ID.",
  "parameters" => [
    {
      "name" => "key_id",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/admin_api_keys', {
  "resourcePath" => "/Default",
  "summary" => "List organization API keys",
  "nickname" => "admin_api_keys_list",
  "responseClass" => "ApiKeyList",
  "endpoint" => "/organization/admin_api_keys",
  "notes" => "Retrieve a paginated list of organization admin API keys.",
  "parameters" => [
    {
      "name" => "after",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "[asc, desc]",
      "defaultValue" => "'asc'",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "",
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

