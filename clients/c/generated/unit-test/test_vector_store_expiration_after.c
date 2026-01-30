#ifndef vector_store_expiration_after_TEST
#define vector_store_expiration_after_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define vector_store_expiration_after_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/vector_store_expiration_after.h"
vector_store_expiration_after_t* instantiate_vector_store_expiration_after(int include_optional);



vector_store_expiration_after_t* instantiate_vector_store_expiration_after(int include_optional) {
  vector_store_expiration_after_t* vector_store_expiration_after = NULL;
  if (include_optional) {
    vector_store_expiration_after = vector_store_expiration_after_create(
      openai_api_vector_store_expiration_after_ANCHOR_last_active_at,
      1
    );
  } else {
    vector_store_expiration_after = vector_store_expiration_after_create(
      openai_api_vector_store_expiration_after_ANCHOR_last_active_at,
      1
    );
  }

  return vector_store_expiration_after;
}


#ifdef vector_store_expiration_after_MAIN

void test_vector_store_expiration_after(int include_optional) {
    vector_store_expiration_after_t* vector_store_expiration_after_1 = instantiate_vector_store_expiration_after(include_optional);

	cJSON* jsonvector_store_expiration_after_1 = vector_store_expiration_after_convertToJSON(vector_store_expiration_after_1);
	printf("vector_store_expiration_after :\n%s\n", cJSON_Print(jsonvector_store_expiration_after_1));
	vector_store_expiration_after_t* vector_store_expiration_after_2 = vector_store_expiration_after_parseFromJSON(jsonvector_store_expiration_after_1);
	cJSON* jsonvector_store_expiration_after_2 = vector_store_expiration_after_convertToJSON(vector_store_expiration_after_2);
	printf("repeating vector_store_expiration_after:\n%s\n", cJSON_Print(jsonvector_store_expiration_after_2));
}

int main() {
  test_vector_store_expiration_after(1);
  test_vector_store_expiration_after(0);

  printf("Hello world \n");
  return 0;
}

#endif // vector_store_expiration_after_MAIN
#endif // vector_store_expiration_after_TEST
