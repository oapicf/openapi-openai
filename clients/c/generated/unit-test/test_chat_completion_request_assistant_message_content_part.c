#ifndef chat_completion_request_assistant_message_content_part_TEST
#define chat_completion_request_assistant_message_content_part_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_request_assistant_message_content_part_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_request_assistant_message_content_part.h"
chat_completion_request_assistant_message_content_part_t* instantiate_chat_completion_request_assistant_message_content_part(int include_optional);



chat_completion_request_assistant_message_content_part_t* instantiate_chat_completion_request_assistant_message_content_part(int include_optional) {
  chat_completion_request_assistant_message_content_part_t* chat_completion_request_assistant_message_content_part = NULL;
  if (include_optional) {
    chat_completion_request_assistant_message_content_part = chat_completion_request_assistant_message_content_part_create(
      openai_api_chat_completion_request_assistant_message_content_part_TYPE_text,
      "0",
      "0"
    );
  } else {
    chat_completion_request_assistant_message_content_part = chat_completion_request_assistant_message_content_part_create(
      openai_api_chat_completion_request_assistant_message_content_part_TYPE_text,
      "0",
      "0"
    );
  }

  return chat_completion_request_assistant_message_content_part;
}


#ifdef chat_completion_request_assistant_message_content_part_MAIN

void test_chat_completion_request_assistant_message_content_part(int include_optional) {
    chat_completion_request_assistant_message_content_part_t* chat_completion_request_assistant_message_content_part_1 = instantiate_chat_completion_request_assistant_message_content_part(include_optional);

	cJSON* jsonchat_completion_request_assistant_message_content_part_1 = chat_completion_request_assistant_message_content_part_convertToJSON(chat_completion_request_assistant_message_content_part_1);
	printf("chat_completion_request_assistant_message_content_part :\n%s\n", cJSON_Print(jsonchat_completion_request_assistant_message_content_part_1));
	chat_completion_request_assistant_message_content_part_t* chat_completion_request_assistant_message_content_part_2 = chat_completion_request_assistant_message_content_part_parseFromJSON(jsonchat_completion_request_assistant_message_content_part_1);
	cJSON* jsonchat_completion_request_assistant_message_content_part_2 = chat_completion_request_assistant_message_content_part_convertToJSON(chat_completion_request_assistant_message_content_part_2);
	printf("repeating chat_completion_request_assistant_message_content_part:\n%s\n", cJSON_Print(jsonchat_completion_request_assistant_message_content_part_2));
}

int main() {
  test_chat_completion_request_assistant_message_content_part(1);
  test_chat_completion_request_assistant_message_content_part(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_request_assistant_message_content_part_MAIN
#endif // chat_completion_request_assistant_message_content_part_TEST
