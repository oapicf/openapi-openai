import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateFineTuningJobRequestIntegrationsInnerWandb
void main() {
  final instance = CreateFineTuningJobRequestIntegrationsInnerWandbBuilder();
  // TODO add properties to the builder and call build()

  group(CreateFineTuningJobRequestIntegrationsInnerWandb, () {
    // The name of the project that the new run will be created under. 
    // String project
    test('to test the property `project`', () async {
      // TODO
    });

    // A display name to set for the run. If not set, we will use the Job ID as the name. 
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // The entity to use for the run. This allows you to set the team or username of the WandB user that you would like associated with the run. If not set, the default entity for the registered WandB API key is used. 
    // String entity
    test('to test the property `entity`', () async {
      // TODO
    });

    // A list of tags to be attached to the newly created run. These tags are passed through directly to WandB. Some default tags are generated by OpenAI: \"openai/finetune\", \"openai/{base-model}\", \"openai/{ftjob-abcdef}\". 
    // BuiltList<String> tags
    test('to test the property `tags`', () async {
      // TODO
    });

  });
}
