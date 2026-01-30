#ifndef vector_store_object_TEST
#define vector_store_object_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define vector_store_object_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/vector_store_object.h"
vector_store_object_t* instantiate_vector_store_object(int include_optional);

#include "test_vector_store_object_file_counts.c"
#include "test_vector_store_expiration_after.c"


vector_store_object_t* instantiate_vector_store_object(int include_optional) {
  vector_store_object_t* vector_store_object = NULL;
  if (include_optional) {
    vector_store_object = vector_store_object_create(
      "0",
      openai_api_vector_store_object_OBJECT_vector_store,
      56,
      "0",
      56,
       // false, not to have infinite recursion
      instantiate_vector_store_object_file_counts(0),
      openai_api_vector_store_object_STATUS_expired,
       // false, not to have infinite recursion
      instantiate_vector_store_expiration_after(0),
      56,
      56,
      0
    );
  } else {
    vector_store_object = vector_store_object_create(
      "0",
      openai_api_vector_store_object_OBJECT_vector_store,
      56,
      "0",
      56,
      NULL,
      openai_api_vector_store_object_STATUS_expired,
      NULL,
      56,
      56,
      0
    );
  }

  return vector_store_object;
}


#ifdef vector_store_object_MAIN

void test_vector_store_object(int include_optional) {
    vector_store_object_t* vector_store_object_1 = instantiate_vector_store_object(include_optional);

	cJSON* jsonvector_store_object_1 = vector_store_object_convertToJSON(vector_store_object_1);
	printf("vector_store_object :\n%s\n", cJSON_Print(jsonvector_store_object_1));
	vector_store_object_t* vector_store_object_2 = vector_store_object_parseFromJSON(jsonvector_store_object_1);
	cJSON* jsonvector_store_object_2 = vector_store_object_convertToJSON(vector_store_object_2);
	printf("repeating vector_store_object:\n%s\n", cJSON_Print(jsonvector_store_object_2));
}

int main() {
  test_vector_store_object(1);
  test_vector_store_object(0);

  printf("Hello world \n");
  return 0;
}

#endif // vector_store_object_MAIN
#endif // vector_store_object_TEST
