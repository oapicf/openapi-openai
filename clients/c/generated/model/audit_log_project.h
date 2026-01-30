/*
 * audit_log_project.h
 *
 * The project that the action was scoped to. Absent for actions not scoped to projects.
 */

#ifndef _audit_log_project_H_
#define _audit_log_project_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_project_t audit_log_project_t;




typedef struct audit_log_project_t {
    char *id; // string
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} audit_log_project_t;

__attribute__((deprecated)) audit_log_project_t *audit_log_project_create(
    char *id,
    char *name
);

void audit_log_project_free(audit_log_project_t *audit_log_project);

audit_log_project_t *audit_log_project_parseFromJSON(cJSON *audit_log_projectJSON);

cJSON *audit_log_project_convertToJSON(audit_log_project_t *audit_log_project);

#endif /* _audit_log_project_H_ */

