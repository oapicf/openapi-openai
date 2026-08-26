#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_invite_sent.h"



static audit_log_invite_sent_t *audit_log_invite_sent_create_internal(
    char *id,
    audit_log_invite_sent_data_t *data
    ) {
    audit_log_invite_sent_t *audit_log_invite_sent_local_var = malloc(sizeof(audit_log_invite_sent_t));
    if (!audit_log_invite_sent_local_var) {
        return NULL;
    }
    memset(audit_log_invite_sent_local_var, 0, sizeof(audit_log_invite_sent_t));
    audit_log_invite_sent_local_var->_library_owned = 1;
    audit_log_invite_sent_local_var->id = id;
    audit_log_invite_sent_local_var->data = data;
    return audit_log_invite_sent_local_var;
}

__attribute__((deprecated)) audit_log_invite_sent_t *audit_log_invite_sent_create(
    char *id,
    audit_log_invite_sent_data_t *data
    ) {
    audit_log_invite_sent_t *result = audit_log_invite_sent_create_internal (
        id,
        data
        );
    if (!result) {
    }
    return result;
}

void audit_log_invite_sent_free(audit_log_invite_sent_t *audit_log_invite_sent) {
    if(NULL == audit_log_invite_sent){
        return ;
    }
    if(audit_log_invite_sent->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_invite_sent_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log_invite_sent->id) {
        free(audit_log_invite_sent->id);
        audit_log_invite_sent->id = NULL;
    }
    if (audit_log_invite_sent->data) {
        audit_log_invite_sent_data_free(audit_log_invite_sent->data);
        audit_log_invite_sent->data = NULL;
    }
    free(audit_log_invite_sent);
}

cJSON *audit_log_invite_sent_convertToJSON(audit_log_invite_sent_t *audit_log_invite_sent) {
    cJSON *item = cJSON_CreateObject();

    // audit_log_invite_sent->id
    if(audit_log_invite_sent->id) {
    if(cJSON_AddStringToObject(item, "id", audit_log_invite_sent->id) == NULL) {
    goto fail; //String
    }
    }


    // audit_log_invite_sent->data
    if(audit_log_invite_sent->data) {
    cJSON *data_local_JSON = audit_log_invite_sent_data_convertToJSON(audit_log_invite_sent->data);
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

audit_log_invite_sent_t *audit_log_invite_sent_parseFromJSON(cJSON *audit_log_invite_sentJSON){

    audit_log_invite_sent_t *audit_log_invite_sent_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for audit_log_invite_sent->data
    audit_log_invite_sent_data_t *data_local_nonprim = NULL;

    // audit_log_invite_sent->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(audit_log_invite_sentJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // audit_log_invite_sent->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(audit_log_invite_sentJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (data) { 
    data_local_nonprim = audit_log_invite_sent_data_parseFromJSON(data); //nonprimitive
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);

    audit_log_invite_sent_local_var = audit_log_invite_sent_create_internal (
        id_local_str,
        data ? data_local_nonprim : NULL
        );

    if (!audit_log_invite_sent_local_var) {
        goto end;
    }

    return audit_log_invite_sent_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (data_local_nonprim) {
        audit_log_invite_sent_data_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
