#ifndef complete_upload_request_TEST
#define complete_upload_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define complete_upload_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/complete_upload_request.h"
complete_upload_request_t* instantiate_complete_upload_request(int include_optional);



complete_upload_request_t* instantiate_complete_upload_request(int include_optional) {
  complete_upload_request_t* complete_upload_request = NULL;
  if (include_optional) {
    complete_upload_request = complete_upload_request_create(
      list_createList(),
      "0"
    );
  } else {
    complete_upload_request = complete_upload_request_create(
      list_createList(),
      "0"
    );
  }

  return complete_upload_request;
}


#ifdef complete_upload_request_MAIN

void test_complete_upload_request(int include_optional) {
    complete_upload_request_t* complete_upload_request_1 = instantiate_complete_upload_request(include_optional);

	cJSON* jsoncomplete_upload_request_1 = complete_upload_request_convertToJSON(complete_upload_request_1);
	printf("complete_upload_request :\n%s\n", cJSON_Print(jsoncomplete_upload_request_1));
	complete_upload_request_t* complete_upload_request_2 = complete_upload_request_parseFromJSON(jsoncomplete_upload_request_1);
	cJSON* jsoncomplete_upload_request_2 = complete_upload_request_convertToJSON(complete_upload_request_2);
	printf("repeating complete_upload_request:\n%s\n", cJSON_Print(jsoncomplete_upload_request_2));
}

int main() {
  test_complete_upload_request(1);
  test_complete_upload_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // complete_upload_request_MAIN
#endif // complete_upload_request_TEST
