#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "admin_api_key.h"



static admin_api_key_t *admin_api_key_create_internal(
    char *object,
    char *id,
    char *name,
    char *redacted_value,
    char *value,
    long created_at,
    admin_api_key_owner_t *owner
    ) {
    admin_api_key_t *admin_api_key_local_var = malloc(sizeof(admin_api_key_t));
    if (!admin_api_key_local_var) {
        return NULL;
    }
    admin_api_key_local_var->object = object;
    admin_api_key_local_var->id = id;
    admin_api_key_local_var->name = name;
    admin_api_key_local_var->redacted_value = redacted_value;
    admin_api_key_local_var->value = value;
    admin_api_key_local_var->created_at = created_at;
    admin_api_key_local_var->owner = owner;

    admin_api_key_local_var->_library_owned = 1;
    return admin_api_key_local_var;
}

__attribute__((deprecated)) admin_api_key_t *admin_api_key_create(
    char *object,
    char *id,
    char *name,
    char *redacted_value,
    char *value,
    long created_at,
    admin_api_key_owner_t *owner
    ) {
    return admin_api_key_create_internal (
        object,
        id,
        name,
        redacted_value,
        value,
        created_at,
        owner
        );
}

void admin_api_key_free(admin_api_key_t *admin_api_key) {
    if(NULL == admin_api_key){
        return ;
    }
    if(admin_api_key->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "admin_api_key_free");
        return ;
    }
    listEntry_t *listEntry;
    if (admin_api_key->object) {
        free(admin_api_key->object);
        admin_api_key->object = NULL;
    }
    if (admin_api_key->id) {
        free(admin_api_key->id);
        admin_api_key->id = NULL;
    }
    if (admin_api_key->name) {
        free(admin_api_key->name);
        admin_api_key->name = NULL;
    }
    if (admin_api_key->redacted_value) {
        free(admin_api_key->redacted_value);
        admin_api_key->redacted_value = NULL;
    }
    if (admin_api_key->value) {
        free(admin_api_key->value);
        admin_api_key->value = NULL;
    }
    if (admin_api_key->owner) {
        admin_api_key_owner_free(admin_api_key->owner);
        admin_api_key->owner = NULL;
    }
    free(admin_api_key);
}

cJSON *admin_api_key_convertToJSON(admin_api_key_t *admin_api_key) {
    cJSON *item = cJSON_CreateObject();

    // admin_api_key->object
    if(admin_api_key->object) {
    if(cJSON_AddStringToObject(item, "object", admin_api_key->object) == NULL) {
    goto fail; //String
    }
    }


    // admin_api_key->id
    if(admin_api_key->id) {
    if(cJSON_AddStringToObject(item, "id", admin_api_key->id) == NULL) {
    goto fail; //String
    }
    }


    // admin_api_key->name
    if(admin_api_key->name) {
    if(cJSON_AddStringToObject(item, "name", admin_api_key->name) == NULL) {
    goto fail; //String
    }
    }


    // admin_api_key->redacted_value
    if(admin_api_key->redacted_value) {
    if(cJSON_AddStringToObject(item, "redacted_value", admin_api_key->redacted_value) == NULL) {
    goto fail; //String
    }
    }


    // admin_api_key->value
    if(admin_api_key->value) {
    if(cJSON_AddStringToObject(item, "value", admin_api_key->value) == NULL) {
    goto fail; //String
    }
    }


    // admin_api_key->created_at
    if(admin_api_key->created_at) {
    if(cJSON_AddNumberToObject(item, "created_at", admin_api_key->created_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // admin_api_key->owner
    if(admin_api_key->owner) {
    cJSON *owner_local_JSON = admin_api_key_owner_convertToJSON(admin_api_key->owner);
    if(owner_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "owner", owner_local_JSON);
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

admin_api_key_t *admin_api_key_parseFromJSON(cJSON *admin_api_keyJSON){

    admin_api_key_t *admin_api_key_local_var = NULL;

    // define the local variable for admin_api_key->owner
    admin_api_key_owner_t *owner_local_nonprim = NULL;

    // admin_api_key->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(admin_api_keyJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (object) { 
    if(!cJSON_IsString(object) && !cJSON_IsNull(object))
    {
    goto end; //String
    }
    }

    // admin_api_key->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(admin_api_keyJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // admin_api_key->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(admin_api_keyJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // admin_api_key->redacted_value
    cJSON *redacted_value = cJSON_GetObjectItemCaseSensitive(admin_api_keyJSON, "redacted_value");
    if (cJSON_IsNull(redacted_value)) {
        redacted_value = NULL;
    }
    if (redacted_value) { 
    if(!cJSON_IsString(redacted_value) && !cJSON_IsNull(redacted_value))
    {
    goto end; //String
    }
    }

    // admin_api_key->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(admin_api_keyJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (value) { 
    if(!cJSON_IsString(value) && !cJSON_IsNull(value))
    {
    goto end; //String
    }
    }

    // admin_api_key->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(admin_api_keyJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (created_at) { 
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }
    }

    // admin_api_key->owner
    cJSON *owner = cJSON_GetObjectItemCaseSensitive(admin_api_keyJSON, "owner");
    if (cJSON_IsNull(owner)) {
        owner = NULL;
    }
    if (owner) { 
    owner_local_nonprim = admin_api_key_owner_parseFromJSON(owner); //nonprimitive
    }


    admin_api_key_local_var = admin_api_key_create_internal (
        object && !cJSON_IsNull(object) ? strdup(object->valuestring) : NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        redacted_value && !cJSON_IsNull(redacted_value) ? strdup(redacted_value->valuestring) : NULL,
        value && !cJSON_IsNull(value) ? strdup(value->valuestring) : NULL,
        created_at ? created_at->valuedouble : 0,
        owner ? owner_local_nonprim : NULL
        );

    return admin_api_key_local_var;
end:
    if (owner_local_nonprim) {
        admin_api_key_owner_free(owner_local_nonprim);
        owner_local_nonprim = NULL;
    }
    return NULL;

}
