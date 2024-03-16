#ifndef chat_completion_request_message_function_call_TEST
#define chat_completion_request_message_function_call_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_request_message_function_call_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_request_message_function_call.h"
chat_completion_request_message_function_call_t* instantiate_chat_completion_request_message_function_call(int include_optional);



chat_completion_request_message_function_call_t* instantiate_chat_completion_request_message_function_call(int include_optional) {
  chat_completion_request_message_function_call_t* chat_completion_request_message_function_call = NULL;
  if (include_optional) {
    chat_completion_request_message_function_call = chat_completion_request_message_function_call_create(
      "0",
      "0"
    );
  } else {
    chat_completion_request_message_function_call = chat_completion_request_message_function_call_create(
      "0",
      "0"
    );
  }

  return chat_completion_request_message_function_call;
}


#ifdef chat_completion_request_message_function_call_MAIN

void test_chat_completion_request_message_function_call(int include_optional) {
    chat_completion_request_message_function_call_t* chat_completion_request_message_function_call_1 = instantiate_chat_completion_request_message_function_call(include_optional);

	cJSON* jsonchat_completion_request_message_function_call_1 = chat_completion_request_message_function_call_convertToJSON(chat_completion_request_message_function_call_1);
	printf("chat_completion_request_message_function_call :\n%s\n", cJSON_Print(jsonchat_completion_request_message_function_call_1));
	chat_completion_request_message_function_call_t* chat_completion_request_message_function_call_2 = chat_completion_request_message_function_call_parseFromJSON(jsonchat_completion_request_message_function_call_1);
	cJSON* jsonchat_completion_request_message_function_call_2 = chat_completion_request_message_function_call_convertToJSON(chat_completion_request_message_function_call_2);
	printf("repeating chat_completion_request_message_function_call:\n%s\n", cJSON_Print(jsonchat_completion_request_message_function_call_2));
}

int main() {
  test_chat_completion_request_message_function_call(1);
  test_chat_completion_request_message_function_call(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_request_message_function_call_MAIN
#endif // chat_completion_request_message_function_call_TEST
