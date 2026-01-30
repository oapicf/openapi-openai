#ifndef chat_completion_request_message_content_part_refusal_TEST
#define chat_completion_request_message_content_part_refusal_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_request_message_content_part_refusal_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_request_message_content_part_refusal.h"
chat_completion_request_message_content_part_refusal_t* instantiate_chat_completion_request_message_content_part_refusal(int include_optional);



chat_completion_request_message_content_part_refusal_t* instantiate_chat_completion_request_message_content_part_refusal(int include_optional) {
  chat_completion_request_message_content_part_refusal_t* chat_completion_request_message_content_part_refusal = NULL;
  if (include_optional) {
    chat_completion_request_message_content_part_refusal = chat_completion_request_message_content_part_refusal_create(
      openai_api_chat_completion_request_message_content_part_refusal_TYPE_refusal,
      "0"
    );
  } else {
    chat_completion_request_message_content_part_refusal = chat_completion_request_message_content_part_refusal_create(
      openai_api_chat_completion_request_message_content_part_refusal_TYPE_refusal,
      "0"
    );
  }

  return chat_completion_request_message_content_part_refusal;
}


#ifdef chat_completion_request_message_content_part_refusal_MAIN

void test_chat_completion_request_message_content_part_refusal(int include_optional) {
    chat_completion_request_message_content_part_refusal_t* chat_completion_request_message_content_part_refusal_1 = instantiate_chat_completion_request_message_content_part_refusal(include_optional);

	cJSON* jsonchat_completion_request_message_content_part_refusal_1 = chat_completion_request_message_content_part_refusal_convertToJSON(chat_completion_request_message_content_part_refusal_1);
	printf("chat_completion_request_message_content_part_refusal :\n%s\n", cJSON_Print(jsonchat_completion_request_message_content_part_refusal_1));
	chat_completion_request_message_content_part_refusal_t* chat_completion_request_message_content_part_refusal_2 = chat_completion_request_message_content_part_refusal_parseFromJSON(jsonchat_completion_request_message_content_part_refusal_1);
	cJSON* jsonchat_completion_request_message_content_part_refusal_2 = chat_completion_request_message_content_part_refusal_convertToJSON(chat_completion_request_message_content_part_refusal_2);
	printf("repeating chat_completion_request_message_content_part_refusal:\n%s\n", cJSON_Print(jsonchat_completion_request_message_content_part_refusal_2));
}

int main() {
  test_chat_completion_request_message_content_part_refusal(1);
  test_chat_completion_request_message_content_part_refusal(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_request_message_content_part_refusal_MAIN
#endif // chat_completion_request_message_content_part_refusal_TEST
