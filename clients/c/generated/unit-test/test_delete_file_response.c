#ifndef delete_file_response_TEST
#define delete_file_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_file_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_file_response.h"
delete_file_response_t* instantiate_delete_file_response(int include_optional);



delete_file_response_t* instantiate_delete_file_response(int include_optional) {
  delete_file_response_t* delete_file_response = NULL;
  if (include_optional) {
    delete_file_response = delete_file_response_create(
      "0",
      openai_api_delete_file_response_OBJECT_file,
      1
    );
  } else {
    delete_file_response = delete_file_response_create(
      "0",
      openai_api_delete_file_response_OBJECT_file,
      1
    );
  }

  return delete_file_response;
}


#ifdef delete_file_response_MAIN

void test_delete_file_response(int include_optional) {
    delete_file_response_t* delete_file_response_1 = instantiate_delete_file_response(include_optional);

	cJSON* jsondelete_file_response_1 = delete_file_response_convertToJSON(delete_file_response_1);
	printf("delete_file_response :\n%s\n", cJSON_Print(jsondelete_file_response_1));
	delete_file_response_t* delete_file_response_2 = delete_file_response_parseFromJSON(jsondelete_file_response_1);
	cJSON* jsondelete_file_response_2 = delete_file_response_convertToJSON(delete_file_response_2);
	printf("repeating delete_file_response:\n%s\n", cJSON_Print(jsondelete_file_response_2));
}

int main() {
  test_delete_file_response(1);
  test_delete_file_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_file_response_MAIN
#endif // delete_file_response_TEST
