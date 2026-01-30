#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_actor_user.h"



static audit_log_actor_user_t *audit_log_actor_user_create_internal(
    char *id,
    char *email
    ) {
    audit_log_actor_user_t *audit_log_actor_user_local_var = malloc(sizeof(audit_log_actor_user_t));
    if (!audit_log_actor_user_local_var) {
        return NULL;
    }
    audit_log_actor_user_local_var->id = id;
    audit_log_actor_user_local_var->email = email;

    audit_log_actor_user_local_var->_library_owned = 1;
    return audit_log_actor_user_local_var;
}

__attribute__((deprecated)) audit_log_actor_user_t *audit_log_actor_user_create(
    char *id,
    char *email
    ) {
    return audit_log_actor_user_create_internal (
        id,
        email
        );
}

void audit_log_actor_user_free(audit_log_actor_user_t *audit_log_actor_user) {
    if(NULL == audit_log_actor_user){
        return ;
    }
    if(audit_log_actor_user->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_actor_user_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log_actor_user->id) {
        free(audit_log_actor_user->id);
        audit_log_actor_user->id = NULL;
    }
    if (audit_log_actor_user->email) {
        free(audit_log_actor_user->email);
        audit_log_actor_user->email = NULL;
    }
    free(audit_log_actor_user);
}

cJSON *audit_log_actor_user_convertToJSON(audit_log_actor_user_t *audit_log_actor_user) {
    cJSON *item = cJSON_CreateObject();

    // audit_log_actor_user->id
    if(audit_log_actor_user->id) {
    if(cJSON_AddStringToObject(item, "id", audit_log_actor_user->id) == NULL) {
    goto fail; //String
    }
    }


    // audit_log_actor_user->email
    if(audit_log_actor_user->email) {
    if(cJSON_AddStringToObject(item, "email", audit_log_actor_user->email) == NULL) {
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

audit_log_actor_user_t *audit_log_actor_user_parseFromJSON(cJSON *audit_log_actor_userJSON){

    audit_log_actor_user_t *audit_log_actor_user_local_var = NULL;

    // audit_log_actor_user->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(audit_log_actor_userJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // audit_log_actor_user->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(audit_log_actor_userJSON, "email");
    if (cJSON_IsNull(email)) {
        email = NULL;
    }
    if (email) { 
    if(!cJSON_IsString(email) && !cJSON_IsNull(email))
    {
    goto end; //String
    }
    }


    audit_log_actor_user_local_var = audit_log_actor_user_create_internal (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        email && !cJSON_IsNull(email) ? strdup(email->valuestring) : NULL
        );

    return audit_log_actor_user_local_var;
end:
    return NULL;

}
