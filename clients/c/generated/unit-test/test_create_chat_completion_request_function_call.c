#ifndef create_chat_completion_request_function_call_TEST
#define create_chat_completion_request_function_call_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_chat_completion_request_function_call_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_chat_completion_request_function_call.h"
create_chat_completion_request_function_call_t* instantiate_create_chat_completion_request_function_call(int include_optional);



create_chat_completion_request_function_call_t* instantiate_create_chat_completion_request_function_call(int include_optional) {
  create_chat_completion_request_function_call_t* create_chat_completion_request_function_call = NULL;
  if (include_optional) {
    create_chat_completion_request_function_call = create_chat_completion_request_function_call_create(
      "0"
    );
  } else {
    create_chat_completion_request_function_call = create_chat_completion_request_function_call_create(
      "0"
    );
  }

  return create_chat_completion_request_function_call;
}


#ifdef create_chat_completion_request_function_call_MAIN

void test_create_chat_completion_request_function_call(int include_optional) {
    create_chat_completion_request_function_call_t* create_chat_completion_request_function_call_1 = instantiate_create_chat_completion_request_function_call(include_optional);

	cJSON* jsoncreate_chat_completion_request_function_call_1 = create_chat_completion_request_function_call_convertToJSON(create_chat_completion_request_function_call_1);
	printf("create_chat_completion_request_function_call :\n%s\n", cJSON_Print(jsoncreate_chat_completion_request_function_call_1));
	create_chat_completion_request_function_call_t* create_chat_completion_request_function_call_2 = create_chat_completion_request_function_call_parseFromJSON(jsoncreate_chat_completion_request_function_call_1);
	cJSON* jsoncreate_chat_completion_request_function_call_2 = create_chat_completion_request_function_call_convertToJSON(create_chat_completion_request_function_call_2);
	printf("repeating create_chat_completion_request_function_call:\n%s\n", cJSON_Print(jsoncreate_chat_completion_request_function_call_2));
}

int main() {
  test_create_chat_completion_request_function_call(1);
  test_create_chat_completion_request_function_call(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_chat_completion_request_function_call_MAIN
#endif // create_chat_completion_request_function_call_TEST
