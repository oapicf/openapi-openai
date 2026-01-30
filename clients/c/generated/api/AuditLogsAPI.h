#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/audit_log_event_type.h"
#include "../model/list_audit_logs_effective_at_parameter.h"
#include "../model/list_audit_logs_response.h"

// Enum EVENTTYPES for AuditLogsAPI_listAuditLogs
typedef enum  { openai_api_listAuditLogs_EVENTTYPES_NULL = 0, openai_api_listAuditLogs_EVENTTYPES_api_key.created, openai_api_listAuditLogs_EVENTTYPES_api_key.updated, openai_api_listAuditLogs_EVENTTYPES_api_key.deleted, openai_api_listAuditLogs_EVENTTYPES_invite.sent, openai_api_listAuditLogs_EVENTTYPES_invite.accepted, openai_api_listAuditLogs_EVENTTYPES_invite.deleted, openai_api_listAuditLogs_EVENTTYPES_login.succeeded, openai_api_listAuditLogs_EVENTTYPES_login.failed, openai_api_listAuditLogs_EVENTTYPES_logout.succeeded, openai_api_listAuditLogs_EVENTTYPES_logout.failed, openai_api_listAuditLogs_EVENTTYPES_organization.updated, openai_api_listAuditLogs_EVENTTYPES_project.created, openai_api_listAuditLogs_EVENTTYPES_project.updated, openai_api_listAuditLogs_EVENTTYPES_project.archived, openai_api_listAuditLogs_EVENTTYPES_service_account.created, openai_api_listAuditLogs_EVENTTYPES_service_account.updated, openai_api_listAuditLogs_EVENTTYPES_service_account.deleted, openai_api_listAuditLogs_EVENTTYPES_rate_limit.updated, openai_api_listAuditLogs_EVENTTYPES_rate_limit.deleted, openai_api_listAuditLogs_EVENTTYPES_user.added, openai_api_listAuditLogs_EVENTTYPES_user.updated, openai_api_listAuditLogs_EVENTTYPES_user.deleted } openai_api_listAuditLogs_event_types[]_e;


// List user actions and configuration changes within this organization.
//
list_audit_logs_response_t*
AuditLogsAPI_listAuditLogs(apiClient_t *apiClient, list_audit_logs_effective_at_parameter_t *effective_at, list_t *project_ids[], list_t *event_types[], list_t *actor_ids[], list_t *actor_emails[], list_t *resource_ids[], int *limit, char *after, char *before);


