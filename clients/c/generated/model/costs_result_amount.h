/*
 * costs_result_amount.h
 *
 * The monetary value in its associated currency.
 */

#ifndef _costs_result_amount_H_
#define _costs_result_amount_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct costs_result_amount_t costs_result_amount_t;




typedef struct costs_result_amount_t {
    double value; //numeric
    char *currency; // string

    int _library_owned; // Is the library responsible for freeing this object?
} costs_result_amount_t;

__attribute__((deprecated)) costs_result_amount_t *costs_result_amount_create(
    double value,
    char *currency
);

void costs_result_amount_free(costs_result_amount_t *costs_result_amount);

costs_result_amount_t *costs_result_amount_parseFromJSON(cJSON *costs_result_amountJSON);

cJSON *costs_result_amount_convertToJSON(costs_result_amount_t *costs_result_amount);

#endif /* _costs_result_amount_H_ */

