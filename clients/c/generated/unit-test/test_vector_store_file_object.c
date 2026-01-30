#ifndef vector_store_file_object_TEST
#define vector_store_file_object_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define vector_store_file_object_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/vector_store_file_object.h"
vector_store_file_object_t* instantiate_vector_store_file_object(int include_optional);

#include "test_vector_store_file_object_last_error.c"
#include "test_vector_store_file_object_chunking_strategy.c"


vector_store_file_object_t* instantiate_vector_store_file_object(int include_optional) {
  vector_store_file_object_t* vector_store_file_object = NULL;
  if (include_optional) {
    vector_store_file_object = vector_store_file_object_create(
      "0",
      openai_api_vector_store_file_object_OBJECT_vector_store.file,
      56,
      56,
      "0",
      openai_api_vector_store_file_object_STATUS_in_progress,
       // false, not to have infinite recursion
      instantiate_vector_store_file_object_last_error(0),
       // false, not to have infinite recursion
      instantiate_vector_store_file_object_chunking_strategy(0)
    );
  } else {
    vector_store_file_object = vector_store_file_object_create(
      "0",
      openai_api_vector_store_file_object_OBJECT_vector_store.file,
      56,
      56,
      "0",
      openai_api_vector_store_file_object_STATUS_in_progress,
      NULL,
      NULL
    );
  }

  return vector_store_file_object;
}


#ifdef vector_store_file_object_MAIN

void test_vector_store_file_object(int include_optional) {
    vector_store_file_object_t* vector_store_file_object_1 = instantiate_vector_store_file_object(include_optional);

	cJSON* jsonvector_store_file_object_1 = vector_store_file_object_convertToJSON(vector_store_file_object_1);
	printf("vector_store_file_object :\n%s\n", cJSON_Print(jsonvector_store_file_object_1));
	vector_store_file_object_t* vector_store_file_object_2 = vector_store_file_object_parseFromJSON(jsonvector_store_file_object_1);
	cJSON* jsonvector_store_file_object_2 = vector_store_file_object_convertToJSON(vector_store_file_object_2);
	printf("repeating vector_store_file_object:\n%s\n", cJSON_Print(jsonvector_store_file_object_2));
}

int main() {
  test_vector_store_file_object(1);
  test_vector_store_file_object(0);

  printf("Hello world \n");
  return 0;
}

#endif // vector_store_file_object_MAIN
#endif // vector_store_file_object_TEST
