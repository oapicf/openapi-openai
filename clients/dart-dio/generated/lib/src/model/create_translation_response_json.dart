//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_translation_response_json.g.dart';

/// CreateTranslationResponseJson
///
/// Properties:
/// * [text] 
@BuiltValue()
abstract class CreateTranslationResponseJson implements Built<CreateTranslationResponseJson, CreateTranslationResponseJsonBuilder> {
  @BuiltValueField(wireName: r'text')
  String get text;

  CreateTranslationResponseJson._();

  factory CreateTranslationResponseJson([void updates(CreateTranslationResponseJsonBuilder b)]) = _$CreateTranslationResponseJson;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateTranslationResponseJsonBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateTranslationResponseJson> get serializer => _$CreateTranslationResponseJsonSerializer();
}

class _$CreateTranslationResponseJsonSerializer implements PrimitiveSerializer<CreateTranslationResponseJson> {
  @override
  final Iterable<Type> types = const [CreateTranslationResponseJson, _$CreateTranslationResponseJson];

  @override
  final String wireName = r'CreateTranslationResponseJson';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateTranslationResponseJson object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'text';
    yield serializers.serialize(
      object.text,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateTranslationResponseJson object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateTranslationResponseJsonBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
  CreateTranslationResponseJson deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateTranslationResponseJsonBuilder();
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

