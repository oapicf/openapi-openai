//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'realtime_response_create_params_max_response_output_tokens.g.dart';

/// Maximum number of output tokens for a single assistant response, inclusive of tool calls. Provide an integer between 1 and 4096 to limit output tokens, or `inf` for the maximum available tokens for a given model. Defaults to `inf`. 
@BuiltValue()
abstract class RealtimeResponseCreateParamsMaxResponseOutputTokens implements Built<RealtimeResponseCreateParamsMaxResponseOutputTokens, RealtimeResponseCreateParamsMaxResponseOutputTokensBuilder> {
  /// One Of [String], [int]
  OneOf get oneOf;

  RealtimeResponseCreateParamsMaxResponseOutputTokens._();

  factory RealtimeResponseCreateParamsMaxResponseOutputTokens([void updates(RealtimeResponseCreateParamsMaxResponseOutputTokensBuilder b)]) = _$RealtimeResponseCreateParamsMaxResponseOutputTokens;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeResponseCreateParamsMaxResponseOutputTokensBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeResponseCreateParamsMaxResponseOutputTokens> get serializer => _$RealtimeResponseCreateParamsMaxResponseOutputTokensSerializer();
}

class _$RealtimeResponseCreateParamsMaxResponseOutputTokensSerializer implements PrimitiveSerializer<RealtimeResponseCreateParamsMaxResponseOutputTokens> {
  @override
  final Iterable<Type> types = const [RealtimeResponseCreateParamsMaxResponseOutputTokens, _$RealtimeResponseCreateParamsMaxResponseOutputTokens];

  @override
  final String wireName = r'RealtimeResponseCreateParamsMaxResponseOutputTokens';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeResponseCreateParamsMaxResponseOutputTokens object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeResponseCreateParamsMaxResponseOutputTokens object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  RealtimeResponseCreateParamsMaxResponseOutputTokens deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeResponseCreateParamsMaxResponseOutputTokensBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(int), FullType(OneOf1Enum), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

