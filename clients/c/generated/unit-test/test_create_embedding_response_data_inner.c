#ifndef create_embedding_response_data_inner_TEST
#define create_embedding_response_data_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_embedding_response_data_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_embedding_response_data_inner.h"
create_embedding_response_data_inner_t* instantiate_create_embedding_response_data_inner(int include_optional);



create_embedding_response_data_inner_t* instantiate_create_embedding_response_data_inner(int include_optional) {
  create_embedding_response_data_inner_t* create_embedding_response_data_inner = NULL;
  if (include_optional) {
    create_embedding_response_data_inner = create_embedding_response_data_inner_create(
      56,
      "0",
      list_createList()
    );
  } else {
    create_embedding_response_data_inner = create_embedding_response_data_inner_create(
      56,
      "0",
      list_createList()
    );
  }

  return create_embedding_response_data_inner;
}


#ifdef create_embedding_response_data_inner_MAIN

void test_create_embedding_response_data_inner(int include_optional) {
    create_embedding_response_data_inner_t* create_embedding_response_data_inner_1 = instantiate_create_embedding_response_data_inner(include_optional);

	cJSON* jsoncreate_embedding_response_data_inner_1 = create_embedding_response_data_inner_convertToJSON(create_embedding_response_data_inner_1);
	printf("create_embedding_response_data_inner :\n%s\n", cJSON_Print(jsoncreate_embedding_response_data_inner_1));
	create_embedding_response_data_inner_t* create_embedding_response_data_inner_2 = create_embedding_response_data_inner_parseFromJSON(jsoncreate_embedding_response_data_inner_1);
	cJSON* jsoncreate_embedding_response_data_inner_2 = create_embedding_response_data_inner_convertToJSON(create_embedding_response_data_inner_2);
	printf("repeating create_embedding_response_data_inner:\n%s\n", cJSON_Print(jsoncreate_embedding_response_data_inner_2));
}

int main() {
  test_create_embedding_response_data_inner(1);
  test_create_embedding_response_data_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_embedding_response_data_inner_MAIN
#endif // create_embedding_response_data_inner_TEST
