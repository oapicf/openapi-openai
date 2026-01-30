#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_invite_sent_data.h"



static audit_log_invite_sent_data_t *audit_log_invite_sent_data_create_internal(
    char *email,
    char *role
    ) {
    audit_log_invite_sent_data_t *audit_log_invite_sent_data_local_var = malloc(sizeof(audit_log_invite_sent_data_t));
    if (!audit_log_invite_sent_data_local_var) {
        return NULL;
    }
    audit_log_invite_sent_data_local_var->email = email;
    audit_log_invite_sent_data_local_var->role = role;

    audit_log_invite_sent_data_local_var->_library_owned = 1;
    return audit_log_invite_sent_data_local_var;
}

__attribute__((deprecated)) audit_log_invite_sent_data_t *audit_log_invite_sent_data_create(
    char *email,
    char *role
    ) {
    return audit_log_invite_sent_data_create_internal (
        email,
        role
        );
}

void audit_log_invite_sent_data_free(audit_log_invite_sent_data_t *audit_log_invite_sent_data) {
    if(NULL == audit_log_invite_sent_data){
        return ;
    }
    if(audit_log_invite_sent_data->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_invite_sent_data_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log_invite_sent_data->email) {
        free(audit_log_invite_sent_data->email);
        audit_log_invite_sent_data->email = NULL;
    }
    if (audit_log_invite_sent_data->role) {
        free(audit_log_invite_sent_data->role);
        audit_log_invite_sent_data->role = NULL;
    }
    free(audit_log_invite_sent_data);
}

cJSON *audit_log_invite_sent_data_convertToJSON(audit_log_invite_sent_data_t *audit_log_invite_sent_data) {
    cJSON *item = cJSON_CreateObject();

    // audit_log_invite_sent_data->email
    if(audit_log_invite_sent_data->email) {
    if(cJSON_AddStringToObject(item, "email", audit_log_invite_sent_data->email) == NULL) {
    goto fail; //String
    }
    }


    // audit_log_invite_sent_data->role
    if(audit_log_invite_sent_data->role) {
    if(cJSON_AddStringToObject(item, "role", audit_log_invite_sent_data->role) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

audit_log_invite_sent_data_t *audit_log_invite_sent_data_parseFromJSON(cJSON *audit_log_invite_sent_dataJSON){

    audit_log_invite_sent_data_t *audit_log_invite_sent_data_local_var = NULL;

    // audit_log_invite_sent_data->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(audit_log_invite_sent_dataJSON, "email");
    if (cJSON_IsNull(email)) {
        email = NULL;
    }
    if (email) { 
    if(!cJSON_IsString(email) && !cJSON_IsNull(email))
    {
    goto end; //String
    }
    }

    // audit_log_invite_sent_data->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(audit_log_invite_sent_dataJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (role) { 
    if(!cJSON_IsString(role) && !cJSON_IsNull(role))
    {
    goto end; //String
    }
    }


    audit_log_invite_sent_data_local_var = audit_log_invite_sent_data_create_internal (
        email && !cJSON_IsNull(email) ? strdup(email->valuestring) : NULL,
        role && !cJSON_IsNull(role) ? strdup(role->valuestring) : NULL
        );

    return audit_log_invite_sent_data_local_var;
end:
    return NULL;

}
