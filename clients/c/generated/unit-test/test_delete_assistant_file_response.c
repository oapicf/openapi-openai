#ifndef delete_assistant_file_response_TEST
#define delete_assistant_file_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_assistant_file_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_assistant_file_response.h"
delete_assistant_file_response_t* instantiate_delete_assistant_file_response(int include_optional);



delete_assistant_file_response_t* instantiate_delete_assistant_file_response(int include_optional) {
  delete_assistant_file_response_t* delete_assistant_file_response = NULL;
  if (include_optional) {
    delete_assistant_file_response = delete_assistant_file_response_create(
      "0",
      1,
      openai_api_delete_assistant_file_response_OBJECT_assistant.file.deleted
    );
  } else {
    delete_assistant_file_response = delete_assistant_file_response_create(
      "0",
      1,
      openai_api_delete_assistant_file_response_OBJECT_assistant.file.deleted
    );
  }

  return delete_assistant_file_response;
}


#ifdef delete_assistant_file_response_MAIN

void test_delete_assistant_file_response(int include_optional) {
    delete_assistant_file_response_t* delete_assistant_file_response_1 = instantiate_delete_assistant_file_response(include_optional);

	cJSON* jsondelete_assistant_file_response_1 = delete_assistant_file_response_convertToJSON(delete_assistant_file_response_1);
	printf("delete_assistant_file_response :\n%s\n", cJSON_Print(jsondelete_assistant_file_response_1));
	delete_assistant_file_response_t* delete_assistant_file_response_2 = delete_assistant_file_response_parseFromJSON(jsondelete_assistant_file_response_1);
	cJSON* jsondelete_assistant_file_response_2 = delete_assistant_file_response_convertToJSON(delete_assistant_file_response_2);
	printf("repeating delete_assistant_file_response:\n%s\n", cJSON_Print(jsondelete_assistant_file_response_2));
}

int main() {
  test_delete_assistant_file_response(1);
  test_delete_assistant_file_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_assistant_file_response_MAIN
#endif // delete_assistant_file_response_TEST
