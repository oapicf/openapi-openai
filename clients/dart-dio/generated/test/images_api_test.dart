import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ImagesApi
void main() {
  final instance = Openapi().getImagesApi();

  group(ImagesApi, () {
    // Creates an image given a prompt.
    //
    //Future<ImagesResponse> createImage(CreateImageRequest createImageRequest) async
    test('test createImage', () async {
      // TODO
    });

    // Creates an edited or extended image given an original image and a prompt.
    //
    //Future<ImagesResponse> createImageEdit(MultipartFile image, String prompt, { MultipartFile mask, CreateImageEditRequestModel model, int n, String size, String responseFormat, String user }) async
    test('test createImageEdit', () async {
      // TODO
    });

    // Creates a variation of a given image.
    //
    //Future<ImagesResponse> createImageVariation(MultipartFile image, { CreateImageEditRequestModel model, int n, String responseFormat, String size, String user }) async
    test('test createImageVariation', () async {
      // TODO
    });

  });
}
