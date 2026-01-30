/*
 * audit_log_event_type.h
 *
 * The event type.
 */

#ifndef _audit_log_event_type_H_
#define _audit_log_event_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_event_type_t audit_log_event_type_t;


// Enum  for audit_log_event_type

typedef enum { openai_api_audit_log_event_type__NULL = 0, openai_api_audit_log_event_type__api_key.created, openai_api_audit_log_event_type__api_key.updated, openai_api_audit_log_event_type__api_key.deleted, openai_api_audit_log_event_type__invite.sent, openai_api_audit_log_event_type__invite.accepted, openai_api_audit_log_event_type__invite.deleted, openai_api_audit_log_event_type__login.succeeded, openai_api_audit_log_event_type__login.failed, openai_api_audit_log_event_type__logout.succeeded, openai_api_audit_log_event_type__logout.failed, openai_api_audit_log_event_type__organization.updated, openai_api_audit_log_event_type__project.created, openai_api_audit_log_event_type__project.updated, openai_api_audit_log_event_type__project.archived, openai_api_audit_log_event_type__service_account.created, openai_api_audit_log_event_type__service_account.updated, openai_api_audit_log_event_type__service_account.deleted, openai_api_audit_log_event_type__rate_limit.updated, openai_api_audit_log_event_type__rate_limit.deleted, openai_api_audit_log_event_type__user.added, openai_api_audit_log_event_type__user.updated, openai_api_audit_log_event_type__user.deleted } openai_api_audit_log_event_type__e;

char* audit_log_event_type_audit_log_event_type_ToString(openai_api_audit_log_event_type__e audit_log_event_type);

openai_api_audit_log_event_type__e audit_log_event_type_audit_log_event_type_FromString(char* audit_log_event_type);

cJSON *audit_log_event_type_convertToJSON(openai_api_audit_log_event_type__e audit_log_event_type);

openai_api_audit_log_event_type__e audit_log_event_type_parseFromJSON(cJSON *audit_log_event_typeJSON);

#endif /* _audit_log_event_type_H_ */

