//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'upload_part.g.dart';

/// The upload Part represents a chunk of bytes we can add to an Upload object. 
///
/// Properties:
/// * [id] - The upload Part unique identifier, which can be referenced in API endpoints.
/// * [createdAt] - The Unix timestamp (in seconds) for when the Part was created.
/// * [uploadId] - The ID of the Upload object that this Part was added to.
/// * [object] - The object type, which is always `upload.part`.
@BuiltValue()
abstract class UploadPart implements Built<UploadPart, UploadPartBuilder> {
  /// The upload Part unique identifier, which can be referenced in API endpoints.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The Unix timestamp (in seconds) for when the Part was created.
  @BuiltValueField(wireName: r'created_at')
  int get createdAt;

  /// The ID of the Upload object that this Part was added to.
  @BuiltValueField(wireName: r'upload_id')
  String get uploadId;

  /// The object type, which is always `upload.part`.
  @BuiltValueField(wireName: r'object')
  UploadPartObjectEnum get object;
  // enum objectEnum {  upload.part,  };

  UploadPart._();

  factory UploadPart([void updates(UploadPartBuilder b)]) = _$UploadPart;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UploadPartBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UploadPart> get serializer => _$UploadPartSerializer();
}

class _$UploadPartSerializer implements PrimitiveSerializer<UploadPart> {
  @override
  final Iterable<Type> types = const [UploadPart, _$UploadPart];

  @override
  final String wireName = r'UploadPart';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UploadPart object, {
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
    yield r'upload_id';
    yield serializers.serialize(
      object.uploadId,
      specifiedType: const FullType(String),
    );
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(UploadPartObjectEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    UploadPart object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UploadPartBuilder result,
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
        case r'upload_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.uploadId = valueDes;
          break;
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UploadPartObjectEnum),
          ) as UploadPartObjectEnum;
          result.object = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UploadPart deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UploadPartBuilder();
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

class UploadPartObjectEnum extends EnumClass {

  /// The object type, which is always `upload.part`.
  @BuiltValueEnumConst(wireName: r'upload.part')
  static const UploadPartObjectEnum uploadPeriodPart = _$uploadPartObjectEnum_uploadPeriodPart;

  static Serializer<UploadPartObjectEnum> get serializer => _$uploadPartObjectEnumSerializer;

  const UploadPartObjectEnum._(String name): super(name);

  static BuiltSet<UploadPartObjectEnum> get values => _$uploadPartObjectEnumValues;
  static UploadPartObjectEnum valueOf(String name) => _$uploadPartObjectEnumValueOf(name);
}

