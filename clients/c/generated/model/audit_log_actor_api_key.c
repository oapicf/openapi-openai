#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_actor_api_key.h"


char* audit_log_actor_api_key_type_ToString(openai_api_audit_log_actor_api_key_TYPE_e type) {
    char* typeArray[] =  { "NULL", "user", "service_account" };
    return typeArray[type];
}

openai_api_audit_log_actor_api_key_TYPE_e audit_log_actor_api_key_type_FromString(char* type){
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

static audit_log_actor_api_key_t *audit_log_actor_api_key_create_internal(
    char *id,
    openai_api_audit_log_actor_api_key_TYPE_e type,
    audit_log_actor_user_t *user,
    audit_log_actor_service_account_t *service_account
    ) {
    audit_log_actor_api_key_t *audit_log_actor_api_key_local_var = malloc(sizeof(audit_log_actor_api_key_t));
    if (!audit_log_actor_api_key_local_var) {
        return NULL;
    }
    audit_log_actor_api_key_local_var->id = id;
    audit_log_actor_api_key_local_var->type = type;
    audit_log_actor_api_key_local_var->user = user;
    audit_log_actor_api_key_local_var->service_account = service_account;

    audit_log_actor_api_key_local_var->_library_owned = 1;
    return audit_log_actor_api_key_local_var;
}

__attribute__((deprecated)) audit_log_actor_api_key_t *audit_log_actor_api_key_create(
    char *id,
    openai_api_audit_log_actor_api_key_TYPE_e type,
    audit_log_actor_user_t *user,
    audit_log_actor_service_account_t *service_account
    ) {
    return audit_log_actor_api_key_create_internal (
        id,
        type,
        user,
        service_account
        );
}

void audit_log_actor_api_key_free(audit_log_actor_api_key_t *audit_log_actor_api_key) {
    if(NULL == audit_log_actor_api_key){
        return ;
    }
    if(audit_log_actor_api_key->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_actor_api_key_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log_actor_api_key->id) {
        free(audit_log_actor_api_key->id);
        audit_log_actor_api_key->id = NULL;
    }
    if (audit_log_actor_api_key->user) {
        audit_log_actor_user_free(audit_log_actor_api_key->user);
        audit_log_actor_api_key->user = NULL;
    }
    if (audit_log_actor_api_key->service_account) {
        audit_log_actor_service_account_free(audit_log_actor_api_key->service_account);
        audit_log_actor_api_key->service_account = NULL;
    }
    free(audit_log_actor_api_key);
}

cJSON *audit_log_actor_api_key_convertToJSON(audit_log_actor_api_key_t *audit_log_actor_api_key) {
    cJSON *item = cJSON_CreateObject();

    // audit_log_actor_api_key->id
    if(audit_log_actor_api_key->id) {
    if(cJSON_AddStringToObject(item, "id", audit_log_actor_api_key->id) == NULL) {
    goto fail; //String
    }
    }


    // audit_log_actor_api_key->type
    if(audit_log_actor_api_key->type != openai_api_audit_log_actor_api_key_TYPE_NULL) {
    if(cJSON_AddStringToObject(item, "type", audit_log_actor_api_key_type_ToString(audit_log_actor_api_key->type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // audit_log_actor_api_key->user
    if(audit_log_actor_api_key->user) {
    cJSON *user_local_JSON = audit_log_actor_user_convertToJSON(audit_log_actor_api_key->user);
    if(user_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user", user_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log_actor_api_key->service_account
    if(audit_log_actor_api_key->service_account) {
    cJSON *service_account_local_JSON = audit_log_actor_service_account_convertToJSON(audit_log_actor_api_key->service_account);
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

audit_log_actor_api_key_t *audit_log_actor_api_key_parseFromJSON(cJSON *audit_log_actor_api_keyJSON){

    audit_log_actor_api_key_t *audit_log_actor_api_key_local_var = NULL;

    // define the local variable for audit_log_actor_api_key->user
    audit_log_actor_user_t *user_local_nonprim = NULL;

    // define the local variable for audit_log_actor_api_key->service_account
    audit_log_actor_service_account_t *service_account_local_nonprim = NULL;

    // audit_log_actor_api_key->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(audit_log_actor_api_keyJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // audit_log_actor_api_key->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(audit_log_actor_api_keyJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    openai_api_audit_log_actor_api_key_TYPE_e typeVariable;
    if (type) { 
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = audit_log_actor_api_key_type_FromString(type->valuestring);
    }

    // audit_log_actor_api_key->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(audit_log_actor_api_keyJSON, "user");
    if (cJSON_IsNull(user)) {
        user = NULL;
    }
    if (user) { 
    user_local_nonprim = audit_log_actor_user_parseFromJSON(user); //nonprimitive
    }

    // audit_log_actor_api_key->service_account
    cJSON *service_account = cJSON_GetObjectItemCaseSensitive(audit_log_actor_api_keyJSON, "service_account");
    if (cJSON_IsNull(service_account)) {
        service_account = NULL;
    }
    if (service_account) { 
    service_account_local_nonprim = audit_log_actor_service_account_parseFromJSON(service_account); //nonprimitive
    }


    audit_log_actor_api_key_local_var = audit_log_actor_api_key_create_internal (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        type ? typeVariable : openai_api_audit_log_actor_api_key_TYPE_NULL,
        user ? user_local_nonprim : NULL,
        service_account ? service_account_local_nonprim : NULL
        );

    return audit_log_actor_api_key_local_var;
end:
    if (user_local_nonprim) {
        audit_log_actor_user_free(user_local_nonprim);
        user_local_nonprim = NULL;
    }
    if (service_account_local_nonprim) {
        audit_log_actor_service_account_free(service_account_local_nonprim);
        service_account_local_nonprim = NULL;
    }
    return NULL;

}
