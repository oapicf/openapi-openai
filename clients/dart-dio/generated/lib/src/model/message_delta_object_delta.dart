//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/message_delta_object_delta_content_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_delta_object_delta.g.dart';

/// The delta containing the fields that have changed on the Message.
///
/// Properties:
/// * [role] - The entity that produced the message. One of `user` or `assistant`.
/// * [content] - The content of the message in array of text and/or images.
@BuiltValue()
abstract class MessageDeltaObjectDelta implements Built<MessageDeltaObjectDelta, MessageDeltaObjectDeltaBuilder> {
  /// The entity that produced the message. One of `user` or `assistant`.
  @BuiltValueField(wireName: r'role')
  MessageDeltaObjectDeltaRoleEnum? get role;
  // enum roleEnum {  user,  assistant,  };

  /// The content of the message in array of text and/or images.
  @BuiltValueField(wireName: r'content')
  BuiltList<MessageDeltaObjectDeltaContentInner>? get content;

  MessageDeltaObjectDelta._();

  factory MessageDeltaObjectDelta([void updates(MessageDeltaObjectDeltaBuilder b)]) = _$MessageDeltaObjectDelta;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageDeltaObjectDeltaBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageDeltaObjectDelta> get serializer => _$MessageDeltaObjectDeltaSerializer();
}

class _$MessageDeltaObjectDeltaSerializer implements PrimitiveSerializer<MessageDeltaObjectDelta> {
  @override
  final Iterable<Type> types = const [MessageDeltaObjectDelta, _$MessageDeltaObjectDelta];

  @override
  final String wireName = r'MessageDeltaObjectDelta';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageDeltaObjectDelta object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.role != null) {
      yield r'role';
      yield serializers.serialize(
        object.role,
        specifiedType: const FullType(MessageDeltaObjectDeltaRoleEnum),
      );
    }
    if (object.content != null) {
      yield r'content';
      yield serializers.serialize(
        object.content,
        specifiedType: const FullType(BuiltList, [FullType(MessageDeltaObjectDeltaContentInner)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageDeltaObjectDelta object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageDeltaObjectDeltaBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'role':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageDeltaObjectDeltaRoleEnum),
          ) as MessageDeltaObjectDeltaRoleEnum;
          result.role = valueDes;
          break;
        case r'content':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MessageDeltaObjectDeltaContentInner)]),
          ) as BuiltList<MessageDeltaObjectDeltaContentInner>;
          result.content.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MessageDeltaObjectDelta deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageDeltaObjectDeltaBuilder();
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

class MessageDeltaObjectDeltaRoleEnum extends EnumClass {

  /// The entity that produced the message. One of `user` or `assistant`.
  @BuiltValueEnumConst(wireName: r'user')
  static const MessageDeltaObjectDeltaRoleEnum user = _$messageDeltaObjectDeltaRoleEnum_user;
  /// The entity that produced the message. One of `user` or `assistant`.
  @BuiltValueEnumConst(wireName: r'assistant')
  static const MessageDeltaObjectDeltaRoleEnum assistant = _$messageDeltaObjectDeltaRoleEnum_assistant;

  static Serializer<MessageDeltaObjectDeltaRoleEnum> get serializer => _$messageDeltaObjectDeltaRoleEnumSerializer;

  const MessageDeltaObjectDeltaRoleEnum._(String name): super(name);

  static BuiltSet<MessageDeltaObjectDeltaRoleEnum> get values => _$messageDeltaObjectDeltaRoleEnumValues;
  static MessageDeltaObjectDeltaRoleEnum valueOf(String name) => _$messageDeltaObjectDeltaRoleEnumValueOf(name);
}

