#ifndef chat_completion_request_tool_message_content_TEST
#define chat_completion_request_tool_message_content_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_request_tool_message_content_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_request_tool_message_content.h"
chat_completion_request_tool_message_content_t* instantiate_chat_completion_request_tool_message_content(int include_optional);



chat_completion_request_tool_message_content_t* instantiate_chat_completion_request_tool_message_content(int include_optional) {
  chat_completion_request_tool_message_content_t* chat_completion_request_tool_message_content = NULL;
  if (include_optional) {
    chat_completion_request_tool_message_content = chat_completion_request_tool_message_content_create(
    );
  } else {
    chat_completion_request_tool_message_content = chat_completion_request_tool_message_content_create(
    );
  }

  return chat_completion_request_tool_message_content;
}


#ifdef chat_completion_request_tool_message_content_MAIN

void test_chat_completion_request_tool_message_content(int include_optional) {
    chat_completion_request_tool_message_content_t* chat_completion_request_tool_message_content_1 = instantiate_chat_completion_request_tool_message_content(include_optional);

	cJSON* jsonchat_completion_request_tool_message_content_1 = chat_completion_request_tool_message_content_convertToJSON(chat_completion_request_tool_message_content_1);
	printf("chat_completion_request_tool_message_content :\n%s\n", cJSON_Print(jsonchat_completion_request_tool_message_content_1));
	chat_completion_request_tool_message_content_t* chat_completion_request_tool_message_content_2 = chat_completion_request_tool_message_content_parseFromJSON(jsonchat_completion_request_tool_message_content_1);
	cJSON* jsonchat_completion_request_tool_message_content_2 = chat_completion_request_tool_message_content_convertToJSON(chat_completion_request_tool_message_content_2);
	printf("repeating chat_completion_request_tool_message_content:\n%s\n", cJSON_Print(jsonchat_completion_request_tool_message_content_2));
}

int main() {
  test_chat_completion_request_tool_message_content(1);
  test_chat_completion_request_tool_message_content(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_request_tool_message_content_MAIN
#endif // chat_completion_request_tool_message_content_TEST
