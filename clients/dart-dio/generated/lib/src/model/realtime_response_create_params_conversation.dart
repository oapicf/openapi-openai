//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'realtime_response_create_params_conversation.g.dart';

/// Controls which conversation the response is added to. Currently supports `auto` and `none`, with `auto` as the default value. The `auto` value means that the contents of the response will be added to the default conversation. Set this to `none` to create an out-of-band response which  will not add items to default conversation. 
@BuiltValue()
abstract class RealtimeResponseCreateParamsConversation implements Built<RealtimeResponseCreateParamsConversation, RealtimeResponseCreateParamsConversationBuilder> {
  /// One Of [String]
  OneOf get oneOf;

  RealtimeResponseCreateParamsConversation._();

  factory RealtimeResponseCreateParamsConversation([void updates(RealtimeResponseCreateParamsConversationBuilder b)]) = _$RealtimeResponseCreateParamsConversation;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeResponseCreateParamsConversationBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeResponseCreateParamsConversation> get serializer => _$RealtimeResponseCreateParamsConversationSerializer();
}

class _$RealtimeResponseCreateParamsConversationSerializer implements PrimitiveSerializer<RealtimeResponseCreateParamsConversation> {
  @override
  final Iterable<Type> types = const [RealtimeResponseCreateParamsConversation, _$RealtimeResponseCreateParamsConversation];

  @override
  final String wireName = r'RealtimeResponseCreateParamsConversation';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeResponseCreateParamsConversation object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeResponseCreateParamsConversation object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  RealtimeResponseCreateParamsConversation deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeResponseCreateParamsConversationBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(String), FullType(OneOf1Enum), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

