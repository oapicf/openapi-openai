//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_function_call_option.g.dart';

/// Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. 
///
/// Properties:
/// * [name] - The name of the function to call.
@BuiltValue()
abstract class ChatCompletionFunctionCallOption implements Built<ChatCompletionFunctionCallOption, ChatCompletionFunctionCallOptionBuilder> {
  /// The name of the function to call.
  @BuiltValueField(wireName: r'name')
  String get name;

  ChatCompletionFunctionCallOption._();

  factory ChatCompletionFunctionCallOption([void updates(ChatCompletionFunctionCallOptionBuilder b)]) = _$ChatCompletionFunctionCallOption;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionFunctionCallOptionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionFunctionCallOption> get serializer => _$ChatCompletionFunctionCallOptionSerializer();
}

class _$ChatCompletionFunctionCallOptionSerializer implements PrimitiveSerializer<ChatCompletionFunctionCallOption> {
  @override
  final Iterable<Type> types = const [ChatCompletionFunctionCallOption, _$ChatCompletionFunctionCallOption];

  @override
  final String wireName = r'ChatCompletionFunctionCallOption';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionFunctionCallOption object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionFunctionCallOption object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChatCompletionFunctionCallOptionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ChatCompletionFunctionCallOption deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionFunctionCallOptionBuilder();
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

