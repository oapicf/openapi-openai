//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/message_delta_object_delta.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_delta_object.g.dart';

/// Represents a message delta i.e. any changed fields on a message during streaming. 
///
/// Properties:
/// * [id] - The identifier of the message, which can be referenced in API endpoints.
/// * [object] - The object type, which is always `thread.message.delta`.
/// * [delta] 
@BuiltValue()
abstract class MessageDeltaObject implements Built<MessageDeltaObject, MessageDeltaObjectBuilder> {
  /// The identifier of the message, which can be referenced in API endpoints.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The object type, which is always `thread.message.delta`.
  @BuiltValueField(wireName: r'object')
  MessageDeltaObjectObjectEnum get object;
  // enum objectEnum {  thread.message.delta,  };

  @BuiltValueField(wireName: r'delta')
  MessageDeltaObjectDelta get delta;

  MessageDeltaObject._();

  factory MessageDeltaObject([void updates(MessageDeltaObjectBuilder b)]) = _$MessageDeltaObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageDeltaObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageDeltaObject> get serializer => _$MessageDeltaObjectSerializer();
}

class _$MessageDeltaObjectSerializer implements PrimitiveSerializer<MessageDeltaObject> {
  @override
  final Iterable<Type> types = const [MessageDeltaObject, _$MessageDeltaObject];

  @override
  final String wireName = r'MessageDeltaObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageDeltaObject object, {
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
      specifiedType: const FullType(MessageDeltaObjectObjectEnum),
    );
    yield r'delta';
    yield serializers.serialize(
      object.delta,
      specifiedType: const FullType(MessageDeltaObjectDelta),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageDeltaObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageDeltaObjectBuilder result,
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
            specifiedType: const FullType(MessageDeltaObjectObjectEnum),
          ) as MessageDeltaObjectObjectEnum;
          result.object = valueDes;
          break;
        case r'delta':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageDeltaObjectDelta),
          ) as MessageDeltaObjectDelta;
          result.delta.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MessageDeltaObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageDeltaObjectBuilder();
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

class MessageDeltaObjectObjectEnum extends EnumClass {

  /// The object type, which is always `thread.message.delta`.
  @BuiltValueEnumConst(wireName: r'thread.message.delta')
  static const MessageDeltaObjectObjectEnum threadPeriodMessagePeriodDelta = _$messageDeltaObjectObjectEnum_threadPeriodMessagePeriodDelta;

  static Serializer<MessageDeltaObjectObjectEnum> get serializer => _$messageDeltaObjectObjectEnumSerializer;

  const MessageDeltaObjectObjectEnum._(String name): super(name);

  static BuiltSet<MessageDeltaObjectObjectEnum> get values => _$messageDeltaObjectObjectEnumValues;
  static MessageDeltaObjectObjectEnum valueOf(String name) => _$messageDeltaObjectObjectEnumValueOf(name);
}

