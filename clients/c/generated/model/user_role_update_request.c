#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_role_update_request.h"


char* user_role_update_request_role_ToString(openai_api_user_role_update_request_ROLE_e role) {
    char* roleArray[] =  { "NULL", "owner", "reader" };
    return roleArray[role];
}

openai_api_user_role_update_request_ROLE_e user_role_update_request_role_FromString(char* role){
    int stringToReturn = 0;
    char *roleArray[] =  { "NULL", "owner", "reader" };
    size_t sizeofArray = sizeof(roleArray) / sizeof(roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(role, roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static user_role_update_request_t *user_role_update_request_create_internal(
    openai_api_user_role_update_request_ROLE_e role
    ) {
    user_role_update_request_t *user_role_update_request_local_var = malloc(sizeof(user_role_update_request_t));
    if (!user_role_update_request_local_var) {
        return NULL;
    }
    user_role_update_request_local_var->role = role;

    user_role_update_request_local_var->_library_owned = 1;
    return user_role_update_request_local_var;
}

__attribute__((deprecated)) user_role_update_request_t *user_role_update_request_create(
    openai_api_user_role_update_request_ROLE_e role
    ) {
    return user_role_update_request_create_internal (
        role
        );
}

void user_role_update_request_free(user_role_update_request_t *user_role_update_request) {
    if(NULL == user_role_update_request){
        return ;
    }
    if(user_role_update_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "user_role_update_request_free");
        return ;
    }
    listEntry_t *listEntry;
    free(user_role_update_request);
}

cJSON *user_role_update_request_convertToJSON(user_role_update_request_t *user_role_update_request) {
    cJSON *item = cJSON_CreateObject();

    // user_role_update_request->role
    if (openai_api_user_role_update_request_ROLE_NULL == user_role_update_request->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", user_role_update_request_role_ToString(user_role_update_request->role)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

user_role_update_request_t *user_role_update_request_parseFromJSON(cJSON *user_role_update_requestJSON){

    user_role_update_request_t *user_role_update_request_local_var = NULL;

    // user_role_update_request->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(user_role_update_requestJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (!role) {
        goto end;
    }

    openai_api_user_role_update_request_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = user_role_update_request_role_FromString(role->valuestring);


    user_role_update_request_local_var = user_role_update_request_create_internal (
        roleVariable
        );

    return user_role_update_request_local_var;
end:
    return NULL;

}
