//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'realtime_session_model.g.dart';

/// The Realtime model used for this session. 
@BuiltValue()
abstract class RealtimeSessionModel implements Built<RealtimeSessionModel, RealtimeSessionModelBuilder> {
  /// Any Of [String]
  AnyOf get anyOf;

  RealtimeSessionModel._();

  factory RealtimeSessionModel([void updates(RealtimeSessionModelBuilder b)]) = _$RealtimeSessionModel;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeSessionModelBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeSessionModel> get serializer => _$RealtimeSessionModelSerializer();
}

class _$RealtimeSessionModelSerializer implements PrimitiveSerializer<RealtimeSessionModel> {
  @override
  final Iterable<Type> types = const [RealtimeSessionModel, _$RealtimeSessionModel];

  @override
  final String wireName = r'RealtimeSessionModel';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeSessionModel object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeSessionModel object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  RealtimeSessionModel deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeSessionModelBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(String), FullType(AnyOf1Enum), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

