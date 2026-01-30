/*
 * audit_log_project_archived.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef _audit_log_project_archived_H_
#define _audit_log_project_archived_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_project_archived_t audit_log_project_archived_t;




typedef struct audit_log_project_archived_t {
    char *id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} audit_log_project_archived_t;

__attribute__((deprecated)) audit_log_project_archived_t *audit_log_project_archived_create(
    char *id
);

void audit_log_project_archived_free(audit_log_project_archived_t *audit_log_project_archived);

audit_log_project_archived_t *audit_log_project_archived_parseFromJSON(cJSON *audit_log_project_archivedJSON);

cJSON *audit_log_project_archived_convertToJSON(audit_log_project_archived_t *audit_log_project_archived);

#endif /* _audit_log_project_archived_H_ */

