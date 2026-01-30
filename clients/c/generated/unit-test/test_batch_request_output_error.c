#ifndef batch_request_output_error_TEST
#define batch_request_output_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define batch_request_output_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/batch_request_output_error.h"
batch_request_output_error_t* instantiate_batch_request_output_error(int include_optional);



batch_request_output_error_t* instantiate_batch_request_output_error(int include_optional) {
  batch_request_output_error_t* batch_request_output_error = NULL;
  if (include_optional) {
    batch_request_output_error = batch_request_output_error_create(
      "0",
      "0"
    );
  } else {
    batch_request_output_error = batch_request_output_error_create(
      "0",
      "0"
    );
  }

  return batch_request_output_error;
}


#ifdef batch_request_output_error_MAIN

void test_batch_request_output_error(int include_optional) {
    batch_request_output_error_t* batch_request_output_error_1 = instantiate_batch_request_output_error(include_optional);

	cJSON* jsonbatch_request_output_error_1 = batch_request_output_error_convertToJSON(batch_request_output_error_1);
	printf("batch_request_output_error :\n%s\n", cJSON_Print(jsonbatch_request_output_error_1));
	batch_request_output_error_t* batch_request_output_error_2 = batch_request_output_error_parseFromJSON(jsonbatch_request_output_error_1);
	cJSON* jsonbatch_request_output_error_2 = batch_request_output_error_convertToJSON(batch_request_output_error_2);
	printf("repeating batch_request_output_error:\n%s\n", cJSON_Print(jsonbatch_request_output_error_2));
}

int main() {
  test_batch_request_output_error(1);
  test_batch_request_output_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // batch_request_output_error_MAIN
#endif // batch_request_output_error_TEST
