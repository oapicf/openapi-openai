//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/modify_thread_request_tool_resources.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'thread_object.g.dart';

/// Represents a thread that contains [messages](/docs/api-reference/messages).
///
/// Properties:
/// * [id] - The identifier, which can be referenced in API endpoints.
/// * [object] - The object type, which is always `thread`.
/// * [createdAt] - The Unix timestamp (in seconds) for when the thread was created.
/// * [toolResources] 
/// * [metadata] - Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
@BuiltValue()
abstract class ThreadObject implements Built<ThreadObject, ThreadObjectBuilder> {
  /// The identifier, which can be referenced in API endpoints.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The object type, which is always `thread`.
  @BuiltValueField(wireName: r'object')
  ThreadObjectObjectEnum get object;
  // enum objectEnum {  thread,  };

  /// The Unix timestamp (in seconds) for when the thread was created.
  @BuiltValueField(wireName: r'created_at')
  int get createdAt;

  @BuiltValueField(wireName: r'tool_resources')
  ModifyThreadRequestToolResources? get toolResources;

  /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  @BuiltValueField(wireName: r'metadata')
  JsonObject? get metadata;

  ThreadObject._();

  factory ThreadObject([void updates(ThreadObjectBuilder b)]) = _$ThreadObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ThreadObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ThreadObject> get serializer => _$ThreadObjectSerializer();
}

class _$ThreadObjectSerializer implements PrimitiveSerializer<ThreadObject> {
  @override
  final Iterable<Type> types = const [ThreadObject, _$ThreadObject];

  @override
  final String wireName = r'ThreadObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ThreadObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ThreadObjectObjectEnum),
    );
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(int),
    );
    yield r'tool_resources';
    yield object.toolResources == null ? null : serializers.serialize(
      object.toolResources,
      specifiedType: const FullType.nullable(ModifyThreadRequestToolResources),
    );
    yield r'metadata';
    yield object.metadata == null ? null : serializers.serialize(
      object.metadata,
      specifiedType: const FullType.nullable(JsonObject),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ThreadObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ThreadObjectBuilder result,
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
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ThreadObjectObjectEnum),
          ) as ThreadObjectObjectEnum;
          result.object = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdAt = valueDes;
          break;
        case r'tool_resources':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ModifyThreadRequestToolResources),
          ) as ModifyThreadRequestToolResources?;
          if (valueDes == null) continue;
          result.toolResources.replace(valueDes);
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
  ThreadObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ThreadObjectBuilder();
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

class ThreadObjectObjectEnum extends EnumClass {

  /// The object type, which is always `thread`.
  @BuiltValueEnumConst(wireName: r'thread')
  static const ThreadObjectObjectEnum thread = _$threadObjectObjectEnum_thread;

  static Serializer<ThreadObjectObjectEnum> get serializer => _$threadObjectObjectEnumSerializer;

  const ThreadObjectObjectEnum._(String name): super(name);

  static BuiltSet<ThreadObjectObjectEnum> get values => _$threadObjectObjectEnumValues;
  static ThreadObjectObjectEnum valueOf(String name) => _$threadObjectObjectEnumValueOf(name);
}

