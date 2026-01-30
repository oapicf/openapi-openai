#ifndef batch_request_output_response_TEST
#define batch_request_output_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define batch_request_output_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/batch_request_output_response.h"
batch_request_output_response_t* instantiate_batch_request_output_response(int include_optional);



batch_request_output_response_t* instantiate_batch_request_output_response(int include_optional) {
  batch_request_output_response_t* batch_request_output_response = NULL;
  if (include_optional) {
    batch_request_output_response = batch_request_output_response_create(
      56,
      "0",
      0
    );
  } else {
    batch_request_output_response = batch_request_output_response_create(
      56,
      "0",
      0
    );
  }

  return batch_request_output_response;
}


#ifdef batch_request_output_response_MAIN

void test_batch_request_output_response(int include_optional) {
    batch_request_output_response_t* batch_request_output_response_1 = instantiate_batch_request_output_response(include_optional);

	cJSON* jsonbatch_request_output_response_1 = batch_request_output_response_convertToJSON(batch_request_output_response_1);
	printf("batch_request_output_response :\n%s\n", cJSON_Print(jsonbatch_request_output_response_1));
	batch_request_output_response_t* batch_request_output_response_2 = batch_request_output_response_parseFromJSON(jsonbatch_request_output_response_1);
	cJSON* jsonbatch_request_output_response_2 = batch_request_output_response_convertToJSON(batch_request_output_response_2);
	printf("repeating batch_request_output_response:\n%s\n", cJSON_Print(jsonbatch_request_output_response_2));
}

int main() {
  test_batch_request_output_response(1);
  test_batch_request_output_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // batch_request_output_response_MAIN
#endif // batch_request_output_response_TEST
