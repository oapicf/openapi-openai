#ifndef delete_model_response_TEST
#define delete_model_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_model_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_model_response.h"
delete_model_response_t* instantiate_delete_model_response(int include_optional);



delete_model_response_t* instantiate_delete_model_response(int include_optional) {
  delete_model_response_t* delete_model_response = NULL;
  if (include_optional) {
    delete_model_response = delete_model_response_create(
      "0",
      "0",
      1
    );
  } else {
    delete_model_response = delete_model_response_create(
      "0",
      "0",
      1
    );
  }

  return delete_model_response;
}


#ifdef delete_model_response_MAIN

void test_delete_model_response(int include_optional) {
    delete_model_response_t* delete_model_response_1 = instantiate_delete_model_response(include_optional);

	cJSON* jsondelete_model_response_1 = delete_model_response_convertToJSON(delete_model_response_1);
	printf("delete_model_response :\n%s\n", cJSON_Print(jsondelete_model_response_1));
	delete_model_response_t* delete_model_response_2 = delete_model_response_parseFromJSON(jsondelete_model_response_1);
	cJSON* jsondelete_model_response_2 = delete_model_response_convertToJSON(delete_model_response_2);
	printf("repeating delete_model_response:\n%s\n", cJSON_Print(jsondelete_model_response_2));
}

int main() {
  test_delete_model_response(1);
  test_delete_model_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_model_response_MAIN
#endif // delete_model_response_TEST
