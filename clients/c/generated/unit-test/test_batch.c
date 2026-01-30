#ifndef batch_TEST
#define batch_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define batch_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/batch.h"
batch_t* instantiate_batch(int include_optional);

#include "test_batch_errors.c"
#include "test_batch_request_counts.c"


batch_t* instantiate_batch(int include_optional) {
  batch_t* batch = NULL;
  if (include_optional) {
    batch = batch_create(
      "0",
      openai_api_batch_OBJECT_batch,
      "0",
       // false, not to have infinite recursion
      instantiate_batch_errors(0),
      "0",
      "0",
      openai_api_batch_STATUS_validating,
      "0",
      "0",
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
       // false, not to have infinite recursion
      instantiate_batch_request_counts(0),
      0
    );
  } else {
    batch = batch_create(
      "0",
      openai_api_batch_OBJECT_batch,
      "0",
      NULL,
      "0",
      "0",
      openai_api_batch_STATUS_validating,
      "0",
      "0",
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      NULL,
      0
    );
  }

  return batch;
}


#ifdef batch_MAIN

void test_batch(int include_optional) {
    batch_t* batch_1 = instantiate_batch(include_optional);

	cJSON* jsonbatch_1 = batch_convertToJSON(batch_1);
	printf("batch :\n%s\n", cJSON_Print(jsonbatch_1));
	batch_t* batch_2 = batch_parseFromJSON(jsonbatch_1);
	cJSON* jsonbatch_2 = batch_convertToJSON(batch_2);
	printf("repeating batch:\n%s\n", cJSON_Print(jsonbatch_2));
}

int main() {
  test_batch(1);
  test_batch(0);

  printf("Hello world \n");
  return 0;
}

#endif // batch_MAIN
#endif // batch_TEST
