require 'json'


MyApp.add_route('DELETE', '/v1/organization/invites/{invite_id}', {
  "resourcePath" => "/Invites",
  "summary" => "Delete an invite. If the invite has already been accepted, it cannot be deleted.",
  "nickname" => "delete_invite",
  "responseClass" => "InviteDeleteResponse",
  "endpoint" => "/organization/invites/{invite_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "invite_id",
      "description" => "The ID of the invite to delete.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/organization/invites', {
  "resourcePath" => "/Invites",
  "summary" => "Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.",
  "nickname" => "invite_user",
  "responseClass" => "Invite",
  "endpoint" => "/organization/invites",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "The invite request payload.",
      "dataType" => "InviteRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/invites', {
  "resourcePath" => "/Invites",
  "summary" => "Returns a list of invites in the organization.",
  "nickname" => "list_invites",
  "responseClass" => "InviteListResponse",
  "endpoint" => "/organization/invites",
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


MyApp.add_route('GET', '/v1/organization/invites/{invite_id}', {
  "resourcePath" => "/Invites",
  "summary" => "Retrieves an invite.",
  "nickname" => "retrieve_invite",
  "responseClass" => "Invite",
  "endpoint" => "/organization/invites/{invite_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "invite_id",
      "description" => "The ID of the invite to retrieve.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

