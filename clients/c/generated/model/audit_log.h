/*
 * audit_log.h
 *
 * A log of a user action or configuration change within this organization.
 */

#ifndef _audit_log_H_
#define _audit_log_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_t audit_log_t;

#include "audit_log_actor.h"
#include "audit_log_api_key_created.h"
#include "audit_log_api_key_deleted.h"
#include "audit_log_api_key_updated.h"
#include "audit_log_event_type.h"
#include "audit_log_invite_accepted.h"
#include "audit_log_invite_sent.h"
#include "audit_log_login_failed.h"
#include "audit_log_organization_updated.h"
#include "audit_log_project.h"
#include "audit_log_project_archived.h"
#include "audit_log_project_created.h"
#include "audit_log_project_updated.h"
#include "audit_log_rate_limit_deleted.h"
#include "audit_log_rate_limit_updated.h"
#include "audit_log_service_account_created.h"
#include "audit_log_service_account_deleted.h"
#include "audit_log_service_account_updated.h"
#include "audit_log_user_added.h"
#include "audit_log_user_deleted.h"
#include "audit_log_user_updated.h"



typedef struct audit_log_t {
    char *id; // string
    openai_api_audit_log_event_type__e type; //referenced enum
    int effective_at; //numeric
    struct audit_log_project_t *project; //model
    struct audit_log_actor_t *actor; //model
    struct audit_log_api_key_created_t *api_key_created; //model
    struct audit_log_api_key_updated_t *api_key_updated; //model
    struct audit_log_api_key_deleted_t *api_key_deleted; //model
    struct audit_log_invite_sent_t *invite_sent; //model
    struct audit_log_invite_accepted_t *invite_accepted; //model
    struct audit_log_invite_accepted_t *invite_deleted; //model
    struct audit_log_login_failed_t *login_failed; //model
    struct audit_log_login_failed_t *logout_failed; //model
    struct audit_log_organization_updated_t *organization_updated; //model
    struct audit_log_project_created_t *project_created; //model
    struct audit_log_project_updated_t *project_updated; //model
    struct audit_log_project_archived_t *project_archived; //model
    struct audit_log_rate_limit_updated_t *rate_limit_updated; //model
    struct audit_log_rate_limit_deleted_t *rate_limit_deleted; //model
    struct audit_log_service_account_created_t *service_account_created; //model
    struct audit_log_service_account_updated_t *service_account_updated; //model
    struct audit_log_service_account_deleted_t *service_account_deleted; //model
    struct audit_log_user_added_t *user_added; //model
    struct audit_log_user_updated_t *user_updated; //model
    struct audit_log_user_deleted_t *user_deleted; //model

    int _library_owned; // Is the library responsible for freeing this object?
} audit_log_t;

__attribute__((deprecated)) audit_log_t *audit_log_create(
    char *id,
    openai_api_audit_log_event_type__e type,
    int effective_at,
    audit_log_project_t *project,
    audit_log_actor_t *actor,
    audit_log_api_key_created_t *api_key_created,
    audit_log_api_key_updated_t *api_key_updated,
    audit_log_api_key_deleted_t *api_key_deleted,
    audit_log_invite_sent_t *invite_sent,
    audit_log_invite_accepted_t *invite_accepted,
    audit_log_invite_accepted_t *invite_deleted,
    audit_log_login_failed_t *login_failed,
    audit_log_login_failed_t *logout_failed,
    audit_log_organization_updated_t *organization_updated,
    audit_log_project_created_t *project_created,
    audit_log_project_updated_t *project_updated,
    audit_log_project_archived_t *project_archived,
    audit_log_rate_limit_updated_t *rate_limit_updated,
    audit_log_rate_limit_deleted_t *rate_limit_deleted,
    audit_log_service_account_created_t *service_account_created,
    audit_log_service_account_updated_t *service_account_updated,
    audit_log_service_account_deleted_t *service_account_deleted,
    audit_log_user_added_t *user_added,
    audit_log_user_updated_t *user_updated,
    audit_log_user_deleted_t *user_deleted
);

void audit_log_free(audit_log_t *audit_log);

audit_log_t *audit_log_parseFromJSON(cJSON *audit_logJSON);

cJSON *audit_log_convertToJSON(audit_log_t *audit_log);

#endif /* _audit_log_H_ */

