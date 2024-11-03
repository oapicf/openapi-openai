#ifndef chat_completion_request_message_content_part_image_TEST
#define chat_completion_request_message_content_part_image_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_request_message_content_part_image_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_request_message_content_part_image.h"
chat_completion_request_message_content_part_image_t* instantiate_chat_completion_request_message_content_part_image(int include_optional);

#include "test_chat_completion_request_message_content_part_image_image_url.c"


chat_completion_request_message_content_part_image_t* instantiate_chat_completion_request_message_content_part_image(int include_optional) {
  chat_completion_request_message_content_part_image_t* chat_completion_request_message_content_part_image = NULL;
  if (include_optional) {
    chat_completion_request_message_content_part_image = chat_completion_request_message_content_part_image_create(
      openai_api_chat_completion_request_message_content_part_image_TYPE_image_url,
       // false, not to have infinite recursion
      instantiate_chat_completion_request_message_content_part_image_image_url(0)
    );
  } else {
    chat_completion_request_message_content_part_image = chat_completion_request_message_content_part_image_create(
      openai_api_chat_completion_request_message_content_part_image_TYPE_image_url,
      NULL
    );
  }

  return chat_completion_request_message_content_part_image;
}


#ifdef chat_completion_request_message_content_part_image_MAIN

void test_chat_completion_request_message_content_part_image(int include_optional) {
    chat_completion_request_message_content_part_image_t* chat_completion_request_message_content_part_image_1 = instantiate_chat_completion_request_message_content_part_image(include_optional);

	cJSON* jsonchat_completion_request_message_content_part_image_1 = chat_completion_request_message_content_part_image_convertToJSON(chat_completion_request_message_content_part_image_1);
	printf("chat_completion_request_message_content_part_image :\n%s\n", cJSON_Print(jsonchat_completion_request_message_content_part_image_1));
	chat_completion_request_message_content_part_image_t* chat_completion_request_message_content_part_image_2 = chat_completion_request_message_content_part_image_parseFromJSON(jsonchat_completion_request_message_content_part_image_1);
	cJSON* jsonchat_completion_request_message_content_part_image_2 = chat_completion_request_message_content_part_image_convertToJSON(chat_completion_request_message_content_part_image_2);
	printf("repeating chat_completion_request_message_content_part_image:\n%s\n", cJSON_Print(jsonchat_completion_request_message_content_part_image_2));
}

int main() {
  test_chat_completion_request_message_content_part_image(1);
  test_chat_completion_request_message_content_part_image(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_request_message_content_part_image_MAIN
#endif // chat_completion_request_message_content_part_image_TEST
