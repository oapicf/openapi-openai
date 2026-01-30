#ifndef create_upload_request_TEST
#define create_upload_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_upload_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_upload_request.h"
create_upload_request_t* instantiate_create_upload_request(int include_optional);



create_upload_request_t* instantiate_create_upload_request(int include_optional) {
  create_upload_request_t* create_upload_request = NULL;
  if (include_optional) {
    create_upload_request = create_upload_request_create(
      "0",
      openai_api_create_upload_request_PURPOSE_assistants,
      56,
      "0"
    );
  } else {
    create_upload_request = create_upload_request_create(
      "0",
      openai_api_create_upload_request_PURPOSE_assistants,
      56,
      "0"
    );
  }

  return create_upload_request;
}


#ifdef create_upload_request_MAIN

void test_create_upload_request(int include_optional) {
    create_upload_request_t* create_upload_request_1 = instantiate_create_upload_request(include_optional);

	cJSON* jsoncreate_upload_request_1 = create_upload_request_convertToJSON(create_upload_request_1);
	printf("create_upload_request :\n%s\n", cJSON_Print(jsoncreate_upload_request_1));
	create_upload_request_t* create_upload_request_2 = create_upload_request_parseFromJSON(jsoncreate_upload_request_1);
	cJSON* jsoncreate_upload_request_2 = create_upload_request_convertToJSON(create_upload_request_2);
	printf("repeating create_upload_request:\n%s\n", cJSON_Print(jsoncreate_upload_request_2));
}

int main() {
  test_create_upload_request(1);
  test_create_upload_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_upload_request_MAIN
#endif // create_upload_request_TEST
