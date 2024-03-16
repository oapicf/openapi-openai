#ifndef create_embedding_request_TEST
#define create_embedding_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_embedding_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_embedding_request.h"
create_embedding_request_t* instantiate_create_embedding_request(int include_optional);

#include "test_create_embedding_request_model.c"
#include "test_create_embedding_request_input.c"


create_embedding_request_t* instantiate_create_embedding_request(int include_optional) {
  create_embedding_request_t* create_embedding_request = NULL;
  if (include_optional) {
    create_embedding_request = create_embedding_request_create(
      text-embedding-ada-002,
      The quick brown fox jumped over the lazy dog,
      "user-1234"
    );
  } else {
    create_embedding_request = create_embedding_request_create(
      text-embedding-ada-002,
      The quick brown fox jumped over the lazy dog,
      "user-1234"
    );
  }

  return create_embedding_request;
}


#ifdef create_embedding_request_MAIN

void test_create_embedding_request(int include_optional) {
    create_embedding_request_t* create_embedding_request_1 = instantiate_create_embedding_request(include_optional);

	cJSON* jsoncreate_embedding_request_1 = create_embedding_request_convertToJSON(create_embedding_request_1);
	printf("create_embedding_request :\n%s\n", cJSON_Print(jsoncreate_embedding_request_1));
	create_embedding_request_t* create_embedding_request_2 = create_embedding_request_parseFromJSON(jsoncreate_embedding_request_1);
	cJSON* jsoncreate_embedding_request_2 = create_embedding_request_convertToJSON(create_embedding_request_2);
	printf("repeating create_embedding_request:\n%s\n", cJSON_Print(jsoncreate_embedding_request_2));
}

int main() {
  test_create_embedding_request(1);
  test_create_embedding_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_embedding_request_MAIN
#endif // create_embedding_request_TEST
