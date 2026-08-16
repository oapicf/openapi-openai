//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/open_ai_file.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'upload.g.dart';

/// The Upload object can accept byte chunks in the form of Parts. 
///
/// Properties:
/// * [id] - The Upload unique identifier, which can be referenced in API endpoints.
/// * [createdAt] - The Unix timestamp (in seconds) for when the Upload was created.
/// * [filename] - The name of the file to be uploaded.
/// * [bytes] - The intended number of bytes to be uploaded.
/// * [purpose] - The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
/// * [status] - The status of the Upload.
/// * [expiresAt] - The Unix timestamp (in seconds) for when the Upload was created.
/// * [object] - The object type, which is always \"upload\".
/// * [file] 
@BuiltValue()
abstract class Upload implements Built<Upload, UploadBuilder> {
  /// The Upload unique identifier, which can be referenced in API endpoints.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The Unix timestamp (in seconds) for when the Upload was created.
  @BuiltValueField(wireName: r'created_at')
  int get createdAt;

  /// The name of the file to be uploaded.
  @BuiltValueField(wireName: r'filename')
  String get filename;

  /// The intended number of bytes to be uploaded.
  @BuiltValueField(wireName: r'bytes')
  int get bytes;

  /// The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
  @BuiltValueField(wireName: r'purpose')
  String get purpose;

  /// The status of the Upload.
  @BuiltValueField(wireName: r'status')
  UploadStatusEnum get status;
  // enum statusEnum {  pending,  completed,  cancelled,  expired,  };

  /// The Unix timestamp (in seconds) for when the Upload was created.
  @BuiltValueField(wireName: r'expires_at')
  int get expiresAt;

  /// The object type, which is always \"upload\".
  @BuiltValueField(wireName: r'object')
  UploadObjectEnum? get object;
  // enum objectEnum {  upload,  };

  @BuiltValueField(wireName: r'file')
  OpenAIFile? get file;

  Upload._();

  factory Upload([void updates(UploadBuilder b)]) = _$Upload;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UploadBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Upload> get serializer => _$UploadSerializer();
}

class _$UploadSerializer implements PrimitiveSerializer<Upload> {
  @override
  final Iterable<Type> types = const [Upload, _$Upload];

  @override
  final String wireName = r'Upload';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Upload object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(int),
    );
    yield r'filename';
    yield serializers.serialize(
      object.filename,
      specifiedType: const FullType(String),
    );
    yield r'bytes';
    yield serializers.serialize(
      object.bytes,
      specifiedType: const FullType(int),
    );
    yield r'purpose';
    yield serializers.serialize(
      object.purpose,
      specifiedType: const FullType(String),
    );
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(UploadStatusEnum),
    );
    yield r'expires_at';
    yield serializers.serialize(
      object.expiresAt,
      specifiedType: const FullType(int),
    );
    if (object.object != null) {
      yield r'object';
      yield serializers.serialize(
        object.object,
        specifiedType: const FullType(UploadObjectEnum),
      );
    }
    if (object.file != null) {
      yield r'file';
      yield serializers.serialize(
        object.file,
        specifiedType: const FullType(OpenAIFile),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    Upload object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UploadBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdAt = valueDes;
          break;
        case r'filename':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.filename = valueDes;
          break;
        case r'bytes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.bytes = valueDes;
          break;
        case r'purpose':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.purpose = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UploadStatusEnum),
          ) as UploadStatusEnum;
          result.status = valueDes;
          break;
        case r'expires_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.expiresAt = valueDes;
          break;
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UploadObjectEnum),
          ) as UploadObjectEnum;
          result.object = valueDes;
          break;
        case r'file':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(OpenAIFile),
          ) as OpenAIFile;
          result.file.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Upload deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UploadBuilder();
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

class UploadStatusEnum extends EnumClass {

  /// The status of the Upload.
  @BuiltValueEnumConst(wireName: r'pending')
  static const UploadStatusEnum pending = _$uploadStatusEnum_pending;
  /// The status of the Upload.
  @BuiltValueEnumConst(wireName: r'completed')
  static const UploadStatusEnum completed = _$uploadStatusEnum_completed;
  /// The status of the Upload.
  @BuiltValueEnumConst(wireName: r'cancelled')
  static const UploadStatusEnum cancelled = _$uploadStatusEnum_cancelled;
  /// The status of the Upload.
  @BuiltValueEnumConst(wireName: r'expired')
  static const UploadStatusEnum expired = _$uploadStatusEnum_expired;

  static Serializer<UploadStatusEnum> get serializer => _$uploadStatusEnumSerializer;

  const UploadStatusEnum._(String name): super(name);

  static BuiltSet<UploadStatusEnum> get values => _$uploadStatusEnumValues;
  static UploadStatusEnum valueOf(String name) => _$uploadStatusEnumValueOf(name);
}

class UploadObjectEnum extends EnumClass {

  /// The object type, which is always \"upload\".
  @BuiltValueEnumConst(wireName: r'upload')
  static const UploadObjectEnum upload = _$uploadObjectEnum_upload;

  static Serializer<UploadObjectEnum> get serializer => _$uploadObjectEnumSerializer;

  const UploadObjectEnum._(String name): super(name);

  static BuiltSet<UploadObjectEnum> get values => _$uploadObjectEnumValues;
  static UploadObjectEnum valueOf(String name) => _$uploadObjectEnumValueOf(name);
}

