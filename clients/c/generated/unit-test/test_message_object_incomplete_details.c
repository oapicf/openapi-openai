#ifndef message_object_incomplete_details_TEST
#define message_object_incomplete_details_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define message_object_incomplete_details_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/message_object_incomplete_details.h"
message_object_incomplete_details_t* instantiate_message_object_incomplete_details(int include_optional);



message_object_incomplete_details_t* instantiate_message_object_incomplete_details(int include_optional) {
  message_object_incomplete_details_t* message_object_incomplete_details = NULL;
  if (include_optional) {
    message_object_incomplete_details = message_object_incomplete_details_create(
      openai_api_message_object_incomplete_details_REASON_content_filter
    );
  } else {
    message_object_incomplete_details = message_object_incomplete_details_create(
      openai_api_message_object_incomplete_details_REASON_content_filter
    );
  }

  return message_object_incomplete_details;
}


#ifdef message_object_incomplete_details_MAIN

void test_message_object_incomplete_details(int include_optional) {
    message_object_incomplete_details_t* message_object_incomplete_details_1 = instantiate_message_object_incomplete_details(include_optional);

	cJSON* jsonmessage_object_incomplete_details_1 = message_object_incomplete_details_convertToJSON(message_object_incomplete_details_1);
	printf("message_object_incomplete_details :\n%s\n", cJSON_Print(jsonmessage_object_incomplete_details_1));
	message_object_incomplete_details_t* message_object_incomplete_details_2 = message_object_incomplete_details_parseFromJSON(jsonmessage_object_incomplete_details_1);
	cJSON* jsonmessage_object_incomplete_details_2 = message_object_incomplete_details_convertToJSON(message_object_incomplete_details_2);
	printf("repeating message_object_incomplete_details:\n%s\n", cJSON_Print(jsonmessage_object_incomplete_details_2));
}

int main() {
  test_message_object_incomplete_details(1);
  test_message_object_incomplete_details(0);

  printf("Hello world \n");
  return 0;
}

#endif // message_object_incomplete_details_MAIN
#endif // message_object_incomplete_details_TEST
