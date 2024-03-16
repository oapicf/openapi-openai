#ifndef create_chat_completion_request_TEST
#define create_chat_completion_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_chat_completion_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_chat_completion_request.h"
create_chat_completion_request_t* instantiate_create_chat_completion_request(int include_optional);

#include "test_create_chat_completion_request_model.c"
#include "test_create_chat_completion_request_function_call.c"
#include "test_create_chat_completion_request_stop.c"


create_chat_completion_request_t* instantiate_create_chat_completion_request(int include_optional) {
  create_chat_completion_request_t* create_chat_completion_request = NULL;
  if (include_optional) {
    create_chat_completion_request = create_chat_completion_request_create(
      gpt-3.5-turbo,
      list_createList(),
      list_createList(),
      null,
      1,
      1,
      1,
      1,
      null,
      56,
      -2,
      -2,
      0,
      "user-1234"
    );
  } else {
    create_chat_completion_request = create_chat_completion_request_create(
      gpt-3.5-turbo,
      list_createList(),
      list_createList(),
      null,
      1,
      1,
      1,
      1,
      null,
      56,
      -2,
      -2,
      0,
      "user-1234"
    );
  }

  return create_chat_completion_request;
}


#ifdef create_chat_completion_request_MAIN

void test_create_chat_completion_request(int include_optional) {
    create_chat_completion_request_t* create_chat_completion_request_1 = instantiate_create_chat_completion_request(include_optional);

	cJSON* jsoncreate_chat_completion_request_1 = create_chat_completion_request_convertToJSON(create_chat_completion_request_1);
	printf("create_chat_completion_request :\n%s\n", cJSON_Print(jsoncreate_chat_completion_request_1));
	create_chat_completion_request_t* create_chat_completion_request_2 = create_chat_completion_request_parseFromJSON(jsoncreate_chat_completion_request_1);
	cJSON* jsoncreate_chat_completion_request_2 = create_chat_completion_request_convertToJSON(create_chat_completion_request_2);
	printf("repeating create_chat_completion_request:\n%s\n", cJSON_Print(jsoncreate_chat_completion_request_2));
}

int main() {
  test_create_chat_completion_request(1);
  test_create_chat_completion_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_chat_completion_request_MAIN
#endif // create_chat_completion_request_TEST
