#ifndef vector_store_object_file_counts_TEST
#define vector_store_object_file_counts_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define vector_store_object_file_counts_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/vector_store_object_file_counts.h"
vector_store_object_file_counts_t* instantiate_vector_store_object_file_counts(int include_optional);



vector_store_object_file_counts_t* instantiate_vector_store_object_file_counts(int include_optional) {
  vector_store_object_file_counts_t* vector_store_object_file_counts = NULL;
  if (include_optional) {
    vector_store_object_file_counts = vector_store_object_file_counts_create(
      56,
      56,
      56,
      56,
      56
    );
  } else {
    vector_store_object_file_counts = vector_store_object_file_counts_create(
      56,
      56,
      56,
      56,
      56
    );
  }

  return vector_store_object_file_counts;
}


#ifdef vector_store_object_file_counts_MAIN

void test_vector_store_object_file_counts(int include_optional) {
    vector_store_object_file_counts_t* vector_store_object_file_counts_1 = instantiate_vector_store_object_file_counts(include_optional);

	cJSON* jsonvector_store_object_file_counts_1 = vector_store_object_file_counts_convertToJSON(vector_store_object_file_counts_1);
	printf("vector_store_object_file_counts :\n%s\n", cJSON_Print(jsonvector_store_object_file_counts_1));
	vector_store_object_file_counts_t* vector_store_object_file_counts_2 = vector_store_object_file_counts_parseFromJSON(jsonvector_store_object_file_counts_1);
	cJSON* jsonvector_store_object_file_counts_2 = vector_store_object_file_counts_convertToJSON(vector_store_object_file_counts_2);
	printf("repeating vector_store_object_file_counts:\n%s\n", cJSON_Print(jsonvector_store_object_file_counts_2));
}

int main() {
  test_vector_store_object_file_counts(1);
  test_vector_store_object_file_counts(0);

  printf("Hello world \n");
  return 0;
}

#endif // vector_store_object_file_counts_MAIN
#endif // vector_store_object_file_counts_TEST
