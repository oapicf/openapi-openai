#ifndef upload_part_TEST
#define upload_part_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define upload_part_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/upload_part.h"
upload_part_t* instantiate_upload_part(int include_optional);



upload_part_t* instantiate_upload_part(int include_optional) {
  upload_part_t* upload_part = NULL;
  if (include_optional) {
    upload_part = upload_part_create(
      "0",
      56,
      "0",
      openai_api_upload_part_OBJECT_upload.part
    );
  } else {
    upload_part = upload_part_create(
      "0",
      56,
      "0",
      openai_api_upload_part_OBJECT_upload.part
    );
  }

  return upload_part;
}


#ifdef upload_part_MAIN

void test_upload_part(int include_optional) {
    upload_part_t* upload_part_1 = instantiate_upload_part(include_optional);

	cJSON* jsonupload_part_1 = upload_part_convertToJSON(upload_part_1);
	printf("upload_part :\n%s\n", cJSON_Print(jsonupload_part_1));
	upload_part_t* upload_part_2 = upload_part_parseFromJSON(jsonupload_part_1);
	cJSON* jsonupload_part_2 = upload_part_convertToJSON(upload_part_2);
	printf("repeating upload_part:\n%s\n", cJSON_Print(jsonupload_part_2));
}

int main() {
  test_upload_part(1);
  test_upload_part(0);

  printf("Hello world \n");
  return 0;
}

#endif // upload_part_MAIN
#endif // upload_part_TEST
