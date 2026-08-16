//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_functions.g.dart';

/// ChatCompletionFunctions
///
/// Properties:
/// * [description] - A description of what the function does, used by the model to choose when and how to call the function.
/// * [name] - The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
/// * [parameters] - The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
@Deprecated('ChatCompletionFunctions has been deprecated')
@BuiltValue()
abstract class ChatCompletionFunctions implements Built<ChatCompletionFunctions, ChatCompletionFunctionsBuilder> {
  /// A description of what the function does, used by the model to choose when and how to call the function.
  @BuiltValueField(wireName: r'description')
  String? get description;

  /// The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
  @BuiltValueField(wireName: r'parameters')
  BuiltMap<String, JsonObject?>? get parameters;

  ChatCompletionFunctions._();

  factory ChatCompletionFunctions([void updates(ChatCompletionFunctionsBuilder b)]) = _$ChatCompletionFunctions;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionFunctionsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionFunctions> get serializer => _$ChatCompletionFunctionsSerializer();
}

class _$ChatCompletionFunctionsSerializer implements PrimitiveSerializer<ChatCompletionFunctions> {
  @override
  final Iterable<Type> types = const [ChatCompletionFunctions, _$ChatCompletionFunctions];

  @override
  final String wireName = r'ChatCompletionFunctions';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionFunctions object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    if (object.parameters != null) {
      yield r'parameters';
      yield serializers.serialize(
        object.parameters,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType.nullable(JsonObject)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionFunctions object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChatCompletionFunctionsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.description = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'parameters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltMap, [FullType(String), FullType.nullable(JsonObject)]),
          ) as BuiltMap<String, JsonObject?>;
          result.parameters.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ChatCompletionFunctions deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionFunctionsBuilder();
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

