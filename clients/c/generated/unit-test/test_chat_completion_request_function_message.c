#ifndef chat_completion_request_function_message_TEST
#define chat_completion_request_function_message_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_request_function_message_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_request_function_message.h"
chat_completion_request_function_message_t* instantiate_chat_completion_request_function_message(int include_optional);



chat_completion_request_function_message_t* instantiate_chat_completion_request_function_message(int include_optional) {
  chat_completion_request_function_message_t* chat_completion_request_function_message = NULL;
  if (include_optional) {
    chat_completion_request_function_message = chat_completion_request_function_message_create(
      openai_api_chat_completion_request_function_message_ROLE_function,
      "0",
      "0"
    );
  } else {
    chat_completion_request_function_message = chat_completion_request_function_message_create(
      openai_api_chat_completion_request_function_message_ROLE_function,
      "0",
      "0"
    );
  }

  return chat_completion_request_function_message;
}


#ifdef chat_completion_request_function_message_MAIN

void test_chat_completion_request_function_message(int include_optional) {
    chat_completion_request_function_message_t* chat_completion_request_function_message_1 = instantiate_chat_completion_request_function_message(include_optional);

	cJSON* jsonchat_completion_request_function_message_1 = chat_completion_request_function_message_convertToJSON(chat_completion_request_function_message_1);
	printf("chat_completion_request_function_message :\n%s\n", cJSON_Print(jsonchat_completion_request_function_message_1));
	chat_completion_request_function_message_t* chat_completion_request_function_message_2 = chat_completion_request_function_message_parseFromJSON(jsonchat_completion_request_function_message_1);
	cJSON* jsonchat_completion_request_function_message_2 = chat_completion_request_function_message_convertToJSON(chat_completion_request_function_message_2);
	printf("repeating chat_completion_request_function_message:\n%s\n", cJSON_Print(jsonchat_completion_request_function_message_2));
}

int main() {
  test_chat_completion_request_function_message(1);
  test_chat_completion_request_function_message(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_request_function_message_MAIN
#endif // chat_completion_request_function_message_TEST
