#ifndef vector_store_file_object_last_error_TEST
#define vector_store_file_object_last_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define vector_store_file_object_last_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/vector_store_file_object_last_error.h"
vector_store_file_object_last_error_t* instantiate_vector_store_file_object_last_error(int include_optional);



vector_store_file_object_last_error_t* instantiate_vector_store_file_object_last_error(int include_optional) {
  vector_store_file_object_last_error_t* vector_store_file_object_last_error = NULL;
  if (include_optional) {
    vector_store_file_object_last_error = vector_store_file_object_last_error_create(
      openai_api_vector_store_file_object_last_error_CODE_server_error,
      "0"
    );
  } else {
    vector_store_file_object_last_error = vector_store_file_object_last_error_create(
      openai_api_vector_store_file_object_last_error_CODE_server_error,
      "0"
    );
  }

  return vector_store_file_object_last_error;
}


#ifdef vector_store_file_object_last_error_MAIN

void test_vector_store_file_object_last_error(int include_optional) {
    vector_store_file_object_last_error_t* vector_store_file_object_last_error_1 = instantiate_vector_store_file_object_last_error(include_optional);

	cJSON* jsonvector_store_file_object_last_error_1 = vector_store_file_object_last_error_convertToJSON(vector_store_file_object_last_error_1);
	printf("vector_store_file_object_last_error :\n%s\n", cJSON_Print(jsonvector_store_file_object_last_error_1));
	vector_store_file_object_last_error_t* vector_store_file_object_last_error_2 = vector_store_file_object_last_error_parseFromJSON(jsonvector_store_file_object_last_error_1);
	cJSON* jsonvector_store_file_object_last_error_2 = vector_store_file_object_last_error_convertToJSON(vector_store_file_object_last_error_2);
	printf("repeating vector_store_file_object_last_error:\n%s\n", cJSON_Print(jsonvector_store_file_object_last_error_2));
}

int main() {
  test_vector_store_file_object_last_error(1);
  test_vector_store_file_object_last_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // vector_store_file_object_last_error_MAIN
#endif // vector_store_file_object_last_error_TEST
