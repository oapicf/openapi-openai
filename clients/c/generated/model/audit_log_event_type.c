#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_event_type.h"


char* audit_log_event_type_audit_log_event_type_ToString(openai_api_audit_log_event_type__e audit_log_event_type) {
    char *audit_log_event_typeArray[] =  { "NULL", "api_key.created", "api_key.updated", "api_key.deleted", "invite.sent", "invite.accepted", "invite.deleted", "login.succeeded", "login.failed", "logout.succeeded", "logout.failed", "organization.updated", "project.created", "project.updated", "project.archived", "service_account.created", "service_account.updated", "service_account.deleted", "rate_limit.updated", "rate_limit.deleted", "user.added", "user.updated", "user.deleted" };
    return audit_log_event_typeArray[audit_log_event_type];
}

openai_api_audit_log_event_type__e audit_log_event_type_audit_log_event_type_FromString(char* audit_log_event_type) {
    int stringToReturn = 0;
    char *audit_log_event_typeArray[] =  { "NULL", "api_key.created", "api_key.updated", "api_key.deleted", "invite.sent", "invite.accepted", "invite.deleted", "login.succeeded", "login.failed", "logout.succeeded", "logout.failed", "organization.updated", "project.created", "project.updated", "project.archived", "service_account.created", "service_account.updated", "service_account.deleted", "rate_limit.updated", "rate_limit.deleted", "user.added", "user.updated", "user.deleted" };
    size_t sizeofArray = sizeof(audit_log_event_typeArray) / sizeof(audit_log_event_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(audit_log_event_type, audit_log_event_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *audit_log_event_type_convertToJSON(openai_api_audit_log_event_type__e audit_log_event_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "audit_log_event_type", audit_log_event_type_audit_log_event_type_ToString(audit_log_event_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

openai_api_audit_log_event_type__e audit_log_event_type_parseFromJSON(cJSON *audit_log_event_typeJSON) {
    if(!cJSON_IsString(audit_log_event_typeJSON) || (audit_log_event_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return audit_log_event_type_audit_log_event_type_FromString(audit_log_event_typeJSON->valuestring);
}
