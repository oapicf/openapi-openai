import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ModelsApi
void main() {
  final instance = Openapi().getModelsApi();

  group(ModelsApi, () {
    // Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
    //
    //Future<DeleteModelResponse> deleteModel(String model) async
    test('test deleteModel', () async {
      // TODO
    });

    // Lists the currently available models, and provides basic information about each one such as the owner and availability.
    //
    //Future<ListModelsResponse> listModels() async
    test('test listModels', () async {
      // TODO
    });

    // Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    //
    //Future<Model> retrieveModel(String model) async
    test('test retrieveModel', () async {
      // TODO
    });

  });
}
