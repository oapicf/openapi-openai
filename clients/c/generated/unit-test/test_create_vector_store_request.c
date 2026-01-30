#ifndef create_vector_store_request_TEST
#define create_vector_store_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_vector_store_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_vector_store_request.h"
create_vector_store_request_t* instantiate_create_vector_store_request(int include_optional);

#include "test_vector_store_expiration_after.c"
#include "test_create_vector_store_request_chunking_strategy.c"


create_vector_store_request_t* instantiate_create_vector_store_request(int include_optional) {
  create_vector_store_request_t* create_vector_store_request = NULL;
  if (include_optional) {
    create_vector_store_request = create_vector_store_request_create(
      list_createList(),
      "0",
       // false, not to have infinite recursion
      instantiate_vector_store_expiration_after(0),
       // false, not to have infinite recursion
      instantiate_create_vector_store_request_chunking_strategy(0),
      0
    );
  } else {
    create_vector_store_request = create_vector_store_request_create(
      list_createList(),
      "0",
      NULL,
      NULL,
      0
    );
  }

  return create_vector_store_request;
}


#ifdef create_vector_store_request_MAIN

void test_create_vector_store_request(int include_optional) {
    create_vector_store_request_t* create_vector_store_request_1 = instantiate_create_vector_store_request(include_optional);

	cJSON* jsoncreate_vector_store_request_1 = create_vector_store_request_convertToJSON(create_vector_store_request_1);
	printf("create_vector_store_request :\n%s\n", cJSON_Print(jsoncreate_vector_store_request_1));
	create_vector_store_request_t* create_vector_store_request_2 = create_vector_store_request_parseFromJSON(jsoncreate_vector_store_request_1);
	cJSON* jsoncreate_vector_store_request_2 = create_vector_store_request_convertToJSON(create_vector_store_request_2);
	printf("repeating create_vector_store_request:\n%s\n", cJSON_Print(jsoncreate_vector_store_request_2));
}

int main() {
  test_create_vector_store_request(1);
  test_create_vector_store_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_vector_store_request_MAIN
#endif // create_vector_store_request_TEST
