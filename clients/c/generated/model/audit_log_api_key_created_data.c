#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_api_key_created_data.h"



static audit_log_api_key_created_data_t *audit_log_api_key_created_data_create_internal(
    list_t *scopes
    ) {
    audit_log_api_key_created_data_t *audit_log_api_key_created_data_local_var = malloc(sizeof(audit_log_api_key_created_data_t));
    if (!audit_log_api_key_created_data_local_var) {
        return NULL;
    }
    audit_log_api_key_created_data_local_var->scopes = scopes;

    audit_log_api_key_created_data_local_var->_library_owned = 1;
    return audit_log_api_key_created_data_local_var;
}

__attribute__((deprecated)) audit_log_api_key_created_data_t *audit_log_api_key_created_data_create(
    list_t *scopes
    ) {
    return audit_log_api_key_created_data_create_internal (
        scopes
        );
}

void audit_log_api_key_created_data_free(audit_log_api_key_created_data_t *audit_log_api_key_created_data) {
    if(NULL == audit_log_api_key_created_data){
        return ;
    }
    if(audit_log_api_key_created_data->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_api_key_created_data_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log_api_key_created_data->scopes) {
        list_ForEach(listEntry, audit_log_api_key_created_data->scopes) {
            free(listEntry->data);
        }
        list_freeList(audit_log_api_key_created_data->scopes);
        audit_log_api_key_created_data->scopes = NULL;
    }
    free(audit_log_api_key_created_data);
}

cJSON *audit_log_api_key_created_data_convertToJSON(audit_log_api_key_created_data_t *audit_log_api_key_created_data) {
    cJSON *item = cJSON_CreateObject();

    // audit_log_api_key_created_data->scopes
    if(audit_log_api_key_created_data->scopes) {
    cJSON *scopes = cJSON_AddArrayToObject(item, "scopes");
    if(scopes == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *scopesListEntry;
    list_ForEach(scopesListEntry, audit_log_api_key_created_data->scopes) {
    if(cJSON_AddStringToObject(scopes, "", scopesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

audit_log_api_key_created_data_t *audit_log_api_key_created_data_parseFromJSON(cJSON *audit_log_api_key_created_dataJSON){

    audit_log_api_key_created_data_t *audit_log_api_key_created_data_local_var = NULL;

    // define the local list for audit_log_api_key_created_data->scopes
    list_t *scopesList = NULL;

    // audit_log_api_key_created_data->scopes
    cJSON *scopes = cJSON_GetObjectItemCaseSensitive(audit_log_api_key_created_dataJSON, "scopes");
    if (cJSON_IsNull(scopes)) {
        scopes = NULL;
    }
    if (scopes) { 
    cJSON *scopes_local = NULL;
    if(!cJSON_IsArray(scopes)) {
        goto end;//primitive container
    }
    scopesList = list_createList();

    cJSON_ArrayForEach(scopes_local, scopes)
    {
        if(!cJSON_IsString(scopes_local))
        {
            goto end;
        }
        list_addElement(scopesList , strdup(scopes_local->valuestring));
    }
    }


    audit_log_api_key_created_data_local_var = audit_log_api_key_created_data_create_internal (
        scopes ? scopesList : NULL
        );

    return audit_log_api_key_created_data_local_var;
end:
    if (scopesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, scopesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(scopesList);
        scopesList = NULL;
    }
    return NULL;

}
