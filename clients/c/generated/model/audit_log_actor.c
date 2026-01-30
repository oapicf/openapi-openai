#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_actor.h"


char* audit_log_actor_type_ToString(openai_api_audit_log_actor_TYPE_e type) {
    char* typeArray[] =  { "NULL", "session", "api_key" };
    return typeArray[type];
}

openai_api_audit_log_actor_TYPE_e audit_log_actor_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "session", "api_key" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static audit_log_actor_t *audit_log_actor_create_internal(
    openai_api_audit_log_actor_TYPE_e type,
    audit_log_actor_session_t *session,
    audit_log_actor_api_key_t *api_key
    ) {
    audit_log_actor_t *audit_log_actor_local_var = malloc(sizeof(audit_log_actor_t));
    if (!audit_log_actor_local_var) {
        return NULL;
    }
    audit_log_actor_local_var->type = type;
    audit_log_actor_local_var->session = session;
    audit_log_actor_local_var->api_key = api_key;

    audit_log_actor_local_var->_library_owned = 1;
    return audit_log_actor_local_var;
}

__attribute__((deprecated)) audit_log_actor_t *audit_log_actor_create(
    openai_api_audit_log_actor_TYPE_e type,
    audit_log_actor_session_t *session,
    audit_log_actor_api_key_t *api_key
    ) {
    return audit_log_actor_create_internal (
        type,
        session,
        api_key
        );
}

void audit_log_actor_free(audit_log_actor_t *audit_log_actor) {
    if(NULL == audit_log_actor){
        return ;
    }
    if(audit_log_actor->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_actor_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log_actor->session) {
        object_free(audit_log_actor->session);
        audit_log_actor->session = NULL;
    }
    if (audit_log_actor->api_key) {
        object_free(audit_log_actor->api_key);
        audit_log_actor->api_key = NULL;
    }
    free(audit_log_actor);
}

cJSON *audit_log_actor_convertToJSON(audit_log_actor_t *audit_log_actor) {
    cJSON *item = cJSON_CreateObject();

    // audit_log_actor->type
    if(audit_log_actor->type != openai_api_audit_log_actor_TYPE_NULL) {
    if(cJSON_AddStringToObject(item, "type", audit_log_actor_type_ToString(audit_log_actor->type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // audit_log_actor->session
    if(audit_log_actor->session) {
    cJSON *session_object = object_convertToJSON(audit_log_actor->session);
    if(session_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "session", session_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log_actor->api_key
    if(audit_log_actor->api_key) {
    cJSON *api_key_object = object_convertToJSON(audit_log_actor->api_key);
    if(api_key_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "api_key", api_key_object);
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

audit_log_actor_t *audit_log_actor_parseFromJSON(cJSON *audit_log_actorJSON){

    audit_log_actor_t *audit_log_actor_local_var = NULL;

    // audit_log_actor->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(audit_log_actorJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    openai_api_audit_log_actor_TYPE_e typeVariable;
    if (type) { 
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = audit_log_actor_type_FromString(type->valuestring);
    }

    // audit_log_actor->session
    cJSON *session = cJSON_GetObjectItemCaseSensitive(audit_log_actorJSON, "session");
    if (cJSON_IsNull(session)) {
        session = NULL;
    }
    object_t *session_local_object = NULL;
    if (session) { 
    session_local_object = object_parseFromJSON(session); //object
    }

    // audit_log_actor->api_key
    cJSON *api_key = cJSON_GetObjectItemCaseSensitive(audit_log_actorJSON, "api_key");
    if (cJSON_IsNull(api_key)) {
        api_key = NULL;
    }
    object_t *api_key_local_object = NULL;
    if (api_key) { 
    api_key_local_object = object_parseFromJSON(api_key); //object
    }


    audit_log_actor_local_var = audit_log_actor_create_internal (
        type ? typeVariable : openai_api_audit_log_actor_TYPE_NULL,
        session ? session_local_object : NULL,
        api_key ? api_key_local_object : NULL
        );

    return audit_log_actor_local_var;
end:
    return NULL;

}
