#ifndef usage_time_bucket_TEST
#define usage_time_bucket_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define usage_time_bucket_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/usage_time_bucket.h"
usage_time_bucket_t* instantiate_usage_time_bucket(int include_optional);



usage_time_bucket_t* instantiate_usage_time_bucket(int include_optional) {
  usage_time_bucket_t* usage_time_bucket = NULL;
  if (include_optional) {
    usage_time_bucket = usage_time_bucket_create(
      openai_api_usage_time_bucket_OBJECT_bucket,
      56,
      56,
      list_createList()
    );
  } else {
    usage_time_bucket = usage_time_bucket_create(
      openai_api_usage_time_bucket_OBJECT_bucket,
      56,
      56,
      list_createList()
    );
  }

  return usage_time_bucket;
}


#ifdef usage_time_bucket_MAIN

void test_usage_time_bucket(int include_optional) {
    usage_time_bucket_t* usage_time_bucket_1 = instantiate_usage_time_bucket(include_optional);

	cJSON* jsonusage_time_bucket_1 = usage_time_bucket_convertToJSON(usage_time_bucket_1);
	printf("usage_time_bucket :\n%s\n", cJSON_Print(jsonusage_time_bucket_1));
	usage_time_bucket_t* usage_time_bucket_2 = usage_time_bucket_parseFromJSON(jsonusage_time_bucket_1);
	cJSON* jsonusage_time_bucket_2 = usage_time_bucket_convertToJSON(usage_time_bucket_2);
	printf("repeating usage_time_bucket:\n%s\n", cJSON_Print(jsonusage_time_bucket_2));
}

int main() {
  test_usage_time_bucket(1);
  test_usage_time_bucket(0);

  printf("Hello world \n");
  return 0;
}

#endif // usage_time_bucket_MAIN
#endif // usage_time_bucket_TEST
