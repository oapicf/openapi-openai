#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "admin_api_keys_create_request.h"



static admin_api_keys_create_request_t *admin_api_keys_create_request_create_internal(
    char *name
    ) {
    admin_api_keys_create_request_t *admin_api_keys_create_request_local_var = malloc(sizeof(admin_api_keys_create_request_t));
    if (!admin_api_keys_create_request_local_var) {
        return NULL;
    }
    admin_api_keys_create_request_local_var->name = name;

    admin_api_keys_create_request_local_var->_library_owned = 1;
    return admin_api_keys_create_request_local_var;
}

__attribute__((deprecated)) admin_api_keys_create_request_t *admin_api_keys_create_request_create(
    char *name
    ) {
    return admin_api_keys_create_request_create_internal (
        name
        );
}

void admin_api_keys_create_request_free(admin_api_keys_create_request_t *admin_api_keys_create_request) {
    if(NULL == admin_api_keys_create_request){
        return ;
    }
    if(admin_api_keys_create_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "admin_api_keys_create_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (admin_api_keys_create_request->name) {
        free(admin_api_keys_create_request->name);
        admin_api_keys_create_request->name = NULL;
    }
    free(admin_api_keys_create_request);
}

cJSON *admin_api_keys_create_request_convertToJSON(admin_api_keys_create_request_t *admin_api_keys_create_request) {
    cJSON *item = cJSON_CreateObject();

    // admin_api_keys_create_request->name
    if (!admin_api_keys_create_request->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", admin_api_keys_create_request->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

admin_api_keys_create_request_t *admin_api_keys_create_request_parseFromJSON(cJSON *admin_api_keys_create_requestJSON){

    admin_api_keys_create_request_t *admin_api_keys_create_request_local_var = NULL;

    // admin_api_keys_create_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(admin_api_keys_create_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }


    admin_api_keys_create_request_local_var = admin_api_keys_create_request_create_internal (
        strdup(name->valuestring)
        );

    return admin_api_keys_create_request_local_var;
end:
    return NULL;

}
