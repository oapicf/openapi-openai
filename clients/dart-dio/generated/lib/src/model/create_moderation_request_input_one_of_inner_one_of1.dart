//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_moderation_request_input_one_of_inner_one_of1.g.dart';

/// An object describing text to classify.
///
/// Properties:
/// * [type] - Always `text`.
/// * [text] - A string of text to classify.
@BuiltValue()
abstract class CreateModerationRequestInputOneOfInnerOneOf1 implements Built<CreateModerationRequestInputOneOfInnerOneOf1, CreateModerationRequestInputOneOfInnerOneOf1Builder> {
  /// Always `text`.
  @BuiltValueField(wireName: r'type')
  CreateModerationRequestInputOneOfInnerOneOf1TypeEnum get type;
  // enum typeEnum {  text,  };

  /// A string of text to classify.
  @BuiltValueField(wireName: r'text')
  String get text;

  CreateModerationRequestInputOneOfInnerOneOf1._();

  factory CreateModerationRequestInputOneOfInnerOneOf1([void updates(CreateModerationRequestInputOneOfInnerOneOf1Builder b)]) = _$CreateModerationRequestInputOneOfInnerOneOf1;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateModerationRequestInputOneOfInnerOneOf1Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateModerationRequestInputOneOfInnerOneOf1> get serializer => _$CreateModerationRequestInputOneOfInnerOneOf1Serializer();
}

class _$CreateModerationRequestInputOneOfInnerOneOf1Serializer implements PrimitiveSerializer<CreateModerationRequestInputOneOfInnerOneOf1> {
  @override
  final Iterable<Type> types = const [CreateModerationRequestInputOneOfInnerOneOf1, _$CreateModerationRequestInputOneOfInnerOneOf1];

  @override
  final String wireName = r'CreateModerationRequestInputOneOfInnerOneOf1';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateModerationRequestInputOneOfInnerOneOf1 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(CreateModerationRequestInputOneOfInnerOneOf1TypeEnum),
    );
    yield r'text';
    yield serializers.serialize(
      object.text,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateModerationRequestInputOneOfInnerOneOf1 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateModerationRequestInputOneOfInnerOneOf1Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateModerationRequestInputOneOfInnerOneOf1TypeEnum),
          ) as CreateModerationRequestInputOneOfInnerOneOf1TypeEnum;
          result.type = valueDes;
          break;
        case r'text':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.text = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateModerationRequestInputOneOfInnerOneOf1 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateModerationRequestInputOneOfInnerOneOf1Builder();
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

class CreateModerationRequestInputOneOfInnerOneOf1TypeEnum extends EnumClass {

  /// Always `text`.
  @BuiltValueEnumConst(wireName: r'text')
  static const CreateModerationRequestInputOneOfInnerOneOf1TypeEnum text = _$createModerationRequestInputOneOfInnerOneOf1TypeEnum_text;

  static Serializer<CreateModerationRequestInputOneOfInnerOneOf1TypeEnum> get serializer => _$createModerationRequestInputOneOfInnerOneOf1TypeEnumSerializer;

  const CreateModerationRequestInputOneOfInnerOneOf1TypeEnum._(String name): super(name);

  static BuiltSet<CreateModerationRequestInputOneOfInnerOneOf1TypeEnum> get values => _$createModerationRequestInputOneOfInnerOneOf1TypeEnumValues;
  static CreateModerationRequestInputOneOfInnerOneOf1TypeEnum valueOf(String name) => _$createModerationRequestInputOneOfInnerOneOf1TypeEnumValueOf(name);
}

