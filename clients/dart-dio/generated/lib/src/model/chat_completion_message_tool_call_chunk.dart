//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/chat_completion_message_tool_call_chunk_function.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_message_tool_call_chunk.g.dart';

/// ChatCompletionMessageToolCallChunk
///
/// Properties:
/// * [index] 
/// * [id] - The ID of the tool call.
/// * [type] - The type of the tool. Currently, only `function` is supported.
/// * [function_] 
@BuiltValue()
abstract class ChatCompletionMessageToolCallChunk implements Built<ChatCompletionMessageToolCallChunk, ChatCompletionMessageToolCallChunkBuilder> {
  @BuiltValueField(wireName: r'index')
  int get index;

  /// The ID of the tool call.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// The type of the tool. Currently, only `function` is supported.
  @BuiltValueField(wireName: r'type')
  ChatCompletionMessageToolCallChunkTypeEnum? get type;
  // enum typeEnum {  function,  };

  @BuiltValueField(wireName: r'function')
  ChatCompletionMessageToolCallChunkFunction? get function_;

  ChatCompletionMessageToolCallChunk._();

  factory ChatCompletionMessageToolCallChunk([void updates(ChatCompletionMessageToolCallChunkBuilder b)]) = _$ChatCompletionMessageToolCallChunk;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionMessageToolCallChunkBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionMessageToolCallChunk> get serializer => _$ChatCompletionMessageToolCallChunkSerializer();
}

class _$ChatCompletionMessageToolCallChunkSerializer implements PrimitiveSerializer<ChatCompletionMessageToolCallChunk> {
  @override
  final Iterable<Type> types = const [ChatCompletionMessageToolCallChunk, _$ChatCompletionMessageToolCallChunk];

  @override
  final String wireName = r'ChatCompletionMessageToolCallChunk';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionMessageToolCallChunk object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'index';
    yield serializers.serialize(
      object.index,
      specifiedType: const FullType(int),
    );
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(ChatCompletionMessageToolCallChunkTypeEnum),
      );
    }
    if (object.function_ != null) {
      yield r'function';
      yield serializers.serialize(
        object.function_,
        specifiedType: const FullType(ChatCompletionMessageToolCallChunkFunction),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionMessageToolCallChunk object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChatCompletionMessageToolCallChunkBuilder result,
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
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionMessageToolCallChunkTypeEnum),
          ) as ChatCompletionMessageToolCallChunkTypeEnum;
          result.type = valueDes;
          break;
        case r'function':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionMessageToolCallChunkFunction),
          ) as ChatCompletionMessageToolCallChunkFunction;
          result.function_.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ChatCompletionMessageToolCallChunk deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionMessageToolCallChunkBuilder();
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

class ChatCompletionMessageToolCallChunkTypeEnum extends EnumClass {

  /// The type of the tool. Currently, only `function` is supported.
  @BuiltValueEnumConst(wireName: r'function')
  static const ChatCompletionMessageToolCallChunkTypeEnum function_ = _$chatCompletionMessageToolCallChunkTypeEnum_function_;

  static Serializer<ChatCompletionMessageToolCallChunkTypeEnum> get serializer => _$chatCompletionMessageToolCallChunkTypeEnumSerializer;

  const ChatCompletionMessageToolCallChunkTypeEnum._(String name): super(name);

  static BuiltSet<ChatCompletionMessageToolCallChunkTypeEnum> get values => _$chatCompletionMessageToolCallChunkTypeEnumValues;
  static ChatCompletionMessageToolCallChunkTypeEnum valueOf(String name) => _$chatCompletionMessageToolCallChunkTypeEnumValueOf(name);
}

