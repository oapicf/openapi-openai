//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'assistants_named_tool_choice_function.g.dart';

/// AssistantsNamedToolChoiceFunction
///
/// Properties:
/// * [name] - The name of the function to call.
@BuiltValue()
abstract class AssistantsNamedToolChoiceFunction implements Built<AssistantsNamedToolChoiceFunction, AssistantsNamedToolChoiceFunctionBuilder> {
  /// The name of the function to call.
  @BuiltValueField(wireName: r'name')
  String get name;

  AssistantsNamedToolChoiceFunction._();

  factory AssistantsNamedToolChoiceFunction([void updates(AssistantsNamedToolChoiceFunctionBuilder b)]) = _$AssistantsNamedToolChoiceFunction;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssistantsNamedToolChoiceFunctionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssistantsNamedToolChoiceFunction> get serializer => _$AssistantsNamedToolChoiceFunctionSerializer();
}

class _$AssistantsNamedToolChoiceFunctionSerializer implements PrimitiveSerializer<AssistantsNamedToolChoiceFunction> {
  @override
  final Iterable<Type> types = const [AssistantsNamedToolChoiceFunction, _$AssistantsNamedToolChoiceFunction];

  @override
  final String wireName = r'AssistantsNamedToolChoiceFunction';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssistantsNamedToolChoiceFunction object, {
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
    AssistantsNamedToolChoiceFunction object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AssistantsNamedToolChoiceFunctionBuilder result,
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
  AssistantsNamedToolChoiceFunction deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssistantsNamedToolChoiceFunctionBuilder();
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

