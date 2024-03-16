#ifndef create_embedding_response_TEST
#define create_embedding_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_embedding_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_embedding_response.h"
create_embedding_response_t* instantiate_create_embedding_response(int include_optional);

#include "test_create_embedding_response_usage.c"


create_embedding_response_t* instantiate_create_embedding_response(int include_optional) {
  create_embedding_response_t* create_embedding_response = NULL;
  if (include_optional) {
    create_embedding_response = create_embedding_response_create(
      "0",
      "0",
      list_createList(),
       // false, not to have infinite recursion
      instantiate_create_embedding_response_usage(0)
    );
  } else {
    create_embedding_response = create_embedding_response_create(
      "0",
      "0",
      list_createList(),
      NULL
    );
  }

  return create_embedding_response;
}


#ifdef create_embedding_response_MAIN

void test_create_embedding_response(int include_optional) {
    create_embedding_response_t* create_embedding_response_1 = instantiate_create_embedding_response(include_optional);

	cJSON* jsoncreate_embedding_response_1 = create_embedding_response_convertToJSON(create_embedding_response_1);
	printf("create_embedding_response :\n%s\n", cJSON_Print(jsoncreate_embedding_response_1));
	create_embedding_response_t* create_embedding_response_2 = create_embedding_response_parseFromJSON(jsoncreate_embedding_response_1);
	cJSON* jsoncreate_embedding_response_2 = create_embedding_response_convertToJSON(create_embedding_response_2);
	printf("repeating create_embedding_response:\n%s\n", cJSON_Print(jsoncreate_embedding_response_2));
}

int main() {
  test_create_embedding_response(1);
  test_create_embedding_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_embedding_response_MAIN
#endif // create_embedding_response_TEST
