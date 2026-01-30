#ifndef batch_request_counts_TEST
#define batch_request_counts_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define batch_request_counts_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/batch_request_counts.h"
batch_request_counts_t* instantiate_batch_request_counts(int include_optional);



batch_request_counts_t* instantiate_batch_request_counts(int include_optional) {
  batch_request_counts_t* batch_request_counts = NULL;
  if (include_optional) {
    batch_request_counts = batch_request_counts_create(
      56,
      56,
      56
    );
  } else {
    batch_request_counts = batch_request_counts_create(
      56,
      56,
      56
    );
  }

  return batch_request_counts;
}


#ifdef batch_request_counts_MAIN

void test_batch_request_counts(int include_optional) {
    batch_request_counts_t* batch_request_counts_1 = instantiate_batch_request_counts(include_optional);

	cJSON* jsonbatch_request_counts_1 = batch_request_counts_convertToJSON(batch_request_counts_1);
	printf("batch_request_counts :\n%s\n", cJSON_Print(jsonbatch_request_counts_1));
	batch_request_counts_t* batch_request_counts_2 = batch_request_counts_parseFromJSON(jsonbatch_request_counts_1);
	cJSON* jsonbatch_request_counts_2 = batch_request_counts_convertToJSON(batch_request_counts_2);
	printf("repeating batch_request_counts:\n%s\n", cJSON_Print(jsonbatch_request_counts_2));
}

int main() {
  test_batch_request_counts(1);
  test_batch_request_counts(0);

  printf("Hello world \n");
  return 0;
}

#endif // batch_request_counts_MAIN
#endif // batch_request_counts_TEST
