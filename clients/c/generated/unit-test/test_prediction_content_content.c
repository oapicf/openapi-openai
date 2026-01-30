#ifndef prediction_content_content_TEST
#define prediction_content_content_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define prediction_content_content_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/prediction_content_content.h"
prediction_content_content_t* instantiate_prediction_content_content(int include_optional);



prediction_content_content_t* instantiate_prediction_content_content(int include_optional) {
  prediction_content_content_t* prediction_content_content = NULL;
  if (include_optional) {
    prediction_content_content = prediction_content_content_create(
    );
  } else {
    prediction_content_content = prediction_content_content_create(
    );
  }

  return prediction_content_content;
}


#ifdef prediction_content_content_MAIN

void test_prediction_content_content(int include_optional) {
    prediction_content_content_t* prediction_content_content_1 = instantiate_prediction_content_content(include_optional);

	cJSON* jsonprediction_content_content_1 = prediction_content_content_convertToJSON(prediction_content_content_1);
	printf("prediction_content_content :\n%s\n", cJSON_Print(jsonprediction_content_content_1));
	prediction_content_content_t* prediction_content_content_2 = prediction_content_content_parseFromJSON(jsonprediction_content_content_1);
	cJSON* jsonprediction_content_content_2 = prediction_content_content_convertToJSON(prediction_content_content_2);
	printf("repeating prediction_content_content:\n%s\n", cJSON_Print(jsonprediction_content_content_2));
}

int main() {
  test_prediction_content_content(1);
  test_prediction_content_content(0);

  printf("Hello world \n");
  return 0;
}

#endif // prediction_content_content_MAIN
#endif // prediction_content_content_TEST
