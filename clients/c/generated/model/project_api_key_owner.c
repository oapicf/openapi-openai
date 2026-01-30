#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "project_api_key_owner.h"


char* project_api_key_owner_type_ToString(openai_api_project_api_key_owner_TYPE_e type) {
    char* typeArray[] =  { "NULL", "user", "service_account" };
    return typeArray[type];
}

openai_api_project_api_key_owner_TYPE_e project_api_key_owner_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "user", "service_account" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static project_api_key_owner_t *project_api_key_owner_create_internal(
    openai_api_project_api_key_owner_TYPE_e type,
    project_user_t *user,
    project_service_account_t *service_account
    ) {
    project_api_key_owner_t *project_api_key_owner_local_var = malloc(sizeof(project_api_key_owner_t));
    if (!project_api_key_owner_local_var) {
        return NULL;
    }
    project_api_key_owner_local_var->type = type;
    project_api_key_owner_local_var->user = user;
    project_api_key_owner_local_var->service_account = service_account;

    project_api_key_owner_local_var->_library_owned = 1;
    return project_api_key_owner_local_var;
}

__attribute__((deprecated)) project_api_key_owner_t *project_api_key_owner_create(
    openai_api_project_api_key_owner_TYPE_e type,
    project_user_t *user,
    project_service_account_t *service_account
    ) {
    return project_api_key_owner_create_internal (
        type,
        user,
        service_account
        );
}

void project_api_key_owner_free(project_api_key_owner_t *project_api_key_owner) {
    if(NULL == project_api_key_owner){
        return ;
    }
    if(project_api_key_owner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "project_api_key_owner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (project_api_key_owner->user) {
        project_user_free(project_api_key_owner->user);
        project_api_key_owner->user = NULL;
    }
    if (project_api_key_owner->service_account) {
        project_service_account_free(project_api_key_owner->service_account);
        project_api_key_owner->service_account = NULL;
    }
    free(project_api_key_owner);
}

cJSON *project_api_key_owner_convertToJSON(project_api_key_owner_t *project_api_key_owner) {
    cJSON *item = cJSON_CreateObject();

    // project_api_key_owner->type
    if(project_api_key_owner->type != openai_api_project_api_key_owner_TYPE_NULL) {
    if(cJSON_AddStringToObject(item, "type", project_api_key_owner_type_ToString(project_api_key_owner->type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // project_api_key_owner->user
    if(project_api_key_owner->user) {
    cJSON *user_local_JSON = project_user_convertToJSON(project_api_key_owner->user);
    if(user_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user", user_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // project_api_key_owner->service_account
    if(project_api_key_owner->service_account) {
    cJSON *service_account_local_JSON = project_service_account_convertToJSON(project_api_key_owner->service_account);
    if(service_account_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service_account", service_account_local_JSON);
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

project_api_key_owner_t *project_api_key_owner_parseFromJSON(cJSON *project_api_key_ownerJSON){

    project_api_key_owner_t *project_api_key_owner_local_var = NULL;

    // define the local variable for project_api_key_owner->user
    project_user_t *user_local_nonprim = NULL;

    // define the local variable for project_api_key_owner->service_account
    project_service_account_t *service_account_local_nonprim = NULL;

    // project_api_key_owner->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(project_api_key_ownerJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    openai_api_project_api_key_owner_TYPE_e typeVariable;
    if (type) { 
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = project_api_key_owner_type_FromString(type->valuestring);
    }

    // project_api_key_owner->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(project_api_key_ownerJSON, "user");
    if (cJSON_IsNull(user)) {
        user = NULL;
    }
    if (user) { 
    user_local_nonprim = project_user_parseFromJSON(user); //nonprimitive
    }

    // project_api_key_owner->service_account
    cJSON *service_account = cJSON_GetObjectItemCaseSensitive(project_api_key_ownerJSON, "service_account");
    if (cJSON_IsNull(service_account)) {
        service_account = NULL;
    }
    if (service_account) { 
    service_account_local_nonprim = project_service_account_parseFromJSON(service_account); //nonprimitive
    }


    project_api_key_owner_local_var = project_api_key_owner_create_internal (
        type ? typeVariable : openai_api_project_api_key_owner_TYPE_NULL,
        user ? user_local_nonprim : NULL,
        service_account ? service_account_local_nonprim : NULL
        );

    return project_api_key_owner_local_var;
end:
    if (user_local_nonprim) {
        project_user_free(user_local_nonprim);
        user_local_nonprim = NULL;
    }
    if (service_account_local_nonprim) {
        project_service_account_free(service_account_local_nonprim);
        service_account_local_nonprim = NULL;
    }
    return NULL;

}
