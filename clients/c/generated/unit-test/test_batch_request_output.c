#ifndef batch_request_output_TEST
#define batch_request_output_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define batch_request_output_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/batch_request_output.h"
batch_request_output_t* instantiate_batch_request_output(int include_optional);

#include "test_batch_request_output_response.c"
#include "test_batch_request_output_error.c"


batch_request_output_t* instantiate_batch_request_output(int include_optional) {
  batch_request_output_t* batch_request_output = NULL;
  if (include_optional) {
    batch_request_output = batch_request_output_create(
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_batch_request_output_response(0),
       // false, not to have infinite recursion
      instantiate_batch_request_output_error(0)
    );
  } else {
    batch_request_output = batch_request_output_create(
      "0",
      "0",
      NULL,
      NULL
    );
  }

  return batch_request_output;
}


#ifdef batch_request_output_MAIN

void test_batch_request_output(int include_optional) {
    batch_request_output_t* batch_request_output_1 = instantiate_batch_request_output(include_optional);

	cJSON* jsonbatch_request_output_1 = batch_request_output_convertToJSON(batch_request_output_1);
	printf("batch_request_output :\n%s\n", cJSON_Print(jsonbatch_request_output_1));
	batch_request_output_t* batch_request_output_2 = batch_request_output_parseFromJSON(jsonbatch_request_output_1);
	cJSON* jsonbatch_request_output_2 = batch_request_output_convertToJSON(batch_request_output_2);
	printf("repeating batch_request_output:\n%s\n", cJSON_Print(jsonbatch_request_output_2));
}

int main() {
  test_batch_request_output(1);
  test_batch_request_output(0);

  printf("Hello world \n");
  return 0;
}

#endif // batch_request_output_MAIN
#endif // batch_request_output_TEST
