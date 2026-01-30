#ifndef vector_store_file_object_chunking_strategy_TEST
#define vector_store_file_object_chunking_strategy_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define vector_store_file_object_chunking_strategy_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/vector_store_file_object_chunking_strategy.h"
vector_store_file_object_chunking_strategy_t* instantiate_vector_store_file_object_chunking_strategy(int include_optional);

#include "test_static_chunking_strategy.c"


vector_store_file_object_chunking_strategy_t* instantiate_vector_store_file_object_chunking_strategy(int include_optional) {
  vector_store_file_object_chunking_strategy_t* vector_store_file_object_chunking_strategy = NULL;
  if (include_optional) {
    vector_store_file_object_chunking_strategy = vector_store_file_object_chunking_strategy_create(
      openai_api_vector_store_file_object_chunking_strategy_TYPE_static,
       // false, not to have infinite recursion
      instantiate_static_chunking_strategy(0)
    );
  } else {
    vector_store_file_object_chunking_strategy = vector_store_file_object_chunking_strategy_create(
      openai_api_vector_store_file_object_chunking_strategy_TYPE_static,
      NULL
    );
  }

  return vector_store_file_object_chunking_strategy;
}


#ifdef vector_store_file_object_chunking_strategy_MAIN

void test_vector_store_file_object_chunking_strategy(int include_optional) {
    vector_store_file_object_chunking_strategy_t* vector_store_file_object_chunking_strategy_1 = instantiate_vector_store_file_object_chunking_strategy(include_optional);

	cJSON* jsonvector_store_file_object_chunking_strategy_1 = vector_store_file_object_chunking_strategy_convertToJSON(vector_store_file_object_chunking_strategy_1);
	printf("vector_store_file_object_chunking_strategy :\n%s\n", cJSON_Print(jsonvector_store_file_object_chunking_strategy_1));
	vector_store_file_object_chunking_strategy_t* vector_store_file_object_chunking_strategy_2 = vector_store_file_object_chunking_strategy_parseFromJSON(jsonvector_store_file_object_chunking_strategy_1);
	cJSON* jsonvector_store_file_object_chunking_strategy_2 = vector_store_file_object_chunking_strategy_convertToJSON(vector_store_file_object_chunking_strategy_2);
	printf("repeating vector_store_file_object_chunking_strategy:\n%s\n", cJSON_Print(jsonvector_store_file_object_chunking_strategy_2));
}

int main() {
  test_vector_store_file_object_chunking_strategy(1);
  test_vector_store_file_object_chunking_strategy(0);

  printf("Hello world \n");
  return 0;
}

#endif // vector_store_file_object_chunking_strategy_MAIN
#endif // vector_store_file_object_chunking_strategy_TEST
