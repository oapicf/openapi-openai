#ifndef chat_completion_stream_response_delta_TEST
#define chat_completion_stream_response_delta_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_stream_response_delta_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_stream_response_delta.h"
chat_completion_stream_response_delta_t* instantiate_chat_completion_stream_response_delta(int include_optional);

#include "test_chat_completion_request_message_function_call.c"


chat_completion_stream_response_delta_t* instantiate_chat_completion_stream_response_delta(int include_optional) {
  chat_completion_stream_response_delta_t* chat_completion_stream_response_delta = NULL;
  if (include_optional) {
    chat_completion_stream_response_delta = chat_completion_stream_response_delta_create(
      openai_api_chat_completion_stream_response_delta_ROLE_system,
      "0",
       // false, not to have infinite recursion
      instantiate_chat_completion_request_message_function_call(0)
    );
  } else {
    chat_completion_stream_response_delta = chat_completion_stream_response_delta_create(
      openai_api_chat_completion_stream_response_delta_ROLE_system,
      "0",
      NULL
    );
  }

  return chat_completion_stream_response_delta;
}


#ifdef chat_completion_stream_response_delta_MAIN

void test_chat_completion_stream_response_delta(int include_optional) {
    chat_completion_stream_response_delta_t* chat_completion_stream_response_delta_1 = instantiate_chat_completion_stream_response_delta(include_optional);

	cJSON* jsonchat_completion_stream_response_delta_1 = chat_completion_stream_response_delta_convertToJSON(chat_completion_stream_response_delta_1);
	printf("chat_completion_stream_response_delta :\n%s\n", cJSON_Print(jsonchat_completion_stream_response_delta_1));
	chat_completion_stream_response_delta_t* chat_completion_stream_response_delta_2 = chat_completion_stream_response_delta_parseFromJSON(jsonchat_completion_stream_response_delta_1);
	cJSON* jsonchat_completion_stream_response_delta_2 = chat_completion_stream_response_delta_convertToJSON(chat_completion_stream_response_delta_2);
	printf("repeating chat_completion_stream_response_delta:\n%s\n", cJSON_Print(jsonchat_completion_stream_response_delta_2));
}

int main() {
  test_chat_completion_stream_response_delta(1);
  test_chat_completion_stream_response_delta(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_stream_response_delta_MAIN
#endif // chat_completion_stream_response_delta_TEST
