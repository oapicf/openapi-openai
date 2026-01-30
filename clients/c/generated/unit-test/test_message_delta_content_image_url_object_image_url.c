#ifndef message_delta_content_image_url_object_image_url_TEST
#define message_delta_content_image_url_object_image_url_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define message_delta_content_image_url_object_image_url_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/message_delta_content_image_url_object_image_url.h"
message_delta_content_image_url_object_image_url_t* instantiate_message_delta_content_image_url_object_image_url(int include_optional);



message_delta_content_image_url_object_image_url_t* instantiate_message_delta_content_image_url_object_image_url(int include_optional) {
  message_delta_content_image_url_object_image_url_t* message_delta_content_image_url_object_image_url = NULL;
  if (include_optional) {
    message_delta_content_image_url_object_image_url = message_delta_content_image_url_object_image_url_create(
      "0",
      openai_api_message_delta_content_image_url_object_image_url_DETAIL_"auto"
    );
  } else {
    message_delta_content_image_url_object_image_url = message_delta_content_image_url_object_image_url_create(
      "0",
      openai_api_message_delta_content_image_url_object_image_url_DETAIL_"auto"
    );
  }

  return message_delta_content_image_url_object_image_url;
}


#ifdef message_delta_content_image_url_object_image_url_MAIN

void test_message_delta_content_image_url_object_image_url(int include_optional) {
    message_delta_content_image_url_object_image_url_t* message_delta_content_image_url_object_image_url_1 = instantiate_message_delta_content_image_url_object_image_url(include_optional);

	cJSON* jsonmessage_delta_content_image_url_object_image_url_1 = message_delta_content_image_url_object_image_url_convertToJSON(message_delta_content_image_url_object_image_url_1);
	printf("message_delta_content_image_url_object_image_url :\n%s\n", cJSON_Print(jsonmessage_delta_content_image_url_object_image_url_1));
	message_delta_content_image_url_object_image_url_t* message_delta_content_image_url_object_image_url_2 = message_delta_content_image_url_object_image_url_parseFromJSON(jsonmessage_delta_content_image_url_object_image_url_1);
	cJSON* jsonmessage_delta_content_image_url_object_image_url_2 = message_delta_content_image_url_object_image_url_convertToJSON(message_delta_content_image_url_object_image_url_2);
	printf("repeating message_delta_content_image_url_object_image_url:\n%s\n", cJSON_Print(jsonmessage_delta_content_image_url_object_image_url_2));
}

int main() {
  test_message_delta_content_image_url_object_image_url(1);
  test_message_delta_content_image_url_object_image_url(0);

  printf("Hello world \n");
  return 0;
}

#endif // message_delta_content_image_url_object_image_url_MAIN
#endif // message_delta_content_image_url_object_image_url_TEST
