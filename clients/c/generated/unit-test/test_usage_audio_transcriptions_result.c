#ifndef usage_audio_transcriptions_result_TEST
#define usage_audio_transcriptions_result_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define usage_audio_transcriptions_result_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/usage_audio_transcriptions_result.h"
usage_audio_transcriptions_result_t* instantiate_usage_audio_transcriptions_result(int include_optional);



usage_audio_transcriptions_result_t* instantiate_usage_audio_transcriptions_result(int include_optional) {
  usage_audio_transcriptions_result_t* usage_audio_transcriptions_result = NULL;
  if (include_optional) {
    usage_audio_transcriptions_result = usage_audio_transcriptions_result_create(
      openai_api_usage_audio_transcriptions_result_OBJECT_organization.usage.audio_transcriptions.result,
      56,
      56,
      "0",
      "0",
      "0",
      "0"
    );
  } else {
    usage_audio_transcriptions_result = usage_audio_transcriptions_result_create(
      openai_api_usage_audio_transcriptions_result_OBJECT_organization.usage.audio_transcriptions.result,
      56,
      56,
      "0",
      "0",
      "0",
      "0"
    );
  }

  return usage_audio_transcriptions_result;
}


#ifdef usage_audio_transcriptions_result_MAIN

void test_usage_audio_transcriptions_result(int include_optional) {
    usage_audio_transcriptions_result_t* usage_audio_transcriptions_result_1 = instantiate_usage_audio_transcriptions_result(include_optional);

	cJSON* jsonusage_audio_transcriptions_result_1 = usage_audio_transcriptions_result_convertToJSON(usage_audio_transcriptions_result_1);
	printf("usage_audio_transcriptions_result :\n%s\n", cJSON_Print(jsonusage_audio_transcriptions_result_1));
	usage_audio_transcriptions_result_t* usage_audio_transcriptions_result_2 = usage_audio_transcriptions_result_parseFromJSON(jsonusage_audio_transcriptions_result_1);
	cJSON* jsonusage_audio_transcriptions_result_2 = usage_audio_transcriptions_result_convertToJSON(usage_audio_transcriptions_result_2);
	printf("repeating usage_audio_transcriptions_result:\n%s\n", cJSON_Print(jsonusage_audio_transcriptions_result_2));
}

int main() {
  test_usage_audio_transcriptions_result(1);
  test_usage_audio_transcriptions_result(0);

  printf("Hello world \n");
  return 0;
}

#endif // usage_audio_transcriptions_result_MAIN
#endif // usage_audio_transcriptions_result_TEST
