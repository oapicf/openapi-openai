#ifndef delete_thread_response_TEST
#define delete_thread_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_thread_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_thread_response.h"
delete_thread_response_t* instantiate_delete_thread_response(int include_optional);



delete_thread_response_t* instantiate_delete_thread_response(int include_optional) {
  delete_thread_response_t* delete_thread_response = NULL;
  if (include_optional) {
    delete_thread_response = delete_thread_response_create(
      "0",
      1,
      openai_api_delete_thread_response_OBJECT_thread.deleted
    );
  } else {
    delete_thread_response = delete_thread_response_create(
      "0",
      1,
      openai_api_delete_thread_response_OBJECT_thread.deleted
    );
  }

  return delete_thread_response;
}


#ifdef delete_thread_response_MAIN

void test_delete_thread_response(int include_optional) {
    delete_thread_response_t* delete_thread_response_1 = instantiate_delete_thread_response(include_optional);

	cJSON* jsondelete_thread_response_1 = delete_thread_response_convertToJSON(delete_thread_response_1);
	printf("delete_thread_response :\n%s\n", cJSON_Print(jsondelete_thread_response_1));
	delete_thread_response_t* delete_thread_response_2 = delete_thread_response_parseFromJSON(jsondelete_thread_response_1);
	cJSON* jsondelete_thread_response_2 = delete_thread_response_convertToJSON(delete_thread_response_2);
	printf("repeating delete_thread_response:\n%s\n", cJSON_Print(jsondelete_thread_response_2));
}

int main() {
  test_delete_thread_response(1);
  test_delete_thread_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_thread_response_MAIN
#endif // delete_thread_response_TEST
