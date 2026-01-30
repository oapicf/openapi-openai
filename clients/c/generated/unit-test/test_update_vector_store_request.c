#ifndef update_vector_store_request_TEST
#define update_vector_store_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_vector_store_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_vector_store_request.h"
update_vector_store_request_t* instantiate_update_vector_store_request(int include_optional);

#include "test_vector_store_expiration_after.c"


update_vector_store_request_t* instantiate_update_vector_store_request(int include_optional) {
  update_vector_store_request_t* update_vector_store_request = NULL;
  if (include_optional) {
    update_vector_store_request = update_vector_store_request_create(
      "0",
       // false, not to have infinite recursion
      instantiate_vector_store_expiration_after(0),
      0
    );
  } else {
    update_vector_store_request = update_vector_store_request_create(
      "0",
      NULL,
      0
    );
  }

  return update_vector_store_request;
}


#ifdef update_vector_store_request_MAIN

void test_update_vector_store_request(int include_optional) {
    update_vector_store_request_t* update_vector_store_request_1 = instantiate_update_vector_store_request(include_optional);

	cJSON* jsonupdate_vector_store_request_1 = update_vector_store_request_convertToJSON(update_vector_store_request_1);
	printf("update_vector_store_request :\n%s\n", cJSON_Print(jsonupdate_vector_store_request_1));
	update_vector_store_request_t* update_vector_store_request_2 = update_vector_store_request_parseFromJSON(jsonupdate_vector_store_request_1);
	cJSON* jsonupdate_vector_store_request_2 = update_vector_store_request_convertToJSON(update_vector_store_request_2);
	printf("repeating update_vector_store_request:\n%s\n", cJSON_Print(jsonupdate_vector_store_request_2));
}

int main() {
  test_update_vector_store_request(1);
  test_update_vector_store_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_vector_store_request_MAIN
#endif // update_vector_store_request_TEST
