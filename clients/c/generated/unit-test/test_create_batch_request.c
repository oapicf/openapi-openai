#ifndef create_batch_request_TEST
#define create_batch_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_batch_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_batch_request.h"
create_batch_request_t* instantiate_create_batch_request(int include_optional);



create_batch_request_t* instantiate_create_batch_request(int include_optional) {
  create_batch_request_t* create_batch_request = NULL;
  if (include_optional) {
    create_batch_request = create_batch_request_create(
      "0",
      openai_api_create_batch_request_ENDPOINT_/v1/chat/completions,
      openai_api_create_batch_request_COMPLETIONWINDOW_24h,
      list_createList()
    );
  } else {
    create_batch_request = create_batch_request_create(
      "0",
      openai_api_create_batch_request_ENDPOINT_/v1/chat/completions,
      openai_api_create_batch_request_COMPLETIONWINDOW_24h,
      list_createList()
    );
  }

  return create_batch_request;
}


#ifdef create_batch_request_MAIN

void test_create_batch_request(int include_optional) {
    create_batch_request_t* create_batch_request_1 = instantiate_create_batch_request(include_optional);

	cJSON* jsoncreate_batch_request_1 = create_batch_request_convertToJSON(create_batch_request_1);
	printf("create_batch_request :\n%s\n", cJSON_Print(jsoncreate_batch_request_1));
	create_batch_request_t* create_batch_request_2 = create_batch_request_parseFromJSON(jsoncreate_batch_request_1);
	cJSON* jsoncreate_batch_request_2 = create_batch_request_convertToJSON(create_batch_request_2);
	printf("repeating create_batch_request:\n%s\n", cJSON_Print(jsoncreate_batch_request_2));
}

int main() {
  test_create_batch_request(1);
  test_create_batch_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_batch_request_MAIN
#endif // create_batch_request_TEST
