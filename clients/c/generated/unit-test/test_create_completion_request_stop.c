#ifndef create_completion_request_stop_TEST
#define create_completion_request_stop_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_completion_request_stop_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_completion_request_stop.h"
create_completion_request_stop_t* instantiate_create_completion_request_stop(int include_optional);



create_completion_request_stop_t* instantiate_create_completion_request_stop(int include_optional) {
  create_completion_request_stop_t* create_completion_request_stop = NULL;
  if (include_optional) {
    create_completion_request_stop = create_completion_request_stop_create(
    );
  } else {
    create_completion_request_stop = create_completion_request_stop_create(
    );
  }

  return create_completion_request_stop;
}


#ifdef create_completion_request_stop_MAIN

void test_create_completion_request_stop(int include_optional) {
    create_completion_request_stop_t* create_completion_request_stop_1 = instantiate_create_completion_request_stop(include_optional);

	cJSON* jsoncreate_completion_request_stop_1 = create_completion_request_stop_convertToJSON(create_completion_request_stop_1);
	printf("create_completion_request_stop :\n%s\n", cJSON_Print(jsoncreate_completion_request_stop_1));
	create_completion_request_stop_t* create_completion_request_stop_2 = create_completion_request_stop_parseFromJSON(jsoncreate_completion_request_stop_1);
	cJSON* jsoncreate_completion_request_stop_2 = create_completion_request_stop_convertToJSON(create_completion_request_stop_2);
	printf("repeating create_completion_request_stop:\n%s\n", cJSON_Print(jsoncreate_completion_request_stop_2));
}

int main() {
  test_create_completion_request_stop(1);
  test_create_completion_request_stop(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_completion_request_stop_MAIN
#endif // create_completion_request_stop_TEST
