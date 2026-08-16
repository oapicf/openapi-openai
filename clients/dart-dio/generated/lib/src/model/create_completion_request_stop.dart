//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'create_completion_request_stop.g.dart';

/// Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence. 
@BuiltValue()
abstract class CreateCompletionRequestStop implements Built<CreateCompletionRequestStop, CreateCompletionRequestStopBuilder> {
  /// One Of [BuiltList<String>], [String]
  OneOf get oneOf;

  CreateCompletionRequestStop._();

  factory CreateCompletionRequestStop([void updates(CreateCompletionRequestStopBuilder b)]) = _$CreateCompletionRequestStop;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateCompletionRequestStopBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateCompletionRequestStop> get serializer => _$CreateCompletionRequestStopSerializer();
}

class _$CreateCompletionRequestStopSerializer implements PrimitiveSerializer<CreateCompletionRequestStop> {
  @override
  final Iterable<Type> types = const [CreateCompletionRequestStop, _$CreateCompletionRequestStop];

  @override
  final String wireName = r'CreateCompletionRequestStop';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateCompletionRequestStop object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateCompletionRequestStop object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CreateCompletionRequestStop deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateCompletionRequestStopBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType.nullable(String), FullType(BuiltList, [FullType(String)]), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

