#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_actor_session.h"



static audit_log_actor_session_t *audit_log_actor_session_create_internal(
    audit_log_actor_user_t *user,
    char *ip_address
    ) {
    audit_log_actor_session_t *audit_log_actor_session_local_var = malloc(sizeof(audit_log_actor_session_t));
    if (!audit_log_actor_session_local_var) {
        return NULL;
    }
    audit_log_actor_session_local_var->user = user;
    audit_log_actor_session_local_var->ip_address = ip_address;

    audit_log_actor_session_local_var->_library_owned = 1;
    return audit_log_actor_session_local_var;
}

__attribute__((deprecated)) audit_log_actor_session_t *audit_log_actor_session_create(
    audit_log_actor_user_t *user,
    char *ip_address
    ) {
    return audit_log_actor_session_create_internal (
        user,
        ip_address
        );
}

void audit_log_actor_session_free(audit_log_actor_session_t *audit_log_actor_session) {
    if(NULL == audit_log_actor_session){
        return ;
    }
    if(audit_log_actor_session->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_actor_session_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log_actor_session->user) {
        audit_log_actor_user_free(audit_log_actor_session->user);
        audit_log_actor_session->user = NULL;
    }
    if (audit_log_actor_session->ip_address) {
        free(audit_log_actor_session->ip_address);
        audit_log_actor_session->ip_address = NULL;
    }
    free(audit_log_actor_session);
}

cJSON *audit_log_actor_session_convertToJSON(audit_log_actor_session_t *audit_log_actor_session) {
    cJSON *item = cJSON_CreateObject();

    // audit_log_actor_session->user
    if(audit_log_actor_session->user) {
    cJSON *user_local_JSON = audit_log_actor_user_convertToJSON(audit_log_actor_session->user);
    if(user_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user", user_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log_actor_session->ip_address
    if(audit_log_actor_session->ip_address) {
    if(cJSON_AddStringToObject(item, "ip_address", audit_log_actor_session->ip_address) == NULL) {
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

audit_log_actor_session_t *audit_log_actor_session_parseFromJSON(cJSON *audit_log_actor_sessionJSON){

    audit_log_actor_session_t *audit_log_actor_session_local_var = NULL;

    // define the local variable for audit_log_actor_session->user
    audit_log_actor_user_t *user_local_nonprim = NULL;

    // audit_log_actor_session->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(audit_log_actor_sessionJSON, "user");
    if (cJSON_IsNull(user)) {
        user = NULL;
    }
    if (user) { 
    user_local_nonprim = audit_log_actor_user_parseFromJSON(user); //nonprimitive
    }

    // audit_log_actor_session->ip_address
    cJSON *ip_address = cJSON_GetObjectItemCaseSensitive(audit_log_actor_sessionJSON, "ip_address");
    if (cJSON_IsNull(ip_address)) {
        ip_address = NULL;
    }
    if (ip_address) { 
    if(!cJSON_IsString(ip_address) && !cJSON_IsNull(ip_address))
    {
    goto end; //String
    }
    }


    audit_log_actor_session_local_var = audit_log_actor_session_create_internal (
        user ? user_local_nonprim : NULL,
        ip_address && !cJSON_IsNull(ip_address) ? strdup(ip_address->valuestring) : NULL
        );

    return audit_log_actor_session_local_var;
end:
    if (user_local_nonprim) {
        audit_log_actor_user_free(user_local_nonprim);
        user_local_nonprim = NULL;
    }
    return NULL;

}
