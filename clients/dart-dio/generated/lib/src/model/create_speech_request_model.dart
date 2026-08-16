//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'create_speech_request_model.g.dart';

/// One of the available [TTS models](/docs/models#tts): `tts-1` or `tts-1-hd` 
@BuiltValue()
abstract class CreateSpeechRequestModel implements Built<CreateSpeechRequestModel, CreateSpeechRequestModelBuilder> {
  /// Any Of [String]
  AnyOf get anyOf;

  CreateSpeechRequestModel._();

  factory CreateSpeechRequestModel([void updates(CreateSpeechRequestModelBuilder b)]) = _$CreateSpeechRequestModel;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateSpeechRequestModelBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateSpeechRequestModel> get serializer => _$CreateSpeechRequestModelSerializer();
}

class _$CreateSpeechRequestModelSerializer implements PrimitiveSerializer<CreateSpeechRequestModel> {
  @override
  final Iterable<Type> types = const [CreateSpeechRequestModel, _$CreateSpeechRequestModel];

  @override
  final String wireName = r'CreateSpeechRequestModel';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateSpeechRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateSpeechRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CreateSpeechRequestModel deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateSpeechRequestModelBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(String), FullType(AnyOf1Enum), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

