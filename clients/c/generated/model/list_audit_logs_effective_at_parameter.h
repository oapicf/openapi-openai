/*
 * list_audit_logs_effective_at_parameter.h
 *
 * 
 */

#ifndef _list_audit_logs_effective_at_parameter_H_
#define _list_audit_logs_effective_at_parameter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct list_audit_logs_effective_at_parameter_t list_audit_logs_effective_at_parameter_t;




typedef struct list_audit_logs_effective_at_parameter_t {
    int gt; //numeric
    int gte; //numeric
    int lt; //numeric
    int lte; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} list_audit_logs_effective_at_parameter_t;

__attribute__((deprecated)) list_audit_logs_effective_at_parameter_t *list_audit_logs_effective_at_parameter_create(
    int gt,
    int gte,
    int lt,
    int lte
);

void list_audit_logs_effective_at_parameter_free(list_audit_logs_effective_at_parameter_t *list_audit_logs_effective_at_parameter);

list_audit_logs_effective_at_parameter_t *list_audit_logs_effective_at_parameter_parseFromJSON(cJSON *list_audit_logs_effective_at_parameterJSON);

cJSON *list_audit_logs_effective_at_parameter_convertToJSON(list_audit_logs_effective_at_parameter_t *list_audit_logs_effective_at_parameter);

#endif /* _list_audit_logs_effective_at_parameter_H_ */

