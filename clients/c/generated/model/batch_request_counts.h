/*
 * batch_request_counts.h
 *
 * The request counts for different statuses within the batch.
 */

#ifndef _batch_request_counts_H_
#define _batch_request_counts_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct batch_request_counts_t batch_request_counts_t;




typedef struct batch_request_counts_t {
    int total; //numeric
    int completed; //numeric
    int failed; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} batch_request_counts_t;

__attribute__((deprecated)) batch_request_counts_t *batch_request_counts_create(
    int total,
    int completed,
    int failed
);

void batch_request_counts_free(batch_request_counts_t *batch_request_counts);

batch_request_counts_t *batch_request_counts_parseFromJSON(cJSON *batch_request_countsJSON);

cJSON *batch_request_counts_convertToJSON(batch_request_counts_t *batch_request_counts);

#endif /* _batch_request_counts_H_ */

