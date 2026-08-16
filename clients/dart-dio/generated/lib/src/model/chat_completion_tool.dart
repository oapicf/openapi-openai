//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/function_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_tool.g.dart';

/// ChatCompletionTool
///
/// Properties:
/// * [type] - The type of the tool. Currently, only `function` is supported.
/// * [function_] 
@BuiltValue()
abstract class ChatCompletionTool implements Built<ChatCompletionTool, ChatCompletionToolBuilder> {
  /// The type of the tool. Currently, only `function` is supported.
  @BuiltValueField(wireName: r'type')
  ChatCompletionToolTypeEnum get type;
  // enum typeEnum {  function,  };

  @BuiltValueField(wireName: r'function')
  FunctionObject get function_;

  ChatCompletionTool._();

  factory ChatCompletionTool([void updates(ChatCompletionToolBuilder b)]) = _$ChatCompletionTool;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionToolBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionTool> get serializer => _$ChatCompletionToolSerializer();
}

class _$ChatCompletionToolSerializer implements PrimitiveSerializer<ChatCompletionTool> {
  @override
  final Iterable<Type> types = const [ChatCompletionTool, _$ChatCompletionTool];

  @override
  final String wireName = r'ChatCompletionTool';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionTool object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(ChatCompletionToolTypeEnum),
    );
    yield r'function';
    yield serializers.serialize(
      object.function_,
      specifiedType: const FullType(FunctionObject),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionTool object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChatCompletionToolBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionToolTypeEnum),
          ) as ChatCompletionToolTypeEnum;
          result.type = valueDes;
          break;
        case r'function':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(FunctionObject),
          ) as FunctionObject;
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
  ChatCompletionTool deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionToolBuilder();
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

class ChatCompletionToolTypeEnum extends EnumClass {

  /// The type of the tool. Currently, only `function` is supported.
  @BuiltValueEnumConst(wireName: r'function')
  static const ChatCompletionToolTypeEnum function_ = _$chatCompletionToolTypeEnum_function_;

  static Serializer<ChatCompletionToolTypeEnum> get serializer => _$chatCompletionToolTypeEnumSerializer;

  const ChatCompletionToolTypeEnum._(String name): super(name);

  static BuiltSet<ChatCompletionToolTypeEnum> get values => _$chatCompletionToolTypeEnumValues;
  static ChatCompletionToolTypeEnum valueOf(String name) => _$chatCompletionToolTypeEnumValueOf(name);
}

