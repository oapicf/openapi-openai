//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_object_incomplete_details.g.dart';

/// On an incomplete message, details about why the message is incomplete.
///
/// Properties:
/// * [reason] - The reason the message is incomplete.
@BuiltValue()
abstract class MessageObjectIncompleteDetails implements Built<MessageObjectIncompleteDetails, MessageObjectIncompleteDetailsBuilder> {
  /// The reason the message is incomplete.
  @BuiltValueField(wireName: r'reason')
  MessageObjectIncompleteDetailsReasonEnum get reason;
  // enum reasonEnum {  content_filter,  max_tokens,  run_cancelled,  run_expired,  run_failed,  };

  MessageObjectIncompleteDetails._();

  factory MessageObjectIncompleteDetails([void updates(MessageObjectIncompleteDetailsBuilder b)]) = _$MessageObjectIncompleteDetails;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageObjectIncompleteDetailsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageObjectIncompleteDetails> get serializer => _$MessageObjectIncompleteDetailsSerializer();
}

class _$MessageObjectIncompleteDetailsSerializer implements PrimitiveSerializer<MessageObjectIncompleteDetails> {
  @override
  final Iterable<Type> types = const [MessageObjectIncompleteDetails, _$MessageObjectIncompleteDetails];

  @override
  final String wireName = r'MessageObjectIncompleteDetails';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageObjectIncompleteDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'reason';
    yield serializers.serialize(
      object.reason,
      specifiedType: const FullType(MessageObjectIncompleteDetailsReasonEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageObjectIncompleteDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageObjectIncompleteDetailsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'reason':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageObjectIncompleteDetailsReasonEnum),
          ) as MessageObjectIncompleteDetailsReasonEnum;
          result.reason = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MessageObjectIncompleteDetails deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageObjectIncompleteDetailsBuilder();
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

class MessageObjectIncompleteDetailsReasonEnum extends EnumClass {

  /// The reason the message is incomplete.
  @BuiltValueEnumConst(wireName: r'content_filter')
  static const MessageObjectIncompleteDetailsReasonEnum contentFilter = _$messageObjectIncompleteDetailsReasonEnum_contentFilter;
  /// The reason the message is incomplete.
  @BuiltValueEnumConst(wireName: r'max_tokens')
  static const MessageObjectIncompleteDetailsReasonEnum maxTokens = _$messageObjectIncompleteDetailsReasonEnum_maxTokens;
  /// The reason the message is incomplete.
  @BuiltValueEnumConst(wireName: r'run_cancelled')
  static const MessageObjectIncompleteDetailsReasonEnum runCancelled = _$messageObjectIncompleteDetailsReasonEnum_runCancelled;
  /// The reason the message is incomplete.
  @BuiltValueEnumConst(wireName: r'run_expired')
  static const MessageObjectIncompleteDetailsReasonEnum runExpired = _$messageObjectIncompleteDetailsReasonEnum_runExpired;
  /// The reason the message is incomplete.
  @BuiltValueEnumConst(wireName: r'run_failed')
  static const MessageObjectIncompleteDetailsReasonEnum runFailed = _$messageObjectIncompleteDetailsReasonEnum_runFailed;

  static Serializer<MessageObjectIncompleteDetailsReasonEnum> get serializer => _$messageObjectIncompleteDetailsReasonEnumSerializer;

  const MessageObjectIncompleteDetailsReasonEnum._(String name): super(name);

  static BuiltSet<MessageObjectIncompleteDetailsReasonEnum> get values => _$messageObjectIncompleteDetailsReasonEnumValues;
  static MessageObjectIncompleteDetailsReasonEnum valueOf(String name) => _$messageObjectIncompleteDetailsReasonEnumValueOf(name);
}

