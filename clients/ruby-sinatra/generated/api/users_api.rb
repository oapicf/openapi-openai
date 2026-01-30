require 'json'


MyApp.add_route('DELETE', '/v1/organization/users/{user_id}', {
  "resourcePath" => "/Users",
  "summary" => "Deletes a user from the organization.",
  "nickname" => "delete_user",
  "responseClass" => "UserDeleteResponse",
  "endpoint" => "/organization/users/{user_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "user_id",
      "description" => "The ID of the user.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/users', {
  "resourcePath" => "/Users",
  "summary" => "Lists all of the users in the organization.",
  "nickname" => "list_users",
  "responseClass" => "UserListResponse",
  "endpoint" => "/organization/users",
  "notes" => "",
  "parameters" => [
    {
      "name" => "limit",
      "description" => "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    {
      "name" => "after",
      "description" => "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/organization/users/{user_id}', {
  "resourcePath" => "/Users",
  "summary" => "Modifies a user's role in the organization.",
  "nickname" => "modify_user",
  "responseClass" => "User",
  "endpoint" => "/organization/users/{user_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "user_id",
      "description" => "The ID of the user.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;.",
      "dataType" => "UserRoleUpdateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/users/{user_id}', {
  "resourcePath" => "/Users",
  "summary" => "Retrieves a user by their identifier.",
  "nickname" => "retrieve_user",
  "responseClass" => "User",
  "endpoint" => "/organization/users/{user_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "user_id",
      "description" => "The ID of the user.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

