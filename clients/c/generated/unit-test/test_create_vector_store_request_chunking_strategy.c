#ifndef create_vector_store_request_chunking_strategy_TEST
#define create_vector_store_request_chunking_strategy_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_vector_store_request_chunking_strategy_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_vector_store_request_chunking_strategy.h"
create_vector_store_request_chunking_strategy_t* instantiate_create_vector_store_request_chunking_strategy(int include_optional);

#include "test_static_chunking_strategy.c"


create_vector_store_request_chunking_strategy_t* instantiate_create_vector_store_request_chunking_strategy(int include_optional) {
  create_vector_store_request_chunking_strategy_t* create_vector_store_request_chunking_strategy = NULL;
  if (include_optional) {
    create_vector_store_request_chunking_strategy = create_vector_store_request_chunking_strategy_create(
      openai_api_create_vector_store_request_chunking_strategy_TYPE_auto,
       // false, not to have infinite recursion
      instantiate_static_chunking_strategy(0)
    );
  } else {
    create_vector_store_request_chunking_strategy = create_vector_store_request_chunking_strategy_create(
      openai_api_create_vector_store_request_chunking_strategy_TYPE_auto,
      NULL
    );
  }

  return create_vector_store_request_chunking_strategy;
}


#ifdef create_vector_store_request_chunking_strategy_MAIN

void test_create_vector_store_request_chunking_strategy(int include_optional) {
    create_vector_store_request_chunking_strategy_t* create_vector_store_request_chunking_strategy_1 = instantiate_create_vector_store_request_chunking_strategy(include_optional);

	cJSON* jsoncreate_vector_store_request_chunking_strategy_1 = create_vector_store_request_chunking_strategy_convertToJSON(create_vector_store_request_chunking_strategy_1);
	printf("create_vector_store_request_chunking_strategy :\n%s\n", cJSON_Print(jsoncreate_vector_store_request_chunking_strategy_1));
	create_vector_store_request_chunking_strategy_t* create_vector_store_request_chunking_strategy_2 = create_vector_store_request_chunking_strategy_parseFromJSON(jsoncreate_vector_store_request_chunking_strategy_1);
	cJSON* jsoncreate_vector_store_request_chunking_strategy_2 = create_vector_store_request_chunking_strategy_convertToJSON(create_vector_store_request_chunking_strategy_2);
	printf("repeating create_vector_store_request_chunking_strategy:\n%s\n", cJSON_Print(jsoncreate_vector_store_request_chunking_strategy_2));
}

int main() {
  test_create_vector_store_request_chunking_strategy(1);
  test_create_vector_store_request_chunking_strategy(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_vector_store_request_chunking_strategy_MAIN
#endif // create_vector_store_request_chunking_strategy_TEST
