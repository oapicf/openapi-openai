//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'create_transcription_request_model.g.dart';

/// ID of the model to use. Only `whisper-1` (which is powered by our open source Whisper V2 model) is currently available. 
@BuiltValue()
abstract class CreateTranscriptionRequestModel implements Built<CreateTranscriptionRequestModel, CreateTranscriptionRequestModelBuilder> {
  /// Any Of [String]
  AnyOf get anyOf;

  CreateTranscriptionRequestModel._();

  factory CreateTranscriptionRequestModel([void updates(CreateTranscriptionRequestModelBuilder b)]) = _$CreateTranscriptionRequestModel;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateTranscriptionRequestModelBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateTranscriptionRequestModel> get serializer => _$CreateTranscriptionRequestModelSerializer();
}

class _$CreateTranscriptionRequestModelSerializer implements PrimitiveSerializer<CreateTranscriptionRequestModel> {
  @override
  final Iterable<Type> types = const [CreateTranscriptionRequestModel, _$CreateTranscriptionRequestModel];

  @override
  final String wireName = r'CreateTranscriptionRequestModel';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateTranscriptionRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateTranscriptionRequestModel object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CreateTranscriptionRequestModel deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateTranscriptionRequestModelBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(String), FullType(AnyOf1Enum), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

