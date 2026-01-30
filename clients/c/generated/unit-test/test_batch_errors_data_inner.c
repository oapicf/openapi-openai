#ifndef batch_errors_data_inner_TEST
#define batch_errors_data_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define batch_errors_data_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/batch_errors_data_inner.h"
batch_errors_data_inner_t* instantiate_batch_errors_data_inner(int include_optional);



batch_errors_data_inner_t* instantiate_batch_errors_data_inner(int include_optional) {
  batch_errors_data_inner_t* batch_errors_data_inner = NULL;
  if (include_optional) {
    batch_errors_data_inner = batch_errors_data_inner_create(
      "0",
      "0",
      "0",
      56
    );
  } else {
    batch_errors_data_inner = batch_errors_data_inner_create(
      "0",
      "0",
      "0",
      56
    );
  }

  return batch_errors_data_inner;
}


#ifdef batch_errors_data_inner_MAIN

void test_batch_errors_data_inner(int include_optional) {
    batch_errors_data_inner_t* batch_errors_data_inner_1 = instantiate_batch_errors_data_inner(include_optional);

	cJSON* jsonbatch_errors_data_inner_1 = batch_errors_data_inner_convertToJSON(batch_errors_data_inner_1);
	printf("batch_errors_data_inner :\n%s\n", cJSON_Print(jsonbatch_errors_data_inner_1));
	batch_errors_data_inner_t* batch_errors_data_inner_2 = batch_errors_data_inner_parseFromJSON(jsonbatch_errors_data_inner_1);
	cJSON* jsonbatch_errors_data_inner_2 = batch_errors_data_inner_convertToJSON(batch_errors_data_inner_2);
	printf("repeating batch_errors_data_inner:\n%s\n", cJSON_Print(jsonbatch_errors_data_inner_2));
}

int main() {
  test_batch_errors_data_inner(1);
  test_batch_errors_data_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // batch_errors_data_inner_MAIN
#endif // batch_errors_data_inner_TEST
