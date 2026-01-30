require 'json'


MyApp.add_route('GET', '/v1/organization/audit_logs', {
  "resourcePath" => "/AuditLogs",
  "summary" => "List user actions and configuration changes within this organization.",
  "nickname" => "list_audit_logs",
  "responseClass" => "ListAuditLogsResponse",
  "endpoint" => "/organization/audit_logs",
  "notes" => "",
  "parameters" => [
    {
      "name" => "effective_at",
      "description" => "Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range.",
      "dataType" => "ListAuditLogsEffectiveAtParameter",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "project_ids",
      "description" => "Return only events for these projects.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "event_types",
      "description" => "Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).",
      "dataType" => "Array<AuditLogEventType>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "actor_ids",
      "description" => "Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "actor_emails",
      "description" => "Return only events performed by users with these emails.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "resource_ids",
      "description" => "Return only events performed on these targets. For example, a project ID updated.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
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
    {
      "name" => "after",
      "description" => "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "before",
      "description" => "A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

