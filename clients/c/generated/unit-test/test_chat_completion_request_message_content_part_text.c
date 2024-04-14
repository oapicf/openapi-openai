#ifndef chat_completion_request_message_content_part_text_TEST
#define chat_completion_request_message_content_part_text_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_request_message_content_part_text_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_request_message_content_part_text.h"
chat_completion_request_message_content_part_text_t* instantiate_chat_completion_request_message_content_part_text(int include_optional);



chat_completion_request_message_content_part_text_t* instantiate_chat_completion_request_message_content_part_text(int include_optional) {
  chat_completion_request_message_content_part_text_t* chat_completion_request_message_content_part_text = NULL;
  if (include_optional) {
    chat_completion_request_message_content_part_text = chat_completion_request_message_content_part_text_create(
      openai_api_chat_completion_request_message_content_part_text_TYPE_text,
      "0"
    );
  } else {
    chat_completion_request_message_content_part_text = chat_completion_request_message_content_part_text_create(
      openai_api_chat_completion_request_message_content_part_text_TYPE_text,
      "0"
    );
  }

  return chat_completion_request_message_content_part_text;
}


#ifdef chat_completion_request_message_content_part_text_MAIN

void test_chat_completion_request_message_content_part_text(int include_optional) {
    chat_completion_request_message_content_part_text_t* chat_completion_request_message_content_part_text_1 = instantiate_chat_completion_request_message_content_part_text(include_optional);

	cJSON* jsonchat_completion_request_message_content_part_text_1 = chat_completion_request_message_content_part_text_convertToJSON(chat_completion_request_message_content_part_text_1);
	printf("chat_completion_request_message_content_part_text :\n%s\n", cJSON_Print(jsonchat_completion_request_message_content_part_text_1));
	chat_completion_request_message_content_part_text_t* chat_completion_request_message_content_part_text_2 = chat_completion_request_message_content_part_text_parseFromJSON(jsonchat_completion_request_message_content_part_text_1);
	cJSON* jsonchat_completion_request_message_content_part_text_2 = chat_completion_request_message_content_part_text_convertToJSON(chat_completion_request_message_content_part_text_2);
	printf("repeating chat_completion_request_message_content_part_text:\n%s\n", cJSON_Print(jsonchat_completion_request_message_content_part_text_2));
}

int main() {
  test_chat_completion_request_message_content_part_text(1);
  test_chat_completion_request_message_content_part_text(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_request_message_content_part_text_MAIN
#endif // chat_completion_request_message_content_part_text_TEST
