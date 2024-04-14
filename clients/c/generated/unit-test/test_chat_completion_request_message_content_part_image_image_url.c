#ifndef chat_completion_request_message_content_part_image_image_url_TEST
#define chat_completion_request_message_content_part_image_image_url_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_request_message_content_part_image_image_url_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_request_message_content_part_image_image_url.h"
chat_completion_request_message_content_part_image_image_url_t* instantiate_chat_completion_request_message_content_part_image_image_url(int include_optional);



chat_completion_request_message_content_part_image_image_url_t* instantiate_chat_completion_request_message_content_part_image_image_url(int include_optional) {
  chat_completion_request_message_content_part_image_image_url_t* chat_completion_request_message_content_part_image_image_url = NULL;
  if (include_optional) {
    chat_completion_request_message_content_part_image_image_url = chat_completion_request_message_content_part_image_image_url_create(
      "0",
      openai_api_chat_completion_request_message_content_part_image_image_url_DETAIL_"auto"
    );
  } else {
    chat_completion_request_message_content_part_image_image_url = chat_completion_request_message_content_part_image_image_url_create(
      "0",
      openai_api_chat_completion_request_message_content_part_image_image_url_DETAIL_"auto"
    );
  }

  return chat_completion_request_message_content_part_image_image_url;
}


#ifdef chat_completion_request_message_content_part_image_image_url_MAIN

void test_chat_completion_request_message_content_part_image_image_url(int include_optional) {
    chat_completion_request_message_content_part_image_image_url_t* chat_completion_request_message_content_part_image_image_url_1 = instantiate_chat_completion_request_message_content_part_image_image_url(include_optional);

	cJSON* jsonchat_completion_request_message_content_part_image_image_url_1 = chat_completion_request_message_content_part_image_image_url_convertToJSON(chat_completion_request_message_content_part_image_image_url_1);
	printf("chat_completion_request_message_content_part_image_image_url :\n%s\n", cJSON_Print(jsonchat_completion_request_message_content_part_image_image_url_1));
	chat_completion_request_message_content_part_image_image_url_t* chat_completion_request_message_content_part_image_image_url_2 = chat_completion_request_message_content_part_image_image_url_parseFromJSON(jsonchat_completion_request_message_content_part_image_image_url_1);
	cJSON* jsonchat_completion_request_message_content_part_image_image_url_2 = chat_completion_request_message_content_part_image_image_url_convertToJSON(chat_completion_request_message_content_part_image_image_url_2);
	printf("repeating chat_completion_request_message_content_part_image_image_url:\n%s\n", cJSON_Print(jsonchat_completion_request_message_content_part_image_image_url_2));
}

int main() {
  test_chat_completion_request_message_content_part_image_image_url(1);
  test_chat_completion_request_message_content_part_image_image_url(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_request_message_content_part_image_image_url_MAIN
#endif // chat_completion_request_message_content_part_image_image_url_TEST
