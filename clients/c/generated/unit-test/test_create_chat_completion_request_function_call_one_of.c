#ifndef create_chat_completion_request_function_call_one_of_TEST
#define create_chat_completion_request_function_call_one_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_chat_completion_request_function_call_one_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_chat_completion_request_function_call_one_of.h"
create_chat_completion_request_function_call_one_of_t* instantiate_create_chat_completion_request_function_call_one_of(int include_optional);



create_chat_completion_request_function_call_one_of_t* instantiate_create_chat_completion_request_function_call_one_of(int include_optional) {
  create_chat_completion_request_function_call_one_of_t* create_chat_completion_request_function_call_one_of = NULL;
  if (include_optional) {
    create_chat_completion_request_function_call_one_of = create_chat_completion_request_function_call_one_of_create(
      "0"
    );
  } else {
    create_chat_completion_request_function_call_one_of = create_chat_completion_request_function_call_one_of_create(
      "0"
    );
  }

  return create_chat_completion_request_function_call_one_of;
}


#ifdef create_chat_completion_request_function_call_one_of_MAIN

void test_create_chat_completion_request_function_call_one_of(int include_optional) {
    create_chat_completion_request_function_call_one_of_t* create_chat_completion_request_function_call_one_of_1 = instantiate_create_chat_completion_request_function_call_one_of(include_optional);

	cJSON* jsoncreate_chat_completion_request_function_call_one_of_1 = create_chat_completion_request_function_call_one_of_convertToJSON(create_chat_completion_request_function_call_one_of_1);
	printf("create_chat_completion_request_function_call_one_of :\n%s\n", cJSON_Print(jsoncreate_chat_completion_request_function_call_one_of_1));
	create_chat_completion_request_function_call_one_of_t* create_chat_completion_request_function_call_one_of_2 = create_chat_completion_request_function_call_one_of_parseFromJSON(jsoncreate_chat_completion_request_function_call_one_of_1);
	cJSON* jsoncreate_chat_completion_request_function_call_one_of_2 = create_chat_completion_request_function_call_one_of_convertToJSON(create_chat_completion_request_function_call_one_of_2);
	printf("repeating create_chat_completion_request_function_call_one_of:\n%s\n", cJSON_Print(jsoncreate_chat_completion_request_function_call_one_of_2));
}

int main() {
  test_create_chat_completion_request_function_call_one_of(1);
  test_create_chat_completion_request_function_call_one_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_chat_completion_request_function_call_one_of_MAIN
#endif // create_chat_completion_request_function_call_one_of_TEST
