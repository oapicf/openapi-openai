#ifndef upload_TEST
#define upload_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define upload_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/upload.h"
upload_t* instantiate_upload(int include_optional);

#include "test_open_ai_file.c"


upload_t* instantiate_upload(int include_optional) {
  upload_t* upload = NULL;
  if (include_optional) {
    upload = upload_create(
      "0",
      56,
      "0",
      56,
      "0",
      openai_api_upload_STATUS_pending,
      56,
      openai_api_upload_OBJECT_upload,
       // false, not to have infinite recursion
      instantiate_open_ai_file(0)
    );
  } else {
    upload = upload_create(
      "0",
      56,
      "0",
      56,
      "0",
      openai_api_upload_STATUS_pending,
      56,
      openai_api_upload_OBJECT_upload,
      NULL
    );
  }

  return upload;
}


#ifdef upload_MAIN

void test_upload(int include_optional) {
    upload_t* upload_1 = instantiate_upload(include_optional);

	cJSON* jsonupload_1 = upload_convertToJSON(upload_1);
	printf("upload :\n%s\n", cJSON_Print(jsonupload_1));
	upload_t* upload_2 = upload_parseFromJSON(jsonupload_1);
	cJSON* jsonupload_2 = upload_convertToJSON(upload_2);
	printf("repeating upload:\n%s\n", cJSON_Print(jsonupload_2));
}

int main() {
  test_upload(1);
  test_upload(0);

  printf("Hello world \n");
  return 0;
}

#endif // upload_MAIN
#endif // upload_TEST
