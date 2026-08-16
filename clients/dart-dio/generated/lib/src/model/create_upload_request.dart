//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_upload_request.g.dart';

/// CreateUploadRequest
///
/// Properties:
/// * [filename] - The name of the file to upload. 
/// * [purpose] - The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
/// * [bytes] - The number of bytes in the file you are uploading. 
/// * [mimeType] - The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. 
@BuiltValue()
abstract class CreateUploadRequest implements Built<CreateUploadRequest, CreateUploadRequestBuilder> {
  /// The name of the file to upload. 
  @BuiltValueField(wireName: r'filename')
  String get filename;

  /// The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
  @BuiltValueField(wireName: r'purpose')
  CreateUploadRequestPurposeEnum get purpose;
  // enum purposeEnum {  assistants,  batch,  fine-tune,  vision,  };

  /// The number of bytes in the file you are uploading. 
  @BuiltValueField(wireName: r'bytes')
  int get bytes;

  /// The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. 
  @BuiltValueField(wireName: r'mime_type')
  String get mimeType;

  CreateUploadRequest._();

  factory CreateUploadRequest([void updates(CreateUploadRequestBuilder b)]) = _$CreateUploadRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateUploadRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateUploadRequest> get serializer => _$CreateUploadRequestSerializer();
}

class _$CreateUploadRequestSerializer implements PrimitiveSerializer<CreateUploadRequest> {
  @override
  final Iterable<Type> types = const [CreateUploadRequest, _$CreateUploadRequest];

  @override
  final String wireName = r'CreateUploadRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateUploadRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'filename';
    yield serializers.serialize(
      object.filename,
      specifiedType: const FullType(String),
    );
    yield r'purpose';
    yield serializers.serialize(
      object.purpose,
      specifiedType: const FullType(CreateUploadRequestPurposeEnum),
    );
    yield r'bytes';
    yield serializers.serialize(
      object.bytes,
      specifiedType: const FullType(int),
    );
    yield r'mime_type';
    yield serializers.serialize(
      object.mimeType,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateUploadRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateUploadRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'filename':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.filename = valueDes;
          break;
        case r'purpose':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateUploadRequestPurposeEnum),
          ) as CreateUploadRequestPurposeEnum;
          result.purpose = valueDes;
          break;
        case r'bytes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.bytes = valueDes;
          break;
        case r'mime_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.mimeType = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateUploadRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateUploadRequestBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

class CreateUploadRequestPurposeEnum extends EnumClass {

  /// The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
  @BuiltValueEnumConst(wireName: r'assistants')
  static const CreateUploadRequestPurposeEnum assistants = _$createUploadRequestPurposeEnum_assistants;
  /// The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
  @BuiltValueEnumConst(wireName: r'batch')
  static const CreateUploadRequestPurposeEnum batch = _$createUploadRequestPurposeEnum_batch;
  /// The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
  @BuiltValueEnumConst(wireName: r'fine-tune')
  static const CreateUploadRequestPurposeEnum fineTune = _$createUploadRequestPurposeEnum_fineTune;
  /// The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
  @BuiltValueEnumConst(wireName: r'vision')
  static const CreateUploadRequestPurposeEnum vision = _$createUploadRequestPurposeEnum_vision;

  static Serializer<CreateUploadRequestPurposeEnum> get serializer => _$createUploadRequestPurposeEnumSerializer;

  const CreateUploadRequestPurposeEnum._(String name): super(name);

  static BuiltSet<CreateUploadRequestPurposeEnum> get values => _$createUploadRequestPurposeEnumValues;
  static CreateUploadRequestPurposeEnum valueOf(String name) => _$createUploadRequestPurposeEnumValueOf(name);
}

