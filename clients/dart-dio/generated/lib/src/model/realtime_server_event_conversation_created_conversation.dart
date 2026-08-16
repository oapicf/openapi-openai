//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_conversation_created_conversation.g.dart';

/// The conversation resource.
///
/// Properties:
/// * [id] - The unique ID of the conversation.
/// * [object] - The object type, must be `realtime.conversation`.
@BuiltValue()
abstract class RealtimeServerEventConversationCreatedConversation implements Built<RealtimeServerEventConversationCreatedConversation, RealtimeServerEventConversationCreatedConversationBuilder> {
  /// The unique ID of the conversation.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// The object type, must be `realtime.conversation`.
  @BuiltValueField(wireName: r'object')
  String? get object;

  RealtimeServerEventConversationCreatedConversation._();

  factory RealtimeServerEventConversationCreatedConversation([void updates(RealtimeServerEventConversationCreatedConversationBuilder b)]) = _$RealtimeServerEventConversationCreatedConversation;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventConversationCreatedConversationBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventConversationCreatedConversation> get serializer => _$RealtimeServerEventConversationCreatedConversationSerializer();
}

class _$RealtimeServerEventConversationCreatedConversationSerializer implements PrimitiveSerializer<RealtimeServerEventConversationCreatedConversation> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventConversationCreatedConversation, _$RealtimeServerEventConversationCreatedConversation];

  @override
  final String wireName = r'RealtimeServerEventConversationCreatedConversation';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventConversationCreatedConversation object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.object != null) {
      yield r'object';
      yield serializers.serialize(
        object.object,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventConversationCreatedConversation object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventConversationCreatedConversationBuilder result,
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
            specifiedType: const FullType(String),
          ) as String;
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
  RealtimeServerEventConversationCreatedConversation deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventConversationCreatedConversationBuilder();
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

