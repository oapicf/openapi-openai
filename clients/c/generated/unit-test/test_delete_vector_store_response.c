#ifndef delete_vector_store_response_TEST
#define delete_vector_store_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_vector_store_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_vector_store_response.h"
delete_vector_store_response_t* instantiate_delete_vector_store_response(int include_optional);



delete_vector_store_response_t* instantiate_delete_vector_store_response(int include_optional) {
  delete_vector_store_response_t* delete_vector_store_response = NULL;
  if (include_optional) {
    delete_vector_store_response = delete_vector_store_response_create(
      "0",
      1,
      openai_api_delete_vector_store_response_OBJECT_vector_store.deleted
    );
  } else {
    delete_vector_store_response = delete_vector_store_response_create(
      "0",
      1,
      openai_api_delete_vector_store_response_OBJECT_vector_store.deleted
    );
  }

  return delete_vector_store_response;
}


#ifdef delete_vector_store_response_MAIN

void test_delete_vector_store_response(int include_optional) {
    delete_vector_store_response_t* delete_vector_store_response_1 = instantiate_delete_vector_store_response(include_optional);

	cJSON* jsondelete_vector_store_response_1 = delete_vector_store_response_convertToJSON(delete_vector_store_response_1);
	printf("delete_vector_store_response :\n%s\n", cJSON_Print(jsondelete_vector_store_response_1));
	delete_vector_store_response_t* delete_vector_store_response_2 = delete_vector_store_response_parseFromJSON(jsondelete_vector_store_response_1);
	cJSON* jsondelete_vector_store_response_2 = delete_vector_store_response_convertToJSON(delete_vector_store_response_2);
	printf("repeating delete_vector_store_response:\n%s\n", cJSON_Print(jsondelete_vector_store_response_2));
}

int main() {
  test_delete_vector_store_response(1);
  test_delete_vector_store_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_vector_store_response_MAIN
#endif // delete_vector_store_response_TEST
