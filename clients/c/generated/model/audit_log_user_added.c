#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_user_added.h"



static audit_log_user_added_t *audit_log_user_added_create_internal(
    char *id,
    audit_log_user_added_data_t *data
    ) {
    audit_log_user_added_t *audit_log_user_added_local_var = malloc(sizeof(audit_log_user_added_t));
    if (!audit_log_user_added_local_var) {
        return NULL;
    }
    audit_log_user_added_local_var->id = id;
    audit_log_user_added_local_var->data = data;

    audit_log_user_added_local_var->_library_owned = 1;
    return audit_log_user_added_local_var;
}

__attribute__((deprecated)) audit_log_user_added_t *audit_log_user_added_create(
    char *id,
    audit_log_user_added_data_t *data
    ) {
    return audit_log_user_added_create_internal (
        id,
        data
        );
}

void audit_log_user_added_free(audit_log_user_added_t *audit_log_user_added) {
    if(NULL == audit_log_user_added){
        return ;
    }
    if(audit_log_user_added->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_user_added_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log_user_added->id) {
        free(audit_log_user_added->id);
        audit_log_user_added->id = NULL;
    }
    if (audit_log_user_added->data) {
        audit_log_user_added_data_free(audit_log_user_added->data);
        audit_log_user_added->data = NULL;
    }
    free(audit_log_user_added);
}

cJSON *audit_log_user_added_convertToJSON(audit_log_user_added_t *audit_log_user_added) {
    cJSON *item = cJSON_CreateObject();

    // audit_log_user_added->id
    if(audit_log_user_added->id) {
    if(cJSON_AddStringToObject(item, "id", audit_log_user_added->id) == NULL) {
    goto fail; //String
    }
    }


    // audit_log_user_added->data
    if(audit_log_user_added->data) {
    cJSON *data_local_JSON = audit_log_user_added_data_convertToJSON(audit_log_user_added->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

audit_log_user_added_t *audit_log_user_added_parseFromJSON(cJSON *audit_log_user_addedJSON){

    audit_log_user_added_t *audit_log_user_added_local_var = NULL;

    // define the local variable for audit_log_user_added->data
    audit_log_user_added_data_t *data_local_nonprim = NULL;

    // audit_log_user_added->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(audit_log_user_addedJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // audit_log_user_added->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(audit_log_user_addedJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (data) { 
    data_local_nonprim = audit_log_user_added_data_parseFromJSON(data); //nonprimitive
    }


    audit_log_user_added_local_var = audit_log_user_added_create_internal (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        data ? data_local_nonprim : NULL
        );

    return audit_log_user_added_local_var;
end:
    if (data_local_nonprim) {
        audit_log_user_added_data_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
