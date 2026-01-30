#ifndef batch_errors_TEST
#define batch_errors_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define batch_errors_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/batch_errors.h"
batch_errors_t* instantiate_batch_errors(int include_optional);



batch_errors_t* instantiate_batch_errors(int include_optional) {
  batch_errors_t* batch_errors = NULL;
  if (include_optional) {
    batch_errors = batch_errors_create(
      "0",
      list_createList()
    );
  } else {
    batch_errors = batch_errors_create(
      "0",
      list_createList()
    );
  }

  return batch_errors;
}


#ifdef batch_errors_MAIN

void test_batch_errors(int include_optional) {
    batch_errors_t* batch_errors_1 = instantiate_batch_errors(include_optional);

	cJSON* jsonbatch_errors_1 = batch_errors_convertToJSON(batch_errors_1);
	printf("batch_errors :\n%s\n", cJSON_Print(jsonbatch_errors_1));
	batch_errors_t* batch_errors_2 = batch_errors_parseFromJSON(jsonbatch_errors_1);
	cJSON* jsonbatch_errors_2 = batch_errors_convertToJSON(batch_errors_2);
	printf("repeating batch_errors:\n%s\n", cJSON_Print(jsonbatch_errors_2));
}

int main() {
  test_batch_errors(1);
  test_batch_errors(0);

  printf("Hello world \n");
  return 0;
}

#endif // batch_errors_MAIN
#endif // batch_errors_TEST
