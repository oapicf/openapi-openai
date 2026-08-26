#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_actor_service_account.h"



static audit_log_actor_service_account_t *audit_log_actor_service_account_create_internal(
    char *id
    ) {
    audit_log_actor_service_account_t *audit_log_actor_service_account_local_var = malloc(sizeof(audit_log_actor_service_account_t));
    if (!audit_log_actor_service_account_local_var) {
        return NULL;
    }
    memset(audit_log_actor_service_account_local_var, 0, sizeof(audit_log_actor_service_account_t));
    audit_log_actor_service_account_local_var->_library_owned = 1;
    audit_log_actor_service_account_local_var->id = id;
    return audit_log_actor_service_account_local_var;
}

__attribute__((deprecated)) audit_log_actor_service_account_t *audit_log_actor_service_account_create(
    char *id
    ) {
    audit_log_actor_service_account_t *result = audit_log_actor_service_account_create_internal (
        id
        );
    if (!result) {
    }
    return result;
}

void audit_log_actor_service_account_free(audit_log_actor_service_account_t *audit_log_actor_service_account) {
    if(NULL == audit_log_actor_service_account){
        return ;
    }
    if(audit_log_actor_service_account->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_actor_service_account_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log_actor_service_account->id) {
        free(audit_log_actor_service_account->id);
        audit_log_actor_service_account->id = NULL;
    }
    free(audit_log_actor_service_account);
}

cJSON *audit_log_actor_service_account_convertToJSON(audit_log_actor_service_account_t *audit_log_actor_service_account) {
    cJSON *item = cJSON_CreateObject();

    // audit_log_actor_service_account->id
    if(audit_log_actor_service_account->id) {
    if(cJSON_AddStringToObject(item, "id", audit_log_actor_service_account->id) == NULL) {
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

audit_log_actor_service_account_t *audit_log_actor_service_account_parseFromJSON(cJSON *audit_log_actor_service_accountJSON){

    audit_log_actor_service_account_t *audit_log_actor_service_account_local_var = NULL;

    char *id_local_str = NULL;

    // audit_log_actor_service_account->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(audit_log_actor_service_accountJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);

    audit_log_actor_service_account_local_var = audit_log_actor_service_account_create_internal (
        id_local_str
        );

    if (!audit_log_actor_service_account_local_var) {
        goto end;
    }

    return audit_log_actor_service_account_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    return NULL;

}
