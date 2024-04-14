#ifndef create_thread_request_TEST
#define create_thread_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_thread_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_thread_request.h"
create_thread_request_t* instantiate_create_thread_request(int include_optional);



create_thread_request_t* instantiate_create_thread_request(int include_optional) {
  create_thread_request_t* create_thread_request = NULL;
  if (include_optional) {
    create_thread_request = create_thread_request_create(
      list_createList(),
      0
    );
  } else {
    create_thread_request = create_thread_request_create(
      list_createList(),
      0
    );
  }

  return create_thread_request;
}


#ifdef create_thread_request_MAIN

void test_create_thread_request(int include_optional) {
    create_thread_request_t* create_thread_request_1 = instantiate_create_thread_request(include_optional);

	cJSON* jsoncreate_thread_request_1 = create_thread_request_convertToJSON(create_thread_request_1);
	printf("create_thread_request :\n%s\n", cJSON_Print(jsoncreate_thread_request_1));
	create_thread_request_t* create_thread_request_2 = create_thread_request_parseFromJSON(jsoncreate_thread_request_1);
	cJSON* jsoncreate_thread_request_2 = create_thread_request_convertToJSON(create_thread_request_2);
	printf("repeating create_thread_request:\n%s\n", cJSON_Print(jsoncreate_thread_request_2));
}

int main() {
  test_create_thread_request(1);
  test_create_thread_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_thread_request_MAIN
#endif // create_thread_request_TEST
