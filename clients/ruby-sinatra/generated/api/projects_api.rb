require 'json'


MyApp.add_route('POST', '/v1/organization/projects/{project_id}/archive', {
  "resourcePath" => "/Projects",
  "summary" => "Archives a project in the organization. Archived projects cannot be used or updated.",
  "nickname" => "archive_project",
  "responseClass" => "Project",
  "endpoint" => "/organization/projects/{project_id}/archive",
  "notes" => "",
  "parameters" => [
    {
      "name" => "project_id",
      "description" => "The ID of the project.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/organization/projects', {
  "resourcePath" => "/Projects",
  "summary" => "Create a new project in the organization. Projects can be created and archived, but cannot be deleted.",
  "nickname" => "create_project",
  "responseClass" => "Project",
  "endpoint" => "/organization/projects",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "The project create request payload.",
      "dataType" => "ProjectCreateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/organization/projects/{project_id}/service_accounts', {
  "resourcePath" => "/Projects",
  "summary" => "Creates a new service account in the project. This also returns an unredacted API key for the service account.",
  "nickname" => "create_project_service_account",
  "responseClass" => "ProjectServiceAccountCreateResponse",
  "endpoint" => "/organization/projects/{project_id}/service_accounts",
  "notes" => "",
  "parameters" => [
    {
      "name" => "project_id",
      "description" => "The ID of the project.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "The project service account create request payload.",
      "dataType" => "ProjectServiceAccountCreateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/organization/projects/{project_id}/users', {
  "resourcePath" => "/Projects",
  "summary" => "Adds a user to the project. Users must already be members of the organization to be added to a project.",
  "nickname" => "create_project_user",
  "responseClass" => "ProjectUser",
  "endpoint" => "/organization/projects/{project_id}/users",
  "notes" => "",
  "parameters" => [
    {
      "name" => "project_id",
      "description" => "The ID of the project.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "The project user create request payload.",
      "dataType" => "ProjectUserCreateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/organization/projects/{project_id}/api_keys/{key_id}', {
  "resourcePath" => "/Projects",
  "summary" => "Deletes an API key from the project.",
  "nickname" => "delete_project_api_key",
  "responseClass" => "ProjectApiKeyDeleteResponse",
  "endpoint" => "/organization/projects/{project_id}/api_keys/{key_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "project_id",
      "description" => "The ID of the project.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "key_id",
      "description" => "The ID of the API key.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/organization/projects/{project_id}/service_accounts/{service_account_id}', {
  "resourcePath" => "/Projects",
  "summary" => "Deletes a service account from the project.",
  "nickname" => "delete_project_service_account",
  "responseClass" => "ProjectServiceAccountDeleteResponse",
  "endpoint" => "/organization/projects/{project_id}/service_accounts/{service_account_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "project_id",
      "description" => "The ID of the project.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "service_account_id",
      "description" => "The ID of the service account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/organization/projects/{project_id}/users/{user_id}', {
  "resourcePath" => "/Projects",
  "summary" => "Deletes a user from the project.",
  "nickname" => "delete_project_user",
  "responseClass" => "ProjectUserDeleteResponse",
  "endpoint" => "/organization/projects/{project_id}/users/{user_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "project_id",
      "description" => "The ID of the project.",
      "dataType" => "String",
      "paramType" => "path",
    },
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


MyApp.add_route('GET', '/v1/organization/projects/{project_id}/api_keys', {
  "resourcePath" => "/Projects",
  "summary" => "Returns a list of API keys in the project.",
  "nickname" => "list_project_api_keys",
  "responseClass" => "ProjectApiKeyListResponse",
  "endpoint" => "/organization/projects/{project_id}/api_keys",
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
    {
      "name" => "project_id",
      "description" => "The ID of the project.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/projects/{project_id}/rate_limits', {
  "resourcePath" => "/Projects",
  "summary" => "Returns the rate limits per model for a project.",
  "nickname" => "list_project_rate_limits",
  "responseClass" => "ProjectRateLimitListResponse",
  "endpoint" => "/organization/projects/{project_id}/rate_limits",
  "notes" => "",
  "parameters" => [
    {
      "name" => "limit",
      "description" => "A limit on the number of objects to be returned. The default is 100. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "100",
      "paramType" => "query",
    },
    {
      "name" => "after",
      "description" => "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "before",
      "description" => "A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "project_id",
      "description" => "The ID of the project.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/projects/{project_id}/service_accounts', {
  "resourcePath" => "/Projects",
  "summary" => "Returns a list of service accounts in the project.",
  "nickname" => "list_project_service_accounts",
  "responseClass" => "ProjectServiceAccountListResponse",
  "endpoint" => "/organization/projects/{project_id}/service_accounts",
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
    {
      "name" => "project_id",
      "description" => "The ID of the project.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/projects/{project_id}/users', {
  "resourcePath" => "/Projects",
  "summary" => "Returns a list of users in the project.",
  "nickname" => "list_project_users",
  "responseClass" => "ProjectUserListResponse",
  "endpoint" => "/organization/projects/{project_id}/users",
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
    {
      "name" => "project_id",
      "description" => "The ID of the project.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/projects', {
  "resourcePath" => "/Projects",
  "summary" => "Returns a list of projects.",
  "nickname" => "list_projects",
  "responseClass" => "ProjectListResponse",
  "endpoint" => "/organization/projects",
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
    {
      "name" => "include_archived",
      "description" => "If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/organization/projects/{project_id}', {
  "resourcePath" => "/Projects",
  "summary" => "Modifies a project in the organization.",
  "nickname" => "modify_project",
  "responseClass" => "Project",
  "endpoint" => "/organization/projects/{project_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "project_id",
      "description" => "The ID of the project.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "The project update request payload.",
      "dataType" => "ProjectUpdateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/organization/projects/{project_id}/users/{user_id}', {
  "resourcePath" => "/Projects",
  "summary" => "Modifies a user's role in the project.",
  "nickname" => "modify_project_user",
  "responseClass" => "ProjectUser",
  "endpoint" => "/organization/projects/{project_id}/users/{user_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "project_id",
      "description" => "The ID of the project.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "user_id",
      "description" => "The ID of the user.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "The project user update request payload.",
      "dataType" => "ProjectUserUpdateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/projects/{project_id}', {
  "resourcePath" => "/Projects",
  "summary" => "Retrieves a project.",
  "nickname" => "retrieve_project",
  "responseClass" => "Project",
  "endpoint" => "/organization/projects/{project_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "project_id",
      "description" => "The ID of the project.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/projects/{project_id}/api_keys/{key_id}', {
  "resourcePath" => "/Projects",
  "summary" => "Retrieves an API key in the project.",
  "nickname" => "retrieve_project_api_key",
  "responseClass" => "ProjectApiKey",
  "endpoint" => "/organization/projects/{project_id}/api_keys/{key_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "project_id",
      "description" => "The ID of the project.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "key_id",
      "description" => "The ID of the API key.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/projects/{project_id}/service_accounts/{service_account_id}', {
  "resourcePath" => "/Projects",
  "summary" => "Retrieves a service account in the project.",
  "nickname" => "retrieve_project_service_account",
  "responseClass" => "ProjectServiceAccount",
  "endpoint" => "/organization/projects/{project_id}/service_accounts/{service_account_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "project_id",
      "description" => "The ID of the project.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "service_account_id",
      "description" => "The ID of the service account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/projects/{project_id}/users/{user_id}', {
  "resourcePath" => "/Projects",
  "summary" => "Retrieves a user in the project.",
  "nickname" => "retrieve_project_user",
  "responseClass" => "ProjectUser",
  "endpoint" => "/organization/projects/{project_id}/users/{user_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "project_id",
      "description" => "The ID of the project.",
      "dataType" => "String",
      "paramType" => "path",
    },
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


MyApp.add_route('POST', '/v1/organization/projects/{project_id}/rate_limits/{rate_limit_id}', {
  "resourcePath" => "/Projects",
  "summary" => "Updates a project rate limit.",
  "nickname" => "update_project_rate_limits",
  "responseClass" => "ProjectRateLimit",
  "endpoint" => "/organization/projects/{project_id}/rate_limits/{rate_limit_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "project_id",
      "description" => "The ID of the project.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "rate_limit_id",
      "description" => "The ID of the rate limit.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "The project rate limit update request payload.",
      "dataType" => "ProjectRateLimitUpdateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

