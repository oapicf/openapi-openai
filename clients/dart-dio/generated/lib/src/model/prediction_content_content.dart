//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/chat_completion_request_message_content_part_text.dart';
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'prediction_content_content.g.dart';

/// The content that should be matched when generating a model response. If generated tokens would match this content, the entire model response can be returned much more quickly. 
@BuiltValue()
abstract class PredictionContentContent implements Built<PredictionContentContent, PredictionContentContentBuilder> {
  /// One Of [BuiltList<ChatCompletionRequestMessageContentPartText>], [String]
  OneOf get oneOf;

  PredictionContentContent._();

  factory PredictionContentContent([void updates(PredictionContentContentBuilder b)]) = _$PredictionContentContent;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PredictionContentContentBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PredictionContentContent> get serializer => _$PredictionContentContentSerializer();
}

class _$PredictionContentContentSerializer implements PrimitiveSerializer<PredictionContentContent> {
  @override
  final Iterable<Type> types = const [PredictionContentContent, _$PredictionContentContent];

  @override
  final String wireName = r'PredictionContentContent';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PredictionContentContent object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    PredictionContentContent object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  PredictionContentContent deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PredictionContentContentBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(String), FullType(BuiltList, [FullType(ChatCompletionRequestMessageContentPartText)]), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

