#ifndef create_vector_store_file_batch_request_TEST
#define create_vector_store_file_batch_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_vector_store_file_batch_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_vector_store_file_batch_request.h"
create_vector_store_file_batch_request_t* instantiate_create_vector_store_file_batch_request(int include_optional);

#include "test_chunking_strategy_request_param.c"


create_vector_store_file_batch_request_t* instantiate_create_vector_store_file_batch_request(int include_optional) {
  create_vector_store_file_batch_request_t* create_vector_store_file_batch_request = NULL;
  if (include_optional) {
    create_vector_store_file_batch_request = create_vector_store_file_batch_request_create(
      list_createList(),
       // false, not to have infinite recursion
      instantiate_chunking_strategy_request_param(0)
    );
  } else {
    create_vector_store_file_batch_request = create_vector_store_file_batch_request_create(
      list_createList(),
      NULL
    );
  }

  return create_vector_store_file_batch_request;
}


#ifdef create_vector_store_file_batch_request_MAIN

void test_create_vector_store_file_batch_request(int include_optional) {
    create_vector_store_file_batch_request_t* create_vector_store_file_batch_request_1 = instantiate_create_vector_store_file_batch_request(include_optional);

	cJSON* jsoncreate_vector_store_file_batch_request_1 = create_vector_store_file_batch_request_convertToJSON(create_vector_store_file_batch_request_1);
	printf("create_vector_store_file_batch_request :\n%s\n", cJSON_Print(jsoncreate_vector_store_file_batch_request_1));
	create_vector_store_file_batch_request_t* create_vector_store_file_batch_request_2 = create_vector_store_file_batch_request_parseFromJSON(jsoncreate_vector_store_file_batch_request_1);
	cJSON* jsoncreate_vector_store_file_batch_request_2 = create_vector_store_file_batch_request_convertToJSON(create_vector_store_file_batch_request_2);
	printf("repeating create_vector_store_file_batch_request:\n%s\n", cJSON_Print(jsoncreate_vector_store_file_batch_request_2));
}

int main() {
  test_create_vector_store_file_batch_request(1);
  test_create_vector_store_file_batch_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_vector_store_file_batch_request_MAIN
#endif // create_vector_store_file_batch_request_TEST
