#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "admin_api_key_owner.h"



static admin_api_key_owner_t *admin_api_key_owner_create_internal(
    char *type,
    char *id,
    char *name,
    long created_at,
    char *role
    ) {
    admin_api_key_owner_t *admin_api_key_owner_local_var = malloc(sizeof(admin_api_key_owner_t));
    if (!admin_api_key_owner_local_var) {
        return NULL;
    }
    admin_api_key_owner_local_var->type = type;
    admin_api_key_owner_local_var->id = id;
    admin_api_key_owner_local_var->name = name;
    admin_api_key_owner_local_var->created_at = created_at;
    admin_api_key_owner_local_var->role = role;

    admin_api_key_owner_local_var->_library_owned = 1;
    return admin_api_key_owner_local_var;
}

__attribute__((deprecated)) admin_api_key_owner_t *admin_api_key_owner_create(
    char *type,
    char *id,
    char *name,
    long created_at,
    char *role
    ) {
    return admin_api_key_owner_create_internal (
        type,
        id,
        name,
        created_at,
        role
        );
}

void admin_api_key_owner_free(admin_api_key_owner_t *admin_api_key_owner) {
    if(NULL == admin_api_key_owner){
        return ;
    }
    if(admin_api_key_owner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "admin_api_key_owner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (admin_api_key_owner->type) {
        free(admin_api_key_owner->type);
        admin_api_key_owner->type = NULL;
    }
    if (admin_api_key_owner->id) {
        free(admin_api_key_owner->id);
        admin_api_key_owner->id = NULL;
    }
    if (admin_api_key_owner->name) {
        free(admin_api_key_owner->name);
        admin_api_key_owner->name = NULL;
    }
    if (admin_api_key_owner->role) {
        free(admin_api_key_owner->role);
        admin_api_key_owner->role = NULL;
    }
    free(admin_api_key_owner);
}

cJSON *admin_api_key_owner_convertToJSON(admin_api_key_owner_t *admin_api_key_owner) {
    cJSON *item = cJSON_CreateObject();

    // admin_api_key_owner->type
    if(admin_api_key_owner->type) {
    if(cJSON_AddStringToObject(item, "type", admin_api_key_owner->type) == NULL) {
    goto fail; //String
    }
    }


    // admin_api_key_owner->id
    if(admin_api_key_owner->id) {
    if(cJSON_AddStringToObject(item, "id", admin_api_key_owner->id) == NULL) {
    goto fail; //String
    }
    }


    // admin_api_key_owner->name
    if(admin_api_key_owner->name) {
    if(cJSON_AddStringToObject(item, "name", admin_api_key_owner->name) == NULL) {
    goto fail; //String
    }
    }


    // admin_api_key_owner->created_at
    if(admin_api_key_owner->created_at) {
    if(cJSON_AddNumberToObject(item, "created_at", admin_api_key_owner->created_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // admin_api_key_owner->role
    if(admin_api_key_owner->role) {
    if(cJSON_AddStringToObject(item, "role", admin_api_key_owner->role) == NULL) {
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

admin_api_key_owner_t *admin_api_key_owner_parseFromJSON(cJSON *admin_api_key_ownerJSON){

    admin_api_key_owner_t *admin_api_key_owner_local_var = NULL;

    // admin_api_key_owner->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(admin_api_key_ownerJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // admin_api_key_owner->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(admin_api_key_ownerJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // admin_api_key_owner->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(admin_api_key_ownerJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // admin_api_key_owner->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(admin_api_key_ownerJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (created_at) { 
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }
    }

    // admin_api_key_owner->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(admin_api_key_ownerJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (role) { 
    if(!cJSON_IsString(role) && !cJSON_IsNull(role))
    {
    goto end; //String
    }
    }


    admin_api_key_owner_local_var = admin_api_key_owner_create_internal (
        type && !cJSON_IsNull(type) ? strdup(type->valuestring) : NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        created_at ? created_at->valuedouble : 0,
        role && !cJSON_IsNull(role) ? strdup(role->valuestring) : NULL
        );

    return admin_api_key_owner_local_var;
end:
    return NULL;

}
