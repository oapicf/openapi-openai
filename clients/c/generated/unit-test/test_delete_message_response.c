#ifndef delete_message_response_TEST
#define delete_message_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_message_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_message_response.h"
delete_message_response_t* instantiate_delete_message_response(int include_optional);



delete_message_response_t* instantiate_delete_message_response(int include_optional) {
  delete_message_response_t* delete_message_response = NULL;
  if (include_optional) {
    delete_message_response = delete_message_response_create(
      "0",
      1,
      openai_api_delete_message_response_OBJECT_thread.message.deleted
    );
  } else {
    delete_message_response = delete_message_response_create(
      "0",
      1,
      openai_api_delete_message_response_OBJECT_thread.message.deleted
    );
  }

  return delete_message_response;
}


#ifdef delete_message_response_MAIN

void test_delete_message_response(int include_optional) {
    delete_message_response_t* delete_message_response_1 = instantiate_delete_message_response(include_optional);

	cJSON* jsondelete_message_response_1 = delete_message_response_convertToJSON(delete_message_response_1);
	printf("delete_message_response :\n%s\n", cJSON_Print(jsondelete_message_response_1));
	delete_message_response_t* delete_message_response_2 = delete_message_response_parseFromJSON(jsondelete_message_response_1);
	cJSON* jsondelete_message_response_2 = delete_message_response_convertToJSON(delete_message_response_2);
	printf("repeating delete_message_response:\n%s\n", cJSON_Print(jsondelete_message_response_2));
}

int main() {
  test_delete_message_response(1);
  test_delete_message_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_message_response_MAIN
#endif // delete_message_response_TEST
