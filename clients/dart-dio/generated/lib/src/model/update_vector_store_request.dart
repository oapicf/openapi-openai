//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/vector_store_expiration_after.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_vector_store_request.g.dart';

/// UpdateVectorStoreRequest
///
/// Properties:
/// * [name] - The name of the vector store.
/// * [expiresAfter] 
/// * [metadata] - Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
@BuiltValue()
abstract class UpdateVectorStoreRequest implements Built<UpdateVectorStoreRequest, UpdateVectorStoreRequestBuilder> {
  /// The name of the vector store.
  @BuiltValueField(wireName: r'name')
  String? get name;

  @BuiltValueField(wireName: r'expires_after')
  VectorStoreExpirationAfter? get expiresAfter;

  /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  @BuiltValueField(wireName: r'metadata')
  JsonObject? get metadata;

  UpdateVectorStoreRequest._();

  factory UpdateVectorStoreRequest([void updates(UpdateVectorStoreRequestBuilder b)]) = _$UpdateVectorStoreRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdateVectorStoreRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdateVectorStoreRequest> get serializer => _$UpdateVectorStoreRequestSerializer();
}

class _$UpdateVectorStoreRequestSerializer implements PrimitiveSerializer<UpdateVectorStoreRequest> {
  @override
  final Iterable<Type> types = const [UpdateVectorStoreRequest, _$UpdateVectorStoreRequest];

  @override
  final String wireName = r'UpdateVectorStoreRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdateVectorStoreRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.expiresAfter != null) {
      yield r'expires_after';
      yield serializers.serialize(
        object.expiresAfter,
        specifiedType: const FullType(VectorStoreExpirationAfter),
      );
    }
    if (object.metadata != null) {
      yield r'metadata';
      yield serializers.serialize(
        object.metadata,
        specifiedType: const FullType.nullable(JsonObject),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    UpdateVectorStoreRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdateVectorStoreRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'expires_after':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VectorStoreExpirationAfter),
          ) as VectorStoreExpirationAfter;
          result.expiresAfter.replace(valueDes);
          break;
        case r'metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.metadata = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UpdateVectorStoreRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdateVectorStoreRequestBuilder();
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

