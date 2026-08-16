//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_delta_content_refusal_object.g.dart';

/// The refusal content that is part of a message.
///
/// Properties:
/// * [index] - The index of the refusal part in the message.
/// * [type] - Always `refusal`.
/// * [refusal] 
@BuiltValue()
abstract class MessageDeltaContentRefusalObject implements Built<MessageDeltaContentRefusalObject, MessageDeltaContentRefusalObjectBuilder> {
  /// The index of the refusal part in the message.
  @BuiltValueField(wireName: r'index')
  int get index;

  /// Always `refusal`.
  @BuiltValueField(wireName: r'type')
  MessageDeltaContentRefusalObjectTypeEnum get type;
  // enum typeEnum {  refusal,  };

  @BuiltValueField(wireName: r'refusal')
  String? get refusal;

  MessageDeltaContentRefusalObject._();

  factory MessageDeltaContentRefusalObject([void updates(MessageDeltaContentRefusalObjectBuilder b)]) = _$MessageDeltaContentRefusalObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageDeltaContentRefusalObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageDeltaContentRefusalObject> get serializer => _$MessageDeltaContentRefusalObjectSerializer();
}

class _$MessageDeltaContentRefusalObjectSerializer implements PrimitiveSerializer<MessageDeltaContentRefusalObject> {
  @override
  final Iterable<Type> types = const [MessageDeltaContentRefusalObject, _$MessageDeltaContentRefusalObject];

  @override
  final String wireName = r'MessageDeltaContentRefusalObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageDeltaContentRefusalObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'index';
    yield serializers.serialize(
      object.index,
      specifiedType: const FullType(int),
    );
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(MessageDeltaContentRefusalObjectTypeEnum),
    );
    if (object.refusal != null) {
      yield r'refusal';
      yield serializers.serialize(
        object.refusal,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageDeltaContentRefusalObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageDeltaContentRefusalObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.index = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageDeltaContentRefusalObjectTypeEnum),
          ) as MessageDeltaContentRefusalObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'refusal':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.refusal = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MessageDeltaContentRefusalObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageDeltaContentRefusalObjectBuilder();
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

class MessageDeltaContentRefusalObjectTypeEnum extends EnumClass {

  /// Always `refusal`.
  @BuiltValueEnumConst(wireName: r'refusal')
  static const MessageDeltaContentRefusalObjectTypeEnum refusal = _$messageDeltaContentRefusalObjectTypeEnum_refusal;

  static Serializer<MessageDeltaContentRefusalObjectTypeEnum> get serializer => _$messageDeltaContentRefusalObjectTypeEnumSerializer;

  const MessageDeltaContentRefusalObjectTypeEnum._(String name): super(name);

  static BuiltSet<MessageDeltaContentRefusalObjectTypeEnum> get values => _$messageDeltaContentRefusalObjectTypeEnumValues;
  static MessageDeltaContentRefusalObjectTypeEnum valueOf(String name) => _$messageDeltaContentRefusalObjectTypeEnumValueOf(name);
}

