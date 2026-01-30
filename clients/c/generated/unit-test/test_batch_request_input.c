#ifndef batch_request_input_TEST
#define batch_request_input_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define batch_request_input_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/batch_request_input.h"
batch_request_input_t* instantiate_batch_request_input(int include_optional);



batch_request_input_t* instantiate_batch_request_input(int include_optional) {
  batch_request_input_t* batch_request_input = NULL;
  if (include_optional) {
    batch_request_input = batch_request_input_create(
      "0",
      openai_api_batch_request_input_METHOD_POST,
      "0"
    );
  } else {
    batch_request_input = batch_request_input_create(
      "0",
      openai_api_batch_request_input_METHOD_POST,
      "0"
    );
  }

  return batch_request_input;
}


#ifdef batch_request_input_MAIN

void test_batch_request_input(int include_optional) {
    batch_request_input_t* batch_request_input_1 = instantiate_batch_request_input(include_optional);

	cJSON* jsonbatch_request_input_1 = batch_request_input_convertToJSON(batch_request_input_1);
	printf("batch_request_input :\n%s\n", cJSON_Print(jsonbatch_request_input_1));
	batch_request_input_t* batch_request_input_2 = batch_request_input_parseFromJSON(jsonbatch_request_input_1);
	cJSON* jsonbatch_request_input_2 = batch_request_input_convertToJSON(batch_request_input_2);
	printf("repeating batch_request_input:\n%s\n", cJSON_Print(jsonbatch_request_input_2));
}

int main() {
  test_batch_request_input(1);
  test_batch_request_input(0);

  printf("Hello world \n");
  return 0;
}

#endif // batch_request_input_MAIN
#endif // batch_request_input_TEST
